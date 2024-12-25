public class ArrayExample2SmallestNumber {
    public static void main(String[] args) {

        int[] numbers = {50, 20 , 11, 25, 40, 90, 80, 15,30,2};

        // find Smallest number
        int smallNum = numbers[0];
        for(int i = 1 ; i < (numbers.length); i++ ){
            if(numbers[i]< smallNum){
                smallNum = numbers[i];
            }
        }
        System.out.println("Small number is: "+ smallNum);


    }
}
