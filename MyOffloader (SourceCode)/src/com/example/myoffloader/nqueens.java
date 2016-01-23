package com.example.myoffloader;



import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;
 
public class nqueens extends Activity {
    @Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nqueens_layout);
        Button localButton = (Button)findViewById(R.id.localbutton);
        Button offButton=(Button)findViewById(R.id.offbutton);
        Button adapButton=(Button)findViewById(R.id.adapbutton);
        localButton.setOnClickListener(onClickListener);
        offButton.setOnClickListener(onClickListener);
        adapButton.setOnClickListener(onClickListener);
        
        
    }
    private OnClickListener onClickListener=new OnClickListener(){

		@Override
		public void onClick(View v) {
			EditText editTextN = (EditText)findViewById(R.id.editTextN);
			switch(v.getId())
			{
			case R.id.localbutton:
				Intent intent=new Intent(getApplicationContext(), LocalExecute.class);
				intent.putExtra("Type","nQueens");
				intent.putExtra("nValue",editTextN.getText().toString());
				startActivity(intent);
				break;
			case R.id.offbutton:
				Intent intent1=new Intent(getApplicationContext(), OffExecute.class);
				intent1.putExtra("Type","nQueens");
				intent1.putExtra("nValue",editTextN.getText().toString());
				startActivity(intent1);
				break;
			case R.id.adapbutton:
				Intent intent2=new Intent(getApplicationContext(), AdapExecute.class);
				intent2.putExtra("Type","nQueens");
				intent2.putExtra("nValue",editTextN.getText().toString());
				startActivity(intent2);
				break;
			}
			
			}
				   	
    };
}
