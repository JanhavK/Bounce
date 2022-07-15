/*
 *	===============================================================================
 *	RectangleShape.java : A shape that is a rectangle.
 *  NAME: JANHAV KHANNA
 *  YOUR UPI: JKHA639
 *  DATE: 20/05/21
 *  DESCRIPTION: This is the rectangle shape class which handles the values and drawing of the shape Rectangle.
 *	=============================================================================== */
import java.awt.*;
class RectangleShape extends Shape {

	/** constructor to create a rectangle with default values */
	public RectangleShape() { super(); }
	public RectangleShape(int x, int y, int width, int height, int marginwidth, int marginheight, Color bordercolor, Color fillcolor, PathType pathtype){
        super(x, y, width, height, marginwidth, marginheight, bordercolor, fillcolor, pathtype);
    }
    
    public RectangleShape(int x, int y, int width, int height, int marginwidth, int marginheight, Color bordercolor, Color fillcolor, PathType pathtype, String t){
        super(x, y, width, height, marginwidth, marginheight, bordercolor, fillcolor, pathtype, t);
    }
	/** draw the rectangle with the fill colour
	 *	If it is selected, draw the handles
	 *	@param g	the Graphics control */
	@Override
	public void draw(Painter g2d) {
		g2d.setPaint(fillColor);
		g2d.fillRect(x, y, width, height);
		g2d.setPaint(borderColor);
		g2d.drawRect(x, y, width, height);
	}
	/** Returns whether the point is in the rectangle or not
	 * @return true if and only if the point is in the rectangle, false otherwise. */
	@Override
	public boolean contains(Point mousePt) {
		return (x <= mousePt.x && mousePt.x <= (x + width + 1)	&&	y <= mousePt.y && mousePt.y <= (y + height + 1));
	}
}