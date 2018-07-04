package com.example.ciis_110.myapplication;


import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_high extends Fragment {
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
    private String a1_URL;
    private String a2_URL;
    private String a3_URL;
    private String a4_URL;
    private String a5_URL;
    private String a6_URL;
    private String a7_URL;
    private String a8_URL;
    private String a9_URL;
    private String a10_URL;
    private View view;
    public class data implements Serializable {
        String start;
        String end;
        String ls;
        String rs;
    }

    public fragment_high() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_fragment_high, container, false);
        super.onActivityCreated(savedInstanceState);



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
        a1_URL =  getString(R.string.a1_url);
        a2_URL =  getString(R.string.a2_url);
        a3_URL =  getString(R.string.a3_url);
        a4_URL =  getString(R.string.a4_url);
        a5_URL =  getString(R.string.a5_url);
        a6_URL =  getString(R.string.a6_url);
        a7_URL =  getString(R.string.a7_url);
        a8_URL =  getString(R.string.a8_url);
        a9_URL =  getString(R.string.a9_url);
        a10_URL =  getString(R.string.a10_url);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == btn1) {
                    RequestQueue requestQueue;
                    requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());//this是context
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,a1_URL, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {

                            try {
                                JSONArray array = new JSONArray(response);
                                ArrayList<String> startlist = new ArrayList<String>();
                                ArrayList<String> endlist = new ArrayList<String>();
                                ArrayList<String> lslist = new ArrayList<String>();
                                ArrayList<String> rslist = new ArrayList<String>();

                                for (int i = 0; i < array.length(); i++) {
                                    JSONObject jsonObject = array.getJSONObject(i);
                                    String id = jsonObject.getString("id");
                                    String tag = jsonObject.getString("tag");
                                    String start = jsonObject.getString("start");
                                    String end = jsonObject.getString("end");
                                    String ls = jsonObject.getString("ls");
                                    String rs = jsonObject.getString("rs");
                                    startlist.add(start);
                                    endlist.add(end);
                                    lslist.add(ls);
                                    rslist.add(rs);
                                    Log.e("TAG", "id:" + id + ", tag:" + tag + ", start:" + start+", end:"+end+", ls:"+ls+", rs:"+rs);
                                }
                                Intent intent = new Intent();
                                intent.setClass(getActivity(), drawlist.class);
                                Bundle bundle = new Bundle();

                                bundle.putSerializable("startList", startlist);
                                bundle.putSerializable("endList", endlist);
                                bundle.putSerializable("lsList", lslist);
                                bundle.putSerializable("rsList", rslist);
                                intent.putExtras(bundle);
                                startActivity(intent);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

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
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,a2_URL, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {

                            try {
                                JSONArray array = new JSONArray(response);
                                ArrayList<String> startlist = new ArrayList<String>();
                                ArrayList<String> endlist = new ArrayList<String>();
                                ArrayList<String> lslist = new ArrayList<String>();
                                ArrayList<String> rslist = new ArrayList<String>();

                                for (int i = 0; i < array.length(); i++) {
                                    JSONObject jsonObject = array.getJSONObject(i);
                                    String id = jsonObject.getString("id");
                                    String tag = jsonObject.getString("tag");
                                    String start = jsonObject.getString("start");
                                    String end = jsonObject.getString("end");
                                    String ls = jsonObject.getString("ls");
                                    String rs = jsonObject.getString("rs");
                                    startlist.add(start);
                                    endlist.add(end);
                                    lslist.add(ls);
                                    rslist.add(rs);
                                    Log.e("TAG", "id:" + id + ", tag:" + tag + ", start:" + start+", end:"+end+", ls:"+ls+", rs:"+rs);
                                }
                                Intent intent = new Intent();
                                intent.setClass(getActivity(), drawlist.class);
                                Bundle bundle = new Bundle();

                                bundle.putSerializable("startList", startlist);
                                bundle.putSerializable("endList", endlist);
                                bundle.putSerializable("lsList", lslist);
                                bundle.putSerializable("rsList", rslist);
                                intent.putExtras(bundle);
                                startActivity(intent);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
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
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,a3_URL, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {

                            try {
                                JSONArray array = new JSONArray(response);
                                ArrayList<String> startlist = new ArrayList<String>();
                                ArrayList<String> endlist = new ArrayList<String>();
                                ArrayList<String> lslist = new ArrayList<String>();
                                ArrayList<String> rslist = new ArrayList<String>();

                                for (int i = 0; i < array.length(); i++) {
                                    JSONObject jsonObject = array.getJSONObject(i);
                                    String id = jsonObject.getString("id");
                                    String tag = jsonObject.getString("tag");
                                    String start = jsonObject.getString("start");
                                    String end = jsonObject.getString("end");
                                    String ls = jsonObject.getString("ls");
                                    String rs = jsonObject.getString("rs");
                                    startlist.add(start);
                                    endlist.add(end);
                                    lslist.add(ls);
                                    rslist.add(rs);
                                    Log.e("TAG", "id:" + id + ", tag:" + tag + ", start:" + start+", end:"+end+", ls:"+ls+", rs:"+rs);
                                }
                                Intent intent = new Intent();
                                intent.setClass(getActivity(), drawlist.class);
                                Bundle bundle = new Bundle();

                                bundle.putSerializable("startList", startlist);
                                bundle.putSerializable("endList", endlist);
                                bundle.putSerializable("lsList", lslist);
                                bundle.putSerializable("rsList", rslist);
                                intent.putExtras(bundle);
                                startActivity(intent);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
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
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,a4_URL, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {

                            try {
                                JSONArray array = new JSONArray(response);
                                ArrayList<String> startlist = new ArrayList<String>();
                                ArrayList<String> endlist = new ArrayList<String>();
                                ArrayList<String> lslist = new ArrayList<String>();
                                ArrayList<String> rslist = new ArrayList<String>();

                                for (int i = 0; i < array.length(); i++) {
                                    JSONObject jsonObject = array.getJSONObject(i);
                                    String id = jsonObject.getString("id");
                                    String tag = jsonObject.getString("tag");
                                    String start = jsonObject.getString("start");
                                    String end = jsonObject.getString("end");
                                    String ls = jsonObject.getString("ls");
                                    String rs = jsonObject.getString("rs");
                                    startlist.add(start);
                                    endlist.add(end);
                                    lslist.add(ls);
                                    rslist.add(rs);
                                    Log.e("TAG", "id:" + id + ", tag:" + tag + ", start:" + start+", end:"+end+", ls:"+ls+", rs:"+rs);
                                }
                                Intent intent = new Intent();
                                intent.setClass(getActivity(), drawlist.class);
                                Bundle bundle = new Bundle();

                                bundle.putSerializable("startList", startlist);
                                bundle.putSerializable("endList", endlist);
                                bundle.putSerializable("lsList", lslist);
                                bundle.putSerializable("rsList", rslist);
                                intent.putExtras(bundle);
                                startActivity(intent);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
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
                    Log.e("test","1>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                    RequestQueue requestQueue;
                    requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());//this是context
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,a5_URL, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {

                            try {
                                Log.e("test","2>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                                JSONArray array = new JSONArray(response);
                                ArrayList<String> startlist = new ArrayList<String>();
                                ArrayList<String> endlist = new ArrayList<String>();
                                ArrayList<String> lslist = new ArrayList<String>();
                                ArrayList<String> rslist = new ArrayList<String>();

                                for (int i = 0; i < array.length(); i++) {
                                    JSONObject jsonObject = array.getJSONObject(i);
                                    String id = jsonObject.getString("id");
                                    String tag = jsonObject.getString("tag");
                                    String start = jsonObject.getString("start");
                                    String end = jsonObject.getString("end");
                                    String ls = jsonObject.getString("ls");
                                    String rs = jsonObject.getString("rs");
                                    startlist.add(start);
                                    endlist.add(end);
                                    lslist.add(ls);
                                    rslist.add(rs);
                                    Log.e("TAG", "id:" + id + ", tag:" + tag + ", start:" + start+", end:"+end+", ls:"+ls+", rs:"+rs);
                                }
                                Intent intent = new Intent();
                                intent.setClass(getActivity(), drawlist.class);
                                Bundle bundle = new Bundle();
                                Log.e("test","3>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                                bundle.putSerializable("startList", startlist);
                                bundle.putSerializable("endList", endlist);
                                bundle.putSerializable("lsList", lslist);
                                bundle.putSerializable("rsList", rslist);
                                intent.putExtras(bundle);
                                startActivity(intent);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
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
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,a6_URL, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {

                            try {
                                JSONArray array = new JSONArray(response);
                                ArrayList<String> startlist = new ArrayList<String>();
                                ArrayList<String> endlist = new ArrayList<String>();
                                ArrayList<String> lslist = new ArrayList<String>();
                                ArrayList<String> rslist = new ArrayList<String>();

                                for (int i = 0; i < array.length(); i++) {
                                    JSONObject jsonObject = array.getJSONObject(i);
                                    String id = jsonObject.getString("id");
                                    String tag = jsonObject.getString("tag");
                                    String start = jsonObject.getString("start");
                                    String end = jsonObject.getString("end");
                                    String ls = jsonObject.getString("ls");
                                    String rs = jsonObject.getString("rs");
                                    startlist.add(start);
                                    endlist.add(end);
                                    lslist.add(ls);
                                    rslist.add(rs);
                                    Log.e("TAG", "id:" + id + ", tag:" + tag + ", start:" + start+", end:"+end+", ls:"+ls+", rs:"+rs);
                                }
                                Intent intent = new Intent();
                                intent.setClass(getActivity(), drawlist.class);
                                Bundle bundle = new Bundle();

                                bundle.putSerializable("startList", startlist);
                                bundle.putSerializable("endList", endlist);
                                bundle.putSerializable("lsList", lslist);
                                bundle.putSerializable("rsList", rslist);
                                intent.putExtras(bundle);
                                startActivity(intent);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
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
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,a7_URL, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {

                            try {
                                JSONArray array = new JSONArray(response);
                                ArrayList<String> startlist = new ArrayList<String>();
                                ArrayList<String> endlist = new ArrayList<String>();
                                ArrayList<String> lslist = new ArrayList<String>();
                                ArrayList<String> rslist = new ArrayList<String>();

                                for (int i = 0; i < array.length(); i++) {
                                    JSONObject jsonObject = array.getJSONObject(i);
                                    String id = jsonObject.getString("id");
                                    String tag = jsonObject.getString("tag");
                                    String start = jsonObject.getString("start");
                                    String end = jsonObject.getString("end");
                                    String ls = jsonObject.getString("ls");
                                    String rs = jsonObject.getString("rs");
                                    startlist.add(start);
                                    endlist.add(end);
                                    lslist.add(ls);
                                    rslist.add(rs);
                                    Log.e("TAG", "id:" + id + ", tag:" + tag + ", start:" + start+", end:"+end+", ls:"+ls+", rs:"+rs);
                                }
                                Intent intent = new Intent();
                                intent.setClass(getActivity(), drawlist.class);
                                Bundle bundle = new Bundle();

                                bundle.putSerializable("startList", startlist);
                                bundle.putSerializable("endList", endlist);
                                bundle.putSerializable("lsList", lslist);
                                bundle.putSerializable("rsList", rslist);
                                intent.putExtras(bundle);
                                startActivity(intent);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
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
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,a8_URL, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {

                            try {
                                JSONArray array = new JSONArray(response);
                                ArrayList<String> startlist = new ArrayList<String>();
                                ArrayList<String> endlist = new ArrayList<String>();
                                ArrayList<String> lslist = new ArrayList<String>();
                                ArrayList<String> rslist = new ArrayList<String>();

                                for (int i = 0; i < array.length(); i++) {
                                    JSONObject jsonObject = array.getJSONObject(i);
                                    String id = jsonObject.getString("id");
                                    String tag = jsonObject.getString("tag");
                                    String start = jsonObject.getString("start");
                                    String end = jsonObject.getString("end");
                                    String ls = jsonObject.getString("ls");
                                    String rs = jsonObject.getString("rs");
                                    startlist.add(start);
                                    endlist.add(end);
                                    lslist.add(ls);
                                    rslist.add(rs);
                                    Log.e("TAG", "id:" + id + ", tag:" + tag + ", start:" + start+", end:"+end+", ls:"+ls+", rs:"+rs);
                                }
                                Intent intent = new Intent();
                                intent.setClass(getActivity(), drawlist.class);
                                Bundle bundle = new Bundle();

                                bundle.putSerializable("startList", startlist);
                                bundle.putSerializable("endList", endlist);
                                bundle.putSerializable("lsList", lslist);
                                bundle.putSerializable("rsList", rslist);
                                intent.putExtras(bundle);
                                startActivity(intent);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
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
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,a9_URL, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {

                            try {
                                JSONArray array = new JSONArray(response);
                                ArrayList<String> startlist = new ArrayList<String>();
                                ArrayList<String> endlist = new ArrayList<String>();
                                ArrayList<String> lslist = new ArrayList<String>();
                                ArrayList<String> rslist = new ArrayList<String>();

                                for (int i = 0; i < array.length(); i++) {
                                    JSONObject jsonObject = array.getJSONObject(i);
                                    String id = jsonObject.getString("id");
                                    String tag = jsonObject.getString("tag");
                                    String start = jsonObject.getString("start");
                                    String end = jsonObject.getString("end");
                                    String ls = jsonObject.getString("ls");
                                    String rs = jsonObject.getString("rs");
                                    startlist.add(start);
                                    endlist.add(end);
                                    lslist.add(ls);
                                    rslist.add(rs);
                                    Log.e("TAG", "id:" + id + ", tag:" + tag + ", start:" + start+", end:"+end+", ls:"+ls+", rs:"+rs);
                                }
                                Intent intent = new Intent();
                                intent.setClass(getActivity(), drawlist.class);
                                Bundle bundle = new Bundle();

                                bundle.putSerializable("startList", startlist);
                                bundle.putSerializable("endList", endlist);
                                bundle.putSerializable("lsList", lslist);
                                bundle.putSerializable("rsList", rslist);
                                intent.putExtras(bundle);
                                startActivity(intent);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
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
                    StringRequest stringRequest = new StringRequest(Request.Method.POST,a10_URL, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {

                            try {
                                JSONArray array = new JSONArray(response);
                                ArrayList<String> startlist = new ArrayList<String>();
                                ArrayList<String> endlist = new ArrayList<String>();
                                ArrayList<String> lslist = new ArrayList<String>();
                                ArrayList<String> rslist = new ArrayList<String>();

                                for (int i = 0; i < array.length(); i++) {
                                    JSONObject jsonObject = array.getJSONObject(i);
                                    String id = jsonObject.getString("id");
                                    String tag = jsonObject.getString("tag");
                                    String start = jsonObject.getString("start");
                                    String end = jsonObject.getString("end");
                                    String ls = jsonObject.getString("ls");
                                    String rs = jsonObject.getString("rs");
                                    startlist.add(start);
                                    endlist.add(end);
                                    lslist.add(ls);
                                    rslist.add(rs);
                                    Log.e("TAG", "id:" + id + ", tag:" + tag + ", start:" + start+", end:"+end+", ls:"+ls+", rs:"+rs);
                                }
                                Intent intent = new Intent();
                                intent.setClass(getActivity(), drawlist.class);
                                Bundle bundle = new Bundle();

                                bundle.putSerializable("startList", startlist);
                                bundle.putSerializable("endList", endlist);
                                bundle.putSerializable("lsList", lslist);
                                bundle.putSerializable("rsList", rslist);
                                intent.putExtras(bundle);
                                startActivity(intent);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
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
