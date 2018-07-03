package com.example.ciis_110.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_north extends Fragment {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private String d1_URL;
    private String d2_URL;
    private String d3_URL;
    private String d4_URL;
    private String d5_URL;
    private String d6_URL;

    private View view;
    public fragment_north() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_fragment_north, container, false);

        btn1 = (Button) view.findViewById(R.id.btn1);
        btn2 = (Button) view.findViewById(R.id.btn2);
        btn3 = (Button) view.findViewById(R.id.btn3);
        btn4 = (Button) view.findViewById(R.id.btn4);
        btn5 = (Button) view.findViewById(R.id.btn5);
        btn6 = (Button) view.findViewById(R.id.btn6);

        d1_URL =  getString(R.string.d1_url);
        d2_URL =  getString(R.string.d2_url);
        d3_URL =  getString(R.string.d3_url);
        d4_URL =  getString(R.string.d4_url);
        d5_URL =  getString(R.string.d5_url);
        d6_URL =  getString(R.string.d6_url);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == btn1) {
                    RequestQueue requestQueue;
                    requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());//this是context
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,d1_URL, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {

                            try {
                                JSONArray array = new JSONArray(response);
                                for (int i = 0; i < array.length(); i++) {
                                    JSONObject jsonObject = array.getJSONObject(i);
                                    String id = jsonObject.getString("id");
                                    String tag = jsonObject.getString("tag");
                                    String start = jsonObject.getString("start");
                                    String end = jsonObject.getString("end");
                                    String ls = jsonObject.getString("ls");
                                    String rs = jsonObject.getString("rs");
                                    Log.e("TAG", "id:" + id + ", tag:" + tag + ", start:" + start+", end:"+end+", ls:"+ls+", rs:"+rs);
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            Log.e("response","<>"+response);
                            /*if(response.equals("登入成功!")) {
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
                            }*/
                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            error.printStackTrace();
                        }
                    });
                    requestQueue.add(stringRequest);
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == btn2) {
                    RequestQueue requestQueue;
                    requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());//this是context
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,d2_URL, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {

                            try {
                                JSONArray array = new JSONArray(response);
                                for (int i = 0; i < array.length(); i++) {
                                    JSONObject jsonObject = array.getJSONObject(i);
                                    String id = jsonObject.getString("id");
                                    String tag = jsonObject.getString("tag");
                                    String start = jsonObject.getString("start");
                                    String end = jsonObject.getString("end");
                                    String ls = jsonObject.getString("ls");
                                    String rs = jsonObject.getString("rs");
                                    Log.e("TAG", "id:" + id + ", tag:" + tag + ", start:" + start+", end:"+end+", ls:"+ls+", rs:"+rs);
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            Log.e("response","<>"+response);
                            /*if(response.equals("登入成功!")) {
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
                            }*/
                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            error.printStackTrace();
                        }
                    });
                    requestQueue.add(stringRequest);
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == btn3) {
                    RequestQueue requestQueue;
                    requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());//this是context
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,d3_URL, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {

                            try {
                                JSONArray array = new JSONArray(response);
                                for (int i = 0; i < array.length(); i++) {
                                    JSONObject jsonObject = array.getJSONObject(i);
                                    String id = jsonObject.getString("id");
                                    String tag = jsonObject.getString("tag");
                                    String start = jsonObject.getString("start");
                                    String end = jsonObject.getString("end");
                                    String ls = jsonObject.getString("ls");
                                    String rs = jsonObject.getString("rs");
                                    Log.e("TAG", "id:" + id + ", tag:" + tag + ", start:" + start+", end:"+end+", ls:"+ls+", rs:"+rs);
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            Log.e("response","<>"+response);
                            /*if(response.equals("登入成功!")) {
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
                            }*/
                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            error.printStackTrace();
                        }
                    });
                    requestQueue.add(stringRequest);
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == btn4) {
                    RequestQueue requestQueue;
                    requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());//this是context
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,d4_URL, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {

                            try {
                                JSONArray array = new JSONArray(response);
                                for (int i = 0; i < array.length(); i++) {
                                    JSONObject jsonObject = array.getJSONObject(i);
                                    String id = jsonObject.getString("id");
                                    String tag = jsonObject.getString("tag");
                                    String start = jsonObject.getString("start");
                                    String end = jsonObject.getString("end");
                                    String ls = jsonObject.getString("ls");
                                    String rs = jsonObject.getString("rs");
                                    Log.e("TAG", "id:" + id + ", tag:" + tag + ", start:" + start+", end:"+end+", ls:"+ls+", rs:"+rs);
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            Log.e("response","<>"+response);
                            /*if(response.equals("登入成功!")) {
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
                            }*/
                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            error.printStackTrace();
                        }
                    });
                    requestQueue.add(stringRequest);
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == btn5) {
                    RequestQueue requestQueue;
                    requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());//this是context
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,d5_URL, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {

                            try {
                                JSONArray array = new JSONArray(response);
                                for (int i = 0; i < array.length(); i++) {
                                    JSONObject jsonObject = array.getJSONObject(i);
                                    String id = jsonObject.getString("id");
                                    String tag = jsonObject.getString("tag");
                                    String start = jsonObject.getString("start");
                                    String end = jsonObject.getString("end");
                                    String ls = jsonObject.getString("ls");
                                    String rs = jsonObject.getString("rs");
                                    Log.e("TAG", "id:" + id + ", tag:" + tag + ", start:" + start+", end:"+end+", ls:"+ls+", rs:"+rs);
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            Log.e("response","<>"+response);
                            /*if(response.equals("登入成功!")) {
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
                            }*/
                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            error.printStackTrace();
                        }
                    });
                    requestQueue.add(stringRequest);
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == btn6) {
                    RequestQueue requestQueue;
                    requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());//this是context
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,d6_URL, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {

                            try {
                                JSONArray array = new JSONArray(response);
                                for (int i = 0; i < array.length(); i++) {
                                    JSONObject jsonObject = array.getJSONObject(i);
                                    String id = jsonObject.getString("id");
                                    String tag = jsonObject.getString("tag");
                                    String start = jsonObject.getString("start");
                                    String end = jsonObject.getString("end");
                                    String ls = jsonObject.getString("ls");
                                    String rs = jsonObject.getString("rs");
                                    Log.e("TAG", "id:" + id + ", tag:" + tag + ", start:" + start+", end:"+end+", ls:"+ls+", rs:"+rs);
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            Log.e("response","<>"+response);
                            /*if(response.equals("登入成功!")) {
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
                            }*/
                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            error.printStackTrace();
                        }
                    });
                    requestQueue.add(stringRequest);
                }
            }
        });




        return view ;
    }

}
