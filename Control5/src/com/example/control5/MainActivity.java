package com.example.control5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	

	Button send=(Button)findViewById(R.id.button1);
	send.setOnClickListener(new OnClickListener(){

		@Override
		public void onClick(View arg0) {
			if(arg0.getId()==findViewById(R.id.button1).getId())
			{
			Intent i=new Intent(MainActivity.this,Pera.class);
			startActivity(i);
			
		}
		
	}
	});
	}
}

	

