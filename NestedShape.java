/*
 *	===============================================================================
 *	NestedShape.java : A shape that is a rectangle.
 *  NAME: JANHAV KHANNA
 *  YOUR UPI: JKHA639
 *  DATE: 20/05/21
 *  DESCRIPTION: This is the nested shape class which handles the values and drawing of the shape Nested.
 *	=============================================================================== */
import java.awt.*;
import java.util.ArrayList;
class NestedShape extends RectangleShape{
    private ArrayList<Shape> nestedShapes = new ArrayList<Shape>();
    private static ShapeType nextShapeType = ShapeType.NESTED;
    
    public NestedShape(){
    }
    
    public NestedShape(int x, int y, int w, int h, int mw, int mh, Color bc, Color fc, PathType pt){
        super(x, y, w, h, mw, mh, bc, fc, pt);
        nextShapeType = nextShapeType.next();
        createAddInnerShape(nextShapeType);
    }
    
    public NestedShape(int x, int y, int w, int h, int mw, int mh, Color bc, Color fc, PathType pt, String t){
        super(x, y, w, h, mw, mh, bc, fc, pt, t);
        nextShapeType = nextShapeType.next();
        createAddInnerShape(nextShapeType);
    }
    
    public void createAddInnerShape(ShapeType st){
        switch (st) {
            case RECTANGLE:
                Shape r = new RectangleShape(0, 0, super.width / 2, super.height / 2, super.width, super.height, super.borderColor, super.fillColor, PathType.BOUNCE, super.text);
                r.setParent(this);
                nestedShapes.add(r);
            break;
            
            case XRECTANGLE:
                Shape t = new XRectangleShape(0, 0, super.width / 2, super.height / 2, super.width, super.height, super.borderColor, super.fillColor, PathType.BOUNCE, super.text);
                t.setParent(this);
                nestedShapes.add(t);
            break;
            
            case SQUARE:
                int h = Math.min(super.width, super.height);
                Shape j = new SquareShape(0, 0, h / 2, super.width, super.height, super.borderColor, super.fillColor, PathType.BOUNCE, super.text);
                j.setParent(this);
                nestedShapes.add(j);
            break;
            
            case OVAL:
                Shape k = new OvalShape(0, 0, super.width / 2, super.height / 2, super.width, super.height, super.borderColor, super.fillColor, PathType.BOUNCE, super.text);
                k.setParent(this);
                nestedShapes.add(k);
            break;
            
            case NESTED:
                Shape i = new NestedShape(0, 0, super.width / 2, super.height / 2, super.width, super.height, super.borderColor, super.fillColor, PathType.BOUNCE, super.text);
                i.setParent(this);
                nestedShapes.add(i);
            break;
        }
    }
    
    public Shape getShapeAt(int index){
        return nestedShapes.get(index);
    }
    
    public int getSize(){
        return nestedShapes.size();
    }
    
    public void draw(Painter g){
        g.setPaint(Color.BLACK);
        g.drawRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
        g.translate(super.getX(), super.getY());
        for(int i = 0; i < getSize(); i++){
            Shape s = nestedShapes.get(i);
            s.draw(g);
        }
        g.translate(-super.getX(), -super.getY());
    }
    
    public void move(){
        super.move();
        for(int i = 0; i < getSize(); i++){
            Shape s = nestedShapes.get(i);
            s.move();
        }
    }
    public void add(Shape s){
        s.setParent(this);
        nestedShapes.add(s);
    }
    
    public void remove(Shape s){
        int ind = nestedShapes.indexOf(s);
        nestedShapes.get(ind).setParent(null);
        nestedShapes.remove(ind);
    }
    
    public int indexOf(Shape s){
        return nestedShapes.indexOf(s);
    }
    
    public Shape[] getChildren(){
        Shape[] sh = new Shape[getSize()];
        return nestedShapes.toArray(sh);
    }
}