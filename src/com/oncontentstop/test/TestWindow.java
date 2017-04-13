package com.oncontentstop.test;

import com.oncontentstop.mygl.*;

import java.awt.event.KeyEvent;

/**
 * Created by mario on 4/13/2017.
 */
public class TestWindow extends Graphics {
	private ButtonElement testButton;
	private Background testBackground;
	private TextEntryElement testTextBox;

	public TestWindow() {
		super("Test Window");
		frame.setKeyHandler(new TestKeyListener(this));
		frame.setSize(1000, 800);
		init();
	}
	private void init() {
		testButton = new ButtonElement(100, 100, 200, 50, this);
		testButton.setClickListener(() -> testTextBox.setText("Hello World!"));
		testButton.setText("World Crumbler");
		testTextBox = new TextEntryElement(200, 100, 200, 100, this);
		testTextBox.setVisible(true);
		testTextBox.setHasFocus(true);
	}
	protected void runActions() {
		draw();
	}
	protected void drawActions() {
		testButton.draw();
		testTextBox.draw();
	}
	public void handleKey(KeyEvent e) {
		testTextBox.handleKey(e);
	}
}
