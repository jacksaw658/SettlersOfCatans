package guiClasses;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import players.Player;
public class playerPickColor {
	Color playerColor;
	int color;
   public static void main(String[] a) {
      (new playerPickColor()).test(null);
   }
   public void test(String name)
   		{
	   color = Integer.parseInt(JOptionPane.showInputDialog(null, name + " type in your color" + "\n"
	   		+ "1 for blue, 2 for red, 3 for yellow, 4 for green"));
		      if (color == 1)
		      {
		    	  playerColor = Color.blue;
		      }
		      if(color == 2)
		      {
		    	  playerColor = Color.red;
		      }
		      if(color == 3)
		      {
		    	  playerColor = Color.yellow;
		      }
		      if(color == 4)
		      {
		    	  playerColor = Color.green;
		      }
		      else
		      {
		    	  playerColor=Color.pink;
		      }
		      
		   }
public Color getPlayerColor() {
	return playerColor;
}
public void setPlayerColor(Color playerColor) {
	this.playerColor = playerColor;
}
   
}