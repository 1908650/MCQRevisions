/**
 * Write a description of class Unit3MCQ here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitThreeQOne
{   static int temp;
    
    public static void main(String[] args){
        //Unit 3 Question 7 (Weather)
        System.out.println("Weather Question");
        weatherQuestion(30); //does not work as intended
        //weather is defined as "cold" but the second set of if statements 
        //overrides it and defines to "warm" instead.
        weatherQuestion(51);
        weatherQuestion(60);
    }
    
    public static void weatherQuestion(int temp){
        String weather;
        if (temp <= 31){
            weather = "cold";
        } else {
            weather = "cool";
        }
        
        if (temp >= 51){
            weather = "moderate";
        } else {
            weather = "warm";
        }
        System.out.println(weather);
    }
}


