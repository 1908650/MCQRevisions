
/**
 * Write a description of class Unit6QEight here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit6QEight
{   
    public static void main (String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Question: " + numbers[i]);
        }
        
        for (int x : numbers) {
            System.out.println("Choice A: " + numbers[x]);
        }
        
        for (int x : numbers) {
            System.out.println("Choice B: " + numbers);
        }
        
        for (int x : numbers) {
            System.out.println("Choice C: " + x);
        }
        // correctly uses for each loop: for every int x in the array numbers
        //x is the integer from the array at a certain iteration and it is 
        //printed.
        
        /* What I missed:
         * Choices D and E can be ruled out becuase wrong way around. 
         * Must be written like for every int x in the array numbers. 
        for (numbers : int x) {
            System.out.println(numbers[x]);
        }
        
        for (numbers : int x) {
            System.out.println(x);
        }
        */
    }
}
