package in.saibabatemplevayalpad.sreeshirdisaibabatemple;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.facebook.FacebookSdk;
import com.facebook.notifications.NotificationsManager;

public class Home extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        FacebookSdk.sdkInitialize(getApplicationContext());
        NotificationsManager.presentCardFromNotification(this);

        String token = SharedPrefManager.getInstance(this).getDeviceToken();
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://www.saibabatemplevayalpad.in/token.php?token="+token;
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
            }
        });
        queue.add(stringRequest);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        setIntent(intent);
        NotificationsManager.presentCardFromNotification(this);
    }

    public void openVideo(View view) {
        Intent video = new Intent(this, YoutubeVideo.class);
        startActivity(video);
    }

    public void openWebsite(View view) {
        Intent website = new Intent(this, Website.class);
        startActivity(website);
    }

    public void openLocation(View view) {
        Uri gmmIntentUri = Uri.parse("geo:13.637426, 78.6259891");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }else{
            Intent location = new Intent(this,MapsActivity.class);
            startActivity(location);
        }
    }

    public void openFacebook(View view) {
        Uri fbUri = Uri.parse("fb://SreeShirdiSaiBabaTemple/");
        Intent openFb = new Intent(Intent.ACTION_VIEW,fbUri);
        if (openFb.resolveActivity(getPackageManager()) != null) {
            startActivity(openFb);
        }else{
            Intent openFb2 = new Intent(this,FacebookPage.class);
            startActivity(openFb2);
        }
    }

    public void openNews(View view) {
        Intent openNews = new Intent(this,News.class);
        startActivity(openNews);
    }

    public void openContactUs(View view) {
        Intent contactus = new Intent(this,ContactUs.class);
        startActivity(contactus);
    }

    public void openAarathis(View view) {
        Intent openaarathis = new Intent(this,BabaSongs.class);
        startActivity(openaarathis);
    }

    public void openDSchedule(View view) {
        Intent opends = new Intent(this,DailySchedule.class);
        startActivity(opends);
    }

    public void openDsevas(View view) {
        Intent opends = new Intent(this,DailySevas.class);
        startActivity(opends);
    }

    @Override
    public void onBackPressed()
    {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
    }
}
