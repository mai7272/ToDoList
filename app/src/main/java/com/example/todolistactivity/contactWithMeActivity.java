package com.example.todolistactivity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class contactWithMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_with_me);
    }
    public void dial(View view) {
        String tel = "tel:266-225-225";
        Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse(tel));
        startActivity(i);
    }
    public void openWebBage(View view) {
        String web = "http://www.instagram.com";
        Intent ii = new Intent(Intent.ACTION_VIEW, Uri.parse(web));
        startActivity(ii);
    }
    public void email(View view) {
        String mail = "mailto://exampl@gmail.com";
        Intent iii = new Intent(Intent.ACTION_VIEW, Uri.parse(mail));
        startActivity(iii);
    }

    public void clickToBack(View v){
        Intent ii = new Intent(this, MainActivity.class);
        startActivity(ii);
        finish();

    }
}
