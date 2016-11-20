package com.example.shubham.crappycurbs;

import android.app.DownloadManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        ImageButton img = (ImageButton)findViewById( R.id.imageButton);
        img.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this,QueryCloud.class));
            }
        }
        );

        ImageButton img2 = (ImageButton)findViewById( R.id.imageButton2);
        img2.setOnClickListener(new View.OnClickListener()
                               {
                                   @Override
                                   public void onClick(View v){
                                               startActivity(new Intent(MainActivity.this,ClickPicture2.class));
                                   }
                               }
        );

        ImageButton img3 = (ImageButton)findViewById( R.id.imageButton3);
        img3.setOnClickListener(new View.OnClickListener()
                               {
                                   @Override
                                   public void onClick(View v){
                                       Intent intent = new Intent();
                                       intent.setAction(Intent.ACTION_VIEW);
                                       intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                       intent.setData(Uri.parse("https://www.youtube.com/watch?v=NRh-4Y3aNeo"));
                                       startActivity(intent);

                                   }
                               }
        );
    }




}
