package com.geekdroid.recyclerviewpost.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.geekdroid.recyclerviewpost.R;
import com.geekdroid.recyclerviewpost.adapter.AndroidVersionAdapter;
import com.geekdroid.recyclerviewpost.model.AndroidVersionModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AndroidVersionAdapter versionAdapter;
    private List<AndroidVersionModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=new ArrayList<>();
        recyclerView= findViewById(R.id.recylerView);

        versionAdapter=new AndroidVersionAdapter(list,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(versionAdapter);

        setDataToAdapter();
    }

    private void setDataToAdapter() {
        AndroidVersionModel obj=new AndroidVersionModel("Cupcake","1.5","April 27, 2009",3);
        list.add(obj);
        obj=new AndroidVersionModel("Donut	","1.6	","September 15, 2009",4);
        list.add(obj);
        obj=new AndroidVersionModel("Eclair","	2.0 – 2.1","	October 26, 2009",	5);
        list.add(obj);
        obj=new AndroidVersionModel("Froyo	","2.2 – 2.2.3",	"May 20, 2010",	8);
        list.add(obj);
        obj=new AndroidVersionModel("Gingerbread",	"2.3 – 2.3.7",	"December 6, 2010",	9);
        list.add(obj);
        obj=new AndroidVersionModel("Honeycomb"	,"3.0 – 3.2.6"	,"February 22, 2011"	,11);
        list.add(obj);
        obj=new AndroidVersionModel("Ice Cream Sandwich","4.0 – 4.0.4","October 18, 2011",14);
        list.add(obj);
        obj=new AndroidVersionModel("Jelly Bean	","4.1 – 4.3.1"	,"July 9, 2012",16);
        list.add(obj);
        obj=new AndroidVersionModel("KitKat	","4.4 – 4.4.4","October 31, 2013",19);
        list.add(obj);
        obj=new AndroidVersionModel("Lollipop"	,"5.0 – 5.1.1","November 12, 2014	",21);
        list.add(obj);
        obj=new AndroidVersionModel("Marshmallow",	"6.0 – 6.0.1",	"October 5, 2015",	23);
        list.add(obj);
        obj=new AndroidVersionModel("Nougat"	,"7.0 – 7.1.2	","August 22, 2016	",24);
        list.add(obj);
        obj=new AndroidVersionModel("Oreo",	"8.0 – 8.1","August 21, 2017",	26);
        list.add(obj);
        obj=new AndroidVersionModel("Pie	","9.0"	,"August 6, 2018"	,28);
        list.add(obj);
        obj=new AndroidVersionModel("Android 10	","10.0","September 3, 2019",29);
        list.add(obj);

        versionAdapter.notifyDataSetChanged();
    }
}
