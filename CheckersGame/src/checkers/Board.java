package checkers;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class Board extends JPanel implements MouseListener {
		private Square[][] squares = new Square[8][8];
	
		private int turn = Square.WHITE;
		
		private Square firstSelected = null;
		private Square secondSelected = null;
	
		public Board(){
				
				//setLayout(new GridLayout(8,8));
				
				boolean isWhite = true;   
				
			    for (int row = 0; row < 8; row++) {
			      for (int col = 0; col < 8; col++) {
			       
			        if (isWhite) {
			          squares[row][col] = new Square(row,col,Square.WHITE);
			          isWhite = false;
			        }
			        else {
			          squares[row][col] = new Square(row,col,Square.BLACK);
			          if(row < 3){
			        	  squares[row][col].addPiece(new Piece(Square.BLACK));
			          }
			          if(row > 4){
			        	  squares[row][col].addPiece(new Piece(Square.WHITE));
			          }
			          isWhite = true;
			        }
			        //add(squares[i][j]); 
			      }
			      if (row % 2 == 0)
				        isWhite = false; 
				      else
				        isWhite = true;
			     
			    } 
				this.addMouseListener(this);
			    
				
				
				repaint();
		}
	
	
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			for(int i = 0; i < 8; i++){
			    	for(int j = 0; j < 8; j++){
			    		squares[i][j].draw(g);
			    	}
			    }
		}


		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			Square s = squares[e.getY()/Square.SIZE][e.getX()/Square.SIZE];
			
			if(this.firstSelected == null){
				firstSelected = s;
			}
			else{
				secondSelected = s;
				move();
			}
			
		}

		public void move(){
			if(firstSelected.getPiece() != null){
				Piece p = firstSelected.getPiece();
				firstSelected.removePiece();
				secondSelected.addPiece(p);
				firstSelected = null;
				secondSelected = null;
				repaint();
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	
	
	
}
