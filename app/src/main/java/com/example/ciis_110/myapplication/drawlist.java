package com.example.ciis_110.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class drawlist extends AppCompatActivity {
    private ListView mListView;

    ArrayList<String> startlist ;
    ArrayList<String> endlist ;
    ArrayList<String> lslist ;
    ArrayList<String> rslist ;
    int index ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawlist);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        startlist =((ArrayList<String>) bundle.getSerializable("startList"));
        endlist =((ArrayList<String>) bundle.getSerializable("endList"));
        lslist =((ArrayList<String>) bundle.getSerializable("lsList"));
        rslist =((ArrayList<String>) bundle.getSerializable("rsList"));

        index=startlist.size()-1;

        mListView = (ListView) findViewById(R.id.list);
        mListView.setAdapter(new MyAdapter());

    }

    private class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 3*startlist.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View v = convertView;
            Holder holder;
            if(v == null){
                v = LayoutInflater.from(getApplicationContext()).inflate(R.layout.list_item, null);
                holder = new Holder();
                holder.ls = (TextView) v.findViewById(R.id.ls);
                holder.name = (TextView) v.findViewById(R.id.name);
                holder.rs = (TextView) v.findViewById(R.id.rs);

                v.setTag(holder);
            } else{
                holder = (Holder) v.getTag();
            }
            int pos = position%3;
            if(index<0){
                ;
            }else {
                switch (pos) {
                    case 0:
                        holder.ls.setText("");
                        Log.e("chk>>>", startlist.get(index-(position/3)).toString()+"<>"+index);
                        holder.name.setText(startlist.get(index-(position/3)).toString());

                        holder.rs.setText("");

                        //holder.rs.setBackgroundColor(Color.parseColor("#000000"));
                        break;
                    case 1:
                        holder.ls.setText("↑\n"+lslist.get(index-(position/3)).toString()+"\n↑");
                        if(lslist.get(index-(position/3)).toString().equals("No Data")){
                            Log.e("chk>>>", lslist.get(index-(position/3)).toString()+"<2>"+index);
                            holder.ls.setBackgroundColor(Color.parseColor("#7b7b7b"));
                        }else {

                            int speed = Integer.parseInt(lslist.get(index - (position / 3)).toString());
                            Log.e("chk>>>", lslist.get(index-(position/3)).toString()+"<3>"+speed);
                            if (speed <= 30) {
                                holder.ls.setBackgroundColor(Color.parseColor("#f9f900"));
                            }else{
                                holder.ls.setBackgroundColor(Color.parseColor("#00FF00"));
                            }
                        }
                        holder.name.setText("");
                        holder.rs.setText("↓\n"+rslist.get(index-(position/3)).toString()+"\n↓");
                        if(rslist.get(index-(position/3)).toString().equals("No Data")){
                            holder.rs.setBackgroundColor(Color.parseColor("#7b7b7b"));
                        }else {
                            int speed = Integer.parseInt(rslist.get(index - (position / 3)).toString());
                            if (speed <= 30) {
                                holder.rs.setBackgroundColor(Color.parseColor("#f9f900"));
                            }else{
                                holder.rs.setBackgroundColor(Color.parseColor("#00FF00"));
                            }
                        }



                        break;
                    case 2:
                        holder.ls.setText("");
                        holder.name.setText(endlist.get(index-(position/3)).toString());
                        Log.e("chk>>>", startlist.get(index-(position/3)).toString()+"<>"+index);
                        holder.rs.setText("");
                        //index--;
                        break;

                }

            }
            return v;
        }
        class Holder{
            TextView ls;
            TextView name;
            TextView rs;
        }
    }
}
