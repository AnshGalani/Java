/*Create an applet which displays a solid square having red colour. Display name of your college
within the square with font style =’Times New Roman’, font size=12 and font colour=’Yellow’.*/

import java.applet.*;
import java.awt.*;

/*<applet code="Program8" height="500" width="500">
</applet>
*/
public class Program8 extends Applet
{
    Font f1;
    public void init()
    {
        f1 = new Font("Times new roman",Font.BOLD,18); 
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.fillRect(10,15,200,200);
        g.setColor(Color.yellow);
        g.setFont(f1);
        g.drawString("VTCBCSR",75,100);
    }
}
