package com.example.savingdata;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void persistData(View view)
	{
		Intent intent = new Intent(this, PersistDataActivity.class);
		
		EditText et = (EditText) findViewById(R.id.editText1);
		String message = et.getText().toString();
		
		SharedPreferences sp = this.getSharedPreferences("app-data", Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = sp.edit();
		editor.putString("msg", message);
		editor.commit();
		
		startActivity(intent);
	}

}
