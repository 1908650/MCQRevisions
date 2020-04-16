
/**
 * Write a description of class UnitFourQThree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitFourQThree
{
    public static void main (String[] args){
        int a = 1;
        String result = "";
            while (a < 20){
                result += a;
                a += 5;
                System.out.println(result);
                //First iteration: a = 1 (< 20, enters loop), result = 1
                //Second iteration: a = 6 (< 20, enters loop), result = 16;
                //Third iteration: a = 11 (< 20, enters loop), result = 1611
                //Fourth iteration: a = 16 (< 20, enters loop), result = 161116
                //Fifth iteration: a = 21 (not less than 20), jumps out and
                //prints result, which is 161116
            }
        System.out.println(result);
    }
}
