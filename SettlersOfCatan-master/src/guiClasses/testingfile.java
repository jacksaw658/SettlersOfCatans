package guiClasses;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class testingfile implements ActionListener {
   JFrame myFrame = null;
   public static void main(String[] a) {
      (new testingfile()).test();
   }
   private void test() {
      myFrame = new JFrame("showOptionDialog() Test");
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container myPane = myFrame.getContentPane();
      JButton myButton = new JButton("Show");
      myButton.addActionListener(this);
      myPane.add(myButton);
      myFrame.pack();
      myFrame.setVisible(true);
   }
   public void actionPerformed(ActionEvent e) {
      int messageType = JOptionPane.QUESTION_MESSAGE;
      String[] options = {"Java", "C++", "VB", "PHP", "Perl"};
      int code = JOptionPane.showOptionDialog(myFrame, 
         "What language do you prefer?", 
         "Option Dialog Box", 0, messageType, 
         null, options, "PHP");
      System.out.println("Answer: "+code);
   }
}