package com.oncontentstop.test;

/**
 * Created by mario on 4/13/2017.
 */
public class TestMain {
	public static void main(String[] args) {
		TestWindow testWindow = new TestWindow();
		testWindow.setVisible(true);
		new Thread(testWindow).start();
	}
}
