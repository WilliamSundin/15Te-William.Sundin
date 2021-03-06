import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class Game extends JPanel {
	
	Ball ball = new Ball(this);
	Racket racket = new Racket(this);
	Font scoreFont = new Font("SansSerif", Font.PLAIN, 30);
	
	public Game(){
		addKeyListener(new KeyListener() {	
		
			
			public void keyPressed(KeyEvent e) {
			racket.keyPressed(e);	
			}
			
			public void keyReleased(KeyEvent e) {
			racket.keyReleased(e);	
			}
			
			public void keyTyped(KeyEvent e) {
				
			}
			
		});
		setFocusable(true);
	}
	
	private void move(){
		ball.moveBall();
		racket.move();
	}
	
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		ball.paint(g2d);
		racket.paint(g2d);
		g2d.setFont(scoreFont);
		g2d.drawString("Score: " + ball.getScore(), 15, 30);
	}
	
	
	public void gameOver() {
		JOptionPane.showMessageDialog(this, "Game Over", "Game Over", JOptionPane.YES_NO_OPTION);
		System.exit(ABORT);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Game game = new Game();
		
		frame.setSize(800, 700); //x,y
		frame.setLocation(300,100); // x,y
		frame.setDefaultCloseOperation(3);
		frame.add(game);
		frame.setTitle("Oh, I see you looked over here");
     	frame.setResizable(false);
		frame.setVisible(true);
		while(true){
			game.move();
			game.repaint();
			try{
				Thread.sleep(10);
			} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}

