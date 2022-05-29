
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        int index = 0;
        while(index < array.length){
            int number = array[index];
            for(int stars = 0; stars < number; stars++){
                System.out.print("*");
            }
            index++;
            System.out.println();
        }
    }

}
