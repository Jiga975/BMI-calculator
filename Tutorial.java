import java.util.Scanner;

public class Tutorial {
    public static void main(String[] args) {
        //Given a string array, print out each element in reverse order.
        //String[] colors = {"red", "blue", "black", "white", "green" };
        String[] colors = {"red", "blue", "black", "white", "green" };
        for (int i= colors.length-1;i>=0;i--){
            System.out.println(colors[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter your weight: ");
        float weight = sc.nextFloat();
        System.out.println("Whats your height: ?");
        float height = sc.nextFloat();
        float bmi = (weight/height*height)*1000;

        if (bmi <= 25.0){
            System.out.println("you sr overweight");
        } else if (bmi <= 18.5 || bmi <=24.9) {
            System.out.println("normal weight");
        }else {
            System.out.println("you are underweight");
        }


    }
}
