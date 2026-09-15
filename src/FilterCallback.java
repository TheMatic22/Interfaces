import java.awt.Rectangle;
interface FilterCallback<S> {
    boolean accepts(String S);
    boolean accepts(Rectangle r);
}
abstract class ShortWordFilter implements FilterCallback<String> {
    @Override
    public boolean accepts(String S){
        return S != null && S.length() == 5;
    }
}
abstract class BigRectangleFilter implements FilterCallback{
    public boolean accepts(String s){
        return false;
    }
    public boolean accepts(Rectangle r){
        int perimeter = 2 * (r.width + r.height);
            return perimeter > 10;
    }
}