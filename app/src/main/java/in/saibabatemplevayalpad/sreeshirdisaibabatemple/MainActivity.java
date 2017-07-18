package in.saibabatemplevayalpad.sreeshirdisaibabatemple;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Objects;


public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();
        if (getIntent().getExtras() != null) {
            String news = getIntent().getExtras().getString("News");
            String value = getIntent().getExtras().getString("Image");
            if (Objects.equals("True",news)) {
                if (Objects.equals("True",value)) {
                    Intent intent = new Intent(this, News.class);
                    intent.putExtra("value", value);
                    startActivity(intent);
                    finish();
                }else{
                    Intent intent = new Intent(this, News.class);
                    startActivity(intent);
                    finish();
                }

            }
        }
    }

    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();

        if (currentUser != null) {
            Toast.makeText(this, "Welcome \n" + currentUser.getEmail(), Toast.LENGTH_SHORT).show();
            Intent home = new Intent(this,Home.class);
            startActivity(home);
            finish();
        }
    }

    public void gSignIn(View view) {
        Intent open = new Intent(this,GoogleSignInActivity.class);
        startActivity(open);
        finish();
    }

    public void fbLogIn(View view) {
        Intent open = new Intent(this,FacebookLoginActivity.class);
        startActivity(open);
        finish();
    }
}
