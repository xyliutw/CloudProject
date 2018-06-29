package com.example.ciis_110.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private Button buttonRegister;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        REGISTER_URL = getString(R.string.register_url);
//        editTextName = (EditText) findViewById(R.id.name);
//        editTextUsername = (EditText) findViewById(R.id.username);
//        editTextPassword = (EditText) findViewById(R.id.password);
//        editTextEmail = (EditText) findViewById(R.id.email);
//        editTextTel = (EditText) findViewById(R.id.tel);
        buttonRegister = (Button) findViewById(R.id.create);
        buttonRegister.setOnClickListener(buttonListener);
        buttonLogin =  findViewById(R.id.login);
        buttonLogin.setOnClickListener(buttonListener_login);
    }

    private Button.OnClickListener buttonListener = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v == buttonRegister) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, register.class);
                startActivity(intent);
                //finish();
            }
        }
    };
    private Button.OnClickListener buttonListener_login = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v == buttonLogin) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, login.class);
                startActivity(intent);
                //finish();
            }
        }
    };
//
//    private void registerUser() {/**讀取使用者輸入數據**/
//        String name = editTextName.getText().toString().trim().toLowerCase();
//        String username = editTextUsername.getText().toString().trim().toLowerCase();
//        String password = editTextPassword.getText().toString().trim().toLowerCase();
//        String email = editTextEmail.getText().toString().trim().toLowerCase();
//        String tel = editTextTel.getText().toString().trim().toLowerCase();
//        register(name, username, password, email, tel);/**獲取資料成功後，開始進行傳送**/
//    }
//
//    private void register(final String name, final String username, final String password, final String email, final String tel) {
//
//        RequestQueue requestQueue;
//        requestQueue = Volley.newRequestQueue(MainActivity.this);//this是context
//        String chk = new String();
//        StringRequest stringRequest = new StringRequest(Request.Method.POST,REGISTER_URL, new Response.Listener<String>() {
//            @Override
//            public void onResponse(String response) {
//                Log.e("response",response);
//                if(response.equals("請填滿所有選項!")) {
//                    new AlertDialog.Builder(MainActivity.this)
//                            .setTitle("提醒")//設定視窗標題
//                            .setIcon(R.mipmap.ic_launcher)//設定對話視窗圖示
//                            .setMessage("請填滿所有選項!")//設定顯示的文字
//                            .setPositiveButton("關閉視窗", new DialogInterface.OnClickListener() {
//                                @Override
//                                public void onClick(DialogInterface dialog, int which) {
//                                    //finish();
//                                }
//                            })//設定結束的子視窗
//                            .show();//呈現對話視窗
//                }else if(response.equals("帳號創建成功!")){
//                    new AlertDialog.Builder(MainActivity.this)
//                            .setTitle("提醒")//設定視窗標題
//                            .setIcon(R.mipmap.ic_launcher)//設定對話視窗圖示
//                            .setMessage("帳號創建成功!")//設定顯示的文字
//                            .setPositiveButton("關閉視窗", new DialogInterface.OnClickListener() {
//                                @Override
//                                public void onClick(DialogInterface dialog, int which) {
//                                    //finish();
//                                    //Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
//                                    Intent intent = new Intent();
//                                    intent.setClass(MainActivity.this, login.class);
//                                    startActivity(intent);
//                                    finish();
//                                }
//                            })//設定結束的子視窗
//                            .show();//呈現對話視窗
//                }else if(response.equals("此帳號已經存在!")){
//                    new AlertDialog.Builder(MainActivity.this)
//                            .setTitle("提醒")//設定視窗標題
//                            .setIcon(R.mipmap.ic_launcher)//設定對話視窗圖示
//                            .setMessage("此帳號已經存在!")//設定顯示的文字
//                            .setPositiveButton("關閉視窗", new DialogInterface.OnClickListener() {
//                                @Override
//                                public void onClick(DialogInterface dialog, int which) {
//                                    //finish();
//                                    //Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
////                                    Intent intent = new Intent();
////                                    intent.setClass(MainActivity.this, login.class);
////                                    startActivity(intent);
////                                    finish();
//                                }
//                            })//設定結束的子視窗
//                            .show();//呈現對話視窗
//                }
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                error.printStackTrace();
//            }
//        }){
//            @Override
//            protected Map<String, String> getParams() throws AuthFailureError {
//                Map<String, String> data = new HashMap<String, String>();
//                data.put("name", name);
//                data.put("password", username);
//                data.put("username", password);
//                data.put("email", email);
//                data.put("tel", tel);
//                return data;
//            }
//        };
//        requestQueue.add(stringRequest);
//
//

//    }
}