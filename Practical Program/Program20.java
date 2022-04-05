/*Write an applet program which accepts number of ovals user wants to display using parameter
tag and draws ovals in different positions.*/

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="Program10.java" height=500 width=500></applet>*/

public class Program10 extends Applet implements ActionListener
{
    TextField t1,t2;
    Button b1;
    String s=" ";
    public void init()
    {
        t1=new TextField();
        add(t1);
        b1=new Button("Draw");
        add(b1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        s=ae.getActionCommand();
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString("Enter the number for draw circles",10,10);
        int x=0;
        int n=0;

        x=Integer.parseInt(t1.getText());
        for(int i=1;i<=x;i++)
        {
            g.drawOval(20+n, 20+n, 100, 100);
        }
    }
}
