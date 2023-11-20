package checkers;

import javax.swing.JFrame;


public class CheckerBoardApp  {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        //Create the Frame
        JFrame myFrame = new JFrame();
        myFrame.setSize(400, 600);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setTitle("Checkers");
        //Add Components
        myFrame.add(new Board());
        myFrame.setVisible(true);
		   
	}

}
