package Grade;
public class GradeItem implements  Gradable{
    //这个类可以接收作业项目(name)以及该作业的分数?/完成度?(percentage)
    String name;
    int percentage;

    @Override
    public double getPercentage() {
        return percentage;
    }

    @Override
    public String getName() {
        return name;
    }

    public GradeItem(String name, int percentage) {
        this.name = name;
        this.percentage = percentage;
    }
}
