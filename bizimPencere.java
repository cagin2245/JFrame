import java.awt.Graphics;
import javax.swing.JFrame;

public class bizimPencere extends JFrame {
	public void paint(Graphics g) {
		super.paint(g);
		for(int i=0; i<50;i++) {
		g.drawRect(160-i, 120-i, 320-i, 240-i);
		g.drawRect(240+i, 180+i, 160+i, 120+i);
		}
	}
}
