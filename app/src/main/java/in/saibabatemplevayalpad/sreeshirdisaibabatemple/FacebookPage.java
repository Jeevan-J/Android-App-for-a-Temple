package in.saibabatemplevayalpad.sreeshirdisaibabatemple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class FacebookPage extends AppCompatActivity {

    WebView fbpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_page);

        fbpage = (WebView) findViewById(R.id.facebook_page);
        fbpage.getSettings().setJavaScriptEnabled(true);
        fbpage.loadUrl("https://www.facebook.com/SreeShirdiSaiBabaTemple/");
    }
}
