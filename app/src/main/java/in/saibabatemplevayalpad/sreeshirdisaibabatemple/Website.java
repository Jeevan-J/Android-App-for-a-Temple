package in.saibabatemplevayalpad.sreeshirdisaibabatemple;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Website extends Activity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);

        webView = (WebView) findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.saibabatemplevayalpad.in");

    }
}
