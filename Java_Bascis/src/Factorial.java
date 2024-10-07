import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the n value");
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int reult=factorialOfGivenNumber(num);
        System.out.println("Factorial of given number " +num+" is :"+reult);
    }

    private static int factorialOfGivenNumber(int num) {
        int reult=0;
        if(num<=2){
            return num;
        }
        else {
            reult = num * factorialOfGivenNumber(num - 1);
        }
        return reult;
    }
}
