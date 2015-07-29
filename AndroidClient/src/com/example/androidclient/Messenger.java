package com.example.androidclient;

import java.io.PrintWriter;
import java.io.Serializable;
import java.util.TimerTask;


import android.R.color;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Messenger extends Activity implements Serializable {

	private EditText etMessage;
	private TextView tvChat;
	
	private Messenger messenger;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_messenger);

		etMessage = (EditText) findViewById(R.id.etMessage);
		tvChat = (TextView) findViewById(R.id.tvChat);
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.messenger, menu);
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

	public void sendeMessage(View view) {

		ClientLogin.getWriter().write(etMessage.getText().toString() + "\n");
		ClientLogin.getWriter().flush();
		ClientLogin.getWriter().write("");
		ClientLogin.getWriter().flush();
		


	}
	
	public void aktualisieren(View view) {
		
		
		//String str = ClientLogin.leseVonServer();

		
		tvChat.append("test");
	
	
	}
	
}

