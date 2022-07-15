/*
 *  ============================================================================================
 *  enum which defines the type of shapes in A1
 *  NAME: JANHAV KHANNA
 *  YOUR UPI: JKHA639
 *  DATE: 20/05/21
 *  DESCRIPTION: This is the shapetype class which handles the different enums of each shape.
 *  ============================================================================================
 */
import java.util.*;
enum ShapeType { RECTANGLE, XRECTANGLE, SQUARE, OVAL, NESTED;
	private static final Random rand = new Random();
	private static final int SIZE = values().length;
	public static final ShapeType getShapeType(int index) { return values()[index]; }
	public ShapeType next() {
		return values()[(ordinal() + 1) % values().length];
		}
	public static ShapeType getRandomShapeType()  {
	    return values()[rand.nextInt(SIZE)];
  }
}