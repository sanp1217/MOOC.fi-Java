
import java.util.ArrayList;

public class GradeRegister {
    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.points.add(points);
        this.grades.add(pointsToGrade(points));
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    public double averageOfGrades(){
        if(this.grades.isEmpty()){
            return -1;
        }
        
        double average = 0;
        for(int i = 0; i < this.grades.size(); i++){
            average = average + this.grades.get(i);
        }
        
        return average / this.grades.size();
        
    }
    
    public double averageOfPoints(){
        if(this.points.isEmpty()){
            return -1;
        }
        double average = 0;
        for(int i = 0; i < this.points.size(); i++){
            average = average + this.points.get(i);
        }
        return average / this.points.size();
    }
}
