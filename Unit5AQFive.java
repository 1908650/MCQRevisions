
/**
 * Write a description of class Unit5AQFive here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit5AQFive
{ 
    private String name;
    private int wk_hours;
    private double pay_rate;

    public Unit5AQFive(String nm, int hrs, double rt){
        name = nm;
        wk_hours = hrs;
        pay_rate = rt;
        System.out.println(name + " " + wk_hours + " " + pay_rate);
    }

    public Unit5AQFive(String nm, double rt){
        name = nm;
        wk_hours = 20;
        pay_rate = rt;
        System.out.println(name + " " + wk_hours + " " + pay_rate);
    }
    
    public static void main (String[] args) {
        Unit5AQFive e1 = new Unit5AQFive("Lili", 20, 18.5);
        //correctly sets hours and wages from the first constructor
        
        Unit5AQFive e2 = new Unit5AQFive("Steve", 18.5);
        //correctly sets hours and wages from the second constructor
        
        Unit5AQFive e3 = new Unit5AQFive("Carol", 20);
        /* what I did wrong: I did not read the question, saw that this works 
        for the second constructor. BUT THE QUESTION SPECIFIES 20 HOURS AND
        ....drumroll...... $18.50! what fun.
        */
    }
}
