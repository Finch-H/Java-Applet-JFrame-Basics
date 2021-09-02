/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alienpaint;



import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Daniel  A Narterh
 */
public class AlienPaint extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new PaintAnAlienInAJFrame();
     
    }
    

public void paint(Graphics g)
{
super.paint(g);
int[] xs = {0, 50, 50, 44, 37, 25, 13, 6, 0};
int[] ys = {60, 60, 90, 60, 90, 60, 90, 60, 90};
g.setColor(Color.YELLOW);
//draw the top of head
g.fillOval(0, 0, 50, 60);
//draw the middle of head
g.fillRect(0, 30, 50, 30);
//draw the bottom of head
g.fillPolygon(xs, ys, 9);
//draw features (not s
}
}
    

