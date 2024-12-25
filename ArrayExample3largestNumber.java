public class ArrayExample3largestNumber {
    public static void main(String[] args) {
        int[] numbers = {5, 2 , 12, 25, 4, 9, 8, 15,60,80};
        int largeNum = numbers[0];
        for(int i = 1 ; i < (numbers.length); i++ ){
            if(numbers[i]> largeNum){
                largeNum = numbers[i];
            }
        }
        System.out.println("Largest number is: "+ largeNum);


    }
}
