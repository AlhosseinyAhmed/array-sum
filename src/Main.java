import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] arr = new int[5] ;
        Scanner scanner= new Scanner(System.in);
        System.out.println(" Please enter your 1 st number");
        arr[0]= scanner.nextInt();
        System.out.println(" Please enter your 2 nd number");
        arr[1]=scanner.nextInt();
        System.out.println(" Please enter your 3 rd number");
        arr[2]=scanner.nextInt();
        System.out.println(" Please enter your 4 th number");
        arr[3]=scanner.nextInt();
        System.out.println(" Please enter your 5 th number");
        arr[4]=scanner.nextInt();
         int sumArray = arr[0] + arr[1] + arr[2] + arr[3] + arr[4] ;

         System.out.println(" Sum of array = 1 " +sumArray);


    }
}