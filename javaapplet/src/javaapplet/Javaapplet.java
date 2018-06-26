/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplet;
import java.awt.*;
import java.applet.*;

public class Javaapplet extends Applet {
String msg;

public void init() {
setBackground(Color.cyan);
setForeground(Color.red);
msg="inside init()";
}

public void start() {
msg += " inside start()";
}

public void paint(Graphics g) {
msg += " inside paint()";
g.drawString(msg,10,30);
}
}

