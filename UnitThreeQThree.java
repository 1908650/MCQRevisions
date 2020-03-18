
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
        System.out.println("when x is smaller than y");
        codeOne(1,2);
        codeTwo(1,2);
        System.out.println("when x is greater than y");
        codeOne(2,1);
        codeTwo(2,1);
        //both print the same things. When x < y, the code evaluates the 
        //difference, x-y. When x>y, y-x is evaluated
    }

    public static void codeOne(int x ,int y){
        int result = 0;
        if (x > y){
            result = x - y;
            System.out.println(result);
        } else if (x < y) {
            result = y - x;
            System.out.println(result);
        } else {
            System.out.println(result);
        }
    }
    
    public static void codeTwo(int x, int y){
        if (x < y) {
            System.out.println(y - x);
        } else {
            System.out.println(x - y);
        }
    }
}
