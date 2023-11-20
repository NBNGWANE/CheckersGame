package checkers;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Square {
	
	public static final int SIZE = 60;
	public static final int BLACK = 0;
	public static final int WHITE = 1; 
	public static final int BLANK = 2;
	
	private Piece p = null;
	
	private int x, y,color;
	
	
	
	
	public Square(int row, int col,int color) {
		x = col * SIZE;
		y = row * SIZE;
		this.color = color;
	}
	
	public void draw(Graphics g) {
		
		if(color == BLACK){
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(x, y, SIZE, SIZE);
			g.setColor(Color.BLACK);
		}
		else{
			g.setColor(Color.WHITE);
			g.fillRect(x, y, SIZE, SIZE);
			g.setColor(Color.BLACK);
		}
		
		if(p != null){
			p.draw(g, x, y, SIZE, SIZE);
		}
		
	}

	public Piece getPiece() {
		return p;
	}

	public void addPiece(Piece p){
		this.p = p;
	}
	
	public void removePiece(){
		p = null;
	}
	
	public int getColor() {
		return color;
	}

	public void  kingMe(){
		if(p != null){
			p.makeKing();
		}
	}
	
	
	
}
