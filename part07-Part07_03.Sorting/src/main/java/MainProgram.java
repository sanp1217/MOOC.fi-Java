
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
       int[] numbers = {8, 3, 7, 9, 1, 2, 4};
       sort(numbers);
    }
    
    public static int smallest(int[] array){
        int num = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < num){
                num = array[i];
            }
        }
        return num;
    }
    
    public static int indexOfSmallest(int[] array){
        int num = array[0];
        int index = 0;
        
        for(int i = 0; i < array.length; i++){
            if(array[i] < num){
                num = array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int num = table[startIndex];
        int index = startIndex;
        for(int i = startIndex; i < table.length; i++){
            if(table[i] < num){
                num = table[i];
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int index = array[index1];
        int indexSwapped = array[index2];
        
        array[index1] = indexSwapped;
        array[index2] = index;
    }
    
    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array));
            
            int index = i;
            int smallestIndex = indexOfSmallestFrom(array, i);
            
            swap(array, index, smallestIndex);
            index++;
            
        }
    }
    
    
    
    

}
