/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplet;
import java.awt.*;
import java.applet.*;

public class polygons extends Applet {
    public void paint(Graphics g) {
        int xpoints[] = {30,200,30,200,30};
        int ypoints[]={30,30,200,200,30};
        int num=5;
        g.drawPolygon(xpoints, ypoints, num);
    }
}