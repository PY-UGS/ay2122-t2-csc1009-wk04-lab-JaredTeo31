import java.util.Scanner;
public class BMITest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = scan.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = scan.nextDouble();
        weight*=0.45359237;
        height*=0.0254;
        BMI test = new BMI(weight, height);
        System.out.println("BMI is " + test.getBMI());
        System.out.println(test.getBMIInterpretation(test.getBMI()));
        scan.close();
     }
}
