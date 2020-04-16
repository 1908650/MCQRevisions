
/**
 * Write a description of class Unit7QThirteen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Unit7QThirteen
{
    public static int question(ArrayList<Integer> elements, int target){
        for (int j = 0; j < elements.size(); j++) {
            if (elements.get(j) == target) {
                return j;
            }
            
            /* starts from the 0th element and advances to the right 
             * (j increasing by 1)
             * evaluates if equal to target and returns the index of the
             * FIRST appearance.
            */
        }
        return -1;
    }
    
    public static int line3Change(ArrayList<Integer> elements, int target){
        for (int j = (elements.size() - 1); j >= 0; j--) {
            if (elements.get(j) == target) {
                return j;
            }
            
            /* starts from the last element (size - 1 becuase array starts from 0
             * and checks moving to the left (j decreases by 1 every loop)
             * ^ What I did wrong
             * evaluates if the value at that index is equal to target and 
             * returns the index of the LAST appearance.
            */
        }
        return -1;
    }
    
    public static void main(String[] args) {
       ArrayList<Integer> array = new ArrayList<Integer>();
       array.add(1);
       array.add(5);
       array.add(7);
       
       System.out.println(question(array, 3));
       System.out.println(line3Change(array, 3));
       /* Therefore, choice B is the right answer:
        * "The modified method will return the index of the last appearance of 
        * the target value in the list, or -1 if the target value does not 
        * appear in the list.
        */
    }
}
