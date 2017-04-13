package com.oncontentstop.test;

import com.oncontentstop.mygl.*;

/**
 * Created by mario on 4/13/2017.
 */
public class TestWindow extends Graphics {
	private ButtonElement testButton;
	private Background testBackground;
	private TextEntryElement testTextBox;

	public TestWindow() {
		super("Test Window");
		frame.setKeyHandler(new TestKeyListener());
		frame.setSize(1000, 800);
		init();
	}
	private void init() {
		testButton = new ButtonElement(this);
		testButton.setClickListener(() -> testTextBox.setText("Hello World!"));
	}
	protected void runActions() {
		draw();
	}
	protected void drawActions() {
		testButton.draw();
	}
}
