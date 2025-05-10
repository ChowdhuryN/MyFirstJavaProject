package Assignment_02;

public class assignment {
    public static void main(String[] args) {
        int num1 = 25, num2 = 35, num3;

        num1 += num2; // num1 = num1 + num2
        System.out.println("Addition:" + num1);

        num2 -= num1; // num2 = num2 - num1
        System.out.println("Subtraction:" + num2);

        num1 *= num2; // num1 = num1 * num2
        System.out.println("Multiplication:" + num1);

        num1 /= num1; // num1 = num1 / num1
        System.out.println("Division:" + num1);


    }
}
