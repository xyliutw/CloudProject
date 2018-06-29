package com.example.ciis_110.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.android.volley.RequestQueue;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class login extends AppCompatActivity {
    private EditText editTextName;
    private EditText editTextPassword;
    private Button buttonLogin;
    private String Login_URL;
    String name;// = editTextName.getText().toString().trim().toLowerCase();
    String password;// = editTextPassword.getText().toString().trim().toLowerCase();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Login_URL = getString(R.string.login_url);
        editTextName = (EditText) findViewById(R.id.name);
        editTextPassword = (EditText) findViewById(R.id.password);
        buttonLogin = (Button) findViewById(R.id.login);
        buttonLogin.setOnClickListener(buttonListener);


    }
        private Button.OnClickListener buttonListener = new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (v == buttonLogin) {
                    RequestQueue requestQueue;
                    requestQueue = Volley.newRequestQueue(login.this);//this是context
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,Login_URL, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {


                            Log.e("response",response);
                            if(response.equals("登入成功!")) {
                                new AlertDialog.Builder(login.this)
                                        .setTitle("提醒")//設定視窗標題
                                        .setIcon(R.mipmap.ic_launcher)//設定對話視窗圖示
                                        .setMessage("登入成功!")//設定顯示的文字
                                        .setPositiveButton("關閉視窗", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                //finish();
                                                Intent intent = new Intent();
                                                intent.setClass(login.this, Home.class);
                                                startActivity(intent);
                                                finish();
                                            }
                                        })//設定結束的子視窗
                                        .show();//呈現對話視窗
                            }else if(response.equals("登入失敗!")){
                                new AlertDialog.Builder(login.this)
                                        .setTitle("提醒")//設定視窗標題
                                        .setIcon(R.mipmap.ic_launcher)//設定對話視窗圖示
                                        .setMessage("登入失敗!")//設定顯示的文字
                                        .setPositiveButton("關閉視窗", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                //finish();
                                                //Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
                                                Intent intent = new Intent();
                                                intent.setClass(login.this, login.class);
                                                startActivity(intent);
                                                finish();
                                            }
                                        })//設定結束的子視窗
                                        .show();//呈現對話視窗
                            }
                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            error.printStackTrace();
                        }
                    }){
                        @Override
                        protected Map<String, String> getParams() throws AuthFailureError {
                            Map<String, String> data = new HashMap<String, String>();
                            name = editTextName.getText().toString().trim().toLowerCase();
                            password = editTextPassword.getText().toString().trim().toLowerCase();
                            Log.e("chk",name+"<>"+password);
                            data.put("name", name);
                            //Log.e("check",name);
                            data.put("password", password);
                            //Log.e("check",password);

                            return data;
                        }
                    };
                    requestQueue.add(stringRequest);

                }
            }
        };

}
