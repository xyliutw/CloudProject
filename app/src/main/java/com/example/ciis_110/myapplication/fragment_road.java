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
public class fragment_road extends Fragment {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn10;
    private Button btn11;
    private Button btn12;
    private Button btn13;
    private Button btn14;
    private Button btn15;
    private Button btn16;
    private Button btn17;
    private Button btn18;
    private Button btn19;
    private Button btn20;
    private String c1_URL;
    private String c2_URL;
    private String c3_URL;
    private String c4_URL;
    private String c5_URL;
    private String c6_URL;
    private String c7_URL;
    private String c8_URL;
    private String c9_URL;
    private String c10_URL;
    private String c11_URL;
    private String c12_URL;
    private String c13_URL;
    private String c14_URL;
    private String c15_URL;
    private String c16_URL;
    private String c17_URL;
    private String c18_URL;
    private String c19_URL;
    private String c20_URL;

    private View view;

    public fragment_road() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_fragment_road, container, false);

        btn1 = (Button) view.findViewById(R.id.btn1);
        btn2 = (Button) view.findViewById(R.id.btn2);
        btn3 = (Button) view.findViewById(R.id.btn3);
        btn4 = (Button) view.findViewById(R.id.btn4);
        btn5 = (Button) view.findViewById(R.id.btn5);
        btn6 = (Button) view.findViewById(R.id.btn6);
        btn7 = (Button) view.findViewById(R.id.btn7);
        btn8 = (Button) view.findViewById(R.id.btn8);
        btn9 = (Button) view.findViewById(R.id.btn9);
        btn10 = (Button) view.findViewById(R.id.btn10);
        btn11 = (Button) view.findViewById(R.id.btn11);
        btn12 = (Button) view.findViewById(R.id.btn12);
        btn13 = (Button) view.findViewById(R.id.btn13);
        btn14 = (Button) view.findViewById(R.id.btn14);
        btn15 = (Button) view.findViewById(R.id.btn15);
        btn16 = (Button) view.findViewById(R.id.btn16);
        btn17= (Button) view.findViewById(R.id.btn17);
        btn18 = (Button) view.findViewById(R.id.btn18);
        btn19 = (Button) view.findViewById(R.id.btn19);
        btn20 = (Button) view.findViewById(R.id.btn20);
        c1_URL =  getString(R.string.c1_url);
        c2_URL =  getString(R.string.c2_url);
        c3_URL =  getString(R.string.c3_url);
        c4_URL =  getString(R.string.c4_url);
        c5_URL =  getString(R.string.c5_url);
        c6_URL =  getString(R.string.c6_url);
        c7_URL =  getString(R.string.c7_url);
        c8_URL =  getString(R.string.c8_url);
        c9_URL =  getString(R.string.c9_url);
        c10_URL =  getString(R.string.c10_url);
        c11_URL =  getString(R.string.c11_url);
        c12_URL =  getString(R.string.c12_url);
        c13_URL =  getString(R.string.c13_url);
        c14_URL =  getString(R.string.c14_url);
        c15_URL =  getString(R.string.c15_url);
        c16_URL =  getString(R.string.c16_url);
        c17_URL =  getString(R.string.c17_url);
        c18_URL =  getString(R.string.c18_url);
        c19_URL =  getString(R.string.c19_url);
        c20_URL =  getString(R.string.c20_url);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == btn1) {
                    RequestQueue requestQueue;
                    requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());//this是context
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,c1_URL, new Response.Listener<String>() {
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
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,c2_URL, new Response.Listener<String>() {
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
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,c3_URL, new Response.Listener<String>() {
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
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,c4_URL, new Response.Listener<String>() {
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
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,c5_URL, new Response.Listener<String>() {
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
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,c6_URL, new Response.Listener<String>() {
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

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == btn7) {
                    RequestQueue requestQueue;
                    requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());//this是context
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,c7_URL, new Response.Listener<String>() {
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

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == btn8) {
                    RequestQueue requestQueue;
                    requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());//this是context
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,c8_URL, new Response.Listener<String>() {
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

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == btn9) {
                    RequestQueue requestQueue;
                    requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());//this是context
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,c9_URL, new Response.Listener<String>() {
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

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == btn10) {
                    RequestQueue requestQueue;
                    requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());//this是context
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,c10_URL, new Response.Listener<String>() {
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

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == btn11) {
                    RequestQueue requestQueue;
                    requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());//this是context
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,c11_URL, new Response.Listener<String>() {
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

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == btn12) {
                    RequestQueue requestQueue;
                    requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());//this是context
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,c12_URL, new Response.Listener<String>() {
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

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == btn13) {
                    RequestQueue requestQueue;
                    requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());//this是context
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,c13_URL, new Response.Listener<String>() {
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

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == btn14) {
                    RequestQueue requestQueue;
                    requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());//this是context
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,c14_URL, new Response.Listener<String>() {
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

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == btn15) {
                    RequestQueue requestQueue;
                    requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());//this是context
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,c15_URL, new Response.Listener<String>() {
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

        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == btn16) {
                    RequestQueue requestQueue;
                    requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());//this是context
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,c16_URL, new Response.Listener<String>() {
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

        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == btn17) {
                    RequestQueue requestQueue;
                    requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());//this是context
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,c17_URL, new Response.Listener<String>() {
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

        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == btn18) {
                    RequestQueue requestQueue;
                    requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());//this是context
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,c18_URL, new Response.Listener<String>() {
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

        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == btn19) {
                    RequestQueue requestQueue;
                    requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());//this是context
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,c19_URL, new Response.Listener<String>() {
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

        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == btn20) {
                    RequestQueue requestQueue;
                    requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());//this是context
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,c20_URL, new Response.Listener<String>() {
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



        return view;
    }

}
