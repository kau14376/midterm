/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package days;

/**
 *
 * @author sivagamasrinivasan
 */
public class Weekdays 
{
    public enum Day {
        ONE("Monday"),
        TWO("Tuesday"),
        THREE("Wednesday"),
        FOUR("Thursday"),
        FIVE("Friday"),
        SIX("Saturday"),
        SEVEN("Sunday");
        
        private final String name;
        
        private Day(String name) {
            this.name = name;
        }
        
        public String getName() {
            return name;
        }
    }

  
    public void nameOfDay(Day day) {
        System.out.println(day.getName());
    }
  
    public static void main(String[] args) {
        Weekdays weekdays = new Weekdays();
        weekdays.nameOfDay(Weekdays.Day.ONE);       
        weekdays.nameOfDay(Weekdays.Day.TWO);       
        weekdays.nameOfDay(Weekdays.Day.THREE);
        weekdays.nameOfDay(Weekdays.Day.FOUR);       
        weekdays.nameOfDay(Weekdays.Day.FIVE);       
        weekdays.nameOfDay(Weekdays.Day.SIX);
        weekdays.nameOfDay(Weekdays.Day.SEVEN);
    }
}



