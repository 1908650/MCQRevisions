
/**
 * Write a description of class Unit6QSix here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit6QSix
{
    public static void main (String[] args) {
        String [] fruits = {"apples", "bananas", "cherries", "dates"};
        
        for (int i = 0; i <= fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        /*produces an out of bounds exception at index 4.
         * i has to be less than or equal to the array's length, which is 4.
         * fruits[4] does not exist.
        */
        
        for (int i = 0; i <= fruits.length - 1; i++) {
            System.out.println(fruits[i]);
        }
        //fruits.length-1 = 3. fruits[3] exists, no bounds error
        
        for (int i = 1; i <= fruits.length; i++) {
            System.out.println(fruits[i - 1]);
        }
        //i goes from 1 to 4, but fruits[i-1] is also fruits[0] to fruits[3]
        //no bounds error
        
        //Answer: Only statement 1 produces an out of bounds exception
    }
}
