/*
 *  ============================================================================================
 *  Text version of a painter
 *  NAME: JANHAV KHANNA
 *  YOUR UPI: JKHA639
 *  DATE: 20/05/21
 *  DESCRIPTION: This is the graphicspainter class which handles the values required to allow the painter class to function properly.
 *  ============================================================================================
 */
import java.awt.*;
import java.awt.Graphics2D;
public class GraphicsPainter implements Painter {
	private Graphics2D g;
	public GraphicsPainter() {
	}
	public void setGraphics(Graphics g) {
		this.g = (Graphics2D)g;
	}
	@Override
	public void drawLine(int x1, int y1, int x2, int y2) {
		g.drawLine(x1, y1, x2, y2);
	}
	@Override
	public void drawRect(int x, int y, int width, int height) {
		g.drawRect(x, y, width, height);
	}
	@Override
	public void fillRect(int x, int y, int width, int height) {
		g.fillRect(x, y, width, height);
	}
	@Override
	public void drawOval(int x, int y, int width, int height) {
		g.drawOval(x, y, width, height);
	}
	@Override
	public void fillOval(int x, int y, int width, int height) {
		g.fillOval(x, y, width, height);
	}
	@Override
	public void setPaint(Color c) {
		g.setPaint(c);
	}
	@Override
	public void drawHandles(boolean isSelected, int x, int y, int width, int height) {
		if (isSelected) {
            g.setPaint(Color.black);
            g.fillRect(x -2, y-2, 4, 4);
            g.fillRect(x + width -2, y + height -2, 4, 4);
            g.fillRect(x -2, y + height -2, 4, 4);
            g.fillRect(x + width -2, y-2, 4, 4);
        }
	}
	@Override
	public void translate(int x, int y) {
		g.translate(x, y);
	}
	@Override
	public void drawString(String t, int x, int y){
		g.drawString(t, x, y);
	}
	@Override
	public void setColor(Color c){
		g.setColor(c);
	}
	@Override
	public void drawCenteredText(String t, int x, int y, int w, int h) {
		FontMetrics fm = g.getFontMetrics();
		int as = fm.getAscent();
		int de = fm.getDescent();
		int he = fm.getHeight();
		int sw = fm.stringWidth(t);
		int xd;
		int yd;
		
		xd = x + ((w - sw) / 2);
		yd = y + ((h + (as - de))/2);
		
		g.drawString(t,xd,yd);
		
	}
}
