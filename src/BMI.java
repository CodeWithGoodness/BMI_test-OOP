import java .util.Scanner;
public class BMI {
    public static void main(String[]args){
        //Creating Scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = input.next();
        System.out.print("Input your age: ");
        int age = input.nextInt();
        System.out.print("Input your weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Input your height in inches: ");
        double height = input.nextDouble();
        System.out.println();
        Object myObject = new Object(weight, name, age, height);
        System.out.println(myObject.name + " your BMI is " + myObject.getBMI() + " at your current age (" + myObject.age+
                " Years). You are " + myObject.geMystatus() + ".");
        System.out.println(myObject.getHeight());
    }
}
class Object{
    private  double pound_per_kg = 0.45359237;
    private  double inch_per_meter = 0.0254;
    double myWeight;
    String name ;
    int age;
    double height;
    Object( double newWeight, String newName, int newAge, double newHeight ){
        myWeight = newWeight;
        name = newName;
        age = newAge;
        height = newHeight;

    }
    public double getMyWeight() {
        return (myWeight * pound_per_kg);
    }
    public  int getAge(){
        return age;
    }
    public String getName(){
        return  getName();
    }

    public double getHeight() {
        return (height* inch_per_meter);
    }
    public double getBMI(){
      return  Math.round(getMyWeight()/Math.pow(getHeight(), getHeight()))  ;
    }
    public String geMystatus(){
      double bmi =  getBMI();
        if ( bmi < 18.5)
            return "Underweight";
        else if ( bmi < 25.0)
            return "Normal";
       else if ( bmi < 30.0)
            return "Overweight";
       else
            return "Obese";
    }

}