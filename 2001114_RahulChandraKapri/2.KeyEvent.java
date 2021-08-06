import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class KeyEvent extends Applet implements KeyListener
{
	String msg = "";
 
    public void init()
    {
        addKeyListener(this);
    }
 
    public void keyReleased(KeyEvent k)
    {
        showStatus("Key Released");
        repaint();
    }
 
    public void keyTyped(KeyEvent k)
    {
        showStatus("Key Typed");
        repaint();
    }
 
    public void keyPressed(KeyEvent k)
    {
        showStatus("Key Pressed");
        repaint();
    }
 
    public void paint(Graphics g)
    {
        g.drawString(msg, 10, 10);
    }

	@Override
	public void keyTyped(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}