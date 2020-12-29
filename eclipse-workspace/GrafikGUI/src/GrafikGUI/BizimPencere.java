package GrafikGUI;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;

public class BizimPencere extends JFrame implements MouseListener , KeyListener {
	
	Random rnd ;
	
	private int x1=20,y1=10;
	private int x2=100,y2=300;
	private String yazi;
	
	public BizimPencere() {
		super();
		rnd =new Random();
		addMouseListener(this);
		addKeyListener(this);
		x1=0;
		y1=0;
		x2=0;
		y2=0;
		yazi="merhabalar...";
		
	}
	public void paint(Graphics g) {
		super.paint(g);
		
		g.drawLine(x1, y1, x2, y2);
		/*
		 * Burda rastgele olu�turulmu� cizgileri rastgele konumlara bas�yoruz.
		for (int i = 1; i <= 0; i++) {
			g.drawLine(rnd.nextInt(640), rnd.nextInt(480), rnd.nextInt(640), rnd.nextInt(480));
		}
		g.drawRect(160, 120, 320, 240);
		g.drawLine(0, 0, 200, 300);
		*/
		
		
		g.drawString(yazi, x1, y1);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getButton()==e.BUTTON1) {
			x1=e.getX();
			y1=e.getY();
		}
		else if(e.getButton()==e.BUTTON3) {
			
			x2=e.getX();
			y2=e.getY();
		}
		repaint();
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
	
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode()==e.VK_ALPHANUMERIC) {
			yazi=yazi +e.getKeyChar();
		}
		else if (e.getKeyCode()==e.VK_BACK_SPACE&& yazi.length()>0) {
			yazi=yazi.substring(0, yazi.length()-1);
		}
		else {
			yazi+=e.getKeyChar();
		}
		repaint();
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
