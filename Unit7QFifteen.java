
/**
 * Write a description of class Unit7QFifteen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit7QFifteen
{
    public static int seqSearch(int[] arr, int target) {
    
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == target) {
                return j;
                //int j is the index 
            }
        }
        return -1;
    }
    
    public static int seqSearch2(int[] arr, int target) {
        
        for (int j : arr) {
            if (j == target) {
                return j;
                //j is the value in arr that is equal to target. not the index
                //for each loop: each int j is assigned to a value in arr.
            }
        }
        return -1;
    }
    
    public static void main (String[] args) {
        int[] intArr = new int[] {2,3,4};
        System.out.println("index: "+seqSearch(intArr, 2));
        System.out.println("target value: "+seqSearch2(intArr, 2));
        
        /*Therefore the answer is E: "The modification in seqSearch2 will cause 
         * the value of target to be returned instead of the index of target in 
         * cases where target appears in arr."
         */
    }
}
