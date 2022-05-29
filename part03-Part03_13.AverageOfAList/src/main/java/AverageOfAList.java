
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                break;
}
            list.add(input);
}

        double sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i);
}

        double average;

        average = sum / list.size();

        System.out.println("average: " + average);
        
    }
}
