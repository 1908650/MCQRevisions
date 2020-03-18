/**
 * Write a description of class UnitTwoMCQ here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitTwoQTwo
{

    
    public static void main(String[] args){
        //Question 2.9
        System.out.print("Question 2.9");
        int val = (int)(Math.random() * 4 + 1); 
        //Math.random produces a number [0,1) 
        //times 4 makes the number in range of 0,1,2,3
        //plus 1 returns a number in range of 1,2,3,4
        val *= 2;
        //val times 2 returns a random number 2,4,6,8, which is the intention
        System.out.println(val);
    }
}
