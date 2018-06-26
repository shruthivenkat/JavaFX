/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplet;

import java.awt.*;
import java.applet.*;

public class banner extends Applet implements Runnable {
String msg="A simple moving banner";
Thread t=null;
int state;
boolean stopFlag;

public void init() {
setBackground(Color.ORANGE);
setForeground(Color.RED);
}

public void start() {
t=new Thread(this);
stopFlag=false;
t.start();
}

public void run() {
	char ch;
	for(;;) {
		try {
			repaint();
			Thread.sleep(250);
			ch=msg.charAt(0);
			msg=msg.substring(1,msg.length());
			msg+=ch;
			if(stopFlag)
				break;
		} catch(InterruptedException e) {}
}
}

public void stop() {
	stopFlag=true;
	t=null;
}

public void paint(Graphics g) {
	g.drawString(msg,50,40);
}
}
