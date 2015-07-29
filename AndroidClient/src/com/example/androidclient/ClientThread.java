package com.example.androidclient;


public class ClientThread implements Runnable {

	private Thread thread;
	private Messenger messenger;

	public ClientThread(Messenger messenger) {

		this.messenger = messenger;
		thread = new Thread(this);
		thread.start();

	}

	@Override
	public void run() {

		String str;

		while (true) {

			if ((str = ClientLogin.leseVonServer()) != "") {
				System.out.println(str);
			}

		}
	}

	public void start() {
		if (!thread.isAlive()) {
			thread.run();
		}
	}

}
