
/**
 * Write a description of class UnitThreeQFour here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitThreeQFour
{
    public static void main(String[] args){
        int j = 1;
        int k = 2;
        int m = 1;
        if (!((j == k) && (k > m))){
            System.out.println("true");
        }
        /* Under the De Morgan's Laws, distributing the "!" the operator flips.
         * In this case, it would be applied to the "==", "&&", and ">",
         * giving us the parameter "(j != k) || (k <= m)"
         * Note that the opposite of ">" is what does not include the former,
         * thus making it "<="
        */
    }
}
