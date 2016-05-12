package com.example.acreagefarmerapponandroid;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;


public abstract class LoginActivity extends AppCompatActivity implements View.OnClickListener {

//    private EditText edt_username;
//    private EditText edt_password;
//
//    private Button btn_login;
//
//    public static final String USERNAME = "USERNAME";
//    public static final String PASSWORD = "PASSWORD";
//
//    private static final String LOGIN_URL ="http://acreagefarmer.16mb.com/config.php";
//
//    String username;
//    String password;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
//
//        edt_username = (EditText) findViewById(R.id.edt_username);
//        edt_password = (EditText) findViewById(R.id.edt_password);
//
//        btn_login = (Button) findViewById(R.id.btn_login);
//
//        btn_login.setOnClickListener(this);
//
//    }
//
//    private void login(){
//        String username = edt_username.getText().toString().trim();
//        String password = edt_password.getText().toString().trim();
//        userLogin(username,password);
//    }
//
//    private void userLogin(final String username, final String password){
//        class UserLoginClass extends AsyncTask<String,Void,String>{
//            ProgressDialog loading;
//            @Override
//            protected void onPreExecute() {
//                super.onPreExecute();
//                loading = ProgressDialog.show(LoginActivity.this,"Please Wait",null,true,true);
//            }
//
//            @Override
//            protected void onPostExecute(String s) {
//                super.onPostExecute(s);
//                loading.dismiss();
//                if(s.equalsIgnoreCase("success")){
//                    Intent intent = new Intent(LoginActivity.this,UserActivity.class);
//                    intent.putExtra(USERNAME,username);
//                    startActivity(intent);
//                }else{
//                    Toast.makeText(LoginActivity.this,s,Toast.LENGTH_LONG).show();
//                }
//            }
//
//            @Override
//            protected String doInBackground(String... params) {
//                HashMap<String,String> data = new HashMap<>();
//                data.put("username",params[0]);
//                data.put("password",params[1]);
//
//                RegisterUserClass ruc = new RegisterUserClass();
//
//                String result = ruc.sendPostRequest(LOGIN_URL,data);
//
//                return result;
//            }
//        }
//        UserLoginClass ulc = new UserLoginClass();
//        ulc.execute(username,password);
//    }
//
//    @Override
//    public void onClick(View v) {
//        if(v == btn_login){
//            login();
//        }
//    }



}
