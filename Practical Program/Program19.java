//Write a program to draw circle inside a square in applet with different colours.

import java.awt.*;
import java.applet.*;
/*
<applet code="Program9.class" height="500" width="500">
</applet>*/
public class Program9 extends Applet
{
public void paint(Graphics g)
{

//g.drawString("Squar Inside A Circle",150,110);
g.setColor(Color.YELLOW);
g.fillOval(180,10,80,80);
g.setColor(Color.RED);
g.fillRect(192,22,55,55);


}
}
