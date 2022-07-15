/*
 *  ============================================================================================
 *  Painter.java : Painter interface
 *  NAME: JANHAV KHANNA
 *  YOUR UPI: JKHA639
 *  DATE: 20/05/21
 *  DESCRIPTION: This is the painter class which handles the painter interface of the program.
 *  ============================================================================================
 */
import java.awt.*;
interface Painter {
    public void drawLine(int x1, int y1, int x2, int y2);
    public void drawRect(int x, int y, int width, int height);
    public void drawOval(int x, int y, int width, int height);
    public void fillRect(int x, int y, int width, int height);
    public void fillOval(int x, int y, int width, int height);
	public void setPaint(Color color);
	public void setGraphics(Graphics g);
	public void drawHandles(boolean isSelected, int x, int y, int width, int height);
    public void translate(int x, int y);
	public void drawString(String text, int x, int y);
	public void setColor(Color color);
	public void drawCenteredText(String text, int x, int y, int width, int height);
}