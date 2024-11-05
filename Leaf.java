/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaf;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.CubicCurve2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author moham
 */
public class Leaf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int w = 800; // Frame width
int h = 800; // Frame height
JFrame frame = new JFrame(); // Create a frame instance
frame.getContentPane().setBackground(Color.white); // Set frame background color
frame.setSize(w, h); // Set frame size (width, height)
frame.setLocationRelativeTo(null); // Set frame location to center of screen
frame.setTitle("Curves in Java"); // Set frame title
frame.add(new DrawingCanvas(w, h)); // Add drawing canvas to the frame
frame.setVisible(true); // Show frame
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close/Exit frame
}
}

class DrawingCanvas extends JComponent {
// Define curve variables
float[] x = new float[4]; // Control points x coord
float[] y = new float[4]; // Control points y coord
float step = 0.001f; // Parameter step size

public DrawingCanvas(int w, int h) {
this.setSize(new Dimension(w, h)); // Set canvas size
}


protected void paintComponent(Graphics g) {
Graphics2D g2d = (Graphics2D)g; 
// left curve
g2d.setColor(new Color(0, 150, 0));
g2d.fill(new CubicCurve2D.Double(
  323, 458, // x1, y1
 120, 110, // ctrlx1, ctrly1
 450, 141, // ctrlx2, ctrly2
 531, 96)); // x2, y2
g2d.fill(new CubicCurve2D.Double(
 323, 458, // x1, y1
 700, 420, // ctrlx1, ctrly1
 490, 141, // ctrlx2, ctrly2
 531, 96)); // x2, y2

g2d.setStroke(new BasicStroke(5));
g2d.setColor(Color.BLACK);
g2d.draw(new CubicCurve2D.Double(
 323, 558, // x1, y1
 300, 204, // ctrlx1, ctrly1
 490, 141, // ctrlx2, ctrly2
 531, 96)); // x2, y2


g2d.draw(new CubicCurve2D.Double(
 323, 458, // x1, y1
 112, 110, // ctrlx1, ctrly1
 490, 141, // ctrlx2, ctrly2
 531, 96)); // x2, y2

g2d.draw(new CubicCurve2D.Double(
 323, 458, // x1, y1
 700, 420, // ctrlx1, ctrly1
 490, 141, // ctrlx2, ctrly2
 531, 96)); // x2, y2

}
}





