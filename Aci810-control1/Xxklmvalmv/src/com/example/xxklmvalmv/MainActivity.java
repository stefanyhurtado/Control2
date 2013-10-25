package com.example.xxklmvalmv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button send;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		send=(Button)findViewById(R.id.button1);
	}

	public void doSometing(View v)
	
	{
		Intent i=new Intent(this,Activitya.class);
		startActivity(i);
	}

}
