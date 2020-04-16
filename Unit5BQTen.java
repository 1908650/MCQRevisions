
/**
 * Write a description of class Unit5BQTen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit5BQTen
{
    private String contactName;
    private String contactNumber;

    public Unit5BQTen(String name, String number){
        contactName = name;
        contactNumber = number;
    }

    public void doSomething() {
        System.out.println(this);
    }

    public String toString() {
        return contactName + " " + contactNumber;
    }
    
    public static void main (String[] args) {
        Unit5BQTen c = new Unit5BQTen("Alice", "555-1234");
        //runs constructor to assign both information to fields
        c.doSomething();
        //prints "Alice 555-1234"
        
        c = new Unit5BQTen("Daryl", "");
        //also runs constructor and assigns "Daryl" to contactName while 
        //contact number remails an empty string "".
        c.doSomething();
        //prints "Daryl" 
        
        //Answer: This code prints out:
        //Alice 555-1234
        //Daryl
    }
}
