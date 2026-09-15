import java.util.ArrayList;
import java.awt.Rectangle;
public class BigRecLister {
    public static void main(String[] args){
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        //<10
        rectangles.add(new Rectangle(0,0,1,1));
        rectangles.add(new Rectangle(0,0,2,1));
        rectangles.add(new Rectangle(0,0,2,2));
        rectangles.add(new Rectangle(0,0,3,2));

        //>10
        rectangles.add(new Rectangle(0,0,6,3));
        rectangles.add(new Rectangle(0,0,10,10));
        rectangles.add(new Rectangle(0,0,8,5));
        rectangles.add(new Rectangle(0,0,4,4));
        rectangles.add(new Rectangle(0,0,20,1));
        rectangles.add(new Rectangle(0,0,3,5));

        System.out.println("All Rectangles: ");
        for(Rectangle r : rectangles){
            int perimeter = 2 * (r.width + r.height);
            System.out.println("width=" + r.width + " height=" + r.height + " perimeter=" + perimeter);
        }
        BigRectangleFilter filter = new BigRectangleFilter() {};
        System.out.println("\nRectangles with perimeter > 10:");
        for(Rectangle r : rectangles){
            if(filter.accepts(r)){
                int perimeter = 2 * (r.width + r.height);
                System.out.println("width=" + r.width + " height=" + r.height + " perimeter=" + perimeter);            }
        }
    }
}
