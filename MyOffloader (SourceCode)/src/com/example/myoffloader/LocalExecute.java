package com.example.myoffloader;

import android.os.Bundle;

import android.app.*;
import android.content.Intent;
import android.view.Menu;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class LocalExecute extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.local_layout);
        Intent myIntent=getIntent();
        RelativeLayout mylayout=(RelativeLayout)findViewById(R.id.relativelayout);
        TextView text=(TextView)findViewById(R.id.textViewnumber);
        text.setText(3);
        
        if(myIntent.getStringExtra("Type")=="nQueens")
        {
        	int n=Integer.parseInt(myIntent.getStringExtra("nValue"));
            TextView mytext=new TextView(this);
            
            text.setText(n);
            mytext.setText(n);
            mytext.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT));
            mylayout.addView(mytext);
        }
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}