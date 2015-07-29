package com.example.androidclient;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Serializable;

import com.example.androidclient.R.menu;


import android.R.color;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	
	private EditText etIp;
	private EditText etPort;

	private ClientLogin clientLogin;
	private Messenger messenger;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		System.out.println("gestartet");

		etIp = (EditText) findViewById(R.id.etIp);
		etPort = (EditText) findViewById(R.id.etPort);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

	public void loginClient(View view) {

		clientLogin = new ClientLogin();

		clientLogin.execute(etIp.getText().toString(), etPort.getText().toString());
		

		Intent intent = new Intent(getApplicationContext(), Messenger.class);
		startActivity(intent);
		
		
		
	
	}

}
