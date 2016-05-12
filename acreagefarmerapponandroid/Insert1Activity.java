package com.example.acreagefarmerapponandroid;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;


public class Insert1Activity extends AppCompatActivity {

    private EditText edt_id;
    private EditText edt_title;
    private EditText edt_name;
    private EditText edt_lastname;
    private EditText edt_day;
    private EditText edt_mount;
    private EditText edt_year;
    private EditText edt_houseno;
    private EditText edt_countrycode;
    private EditText edt_locality;
    private EditText edt_district;
    private EditText edt_province;
    private EditText edt_postcode;
    private EditText edt_phone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert1);

        edt_id = (EditText) findViewById(R.id.edt_id);
        edt_title = (EditText) findViewById(R.id.edt_title);
        edt_name = (EditText) findViewById(R.id.edt_name);
        edt_lastname = (EditText) findViewById(R.id.edt_lastname);
        edt_day = (EditText) findViewById(R.id.edt_day);
        edt_mount = (EditText) findViewById(R.id.edt_mount);
        edt_year = (EditText) findViewById(R.id.edt_year);
        edt_houseno = (EditText) findViewById(R.id.edt_houseno);
        edt_countrycode = (EditText) findViewById(R.id.edt_countrycode);
        edt_locality = (EditText) findViewById(R.id.edt_locality);
        edt_district = (EditText) findViewById(R.id.edt_district);
        edt_province = (EditText) findViewById(R.id.edt_province);
        edt_postcode = (EditText) findViewById(R.id.edt_postcode);
        edt_phone = (EditText) findViewById(R.id.edt_phone);

    }

    public void insert(View view){

        String id = edt_id.getText().toString();
        String title = edt_title.getText().toString();
        String name = edt_name.getText().toString();
        String lastname = edt_lastname.getText().toString();
        String day = edt_day.getText().toString();
        String mount = edt_mount.getText().toString();
        String year = edt_year.getText().toString();
        String houseno = edt_houseno.getText().toString();
        String countrycode = edt_countrycode.getText().toString();
        String locality = edt_locality.getText().toString();
        String district = edt_district.getText().toString();
        String province = edt_province.getText().toString();
        String postcode = edt_postcode.getText().toString();
        String phone = edt_phone.getText().toString();

        insertToDatabase(id,title,name,lastname,day,mount,year,houseno,countrycode,
                locality,district,province,postcode,phone);

    }

    private void insertToDatabase(String id, String title, String name,
                                  String lastname, String day, String mount,
                                  String year, String houseno, String countrycode,
                                  String locality, String district, String province,
                                  String postcode, String phone){
        class SendPostReqAsyncTask extends AsyncTask<String, Void, String> {
            @Override
            protected String doInBackground(String... params) {
                String paramid = params[0];
                String paramtitle = params[1];
                String paramname = params[2];
                String paramlastname = params[3];
                String paramday = params[4];
                String parammount = params[5];
                String paramyear = params[6];
                String paramhouseno = params[7];
                String paramscountrycode = params[8];
                String paramlocality = params[9];
                String paramdistrict = params[10];
                String paramprovince = params[11];
                String parampostcode = params[12];
                String paramphone = params[13];

                String id = edt_id.getText().toString();
                String title = edt_title.getText().toString();
                String name = edt_name.getText().toString();
                String lastname = edt_lastname.getText().toString();
                String day = edt_day.getText().toString();
                String mount = edt_mount.getText().toString();
                String year = edt_year.getText().toString();
                String houseno = edt_houseno.getText().toString();
                String countrycode = edt_countrycode.getText().toString();
                String locality = edt_locality.getText().toString();
                String district = edt_district.getText().toString();
                String province = edt_province.getText().toString();
                String postcode = edt_postcode.getText().toString();
                String phone = edt_phone.getText().toString();

                List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
                nameValuePairs.add(new BasicNameValuePair("id", id));
                nameValuePairs.add(new BasicNameValuePair("title", title));
                nameValuePairs.add(new BasicNameValuePair("name", name));
                nameValuePairs.add(new BasicNameValuePair("lastname", lastname));
                nameValuePairs.add(new BasicNameValuePair("day", day));
                nameValuePairs.add(new BasicNameValuePair("mount", mount));
                nameValuePairs.add(new BasicNameValuePair("name", name));
                nameValuePairs.add(new BasicNameValuePair("year", year));
                nameValuePairs.add(new BasicNameValuePair("houseno", houseno));
                nameValuePairs.add(new BasicNameValuePair("countrycode", countrycode));
                nameValuePairs.add(new BasicNameValuePair("locality", locality));
                nameValuePairs.add(new BasicNameValuePair("district", district));
                nameValuePairs.add(new BasicNameValuePair("province", province));
                nameValuePairs.add(new BasicNameValuePair("postcode", postcode));
                nameValuePairs.add(new BasicNameValuePair("phone", phone));


                try {
                    HttpClient httpClient = new DefaultHttpClient();
                    HttpPost httpPost = new HttpPost(
                            "http://acreagefarmer.16mb.com/insert-db.php");
                    httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

                    HttpResponse response = httpClient.execute(httpPost);

                    HttpEntity entity = response.getEntity();


                } catch (ClientProtocolException e) {

                } catch (IOException e) {

                }
                return "success";
            }

            @Override
            protected void onPostExecute(String result) {
                super.onPostExecute(result);

                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
                TextView textViewResult = (TextView) findViewById(R.id.textViewResult);
                textViewResult.setText("Inserted");
            }
        }
        SendPostReqAsyncTask sendPostReqAsyncTask = new SendPostReqAsyncTask();
        sendPostReqAsyncTask.execute(id,title,name,lastname,day,mount,year,houseno,countrycode,
                locality,district,province,postcode,phone);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
