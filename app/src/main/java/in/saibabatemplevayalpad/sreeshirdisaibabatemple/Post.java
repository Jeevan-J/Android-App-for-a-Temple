package in.saibabatemplevayalpad.sreeshirdisaibabatemple;

import android.app.ProgressDialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import java.util.Map;

public class Post extends AppCompatActivity {

    TextView title;
    WebView content;
    ProgressDialog progressDialog;
    Gson gson;
    Map<String, Object> mapPost;
    Map<String, Object> mapTitle;
    Map<String, Object> mapContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);


        ActionBar actionBar = new ActionBar() {
            @Override
            public void setCustomView(View view) {

            }

            @Override
            public void setCustomView(View view, LayoutParams layoutParams) {

            }

            @Override
            public void setCustomView(int resId) {

            }

            @Override
            public void setIcon(@DrawableRes int resId) {

            }

            @Override
            public void setIcon(Drawable icon) {

            }

            @Override
            public void setLogo(@DrawableRes int resId) {

            }

            @Override
            public void setLogo(Drawable logo) {

            }

            @Override
            public void setListNavigationCallbacks(SpinnerAdapter adapter, OnNavigationListener callback) {

            }

            @Override
            public void setSelectedNavigationItem(int position) {

            }

            @Override
            public int getSelectedNavigationIndex() {
                return 0;
            }

            @Override
            public int getNavigationItemCount() {
                return 0;
            }

            @Override
            public void setTitle(CharSequence title) {

            }

            @Override
            public void setTitle(@StringRes int resId) {

            }

            @Override
            public void setSubtitle(CharSequence subtitle) {

            }

            @Override
            public void setSubtitle(int resId) {

            }

            @Override
            public void setDisplayOptions(int options) {

            }

            @Override
            public void setDisplayOptions(int options, int mask) {

            }

            @Override
            public void setDisplayUseLogoEnabled(boolean useLogo) {

            }

            @Override
            public void setDisplayShowHomeEnabled(boolean showHome) {

            }

            @Override
            public void setDisplayHomeAsUpEnabled(boolean showHomeAsUp) {

            }

            @Override
            public void setDisplayShowTitleEnabled(boolean showTitle) {

            }

            @Override
            public void setDisplayShowCustomEnabled(boolean showCustom) {

            }

            @Override
            public void setBackgroundDrawable(@Nullable Drawable d) {

            }

            @Override
            public View getCustomView() {
                return null;
            }

            @Nullable
            @Override
            public CharSequence getTitle() {
                return null;
            }

            @Nullable
            @Override
            public CharSequence getSubtitle() {
                return null;
            }

            @Override
            public int getNavigationMode() {
                return 0;
            }

            @Override
            public void setNavigationMode(int mode) {

            }

            @Override
            public int getDisplayOptions() {
                return 0;
            }

            @Override
            public Tab newTab() {
                return null;
            }

            @Override
            public void addTab(Tab tab) {

            }

            @Override
            public void addTab(Tab tab, boolean setSelected) {

            }

            @Override
            public void addTab(Tab tab, int position) {

            }

            @Override
            public void addTab(Tab tab, int position, boolean setSelected) {

            }

            @Override
            public void removeTab(Tab tab) {

            }

            @Override
            public void removeTabAt(int position) {

            }

            @Override
            public void removeAllTabs() {

            }

            @Override
            public void selectTab(Tab tab) {

            }

            @Nullable
            @Override
            public Tab getSelectedTab() {
                return null;
            }

            @Override
            public Tab getTabAt(int index) {
                return null;
            }

            @Override
            public int getTabCount() {
                return 0;
            }

            @Override
            public int getHeight() {
                return 0;
            }

            @Override
            public void show() {

            }

            @Override
            public void hide() {

            }

            @Override
            public boolean isShowing() {
                return false;
            }

            @Override
            public void addOnMenuVisibilityListener(OnMenuVisibilityListener listener) {

            }

            @Override
            public void removeOnMenuVisibilityListener(OnMenuVisibilityListener listener) {

            }
        };
        actionBar.setDisplayHomeAsUpEnabled(true);

        final String id = getIntent().getExtras().getString("id");

        title = (TextView) findViewById(R.id.title);
        content = (WebView)findViewById(R.id.content);

        progressDialog = new ProgressDialog(Post.this);
        progressDialog.setMessage("Loading...");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.show();

        String url = "http://www.saibabatemplevayalpad.in/blog/wp-json/wp/v2/posts/"+id+"?fields=title,content";

        StringRequest request = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                gson = new Gson();
                mapPost = (Map<String, Object>) gson.fromJson(s, Map.class);
                mapTitle = (Map<String, Object>) mapPost.get("title");
                mapContent = (Map<String, Object>) mapPost.get("content");

                title.setText(mapTitle.get("rendered").toString());
                content.loadData(mapContent.get("rendered").toString(),"text/html","UTF-8");

                progressDialog.dismiss();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                progressDialog.dismiss();
                Toast.makeText(Post.this, id, Toast.LENGTH_LONG).show();
            }
        });

        RequestQueue rQueue = Volley.newRequestQueue(Post.this);
        rQueue.add(request);
    }
}
