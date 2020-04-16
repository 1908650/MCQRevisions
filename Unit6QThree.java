
/**
 * Write a description of class Unit6QThree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit6QThree
{
    public static int checkString(String[] arr) {
        int count = 0;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k].length() >= 3) {
                count++;
            }
        }
        return count;

    }
    
    public static void main(String[] args) {
        //checkString(new String[]); // Statement 1
        //Array dimension missing, so there is big fat red error
        
        checkString(new String[0]); //Statement 2
        //legal statement, though it is an empty String array of size 0
        
        String[] str = {"cat", "dog"}; //Statement 3
        checkString(str);
        //correctly creates string array with elements "cat" and "dog"
        
        //Answer: Statements 2 and 3 compile without error
    }
}
