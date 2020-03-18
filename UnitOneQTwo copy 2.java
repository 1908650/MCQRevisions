
/**
 * Write a description of class UnitOneQTwo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitOneQTwo
{
    public static void main(String[]args){
        //Topic 1.5: Casting and Ranges of Variables
        System.out.println("Topic 1.5");
        double d = 0.25;
        int i = 3;
        double diff = d - i;
        System.out.println((int)diff - 0.5); //prints -2.5
        //diff = -2.75 -> (int)diff = -2 -> -2 - 0.5 = -2.5
    }
}
