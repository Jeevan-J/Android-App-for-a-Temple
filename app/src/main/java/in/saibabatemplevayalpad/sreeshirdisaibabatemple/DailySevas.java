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

public class DailySevas extends AppCompatActivity {

    public String url = "https://www.payumoney.com/paybypayumoney/#/";
    public static final String NA = "324335";
    public static final String A = "321377";
    public static final String SA = "324349";
    public static final String PS = "324355";
    public static final String P = "324357";
    public static final String V = "324361";
    public static final String D = "324437";
    public static final String N = "324439";
    public static final String ALL = "324365";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_sevas);
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

    public void payforNA(View view) {
        Uri na = Uri.parse(url+NA);
        Intent pna = new Intent(Intent.ACTION_VIEW,na);
        startActivity(pna);
    }

    public void payforA(View view) {
        Uri a = Uri.parse(url+A);
        Intent pa = new Intent(Intent.ACTION_VIEW,a);
        startActivity(pa);
    }

    public void payforSA(View view) {
        Uri sa = Uri.parse(url+SA);
        Intent psa = new Intent(Intent.ACTION_VIEW,sa);
        startActivity(psa);
    }

    public void payforD(View view) {
        Uri d = Uri.parse(url+D);
        Intent pd = new Intent(Intent.ACTION_VIEW,d);
        startActivity(pd);
    }

    public void payforN(View view) {
        Uri n = Uri.parse(url+N);
        Intent pn = new Intent(Intent.ACTION_VIEW,n);
        startActivity(pn);
    }

    public void payforALL(View view) {
        Uri all = Uri.parse(url+ALL);
        Intent pall = new Intent(Intent.ACTION_VIEW,all);
        startActivity(pall);
    }

    public void payforV(View view) {
        Uri v = Uri.parse(url+V);
        Intent pv = new Intent(Intent.ACTION_VIEW,v);
        startActivity(pv);
    }

    public void payforP(View view) {
        Uri p = Uri.parse(url+P);
        Intent pp = new Intent(Intent.ACTION_VIEW,p);
        startActivity(pp);
    }

    public void payforPS(View view) {
        Uri ps = Uri.parse(url+PS);
        Intent pps = new Intent(Intent.ACTION_VIEW,ps);
        startActivity(pps);
    }
}
