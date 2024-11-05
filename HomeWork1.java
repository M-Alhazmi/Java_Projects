/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

import java.awt.*; // For the Color class
import javax.swing.*; // For the JFrame class
public class HomeWork1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int w = 900; // Frame width
int h = 400; // Frame height
JFrame frame = new JFrame(); // Create a frame instance
DrawingCanvas canvas = new DrawingCanvas(w, h); 
frame.add(canvas); 
frame.getContentPane().setBackground(Color.white); // Set frame background color
frame.setSize(w, h); // Set frame size (width, height)
frame.setTitle("Drawing in Java"); // Set frame title
frame.setVisible(true); // Show frame
frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); // Close/Exit frame
}
}

 class DrawingCanvas extends JComponent {
// Constructor
public DrawingCanvas(int w, int h) {
setSize(new Dimension(w, h)); // Set drawing canvas size
}
@Override
protected void paintComponent(Graphics g) { // Override paintComponent method
Graphics2D g2d = (Graphics2D) g; // Cast g to a 2D graphics object

g2d.setColor(Color.RED);
g2d.fillArc(230, 100, 210, 200, 0, 180);

g2d.setColor(Color.BLACK);
g2d.drawArc(230, 100, 210, 200, 0, -180);

g2d.setColor(Color.DARK_GRAY);
g2d.fillRect(230, 190, 210, 25);

g2d.setColor(Color.DARK_GRAY);
g2d.fillOval(305, 170, 60, 60);

g2d.setColor(Color.WHITE);
g2d.fillOval(315, 180, 40, 40);

g2d.setColor(Color.BLACK);
g2d.drawOval(320, 185, 30, 30);

g2d.setColor(Color.BLACK);
g2d.setStroke(new BasicStroke(5));
g2d.drawOval(230, 100, 210, 200); // Adjusted position and size to contain all shapes

//-----------------------------------------------------------------------------------------------
g2d.setColor(Color.decode("#800080"));
g2d.setStroke(new BasicStroke(5));
g2d.drawOval(550, 80, 320, 250);
g2d.fillOval(550, 80, 320, 250);

g2d.setColor(Color.BLACK);
g2d.fillOval(600, 100, 210, 200); // Adjusted position and size to contain all shapes

g2d.setColor(Color.black);
g2d.drawArc(565, 120, 155, 90, -60, -180);

g2d.setColor(Color.white);
g2d.fillArc(570, 120, 150, 90, -60, -180);

g2d.setColor(Color.black);
g2d.drawArc(700, 120, 155, 90, 60, -180);

g2d.setColor(Color.white);
g2d.fillArc(700, 120, 150, 90, 60, -180);

g2d.setColor(Color.red);
g2d.fillArc(660, 240, 100, 20, 0, -180);
g2d.setStroke(new BasicStroke(0));
int[] xPoints = {690,680,685}; 
int[] yPoints = {250, 250,255}; 
Polygon fang = new Polygon(xPoints, yPoints, xPoints.length); 
g2d.setColor(Color.WHITE);
g2d.fillPolygon(fang);
g2d.drawPolygon(fang);

int[] xxPoints = {730,740,735}; 
int[] yyPoints = {250, 250,255}; 
 
g2d.setColor(Color.WHITE);
g2d.fillPolygon(xxPoints,yyPoints,3);
g2d.drawPolygon(xxPoints,yyPoints,3);

g2d.setColor(Color.BLACK);
g2d.fillOval(640,180,5,20);
g2d.fillOval(770,180,5,20);

g2d.setColor(Color.BLACK); // Set painting color
g2d.setFont(new Font("Chalkboard", Font.BOLD|Font.ITALIC, 30)); // Set text font (font, style, size)
g2d.drawString("PokeBall!", 240, 80); // Draw text (textString, x, y
g2d.drawString("Gastly!", 650, 60); // Draw text (textString, x, y

}
}


