package MavenProject1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        int sum = addIntegers(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }

    public static int addIntegers(int a, int b) {
        return a + b;
    }
}
