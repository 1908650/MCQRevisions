
/**
 * Write a description of class Unit5BQThree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit5BQThree
{
    private int one;

    public Unit5BQThree(int newOne) {
        one = newOne;
    }

    public int getOne() {
        return one;
    }

    public boolean isGreater(Unit5BQThree other) {
       return one > other.one;
       // works because it correctly refers to other object 
       
       //return one > other.getOne();
       //works because it calls getOne() method to get instance variable
       
       // return getOne() > other.one;
       // getOne() returns the instance's one while other.one correctly gets 
       // the other's one. 
       
       //answer: Statement 1, 2, 3 all work as intended
    }
    
    public static void main(String[] args) {
        
    }
}
