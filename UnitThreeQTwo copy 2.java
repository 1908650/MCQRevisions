
/**
 * Write a description of class UnitThreeQTwo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitThreeQTwo
{
    public static void main (String[] args){
        String first = new String("duck");
        String second = new String("duck");
        String third = new String("goose");
        if (first == second){
            System.out.print("A"); 
            //although both strings contain "duck", the == operator resolves
            //true only if the two are representing the exact same object or 
            //pointing to the exact same location in memory. Thus, this will
            //evaluate as false.
        } else if (second == third){
            System.out.print("B");
            //obviously not the same--different words and different objects!
        } else if (first.equals(second)){
            System.out.print("C");
            //will print C because .equals compares content
        } else if (second.equals(third)){
            System.out.print("D");
            //false and will not even go here.
        } else {
            System.out.print("E");
        }
        
    }
}
