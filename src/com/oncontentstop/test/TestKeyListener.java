package com.oncontentstop.test;

import com.oncontentstop.mygl.Graphics;
import com.oncontentstop.mygl.KeyInterface;

import java.awt.event.KeyEvent;

/**
 * Created by mario on 4/13/2017.
 */
public class TestKeyListener implements KeyInterface {
	private Graphics graphics;
	
	public TestKeyListener(Graphics graphics) {
		this.graphics = graphics;
	}
	
	@Override
	public void pressKey(KeyEvent e) {
		graphics.handleKey(e);
	}
	
	@Override
	public void releaseKey(KeyEvent e) {
	
	}
}
