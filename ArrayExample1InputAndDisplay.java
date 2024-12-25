import java.util.Scanner;

public class ArrayExample1InputAndDisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of array.");
        int size = input.nextInt();

        int[] numbers = new int[size];


        System.out.println("Enter "+ size +" numbers");
        for(int i = 0; i<size; i++){
            numbers[i] = input.nextInt();
        }

        System.out.println("Elements of array are: ");
        for(int i = 0; i<size; i++){
            System.out.print(numbers[i] +" ");
        }

    }
}
