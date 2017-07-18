package in.saibabatemplevayalpad.sreeshirdisaibabatemple;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.SpinnerAdapter;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class BabaSongs extends AppCompatActivity {

    private StorageReference mStorageRef;
    FirebaseStorage storage = FirebaseStorage.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baba_songs);
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


    }


    public void playSej(View view) {
        mStorageRef = storage.getReferenceFromUrl("gs://sree-shirdi-sai-baba-temple.appspot.com/Harathulu").child("PART 4 MP3.mp3");
        mStorageRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>(){
            @Override
            public void onSuccess(Uri uri) {
                Intent sej = new Intent();
                sej.setAction(Intent.ACTION_VIEW);
                sej.setDataAndType(uri,"audio/mp3");
                startActivity(sej);
            }
        });
    }


    public void playKakada(View view) {
        mStorageRef = storage.getReferenceFromUrl("gs://sree-shirdi-sai-baba-temple.appspot.com/Harathulu").child("PART 1 MP3.mp3");
        mStorageRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>(){
            @Override
            public void onSuccess(Uri uri) {
                Intent kakada = new Intent();
                kakada.setAction(Intent.ACTION_VIEW);
                kakada.setDataAndType(uri,"audio/mp3");
                startActivity(kakada);
            }
        });
    }

    public void playMadhyana(View view) {
        mStorageRef = storage.getReferenceFromUrl("gs://sree-shirdi-sai-baba-temple.appspot.com/Harathulu").child("PART 2 MP3.mp3");
        mStorageRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>(){
            @Override
            public void onSuccess(Uri uri) {
                Intent madhyana = new Intent();
                madhyana.setAction(Intent.ACTION_VIEW);
                madhyana.setDataAndType(uri,"audio/mp3");
                startActivity(madhyana);
            }
        });
    }

    public void playDhoop(View view) {
        mStorageRef = storage.getReferenceFromUrl("gs://sree-shirdi-sai-baba-temple.appspot.com/Harathulu").child("PART 3 MP3.mp3");
        mStorageRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>(){
            @Override
            public void onSuccess(Uri uri) {
                Intent dhoop = new Intent();
                dhoop.setAction(Intent.ACTION_VIEW);
                dhoop.setDataAndType(uri,"audio/mp3");
                startActivity(dhoop);
            }
        });
    }
}
