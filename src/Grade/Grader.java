package Grade;
public class Grader{
    //这个类可以接收学生的作业并给出合适的成绩
    public static String getCAGrade(Gradable g){
        //接收平时测验的成绩(percentage)并给出字母评级
        return "A";
    }
    public static String getExamGrade(Gradable g){
        //接收exam的成绩(percentage)并给出字母评级
        return "A+";
    }
}
