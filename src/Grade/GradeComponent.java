package Grade;
public class GradeComponent implements Combinable{
//    Define a class named GradeComponent that implements the Combinable interface. This class should have a constructor that takes the following parameters:
//    A Gradable object
//    An integer value representing the percentage of the courses grade this item is worth
//    A boolean value representing which grade conversion methods should be used, true for getCAGrade and false for getExamGrade
Gradable gradeItem;
int weight;
boolean b;
    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public String getGrade() {
        if (b == false){
            return Grader.getExamGrade(gradeItem);
        }else{
            return Grader.getCAGrade(gradeItem);
        }
    }

    public GradeComponent(Gradable gradeItem, int weight, boolean b) {
        this.gradeItem = gradeItem;
        this.weight = weight;
        this.b = b;
    }
}
