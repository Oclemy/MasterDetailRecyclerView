package com.tutorials.hp.masterdetailrecyclerview.mDetail;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutorials.hp.masterdetailrecyclerview.R;

public class DetailActivity extends AppCompatActivity {

    TextView nameTxt;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //INITIALIZE VIEWS
        nameTxt= (TextView) findViewById(R.id.nameTxtDetail);
        img= (ImageView) findViewById(R.id.spacecraftImageDetail);

        //RECEIVE DATA
        Intent i=this.getIntent();
        String name=i.getExtras().getString("NAME_KEY");
        int image=i.getExtras().getInt("IMAGE_KEY");

        //BIND DATA
        nameTxt.setText(name);
        img.setImageResource(image);
    }

}
