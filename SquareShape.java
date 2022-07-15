/*
 *	===============================================================================
 *	SquareShape.java : A shape that is a square.
 *  NAME: JANHAV KHANNA
 *  YOUR UPI: JKHA639
 *  DATE: 20/05/21
 *  DESCRIPTION: This is the square shape class which handles the values and drawing of the shape Square.
 *	=============================================================================== */
import java.awt.*;
class SquareShape extends RectangleShape {

	/** constructor to create a rectangle with default values */
	public SquareShape() {
		this(DEFAULT_X, DEFAULT_Y, Math.min(DEFAULT_WIDTH, DEFAULT_HEIGHT), DEFAULT_MARGIN_WIDTH, DEFAULT_MARGIN_HEIGHT, DEFAULT_BORDER_COLOR,DEFAULT_FILL_COLOR, DEFAULT_PATHTYPE); // the default properties
	}
	public SquareShape(int x, int y, int s, int mw, int mh, Color bc, Color fc, PathType pt) {
		super(x ,y ,s, s ,mw ,mh, bc, fc, pt);
		validateSquare();
	}
	public SquareShape(int x, int y, int size, int marginwidth, int marginheight, Color bordercolor, Color fillcolor, PathType pathtype, String t){
        super(x, y, size, size, marginwidth, marginheight, bordercolor, fillcolor, pathtype, t);
		validateSquare();
	}
	/** validate the height and width of the square. */
	private void validateSquare() {
		if (height != width) {
			int size = Math.min(height, width);
			super.setHeight(size);
			super.setWidth(size);
		}
	}
    /** Set the height and width of the shape.
     * @param h     the height/width value */
	public void setHeight(int h) {
		super.setHeight(h);
		super.setWidth(h);
	}
    /** Set the height and width of the shape.
     * @param w     the height/width value */
	public void setWidth(int w) {
		super.setHeight(w);
		super.setWidth(w);
	}
}