package com.example.myoffloader;

import android.os.Bundle;

import android.app.*;
import android.content.Intent;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost = getTabHost();
        TabSpec queenspec = tabHost.newTabSpec("Nqueens");
        // setting Title and Icon for the Tab
        queenspec.setIndicator("N-Queens");
        Intent queensIntent = new Intent(this, nqueens.class);
        queenspec.setContent(queensIntent);
         
       
        TabSpec imagespec = tabHost.newTabSpec("Image Conversion");        
        imagespec.setIndicator("Image Conversion");
        Intent imageIntent = new Intent(this, imageConversion.class);
        imagespec.setContent(imageIntent);
         
        
         
       
        tabHost.addTab(queenspec); 
        tabHost.addTab(imagespec); 
         
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
