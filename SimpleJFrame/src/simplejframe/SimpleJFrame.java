/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplejframe;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Daniel A Narterh
 */
public class SimpleJFrame extends JFrame
{

    /**
     * @param args the command line arguments
//     */
  public static void main(String[] args) {
      new SimpleJFrame();
    }
    

public SimpleJFrame()
{
super("Simple JFrame example");
setSize(400, 300);
setLocation(200, 100);
setDefaultCloseOperation(EXIT_ON_CLOSE);
getContentPane().setBackground(Color.black);
setVisible(true);
}
}
