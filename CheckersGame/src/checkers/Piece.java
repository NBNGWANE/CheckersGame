package checkers;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Piece {
	
	
	private int color;
	private Image image = null;
	private boolean isKing = false;
	
	public Piece(int color){
		this.color = color;
		try{
			if(color == Square.BLACK)
				image = ImageIO.read(new File("images/black.gif"));
			else
				image = ImageIO.read(new File("images/red.gif"));
		} catch (IOException e){
			
		}
	}
	
	public void draw(Graphics g, int x, int y, int height, int width){
		if(image != null)
			g.drawImage(image, x +10 , y+10, (int)(width*0.7), (int)(height*0.7), null);
	}
	
	public int getColor(){
		return color;
	}
	
	public void makeKing(){
		
		isKing = true;
		try{
			
			if(color == Square.BLACK)
				image = ImageIO.read(new File("images/blackcrown.gif"));
			else
				image = ImageIO.read(new File("images/redcrown.png"));
		} catch (IOException e){
		
		}
	}
	
	public boolean isKing(){
		return isKing;
	}
	
	
}
