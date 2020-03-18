
/**
 * Write a description of class UnitThreeQThree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitThreeQThree
{   public static int x;
    public static int y;
    public static void main (String[] args){
    
    }

    public static void codeOne(){
        int result = 0;
        if (x > y){
            result = x - y;
            System.out.print(result);
        } else if (x < y) {
            result = y - x;
            System.out.print(result);
        } else {
            System.out.print(result);
        }
    }
    
    public static void codeTwo(){
        if (x < y) {
            System.out.print(y - x);
        } else {
            System.out.print(x - y);
        }
    }
}
