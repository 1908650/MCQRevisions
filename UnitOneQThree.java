
/**
 * Write a description of class UnitOneQThree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitOneQThree
{   public static void main(String[]args){
    //Topic 1.5: Casting and Ranges of Variables
        System.out.println("Topic 1.5");
        double fact1 = 1/2; //equals 0 since 1 and 2 are int by default
        double fact2 = 3*4; //equals 12
        double product = fact1 * fact2; //12 * 0 = 0
        System.out.println(product); //prints 0
        
        double fact3 = (double)1/2; //equals 0.5
        double fact4 = 3*4;
        double product2 = fact3 * fact4; 
        System.out.println(product2); //prints 6.0 as it should
    }
}
