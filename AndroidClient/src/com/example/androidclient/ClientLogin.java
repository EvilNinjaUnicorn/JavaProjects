package com.example.androidclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.net.Socket;
import java.net.UnknownHostException;

import android.R.color;
import android.content.Intent;
import android.os.AsyncTask;
import android.view.View;

class ClientLogin extends AsyncTask<String, Void, Void> {

	private static Socket socket;

	private static OutputStream os;
	private static PrintWriter writer;
	private static InputStream inputStream;
	private static BufferedReader reader;

	private ClientThread clientThread;

	@Override
	protected Void doInBackground(String... params) {

		try {

			socket = new Socket(params[0], Integer.parseInt(params[1]));

			os = socket.getOutputStream();
			setWriter(new PrintWriter(os));

			inputStream = socket.getInputStream();
			setReader(new BufferedReader(new InputStreamReader(inputStream)));


		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		getWriter().write("Android\n");
		getWriter().flush();

		return null;

	}



	public static PrintWriter getWriter() {
		return writer;
	}

	public static void setWriter(PrintWriter writer) {
		ClientLogin.writer = writer;
	}



	public static BufferedReader getReader() {
		return reader;
	}



	public static void setReader(BufferedReader reader) {
		ClientLogin.reader = reader;
		
		
	}

	public static String leseVonServer() {
		
		
		
		try {
			
			return reader.readLine();
		} catch (IOException e) {
			System.out.println("Feehler");
			e.printStackTrace();
		}
		
		return null;
	}


}
