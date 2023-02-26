package Grade;
public class GradeCombiner {
    public void addCombinable(Combinable c){
        System.out.println("将多个Combinable的实现类的对象结合在一起");
    }

    public String getGrade(){
        return "给出多个项目的综合成绩";
    }
}
