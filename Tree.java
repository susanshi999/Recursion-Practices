import java.awt.*;
import java.awt.geom.*;
import java.util.function.*;
import javax.swing.*;
import javax.swing.event.*;

public class Tree
{
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                frame();
            }
        });
    }    

    private static void frame()
    {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setLayout(new BorderLayout());

        TreePanel p = new TreePanel();
        p.setPreferredSize(new Dimension(500,500));
        f.getContentPane().add(p, BorderLayout.CENTER);


        f.pack();
        f.setVisible(true);
    }


}


class TreePanel extends JPanel
{
    private double ll = 3.0 / 4.0;
    private double lw = 3.0 / 4.0;
    private double la = Math.PI / 5.0;
    private double rl = 2.0 / 3.0;
    private double rw = 1.0 / 2.0;
    private double ra = - Math.PI / 5.0; 

    protected void paintComponent(Graphics gr)
    {
        super.paintComponent(gr);
        Graphics2D g = (Graphics2D)gr;
        Point2D start = new Point2D.Double( getWidth() * 0.5, getHeight() * 0.7);
 
        drawTree(g, start, 100.0, 2.0, 10.0, 0);
    }

    private void drawTree(Graphics2D g,  Point2D start, double length, double minLength, double width, double alpha)
    {
        if (length < minLength)
        {
            return;
        }
        g.setStroke(new BasicStroke((float)width, 
            BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        Point2D end = new Point2D.Double(
            start.getX() + Math.sin(alpha + Math.PI) * length,
            start.getY() + Math.cos(alpha + Math.PI) * length);
        g.draw(new Line2D.Double(start, end));
        drawTree(g, end, length * ll, minLength, 
            width * lw, alpha + la);
        drawTree(g, end, length * rl, minLength, 
            width * rw, alpha + ra);
    }


}