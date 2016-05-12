package com.example.acreagefarmerapponandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        textView = (TextView) findViewById(R.id.textViewUsername);

        Intent intent = getIntent();

        String username = intent.getStringExtra(LoginActivity.USERNAME);

        textView.setText("Welcome User "+username);
    }

}
