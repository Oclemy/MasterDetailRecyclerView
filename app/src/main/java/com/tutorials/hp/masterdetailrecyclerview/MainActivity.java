package com.tutorials.hp.masterdetailrecyclerview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.tutorials.hp.masterdetailrecyclerview.mData.SpaceCraftsCollection;
import com.tutorials.hp.masterdetailrecyclerview.mRecycler.MyAdapter;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView rv= (RecyclerView) findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter adapter=new MyAdapter(this, SpaceCraftsCollection.getSpaceCrafts());
        rv.setAdapter(adapter);
    }

}
