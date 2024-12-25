public class ArrayExample4ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {5, 25, 30, 35,45,65};
        System.out.println("Original Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }


        System.out.println("\nReversed Array:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }


    }
}
