import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseApplet extends Applet
{
    JPanel p;
    JTextField t;
    String msg;
    public void init()
    {
        t=new JTextField(20);
        add(t);
        addMouseListener(new MouseAdapter()
                {
                public void mouseClicked(MouseEvent me)
                {
                msg="Mouse Clicked : X = "+me.getX() + " Y = "+me.getY();
                t.setText(msg);
                }
                });
        addMouseMotionListener(new MouseMotionAdapter()
                {
                public void mouseMoved(MouseEvent me)
                {
                msg="Mouse Moved : X = "+me.getX() +" Y = "+me.getY();
                t.setText(msg);
                }
                });
    }
}