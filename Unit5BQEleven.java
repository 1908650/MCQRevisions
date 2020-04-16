
/**
 * Write a description of class Unit5BQEleven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit5BQEleven
{   private String name;
    private int feet;
    private int inches;

    public Unit5BQEleven(String nm, int ft, int in) {
        name = nm;
        feet = ft;
        inches = in;
    }

    public int heightInInches() {
        return feet * 12 + inches;
    }

    public String getName() {
        return name;
    }

    public String compareHeights(Unit5BQEleven other){

        if (this.heightInInches() < other.heightInInches()) {
            return name;
        } else if (this.heightInInches() > other.heightInInches()) {
            return other.getName();
        } else {
            return "Same";
        }
    }
    
    public static void main (String[] args) {
        Unit5BQEleven andy = new Unit5BQEleven("Andrew", 5, 6);
        // declares instance andy and assigns String, feet, and inches
        Unit5BQEleven ben = new Unit5BQEleven("Benjamin", 6, 5);
        // declares instance ben and assigns String, feet, and inches
        System.out.println(andy.compareHeights(ben));
 
        /* andy is this and ben is other. (ben is passed in)
         * Calling the heightInInches method, Andrew's height = 66 and 
         * Benjamin's = 71
         * From the first if statement, andy is shorter than ben so
         * the "name" returned is the andy instance variable, "Andrew"
         * 
         * Answer: Andrew
         * 
         * What I did wrong: I did not see the feet * 12 + inches, so 
         * Andrew's height in inches, 6, was greater than Benjamins, 5.
        */
        
    }
}
