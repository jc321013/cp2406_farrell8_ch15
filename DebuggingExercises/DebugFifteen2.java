// Demonstrates layout positions
// using BorderLayout
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DebugFifteen2 extends JFrame
{
   // Use button labels that correspond to the positions in the layout
   JButton nb = new JButton("Up    ");
   JButton sb = new JButton("Down  ");
   JButton eb = new JButton("Right ");
   JButton wb = new JButton("Left  ");
   JButton cb = new JButton("Center");
   Container con = null;

   public DebugFifteen2()
   {
      con = this.getContentPane();
      con.setLayout(new BorderLayout());
      // include layout positions ("North", etc) in add() method calls
      con.add(nb, BorderLayout.NORTH);
      con.add(sb, BorderLayout.SOUTH);
      con.add(eb, BorderLayout.EAST);
      con.add(wb, BorderLayout.WEST);
      con.add(cb, BorderLayout.CENTER);
   }
   public static void main(String[] args)
   {
      DebugFifteen2 f = new DebugFifteen2();
      f.setSize(300, 300);
      f.setVisible(true);
   }
}