package question2;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Question2 extends Applet implements KeyListener {
    TextField textField, textField1, textField2, textField3;

    public void init() {
        textField = new TextField(20);
        textField.addKeyListener(this);
        textField1 = new TextField(70);
        textField2 = new TextField(70);
        textField3 = new TextField(70);
        add(textField);
        add(textField1);
        add(textField3);
        add(textField2);
    }
    public void keyTyped(KeyEvent e) {
        textField1.setText("key Released:-  " + e.getKeyChar());
    }
    public void keyReleased(KeyEvent e) {
        textField3.setText("key Released:-  " + e.getKeyChar());
    }
    public void keyPressed(KeyEvent e) {
        int kc;
        String s;
        kc = e.getKeyCode();
        s = e.getKeyText(kc);
        textField2.setText("Key Pressed: - " + s);
    }
}
