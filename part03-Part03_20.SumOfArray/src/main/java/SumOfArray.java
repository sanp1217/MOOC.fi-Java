
public class SumOfArray {

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        
        int num = 0, sum = 0;
        while(num < array.length){
            int numbers = array[num];
            sum += numbers;
            num++;
        }
        return sum;
    }
}
