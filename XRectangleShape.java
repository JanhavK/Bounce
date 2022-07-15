/*
 *	===============================================================================
 *	RectangleShape.java : A shape that is a xrectangle.
 *  NAME: JANHAV KHANNA
 *  YOUR UPI: JKHA639
 *  DATE: 20/05/21
 *  DESCRIPTION: This is the xrectangle shape class which handles the values and drawing of the shape XRectangle.
 *	=============================================================================== */
import java.awt.*;
class XRectangleShape extends RectangleShape {

	/** constructor to create a rectangle with default values */
	public XRectangleShape() { super(); }
	public XRectangleShape(int x, int y, int width, int height, int marginwidth, int marginheight, Color bordercolor, Color fillcolor, PathType pathtype){
        super(x, y, width, height, marginwidth, marginheight, bordercolor, fillcolor, pathtype);
    }
    
    public XRectangleShape(int x, int y, int width, int height, int marginwidth, int marginheight, Color bordercolor, Color fillcolor, PathType pathtype, String t){
        super(x, y, width, height, marginwidth, marginheight, bordercolor, fillcolor, pathtype, t);
    }
	/** draw the rectangle with the fill colour
	 *	If it is selected, draw the handles
	 *	@param g	the Graphics control */
	@Override
	public void draw(Painter g2d) {
		super.draw(g2d);
		g2d.drawLine(x, y, x+width, y+height);
		g2d.drawLine(x+width, y, x, y+height);
	}
}