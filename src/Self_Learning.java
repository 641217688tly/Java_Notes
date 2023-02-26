public class Self_Learning {
    public static void main(String[] args) {
        // P37 三元运算符

        /*
         * 三元运算符:
         * Syntax: 关系表达式? 表达式1:表达式2;
         * Ex: a > b ? a : b;
         *     当a>b是true,那么a将成为三元运算符的运算结果;
         *     如果a<b是false,那么b将成为三元运算符的运算结果
         *
         * 注意:三元表达式的最终结果必须被使用,不能在代码中单独使用:
         * Ex: int max = a > b ? a : b;
         *     System.out.println(a > b ? a : b;);
         */


        // P38 原码反码补码

        /*
         * 没细听,用到的时候再补
         */


        // P41 if-else

        /*
         * if (关系表达式){
         *     语句体1;
         * }else{
         *     语句体2;
         * }
         * 如果关系表达式的值为true就执行语句体1;
         * 如果关系表达式的值为false就执行语句体2;
         * 只要其中一个语句体被执行,那么if语句就会结束,其他语句体将不会被运行
         */


        // P42 if-(else if)-else

        /*
         * if (关系表达式){
         *     语句体1;
         * }else if(关系表达式2){
         *     语句体2;
         * }
         * ...
         * }else{
         *     语句体n+1;
         * }
         * 首先判断关系表达式1:
         *     如果为true就执行语句体1;
         *     如果为false就判断关系表达式2:
         *         如果为true就执行语句体2;
         *         如果为false就判断关系表达式3:
         *             ......
         * 如果所有关系表达式(所有if和else if里的关系表达式)的结果都为false
         * 那么将执行else里的语句体n+1
         */


        // P43 switch语句

        /*
         * switch语句格式:
         * switch (表达式){
         *     case 值1:
         *         语句体1;
         *         break;
         *     case 值2:
         *         语句体1;
         *         break;
         *     ......
         *     default:
         *         语句体n+1;
         *         break;
         * }
         * 首先计算表达式的值
         * 依次和case后面的值进行比较,如果有对应的值,就会执行相应的语句,在执行的过程中,遇到break就会结束
         * 如果所有的case后面的值和表达式的值都不匹配,就会执行default里面的语句体,然后结束整个switch语句
         * Ex:
         * switch(心里想吃的面){
         *     case "兰州拉面":
         *         吃拉面;
         *         break;
         *     case "热干面":
         *         吃热干面;
         *         break;
         *     default:
         *         吃备胎(泡面);
         *         break;
         * }
         */


        // P44 Switch知识拓展

        /*
         * 1.default的位置和省略
         * (1)位置:default不一定是写在最下方的,我们可以写在任意位置,只不过按习惯是写在最下方的
         * (2)省略:default可以省略,语法不会有问题,若所有case都不符合,switch语句则会自动结束
         *
         * 2.case穿透(当语句体中忘记写"break;"语句时会发生)
         * Java会拿着小括号中表达式的值踉下面每一个case进行匹配
         * 如果匹配上了,就会执行对应的语句体,如果此时发现了break,那么结束整个switch语句
         * 如果没有发现break,那么程序会继续执行下一个case的语句体,一直遇到break或者右大括号为止
         *
         * 3.switch新特性(JDK12之后的版本具有该特性)
         * Ex:
         * int number = 1;
         * switch (number){
         *     case (number1) -> {
         *         语句1
         *     }
         *     case (number2) -> {
         *         语句2
         *     }
         *     default (number3) -> {
         *         语句3
         *     }
         * }
         * 这种写法能简化break,而且当case的大括号里的语句只有一行代码时,大括号也可以被省略
         *
         * 4.switch和if第三种格式各自的使用场景
         * if-(else if)-else语句更适合对范围进行判断:
         * 比如小明考试成绩在90-100或80-90或70-80,不同的分数对应不同的奖励;
         * 而switch语句更适合对有限且数量不过大的情况进行选择时来使用
         * 比如小明考试为A或B或C或D时,不同的评级对应不同的奖励
         *
         */


        //P135 抽象类(abstract class)和抽象方法

        /*
         * 如果子类中的方法被抽象到父类之后没有方法体(换句话说,不同的子类具有不同的该方法,如莫娜类的攻击方法和绫华类的攻击方法肯定就不一样)
         * 面对这种情况我们需要在创建子类的时候对该方法进行重写.但有时在开发过程中我们会忘记重写,或者组员懒得重写方法
         * 这时候我们可以将父类中没有方法体的方法用abstract修饰符进行修饰,令其变成一个抽象方法(父类也要变成抽象类);当子类继承了父类中的抽象方法后,
         * 我们必须对抽象方法进行重写,否则Java会报错
         *
         * 注意:如果一个类中存在抽象方法,那么该类就必须声明为抽象类
         * (当然在后面的学习中abstract也有其他的用途,因为抽象类不能创建对象,所以我们可以用它修饰如适配器InterAdapter这类不想让用户创建对象的类)
         *
         * 抽象类的定义格式:
         * public abstract class 类名{}
         *
         * 抽象方法的定义格式:
         * public abstract 返回值类型 方法名(参数列表);
         *
         * 注意事项:
         * 抽象类不能实例化
         * 抽象类中不一定有抽象方法(比如适配器InterAdapter),有抽象方法的类不一定是抽象类
         * 抽象类可以有构造方法(尽管它不能创建对象)
         * 抽象类可以被子类继承,但子类要么重写抽象类中的所有抽象方法(最常用)(InterAdapter的既视感),要么也是一个抽象类
         *
         *
         */


        //P124 面向对象进阶-继承的概述

        /*
         * 随着Javabean类创建的越来越多,我们发现它们中有一部分的代码高度相似
         * 比如Student类和Teacher类中都包含:name,gender,age等等
         * 为此Java以及很多语言的开发者选择提供继承这一方式,将包含相似代码的Javabean类中的相似代码抽出成为父类
         *
         * 继承语法(Syntax):
         * public class Subclass extends Superclass{}
         * Subclass称作子类/派生类;Superclass称作父类/基类/超类
         *
         * 子类可以在继承父类已有的代码的基础上创建的方法和变量
         */


        //P125 面向对象进阶-继承的特点和继承体系的设计

        /*
         * 与Python不同的是,Java只支持单继承,不支持多继承,但支持多层继承
         * 多层继承:子类A继承父类B,父类B可以继承父类C,而类C称作子类A的间接父类,子类既可以使用父类中的内容,也可以使用间接父类中的内容
         *
         * Java中所有类的"祖宗"是Object类,当创建一个类时没有继承别的类,那它将默认继承Object类
         *
         * 注意:子类只能访问父类中非私有类型的成员(内容)
         */


        //P126 面向对象进阶-子类到底能继承父类中的哪些内容

        /*
         * 子类到底能继承父类中的哪些内容?
         * 父类的构造方法  非私有:不能继承;   私有:不能继承;
         * 父类的成员变量  非私有:能继承;     私有:能继承;(虽然子类能继承父类中私有类型的成员变量,但无法调用它们,除非使用get/set方法才可使用)
         * 父类的成员方法  非私有(或者说可以保存在虚方法表中):能继承;     私有:不能继承;(相当于该方法无法被存储在虚方法表中,也就无法继承给子类)
         *
         * 如果子类继承了很多的父类,且子类想调用某个间接父类中的方法,那么Java就必须一个父类一个父类的去找该方法,那么代码运行效率将大大下降;
         * 为了避免这种情况,Java为每个类都设置了一个"虚方法表",表中的方法必须是非private,非static,非final修饰的;
         * 虚方法表中的方法是Java认为的使用频率更高的方法;当发生继承时,父类的虚方法表会继承给子类;当子类调用父类/间接父类的方法时,Java会优先从虚方法表中查找所需方法以优化效率
         * 当然,理论上讲,如果调用的方法不在虚方法表中,那Java也只能苦兮兮的去一层一层去找该方法,但事实上如果父类的方法不在虚方法表中(即该父类方法是private/final/static的),那它从一开始就不会继承给子类
         */


        //P127 面向对象进阶-继承中成员变量和成员方法的访问特点

        /*
         * 继承中成员变量的访问特点:
         * 就近原则:谁离我近我就用谁
         */
/*
public class Fu{
    String name = "Fu";
}
public class Zi extends Fu{
    String name = "Zi";
    public void ziShow(){
        String name = "ziShow";
        System.out.println(name);
    }
}
调用ziShow()方法后,
(1)不删减,那将打印距离name最近的局部变量.输出ziShow
(2)删去191行,局部变量没了,距离name最近的是实例变量name = "Zi",输出结果为Zi
(3)删去191行和189行,局部变量和子类里的实例变量name都没了,打印的将是父类中的name = "Fu",输出结果为Fu
 */

/*
public class Fu{
    String name = "Fu";
}
public class Zi extends Fu{
    String name = "Zi";
    public void ziShow(){
        String name = "ziShow";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
当然,我们也可以用this和super关键字来区别局部变量,子类中的实例变量,父类中的同名实例变量
 */
        /*
         * 由上述例子可知:当局部变量,子类的实例变量,父类的实例变量重名时:
         * varName-Java将从局部位置开始往上找该变量
         * this.varName-Java将跳过局部位置,从本类成员位置开始往上找
         * super.varName-Java将跳过本类,直接从父类的成员位置开始往上找
         *
         *
         * 继承中成员方法的访问特点:
         * 与成员变量的访问类似,依旧满足就近原则,同时this与supper关键字也可以去区分子类与父类中的同名方法
         *
         * 方法重写:当父类的方法不能满足子类现在的需求时,需要进行方法重写
         * 方法重写的本质:重写的同名方法将覆盖虚方法表内的同名方法,比如在A类中虚方法表里有(A的)method1,(A的)method2;B类继承了A类,之后重写了method2,此时虚方法表中的方法为:(A的)method1;(B的)method2
         * 书写格式:在继承体系中,子类出现了和父类中一模一样的方法声明,我们就称子类这个方法是重写的方法
         * @Override重写注解:
         * 1.@Override是放在重写后的方法上,校验子类重写时语法是否正确
         * 2.加上注解后如果有红色波浪线,表示语法错误
         * 3.建议重写方法都加@Override注解,代码安全优雅
         * ex:
         * @Override
         * public void method_with_same_name(){}
         * 方法重写的注意事项和要求:
         * 1.重写方法的名称,参数必须与父类中的保持一致
         * 2.子类重写父类方法时,子类的访问权限子类必须大于等于父类
         * 3.子类重写父类方法时,子类返回(return)值的类型必须小于等于父类(此处的返回值可以不仅仅是int/float等数据类型,也可以是类,比如Animal类,Cat类;假如Animal类是Cat类的父类,此时如果子类重写的方法返回Animal类,父类的原方法返回Cat类,那就将报错)
         * 4.建议:重写的方法尽量和父类保持一致
         * 5.只有被添加到虚方法表中的方法才能被子类重写
         */


        //P128 面向对象进阶-继承中的构造方法和this,supper关键字

        /*
         * 父类中的构造方法不会被子类继承(不然子类中构造方法的名字为父类的类名将直接报错)
         * 子类中所有的构造方法默认先访问父类中的无参构造,再执行自己的无参构造(看不懂没关系,视频2:00)
         *     原因:子类在初始化的时候,有可能会使用到父类中的数据,如果父类没有完成初始化,子类将无法使用父类的数据
         * 所以在子类初始化之前,一定要调用父类构造方法,先完成父类数据空间的初始化
         *
         * 那么怎么调用父类的构造方法呢?
         * 子类构造方法的第一行语句默认都是:super()(不写也行,Java会默认自动帮你添加该语句,它必须在子类构造的第一行)
         * 如果想调用父类的有参构造,必须手动写super进行调用
         * Ex:
         */
/*
父类:
public class Person{
    String name;
    int age;

    public Person(){
        System.out.println("父类的无参构造");
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
子类:
public class Student extends Person{
    public Student(){
        super(); //该方法可以调用Person类中的无参构造
        System.out.println("子类的无参构造");
    }
    public Student(String name, int age){
        super(name, age); //该方法可以调用Person类中的有参构造,并将name和age的值赋予有参构造方法的参数
    }
}
 */
        /*
         * 子类与父类的构造方法总结:
         * 首先,为避免在继承父类时由于未初始化父类导致报错,我们选择在父类和子类里都保留一个空参构造方法:
         * 父类中: public 父类名(){}; 子类中: public 子类名(){}; //子类中的空参构造方法中Java会默认添加super();方法调用父类中的空参构造方法;而父类中的空参构造方法则保证子类中的super()有方法可调用
         * 之后,如果我们希望在创建子类的时候输入参数,那么我们可以:
         * 父类中: public 父类名(类型 参数1,类型 参数2){方法体}; 子类中: public 子类名(类型 参数1,类型 参数2){super(参数1,参数2);以及方法体};
         *
         *
         * 在上述例子中,我们大量使用了super和this关键字,因此我们特地为这两个关键字的使用做一个总结:
         * 关键字       访问成员变量       访问成员方法          访问构造方法
         * this       this.成员变量     this.成员方法(..)       this(..)
         *            访问本类成员变量   访问本类成员方法       访问本类构造方法
         * super      super.成员变量    super.成员方法(..)      super(..)
         *            访问父类成员变量   访问父类成员方法       访问父类构造方法
         * 对于this的访问本类构造方法,我们可能不熟悉,它常常用于为实例变量赋予默认值,我们举个例子:
         */
/*
public class Student{
    String name;
    int age;
    String school;
    // 要求当我们创建对象时,如果不输入school的参数值,那就默认该对象的school为"B站大学"
    public Student(){
        this(null,0,"B站大学"); // 该this语句的作用是调用本类中的其他构造方法
    }

    public Student(String name, int age, String school){
        this.name = name;
        this.age = age;
        this.school = school;
    }
}
让我们在Test类中构造Student对象:
public class Test{
    public static void main(String[] args){
        Student varName = new Student();
        //此时采用空参构造,那么将调用296行的空参构造方法,而空参构造方法中的this语句又将调用第300行的有参构造方法,且school默认的是"B站大学"
    }
}
 */

        //P129 面向对象进阶-认识多态(对象的多种形态)

        /*
         * 假设一个网站的注册功能为:
         * public void register(??){
         *     //实现具体方法的代码
         * }
         * 那该方法的形参在面对学生,老师,管理人员等多个用户时该怎么设定参数呢?
         * 设置成register(Teacher t),学生和管理人员就无法使用;设置成register(Student s),老师和管理人员又无法使用;
         * 如果要为一个类的对象专门设置一个方法.比如register(Teacher t),register(Student s),register(Supervisor s),那么当使用者的类型增加时,
         * 比如辅导员,维护人员等等要使用时,又要创建新的方法,非常繁琐,甚至愚蠢
         * 针对这种情况,我们可以引入"多态"这一概念:
         * public void register(Person p){ //其中Person是所有用户(学生,老师,主管,辅导员...)的父类
         *     //实现具体方法的代码
         * }
         *
         * 多态的定义:同类型的对象表现出的不同形态
         * 多态的表现形式/语法(Syntax): 父类类型 对象名称 = 子类对象;
         * 使用多态的前提:
         *     1.有继承/实现关系(跟接口有关);
         *     2.由父类引用指向子类对象(即: 父类 父类对象的变量名 = new 子类(); )
         *     3.有方法重写
         *
         * 依旧拿本节开篇提到的情况举例:
         * Ex:
         */
/*
//Person类(父类):
public class Person{
    private String name;
    private int age;
    public Person(){
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String gerName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void show(){
        System.out.println(name + ", " + age);
    }
}
//子类Student:
public class Student extends Person{
    @Override
    public void show(){
        System.out.println("学生的信息为:" + getName() + ", " + getAge());
    }
}
//子类Teacher:
public class Teacher extends Person{
    @Override
    public void show(){
        System.out.println("老师的信息为:" + getName() + ", " + getAge());
    }
}
//Teat类:
public class Test{

    public static void main(String [] args){
        Student s = new Student();
        s.setName("TLY");
        s.setAge(19);

        Teacher t = new Teacher();
        t.setName("黑马程序员");
        t.setAge("25");

        register(s); //输出结果:学生的信息为:TLY, 19
        register(t); //输出的结果:老师的信息为:黑马程序员, 25
    }

    public static void register(Person p){ //要求该方法既能接收老师,又能接收学生,此时只需要把参数写成这两个类型的父类
        p.show()
    }
}
 */


        //P130 面向对象进阶-多态中调用成员变量和成员方法的特点

        /*
         * 变量调用:编译看左边,运行看左边
         *
         * 编译看左边:Javac编译代码的时候,会看左边的父类中有没有这个变量,如果有,编译成功,如果没有则编译失败
         * 运行也看左边:Java运行代码的时候,实际获取的就是左边父类中成员变量的值
         *
         * 方法调用:编译看左边,运行看右边
         * 编译看左边:Javac编译代码的时候,会看左边的父类中有没有这个方法,如果有,编译成功;如果没有则编译失败
         * 运行看右边:Java运行代码的时候,实际上运行的是子类中的方法
         * Ex:
         */
/*
public class Test{
    public static void main(String[] args){
        //使用多态的方式来创建对象:
        Animal a = new Dog();

       System.out.println(a.name); //输出结果:动物
       //调用成员变量:编译看左边,运行也看左边
       //编译看左边:Javac编译代码的时候,会看左边的父类中有没有这个变量,如果有,编译成功,如果没有则编译失败
       //运行也看左边:Java运行代码的时候,实际获取的就是左边父类中成员变量的值

       a.show(); //输出结果:Dog--show方法
       //调用成员方法:编译看左边,运行看右边
       //编译看左边:Javac编译代码的时候,会看左边的父类中有没有这个方法,如果有,编译成功;如果没有则编译失败
       //运行看右边:Java运行代码的时候,实际上运行的是子类中的方法
    }

    //创建父类Animal类
    class Animal{
        String name = "动物";

        public void show(){
            System.out.println("Animal--show方法");
        }

    //创建子类Dog类
     class Dog extends Animal{
        String name = "狗";

        @Override
        public void show(){
            System.out.println("Dog--show方法");
        }
    }

    //创建子类Cat类
     class Cat extends Animal{
        String name = "猫";

        @Override
        public void show(){
            System.out.println("Cat--show方法");
        }
        public void catchMouse(){
            System.out.println("猫抓老鼠");
        }
    }
}
 */
        /*
         * 理解:
         * Animal a = new Dog();
         * 现在是用a去调用变量和方法;
         * 而a是Animal类型的,所以Java默认都是从Animal这个类中去找
         * 成员变量:在子类的对象中,会把父类的成员变量也继承下来,故对象a里存在着两个name:父类中的name和子类中的name;由于a的类型是Animal类,故调用父类中的name
         * 成员方法:如果子类对方法进行重写,在虚方法表中是会把父类的方法进行覆盖,故a调用的直接是子类中的show()方法
         */

        //P131 面向对象进阶-多态的优势和弊端

        /*
         * 上两节中多态的优势我们已经感受到了
         *
         * 但多态的也有劣势:
         * 利用多态语法创建的对象无法调用子类的特用功能:
         * (依旧以上面创建的Animal,Dog,Cat为例:)
         * Animal c = new Cat();
         * c.catchMouse(); //此时系统将报错
         * 因为编译的时候Java会先检查左边的父类中是否有该方法,如果没有将直接报错
         *
         * 那么该如何解决该弊端呢?
         * 将通过多态语法创建的对象变回子类类型即可(涉及到强制转换,或者说,铸字):
         * Animal c1 = new Cat();
         * Cat c2 = (Cat) c1; //利用(Cat)强制转换
         * c2.catchMouse(); //此时将不会报错
         *
         * 当然,如果我们想把通过多态语法创建的猫类强制变回为狗子类,那就会报错
         * Dog c2 = (Dog) c1; //报错
         *
         * 因此我们可以利用instanceof方法和if条件句来判断:
         * if (a instanceof Dog){
         *     Dog c = (Dog) a;
         * }else if(a instanceof Cat){
         *     Cat c = (Cat) a;
         * }
         *
         * 在JDK14之后,Java将上述判断语句合并并优化,变成:
         * if (a instanceof Dog d){
         *     d.lookHome();
         * }
         * 它的逻辑是:先判断a是不是多态语句下创建的Dog类,如果是则将它赋值给d
         */


        //P136 面向对象进阶-接口(interface)

        /*
         * 动物类(父类):吃饭,喝水
         * 青蛙类(子类):游泳-public void swim(){}
         * 狗类(子类):游泳-public void swim(){}
         * 兔子类(子类)
         * 在这个例子中,我们发现并不是所有子类都有swim()这个方法,因此不能在父类中专门设计该方法
         * 但很多子类又的的确确拥有swim这一行为
         * 再举一个原神中的例子:假如原神是由Java写成的,那其中的人物为Person类,抽取的角色为Person类的子类-Character类,
         * 而绫华和莫娜这两个角色是Character类中特有的能遁地的角色,因此我们可以写一个规定遁地方法的接口,并在莫娜类和绫华类中实现这个接口
         * 因此,在这种情况下,我们引入接口(interface)这一功能来解决这个问题:
         * 我们创建一个具有游泳功能的接口,它包含了游泳这一行为的规则(即抽象类):public abstract void swim(){}
         *
         * 接口的应用:
         * 举一个例子,假设我们有一个搬家的方法,其参数是Car类及其子类(利用多态可以实现让三轮车,大巴车等等都可以用来搬家)
         * public void move(Car c){}
         * 但在现实生活中,搬家这一功能不仅仅可以通过Car类来实现,也可以通过搬家公司类等其他事物(JavaBean类)来实现
         * 而搬家公司类等Javabean类又不能/不一定能去继承Car类,也就是说无法通过类的多态来实现这一功能
         * 在这种情景下,我们不管是车,搬家公司,哪怕是肩膀扛,只要可以搬家都可以,这种情景下我们要的不是一个继承体系,而是侧重于要干的活.谁干,怎么干,我们不管
         * 因此我们可以定义一个运输的接口:
         * public interface 运输{...}
         * 之后在搬家方法的参数处写成接口的类型就可以了
         * public void move(interface 运输){}
         * 那么在调用方法的时候,不管是车类还是搬家公司类,只要它们按照运输接口中规定的规则编写了方法,那么都可以传递过来:
         * public void move(车的对象){} (√)
         * public void move(搬家公司对象){} (√)
         *
         * 接口和抽象类的异同:
         * 抽象类它更多的是用在父类当中,在抽取共性方法的时候,方法体不一样了,就可以写成抽象方法,而抽象方法所在的类就是抽象类
         * 而接口就不一样了,接口它不是表示一类事物的,接口更多地会侧重于行为:青蛙可以拥有这种行为;狗也可以拥有这种行为;游泳运动员也可以拥有这种行为;
         * 因此接口就是一种规则,是对行为的抽象
         *
         * 接口的定义和使用:
         * 接口使用关键字interface来定义,Syntax:
         * public interface 接口名 {}
         * 注意,接口不能实例化!
         *
         * 接口和类之间是实现的关系,通过implements关键字来表示,Syntax:
         * public class 类名 implements 接口名{}
         *
         * 接口的子类(又叫做:实现类)
         * 在实现类中,要么重写接口中的所有抽象方法(最常用),要么实现类本身也是一个抽象类
         *
         * 注意:
         * (1)接口和类之间的关系是实现关系,可以进行单实现,也可以进行多实现:
         * public class 类名 implements 接口名1, 接口名2, ...{}
         * (2)实现类还可以在继承一个类的同时实现多个接口:
         * public class 类名 extends 父类 implements 接口名1,接口名2,...{}
         */


        //P137 面向对象进阶-接口的细节:成员特点和接口的各种关系

        /*
         * 成员(实例)变量:
         * 接口中的成员变量只能是常量,所有成员变量都默认被public,static和final修饰(不写Java也会默认帮你备注)
         * (也就是说接口中的变量可以通过:interfaceName.varName的方式在任何地方被调用,且当采用interfaceName.varName = newValue;改变接口中的变量(常量)的值时会报错)
         *
         * 构造方法:
         * 接口内没有也不需要有构造方法
         *
         * 成员方法:
         * (JDK7以前)接口中的方法只能是抽象方法,方法默认被public和abstract修饰(不写Java也会默认帮你备注)
         * (JDK8新特性)接口中可以定义有方法体的方法
         * (JDK9新特性)接口中可以定义私有方法
         *
         * 接口和类之间的关系:
         * 实现关系,可以单实现,也可以多实现,还可以在继承一个类的同时实现多个接口
         * 如果多个接口中有重名的方法,我们只需要重写一次即可
         * 比如interface1中有method1和method2;interface2中有method1;我们在实现接口后只需要重写一次method1和method2,重写的这次method1相当于将这两个接口中的method1都重写了
         *
         * 接口和接口之间的关系:
         * 接口与接口之间存在继承关系,而且接口不仅可以实现单继承,也可以实现多继承
         * Ex:public interface InterfaceA extends InterfaceB, InterfaceC...{}
         * 注意:如果实现类(即实现了接口的某个类)实现了继承链最下方的子接口,那么就需要重写该子接口继承的和新建的所有的抽象方法
         */


        //P136 面向对象进阶-接口和抽象类的综合实例

        /*
         * 给了个题目:乒乓球学员以及教练,篮球学员以及教练
         */


        //P136 面向对象进阶-接口中新增方法,接口应用和适配器设计模式

        /*
         * (JDK8新特性)接口中可以定义有方法体的方法(默认(default)方法或静态(static)方法)
         *
         * Java为什么要这么设计呢?
         * 答:为了克服接口升级带来的不便利性:
         * 比如在开发过程中,一个项目小组的组长定义了一个接口,并让组员们使用该接口;组员们也用实现类实现了接口中的方法
         * 过了几天后,需求发生了改变,小组长在接口中新增了其他的规则,即又添加了一些方法.此时如果组员们不重写这些方法,那代码就立即会报错;
         * 而组员们往往会因为手头上有其他任务无法立刻重写,此时就尴尬了
         * 此时Java的开发者就想:如果我又想给接口添加新的规则,又想让他们的代码不报错,那么可以允许开发者在接口里面写有方法体的方法(非抽象方法),这样不就解决问题了
         * 在引入了这一新的特性后,比如一个开发者开发了一个项目,在项目1.0的版本中定义了一个接口,并创建了两个实现类实现了该接口;但在项目2.0版本中,接口新加入了10个新的方法
         * 这就是接口升级.此时实现类不需要立刻进行修改,等以后用到了哪个规则/方法后再进行重写即可,大大增加了便捷性
         *
         * 接口中默认方法(default method)的定义格式:
         * public default 返回值类型 方法名(参数列表){}
         * 注意:
         * (1)默认方法不是抽象方法,所以不强制被重写;但如果默认方法被重写,重写的时候需要去掉default关键字
         * (2)public是默认修饰符,可以省略;但default不可以被省略
         * (3)如果实现了多个接口,多个接口中存在相同名字的默认(default)方法,子类就必须对该重名方法进行重写
         *
         * 接口中静态方法(static method)的定义格式:
         * public static 返回值类型 方法名(参数列表){}
         * 注意:
         * (1)静态方法只能通过接口名调用,即:接口名.静态方法名();,不能通过实现类名或者对象名调用
         * (2)public可以省略,static不能省略
         * (3)静态方法不能也不用在实现类中进行重写,就算进行重写也默认是在实现类中创建了一个与接口中的静态方法同名的类方法而已,在调用时可以通过使用:接口名.同名方法名();与实现类名.同名方法名();来区分同名方法
         *
         * (JDK9新特新)接口中可以定义私有方法(private)
         * 为什么要新增这一特性呢?
         * 比如在大一下学期的数据结构的大作业里,我们先让一个矩阵旋转1次(方法1),之后利用循环令这个矩阵旋转n次(方法2)
         * 在接口中,我们最后提供给用户的肯定是方法2-让一个矩阵旋转n次的这个default method,而方法1仅仅是接口中为方法2提供服务的一个齿轮/零件
         * 也就是说,此方法只为接口提供服务,不需要外类的访问,此时我们可以将该类方法用private权限符进行修饰
         * 接口中私有方法的定义格式(共有2种):
         * Syntax 1: private 返回值类型 方法名(参数列表){} (该方法是为默认方法/default method提供服务的)
         * Syntax 2: private static 返回值类型 方法名(参数列表){} (该方法是为静态方法/static method提供服务的)
         *
         *
         * 适配器设计模式:
         * 解释: 设计模式-是一套被反复使用,多数人知晓,经过分类编目的代码设计经验的总结(也就是行业经验/规则)
         *       适配器设计模式-解决接口与接口的实现类之间的矛盾问题
         * 我们用一个实例来展示:
         */
/*
接口:
public interface Inter{
public abstract void method1();
public abstract void method2();
public abstract void method3();
public abstract void method4();
public abstract void method5();
public abstract void method6();
}
//我们想实现接口中的method6,但这就要求我们还得额外重写method1~method5,非常繁琐
//这种情况下我们就可以用到我们的适配器设计模式:此时我们在接口与实现类中间创建一个桥梁/过渡:适配器-InterAdapter
适配器:
public abstract class InterAdapter implements Inter{
    @Override
    public void method1(){}
    @Override
    public void method2(){}
    @Override
    public void method3(){}
    @Override
    public void method4(){}
    @Override
    public void method5(){}
    @Override
    public void method6(){}
}
//在适配器中,我们将接口中的方法进行重写,但并非真的重写,只是空实现(即不写主体)
//由于适配器类是对接口中的所有方法进行空实现,所以外界调用里面的方法是没有意义的,所以我们为它加上abstract修饰符,避免外界创建适配器类的对象
实现类:
//此时我们的实现类就不需要再实现接口了,只需要继承适配器
public class InterImplement extends InterAdapter{
    //此时我们需要用到哪个方法,就重写适配器中的哪个方法
    @Override
    public void method6(){
        System.out.println("只需要第五个方法");
    }
}
 */
        /*
         * 适配器总结:
         * 使用情景:当一个接口中抽象方法过多,但是我只要使用其中一部分的时候,就可以适配器设计模式
         * 书写步骤:
         * 编写中间类XXXAdapter,实现对应的接口对接口中的抽象方法进行空实现
         * 让真正的实现类继承中间类,并重写需要用的方法
         * 为了避免其他类创建适配器类的对象,中间的适配器类用abstract进行修饰
         * 如果实现类还想继承其他父类,那就适配器在空实现接口的同时继承实现类所需的父类
         */

        //P136 面向对象进阶-接口

        /*
         *
         *
         *
         */


        //P140 面向对象进阶-初识内部类

        /*
         * 什么是内部类?
         */
/*
public class Outer{ //外部类
    public class Inner{//内部类
    }
}
 */
        /*
         * 内部类有什么用?
         * 比如我们定义了一个汽车类,里面包含了汽车的品牌,颜色,发动机等等
         * 但是我们发现,在定义发动机时,我们需要为发动机添加很多它的变量和方法,比如发动机寿命,功率;发动机点火;发动机熄火
         * 此时我们就可以把发动机写成Car类的内部类
         * 同时我们发现发动机类离开了Car类将没有任何使用的意义
         *
         * 综上,我们得出使用内部类的情景:
         * 内部类表示的事物是外部类的一部分
         * 内部类单独出现没有任何意义
         *
         * 内部类的访问特点:
         * 内部类可以直接访问外部类的成员,包括私有成员(成员包含:实例变量,类变量,方法,构造器等)
         * 外部类要访问内部类的成员,必须创建内部类的对象
         */

        //P141 面向对象进阶-成员内部类

        /*
         * 内部类总共分为:(1)成员内部类(2)静态内部类(3)局部内部类(4)匿名内部类
         *
         * 本节我们学习(1)成员内部类
         * 成员内部类写在外部类的成员位置(跟外部类的方法,实例变量或类变量写在一起),属于外部类的成员
         * 成员内部类可以被一些修饰符所修饰,比如private,默认,protected,public,static等
         *
         * 注意:
         * 成员内部类被private修饰后,它能且只能在外部类中创建对象
         * 成员内部类被default修饰后,它能且只能在本包(package)中被使用
         * 成员内部类被protected修饰后,它能且只能在本包(package)中,以及别的包的子类中被使用
         * 成员内部类被public修饰后,它能在任何地方被使用
         * 如果一个类被static所修饰,那么它就不叫成员内部类了,而是成为了第二种内部类(2)静态内部类
         *
         * 新特性:在成员内部类里面,JDK16之前不能定义静态变量,JDK16开始才可以定义静态变量
         *
         * 如何获取成员内部类的对象??
         * 方法1: OuterClass.InnerClass innerclass = new OuterClass().new InnerClass();
         * 该方法有个弊端是:当成员内部类被private修饰后,它将无法在除外部类之外的地方创建对象
         * 方法2:在外部类中编写方法,对外提供内部类对象(通常用于成员内部类被private修饰时)
         * Ex:
         */
/*
public class Outer{ //外部类
    public Inner getInner(){
        return new Inner();
    }
    public class Inner{//内部类
    }
}
 */
        /*
         * 成员内部类如何获取外部类的成员变量:
         * 在成员内部类中会有一个隐藏的变量,该变量的类型是它的外部类,变量的名字叫做this$0(字节码文件中会给内部类加$,用于区分inner类中的this)
         * Syntax: 外部类类名.this.方法名/变量名
         * 我们可以通过这样的语法在内部类里调用外部类中的同名方法/变量
         */
/*
public class Outer{ //外部类
    private int a = 10; // Outer.this.a

    public class Inner{//内部类
        private int a = 20; // this.a
        public void show(){
            int a = 30; // a
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Outer.this.a);
        }
    }
}
 */


        //P142 面向对象进阶-静态内部类和局部内部类

        /*
         * (2)静态内部类:
         * 当成员内部类被static修饰之后,我们称它为静态内部类
         * 我们在学习static关键字时讲过:比如一个静态方法/类方法,它在调用成员变量时只能调用类变量/静态变量(因为实例变量可能随着创建对象的不同而发生改变)
         * 同理,静态内部类只能访问外部类中的静态变量和静态方法,如果想要访问非静态的变量或方法需要创建外部类的对象
         * 创建静态内部类对象的格式: 外部类类名.内部类类名 对象名 = new 外部类名.内部类名(); //由于静态内部类的地位相当于外部类的类方法,因此我们可以通过外部类类名.内部类类名的方式来调用它
         *
         * 注意事项:
         * 1.静态内部类也是成员内部类中的一种
         * 2.静态内部类只能访问外部类中的静态变量和静态方法(如果想要访问非静态的变量或方法需要创建外部类的对象)
         *
         * 如何在外部类中调用静态内部类中的方法?
         * 内部类中的静态方法: 外部类类名.内部类类名.方法名();
         * 内部类中的非静态方法: 创建内部类的对象,用其对象进行调用
         *
         *
         * (3)局部内部类 //没啥用,了解一下就好
         * 1.将内部类定义在方法里面就叫做局部内部类,类似于方法里面的局部变量
         * 2.外界是无法直接使用局部内部类(就像无法在其他类里去调用某个类的方法里的局部变量一样),需要在方法内部创建对象并使用
         * 3.该类可以直接访问外部类的成员,也可以访问方法内的局部变量
         */


        //P142 面向对象进阶-匿名内部类

        /*
         * 匿名内部类本质上就是隐藏了名字的内部类
         * Syntax:
         */
/*
    new 类名或接口名(){
        重写方法;
    };
 */
        /*
         * 让我们演示一下匿名内部类的诞生过程:
         */
/*
假如我们有一个接口:
public interface Swim{
    public abstract void swim();
}

我们想去实现该接口,就必须使用一个实现类:
public class Student implements Swim{
    @Override
    public void swim(){
        System.out.println("重写的游泳方法");
    }
}

假如我们把该实现类的类名给删除,那么只剩下类的主体:
{//类的开始
    @Override
    public void swim(){
        System.out.println("重写的游泳方法");
    }
}//类的结束

如果想用这个没有名字的实现类去实现Swim接口,那么我必须把Swim写在大括号前面来表示这个没有名字的类实现了Swim接口,所以需要在类中重写接口里面所有的抽象方法
Swim{//类的开始
    @Override
    public void swim(){
        System.out.println("重写的游泳方法");
    }
}//类的结束

如果还想要创建这个没有名字的类的对象,我们该怎么办?
对于有名字的类,我们用: new 类名();来创建对象
对于这个没有名字的类,我们用: new 接口名();来创建对象,即:
new Swim() {
    @Override
    public void swim(){
        System.out.println("重写的游泳方法");
    }
};

我们来再次辨析一下:
这部分是真正的类,只不过它没有名字;
{//类的开始
    @Override
    public void swim(){
        System.out.println("重写的游泳方法");
    }
}//类的结束

匿名内部类的写法相当于给上述那一部分的前面加上了new关键字和一个名字(接口/抽象父类的名字)+()空参构造,然后在最下端加上";"使它符合声明一个类的对象的语法
new Swim() {
    @Override
    public void swim(){
        System.out.println("重写的游泳方法");
    }
};

因此,匿名内部类严格意义上应该叫做:匿名内部类的对象

上述我们是以接口为例,创建了一个没有名字的接口的实现类的对象
当然我们可以不局限于接口,即不局限于实现一个接口,而是去继承一个类(这个类可以是一个抽象类)
 */
        /*
         * 那么对于匿名内部类,我们该在什么场景下去使用它呢?
         *
         */
/*
假如我们有一个抽象类Animal,该抽象类中有一个抽象方法eat();
public abstract class Animal{
    public abstract void eat();
}
如果我们想在Test类中创建一个方法:
public class Test{

    public method(Animal a){
        a.eat();
        System.out.println("调用了Animal类的对象并利用该对象调用了Animal类中的抽象方法eat()");
        }

    public static void main(String[] args) {

    }
}
在该方法中我们需要一个Animal类型的对象作为参数,然后去调用它,那么按照我们以往的习惯,我们会先创建一个Animal类的实现子类
(因为抽象类本身不允许创建对象),之后在该子类中继承并重写抽象父类中的抽象方法,然后在Test类中的method(Animal a)方法内创建该子类的对象后去调用重写后的抽象方法
我们发现,这个子类我们可能只会用到一次,但我们为了使用它父类的抽象方法还必须单独定义一个类,很麻烦
在学习了匿名内部类后,我们可以这样操作:
public class Test{

    public method(Animal a){
        a.eat();
        System.out.println("调用了Animal类的对象并利用该对象调用了Animal类中的抽象方法eat()");
        }

    public static void main(String[] args) {
        method(
                new Animal(){
                    @Override
                    public void eat(){
                        System.out.println("狗吃骨头");
                    }
                }
        );
        //相当于在main方法中将一个匿名内部类当作一个Animal的(子类的)对象直接作为参数传递给了method(Animal a)方法(多态)
    }
}
 */
        /*
         * 关于匿名内部类还有一些别的使用方法,因为一个匿名内部类的本质是一个接口/父类的实现类/子类的对象
         * 因此我们可以将匿名内部类给一个它对应接口/父类类型的变量进行赋值:
         */
/*
已知一个接口:
public interface Swim{
    public abstract void swim();
}

在Test类中:
public class Test{
    public static void main(String[] args) {

        Swim s = new Swim(){ //接口的多态
            @Override
            public void swim(){
                System.out.println("重写之后的游泳方法");
            }
        };
        s.swim();//此时我们就可以用该变量去调用匿名实现类中的重写方法
    }
}
 */
        /*
         * 同时,由于匿名内部类本身算是一个对象,因此匿名内部类可以调用自己内部的重写方法:
         */
/*
已知一个接口:
public interface Swim{
    public abstract void swim();
}

在Test类中:
public class Test{
    public static void main(String[] args) {
        new Swim(){
            @Override
            public void swim(){
                System.out.println("重写之后的游泳方法");
            }
        }.swim();
    }
}
 */
        /*
         * 总结:
         * 1.什么是匿名内部类?
         * 隐藏了名字的内部类,可以写在成员位置,也可以写在局部位置
         * 2.匿名内部类的格式?
         * new 类名/接口名(){
         *     重写方法;
         * };
         * 3.格式的细节:
         * 包含了继承或实现,方法重写,创建对象
         * 它的整体就是一个类的子类对象或者接口的实现类对象
         * 4.使用场景:
         * 当方法的参数是接口或者类时,
         * 以接口为例,可以传递这个接口的实现类对象
         * 如果实现类只要使用一次,就可以用匿名内部类简化代码
         *
         */


        //P142 面向对象进阶-静态内部类和局部内部类

        /*
         *
         *
         *
         */


        //P142 面向对象进阶-静态内部类和局部内部类

        /*
         *
         *
         *
         */


//P185 单列集合顶层接口Collection
/*
集合分为:
    单列集合-Collection
    双列集合-Map(每次填充数据时填充一对数据,类似Python中的字典)

Collection类为单列集合的顶层接口(父类):
Collection(接口)
    (1)List(接口)
        (a)ArrayList(实现类)
        (b)LinkedList(实现类)
        (c)Vector(实现类,已被淘汰)
    (2)Set(接口)
        (a)HashSet(实现类)
            (a)LinkedHashSet(实现类)
        (b)TreeSet(实现类)

(1)List系列集合:添加的元素是有序(存的时候和取的时候顺序相同),可重复(元素可重复出现),有索引的
(2)Set系列集合:添加的元素是无序(存的时候和取的时候顺序不相同),不重复,无索引的

Collection接口:
Collection是单列集合的祖宗接口,它的功能是全部单列集合都可以继承使用的。
把给定的对象添加到当前集合中: public boolean add(E e)
清空集合中所有的元素: public void clear()
把给定的对象在当前集合中删除: public boolean remove(E e)
判断当前集合中是否包含给定的对象: public boolean contains(object obj)
//注意!!!contains()方法是利用equals()方法实现的,如果Collection存的是自定义对象(如Student类),没有重写equals()方法,那么默认使用Object类中
//equals()方法,这将依赖地址值进行判断;如果我们存储的是Student对象,我们的需求是判断两个Student对象的age和name是否相同(属性值是否相同)
//所以我们必须在自定义的JavaBean类中重写equals方法(IDEA里的generate快捷键里会提供),此时Collection中的contains()才能正常判断
判断当前集合是否为空: public boolean isEmpty()
返回集合中元素的个数/集合的长度: public int size()
*/


//P186 迭代器(增强For)
/*
由于Set接口下的集合无索引,因此无法用传统的方式去遍历他们
为此我们提供三种更通用的遍历方式:
(1)迭代器遍历
(2)增强for遍历
(3)Lambda表达式遍历

(1)迭代器遍历(特点为不依赖索引)
迭代器在Java中的类是Iterator,迭代器是集合专用的遍历方式
Collection集合获取迭代器:
Iterator<E> iterator() 返回迭代器对象,默认指向当前集合的0索引处
Iterator中的常用方法:
Boolean hasNext(): 判断当前位置是否有元素,有则返还true,没有则返回false
E next() 获取当前位置的元素并将迭代器对象移向下一个位置

编程时常用以下套路(组合拳):
Iterator<String> it = list.iterator();//创建指针:
boolean flag = it.hasNext();//判断是否有元素:
while(it.hasNext()){
    String str = it.next();//获取元素+移动指针:
    System.out.println(str);
}

注意细节:
1.报错NoSuchElementException(指针指向了没有元素的位置)
2.迭代器遍历完毕,指针不会复位
3.循环中只能用一次next方法(多次调用会导致循坏未结束时指针提前指完所有元素导致NoSuchElementException报错)
4.迭代器遍历时,不能用集合的方法进行增加或者删除
比如在循环过程中使用集合中的方法remove方法修改集合,将导致报错
只能使用迭代器中提供的remove方法进行删除(但无法进行元素的添加)

*/


//P192 泛型类,泛型方法
/*
泛型:是JDK5中引入的特性，可以在编译阶段约束操作的数据类型，并进行检查。

泛型的格式:<数据类型>
注意:泛型只能支持引用数据类型

泛型的好处:
统一数据类型。
把运行时期的问题提前到了编译期间，避免了强制类型转换可能出现的异常，因为在编译阶段类型就能确定下来。

拓展:
Java中的泛型是伪泛型,即加入你设置了一个ArrayList<String>,此时Java只允许String类型的变量进入数组
但是,集合仍然会将集合内的String类型的数据当作Object类型的数据进行处理,只不过在从集合中提取数据时,Java会将Object类型的数据
铸字成String类型

泛型的细节:
泛型中不能写基本数据类型(八大基本数据类型:boolean,int,double等)
指定泛型的具体类型后,传递数据时,可以传入该类类型或者其子类类型
如果不写泛型,类型默认是Object
泛型不具备继承性,比如method(ArrayList<Father> list),该方法需要Father类型的数组,如果Son类是Father类的子类,
ArrayList<Son> test = new ArrayList<>;此时将test填入该方法:method(test),Java会报错,因为泛型没有继承关系
虽然泛型不具备继承性,但数据具有继承性,我们可以创建:ArrayList<Father> test2 = new ArrayList<>;,之后向test2中加入Father类和Son类的对象
之后再用test2作为参数填入:method(test2),此时不会报错

泛型的使用:
(1)泛型类
(2)泛型方法
(3)泛型接口


(1)泛型类:
当我们在编写一个类中,有一些变量/一些方法我们不能确定它的类型,那么这个类就可以定义为泛型类
public class className<E>{ //<>中常用T/E/K/V

}
(2)泛型方法:
当方法中形参类型不能确定时,可以使用类名后面定义的泛型<E>;但如果类中只有一个方法的形参类型不能确定,那么我们可以仅在该方法后规定一泛型<E>
而无需使用泛型类
因此,当方法中形参类型或者return类型不确定时:
方案一:使用类名后面定义的泛型(该泛型可供该类中的所有方法使用)
Ex:
public class className<E>{ //<>中常用T/E/K/V
    public <E> void show(E e){}
}
方案二:在方法前为申明该方法定义泛型(该泛型仅可供该方法使用)
public <T> void show(T t){}

(3)泛型接口:
格式:
修饰符 interface 接口名<类型>{}

重点:如何使用一个带泛型的接口?
(1)方式:实现类中给出具体类型
(2)方式:实现类延续泛型,创建对象时再确定


泛型的通配符:
如何限制传递给泛型的类?
比如我们虽然使用了泛型,但我们不希望除了Animal类及其子类之外的类输入泛型,那此时该怎么办呢?
<? extends className/interfaceName>:表示仅可以传递className(interfaceName的实现类)或者clasName所有的子类类型
<? super className/interfaceName>:表示仅可以传递className(interfaceName的实现类)或者clasName所有的父类类型
或者可以类与接口混合使用:<T extends classA & interfaceA & interfaceB> 表示必须既是classA或其子类,同时需要时interfaceA和interfaceB的实现类

*/

//P34 初识Stream流
/*
ArrayList<String> list1 = new ArrayList<>();
list1.add("张无忌");
list1.add("华强");
list1.add("赵敏");
list1.add("张强");
list1.add("张三丰");
如何从list1中得到长度为3且姓为张的名字?
用Stream流解决:
list1.stream().filter(name -> name.startWith("张")).filter(name -> name.length() == 3).forEach(name -> System.out.println(name));
 */


//P35 Stream流的思想和获取Steam流
/*
Stream流的作用:
    结合了Lambda表达式，简化集合、数组的操作

Stream流的使用步骤:
(一)先得到一条Stream流(流水线),并把数据放上去
(二)利用Stream流中的API进行各种操作
(1)先使用中间方法对流水线上的数据进行操作
中间方法(方法调用完毕之后,还可以调用其他方法):
    过滤 转换
(2)再使用终结方法对流水线上的数据进行操作
终结方法(最后一步，调用完毕之后，不能调用其他方法):
    统计 打印

(一)获取Stream流:
(1)单列集合(collection中的默认方法):default Stream<E> stream()
Ex: listName.stream()

(2)双列集合(无法直接使用stream流):无,需要将双列集合转换成单列集合后才能使用stream流
Ex:
hm.keySet().stream()
hm.entrySet().stream()

(3)数组(Arrays工具类中的静态方法):public static <T> Stream<T> stream(T[] array)
Ex: Arrays.stream(arrName)

(4)一堆零散数据(Stream接口中的静态方法):public static<T> Stream<T> of (T... values)
使用前提:这堆零散的数据是同种类型的
Stream.of(1,2,3,4,5).forEach(s -> System.out.println(s));
注意:Steam.of()方法的形参是一个可变参数，可以传递一堆零散的数据，也可以传递数组,//但是数组必须是引用数据类型的，
如果传递基本数据类型，是会把整个数组当做一个元素，放到Stream当中。
*/


//P36 Steam流的中间方法
/*
(a)过滤: Stream<T> filter(Predicate<? super T> predicate)
(a)过滤: Stream<T> filter(Predicate<? super T> predicate)
Ex:
ArrayList<String> list = new ArrayList<>();
Collection.addAll(list,"张无忌","赵敏","周芷若","张强","张三丰","张翠山","张良","王二麻子","谢广坤");
//把张开头的留下
(1)用匿名内部类的写法来写:
list.stream().filter(new Predicate<String>(){
    @Override
    public boolean test(String s){
        //如果返回值为true,则表示当前数据留下
        //如果为false,则数据舍弃不要
        return s.startWith("张");
    }
}).forEach(s -> System.out.println(s));
(2)用lambda表达式来写:
list.stream().
    filter(s -> s.starWith("张")).
    forEach(s -> System.out.println(s));


(b)获取前几个元素: Stream<T> limit(long maxsize)
(b)获取前几个元素: Stream<T> limit(long maxsize)
Ex:
ArrayList<String> list = new ArrayList<>();
Collection.addAll(list,"张无忌","赵敏","周芷若","张强","张三丰","张翠山","张良","王二麻子","谢广坤");
list.stream().limit(3).forEach(s -> System.out.println(s));
此时会输出前三项:"张无忌","赵敏","周芷若"


(c)跳过前几个元素: Stream<T> skip(long n)
(c)跳过前几个元素: Stream<T> skip(long n)
Ex:
ArrayList<String> list = new ArrayList<>();
Collection.addAll(list,"张无忌","赵敏","周芷若","张强","张三丰","张翠山","张良","王二麻子","谢广坤");
list.stream().skip(3).limit(3).forEach(s -> System.out.println(s));
此时将输出中间三项:"张强","张三丰","张翠山"


(d)元素去重，依赖(hashCode和equals方法): Stream<T> distinct()
(d)元素去重，依赖(hashCode和equals方法): Stream<T> distinct()
distinct()方法底层以来hashCode和equals方法
如果数组的类型不是String而是学生对象等,需要手动重写该方法
Ex:
ArrayList<String> list = new ArrayList<>();
Collection.addAll(list,"张无忌","张无忌","赵敏","周芷若","张强","张三丰","张翠山","张良","王二麻子","谢广坤");
list.stream().distinct().forEach(s -> System.out.println(s));
此时将输出:"张无忌","赵敏","周芷若","张强","张三丰","张翠山","张良","王二麻子","谢广坤"


(e)合并a和b两个流为一个流: static <T> Stream<T> concat(Stream a, Stream b)
(e)合并a和b两个流为一个流: static <T> Stream<T> concat(Stream a, Stream b)

(f)转换流中的数据类型: Stream<R> map(Function<T , R> mapper)
(f)转换流中的数据类型: Stream<R> map(Function<T , R> mapper)
ArrayList<String> list = new ArrayList<>();
Collection.addAll(list,"张无忌-15","赵敏-14","周芷若-13","张强-35","张三丰-100","张翠山-27","张良-32","王二麻子-34","谢广坤-22");
(1)匿名内部类写法
list.stream().map(new Function<String,Integer>(){
    @Override
    public Integer apply(String s){
        String[] arr = s.split("-");
        String ageString = arr[1];
        return Integer.parseInt(ageInt);
    }
}).forEach(s -> System.out.println(s));
(2)lambda表达式写法
list.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(s -> System.out.println(s));

注意1:中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
注意2:修改Stream流中的数据，不会影响原来集合或者数组中的数据
*/


//P37 Stream流终结方法
/*
(a)遍历: void forEach(Consumer action)
(b)统计流中数据的个数: long count()
(c)收集流中的数据,放到数组中: toArray()
Ex:假如想创建一个String[]来收集流中的数据:
String[] stringList = list.stream().toArray(value -> new String[value]);
(其中的value指的是流中数据的个数/数组的长度)
(d)收集流中的数据,放到集合中: collect(Collector collector)


*/



//P51 异常体系介绍
/*
异常:异常就是代表程序出现的问题

以下是异常的集成体系:
Throwable
    Error
    Exception
        RuntimeException
            NullPointerException
            ArithmeticException
            ArrayIndexOutOfBoundsException
        其他异常

Error:
    代表的系统级别错误（属于严重问题)
Exception:
    叫做异常，代表程序可能出现的问题。叫做异常，代表程序可能出现的问题。
    我们通常会用Exception以及他的子类来封装程序出现的问题。
运行时异常(未受控异常):
    RuntimeException及其子类，编译阶段不会出现异常提醒。
    运行时出现的异常（如:数组索引越界异常)
编译时异常(受控异常):
    编译阶段就会出现异常提醒的。
*/


//P52 编译时异常和运行时异常
/*
Java文件 →(Javac命令)→ 字节码文件 →(Java命令)→ 运行结果
              ↑编译过程               ↑运行结果
编译过程发生的异常:编译异常
运行过程发生的异常:运行异常
*/


//P53 异常在代码中的两个作用
/*
作用一:异常是用来查询bug的关键参考信息(通过Java给的报错来修复BUG)
作用二︰异常可以作为方法内部的一种特殊返回值，以便通知调用者底层的执行情况
    比如学生类的构造函数为Student(String name, int age);
    其中规定age的范围是18-25;
    在学习异常之前,如果输入的年龄范围不在18-25,那么我们只能用一个else{System.out.println("请输入18-25");}条件句来提醒使用者
    在学习异常之后,我们可以用else{throw new RuntimeException();}只要用户输入了18-25之外的数字,那就不是提醒那么简单了,而会直接报错
*/


//P54 JVM虚拟机默认处理异常的方式
/*
异常的处理方法:
(1)用Java虚拟机的默认方案来处理:
    把异常的名称，异常原因及异常出现的位置等信息输出在了控制台
    程序停止执行，下面的代码不会再执行了
    (我们平时经常遇见的报错)
(2)自己处理
(3)(交给调用者处理)抛出异常
*/


//P55 try-catch捕获异常
/*
异常的处理方法:
(2)自己处理:
try{
    可能出现异常的代码;
}catch(异常类名 变量名){
    异常的处理代码;
}
目的:当代码出现异常时,可以让程序继续往下执行

Ex:
int[] arr = {1,2,3,4,5,6};
try{
    //此处如果出现了异常,程序就会在这里创建一个ArrayIndexOutOfBoundsException对象:
    System.out.println(arr[10]);
    // new ArrayIndexOutOfBoundsException();
}catch (ArrayIndexOutOfBoundException e){ //Java将拿着这个对象到catch的小括号里进行比对,看括号中的变量是否可以接受/匹配这个对象
    //如果对象能够被接收,就表示该异常(对象)就被捕获(抓住),catch语句内的代码将被执行
    System.out.println("索引越界了");
    //当catch里面所有的代码运行完毕,将继续执行其他catch语句或者finally语句
}
*/


//P56 try-catch捕获异常的灵魂四问:(1)(2)
/*
try-catch捕获异常
(1)如果try中没有遇到问题该怎么执行?
答:会把try中的所有代码全部执行完毕,不会执行catch里面的代码
(2)如果try中可能遇到多个问题,此时该怎么执行?
答:我们可以写多个catch语句与之对应
   但是如果我们要捕获的多个异常,这些异常之间存在父子类的关系的话,那么捕获父类的catch语句一定要写在下面
   在DK7之后，我们可以在catch中同时捕获多个异常，中间用|进行隔开表示如果出现了A异常或者B异常的话，采取同一种处理方案
*/


//P57 try-catch捕获异常的灵魂四问:(3)(4)
/*
try-catch捕获异常
(3)如果try中遇到的问题没有被捕获,该怎么执行?
比如发生的是ArrayIndexOutOfBoundsException异常,但我们却在catch语句里用NullPointerException来尝试捕获
答:此时Java会采用虚拟机默认的方式来处理异常,即直接终止编译,然后报错
(4)如果try中遇到了问题,那么try下面的其他代码会执行么?
答:不会;如果try下面的代码也出现了问题,那么会去找对应的catch进行捕获;如果捕获失败Java会终止编译直接报错
*/


//P58 异常中的常见方法
/*
异常类(Throwable类)中的常用方法:
public string getMessage() 返回此throwable的详细消息字符串(获取"发生了什么错误的"信息)
public string toString() 返回此可抛出的简短描述(获取异常的名字+"发生了什么错误的"信息)
public void printStackTrace() 把异常的全部错误信息(地址+信息)以红色的字体输出在控制台(仅仅会打印信息,不会终止程序的运行) (该方法在底层是用System.err.println进行输出)
*/


//P59 抛出异常
/*
异常的处理方法:
(3)(交给调用者处理)抛出异常
抛出处理有两种关键字:

(1)throws
它写在方法的定义处,表示声明一个异常,告诉调用者使用笨方法可能会有哪些异常
Ex:
public void 方法名() throws 异常类名1,异常类名2...{}
如果是编译时异常,异常类名则不能省略,必须要写上;
如果是运行时异常,异常类名则可以省略

(2)throw
写在方法内,结束方法
手动抛出异常对象,交给调用者
方法中处于throw下面的代码不再执行
Ex:
public void 方法名(){
    throw new NullPointerException();
    //下面的代码不会执行
    代码..
}


下面举一个编程时会遇到的具体问题:
我们想写一个能到达数组内最大值的方法:
public static int getMax(int[] arr){
    int max = arr[0];
    for (int i = 1; i < arr.length; i++){
        if (arr[i] > max){
            max = arr[i];
        }
    }
    return max;
}
但这个方法可能会遇到两种异常:
(1)空指针异常: NullPointerException
比如用户令 int[] arr = null;
(2)超出数组长度异常: ArrayIndexOutOfBoundException
比如用户令 int [] arr = new int[0]; 长度为0的数组

那么此时我们就可以用throw关键字添加两个if条件句,手动创建上述两种可能出现的异常并将其交给方法的调用者处理
同时我们可以用throws关键字在方法名后面告诉用户这个方法里可能会出现的异常的类型(本例中的异常类型都是运行时异常,可以省略不写):
public static int getMax(int[] arr) throws NullPointerException, ArrayIndexOutOfBoundException{
    if (arr == null){
        throw new NullPointerException();
    }
    if (arr.length == 0){
        throw new ArrayIndexOfBoundException();
    }
    int max = arr[0];
    for (int i = 1; i < arr.length; i++){
        if (arr[i] > max){
            max = arr[i];
        }
    }
    return max;
}

在抛出异常之后,我们需要处理异常:
int[] arr = null;
int max = 0;
try{
    max = getMax(arr);
}catch(NullPointerException e){
    System.our.println("空指针异常");
}catch(ArrayIndexOfBoundException e){
    System.out.println("索引越界异常");
}
*/


//P60 综合练习
/*
学习完抛出和捕获,我们可能比较迷惑什么时候该用它们
抛出的目的是告诉调用者这个地方出错了,它往往写在方法内;
捕获的目的是让已经出错(出现抛出)的代码不停止编译,而是继续运行下去

以下为一实用的案例:
Scanner sc = new Scanner(System.in);
GirlFriend gf = new GirlFriend();
while (true) {
    try{
        System.out.println("请输入女朋友的名字");
        String name = sc.nextLine();
        gf.setName(name);
        System.out.println("请输入女朋友的年龄");
        String age = sc.nextLine();
        int age = Integer.parseInt(age);
        gf.setAge(age);
        break; //如果上述所有的数据输入都是正确的,那么将退出循环,否则将一直持续循环
    }catch(NumberFormatException e){
        System.out.println("年龄输入有误");
        continue;
    }catch(RuntimeException e){
        System.out.println("姓名输入有误");
        continue;
    }
}
*/


//P61 自定义异常
/*
在P60的例子中,我们在给set方法中加入throw语句时很难选择合适的异常类型
在这种情况下,我们可以利用继承自定义一个异常
步骤:
(1)定义异常类
异常类的名字要见名知意
(2)写继承关系
如果当前异常为编译异常,那就继承Exception;
如果为运行时异常,那就异常RuntimeException
(3)空参构造
为自定义的异常类创建空参构造方法
(4)带参构造
利用super()为自定义的异常类创建构造方法
*/


//62 File的概述和构造方法
/*
1. File表示什么?
File对象表示路径，可以是文件、也可以是文件夹。这个路径可以是存在的，也可以是不存在的\\

2．绝对路径和相对路径是什么意思?
绝对路径是带盘符的。
相对路径是不带盘符的，默认到当前项目下去找

3. File三种构造方法的作用?
public File(String pathname) 把字符串表示的路径变成File对象

public File(string parent，string child) 把父级路径和子级路径进行拼接

public File(File parent，string child) 把父级路径和子级路径进行拼接

注意:
用一例子辨别父级路径和子级路径:
C:\\Users\\alienware\\Desktop\\a.txt
父级路径:C:\\Users\\alienware\\Desktop
子级路径:a.txt
*/

//63 File的成员方法(判断,获取)
/*
public boolean isDirectory() 判断此路径名表示的File是否为文件夹
public boolean isFile() 判断此路径名表示的File是否为文件
public boolean exists() 判断此路径名表示的File是否存在
public long length() 返回文件的大小（字节数量)
public String gerAbsolutePath() 返回文件的绝对路径
public String getPath() 返回定义文件时使用的路径
public String getName() 返回文件的名称，带后缀
public long lastModified() 返回文件的最后修改时间（时间毫秒值)
*/

//64 File的成员方法(创建,删除)
/*
public boolean createNewFile() 创建一个新的空的文件
public boolean createNewFile() 创建一个新的空的文件
细节1:
如果当前路径表示的文件是不存在的，则创建成功，方法返回true
如果当前路径表示的文件是存在的，则创建失败，方法返回false
细节2:
如果父级路径是不存在的，那么方法会有异常IOException
细节3:
createNewFile方法创建的一定是文件，如果路径中不包含后缀名，则创建一个没有后缀的文件
使用方法:
File newFile = new File("D:\\test.txt");//先在内存中创建一个File对象
try{
    newFile.createNewFile();//将File对象于硬盘中进行创建
    System.out.println("创建成功");
}catch (IOException e){
    e.printStackTrace();
}

public boolean mkdir() 创建单级文件夹
public boolean mkdir() 创建单级文件夹
细节1: windows当中路径是唯一的，如果当前路径已经存在，则创建失败，返回false(比如同一个文件夹里,已用了一个名为aaa的文件或文件夹,那你就无法用mkdir来在该路径下再创建同名文件夹)
细节2: mkdir方法只能创建单级文件夹，无法创建多级文件夹(比如你的路径是D:\\aaa\\bbb\\ccc\\ddd,其中aaa文件夹是真实存在的,而bbb,ccc文件夹还没创建,那么此时mkdir将不会帮你自动创建bbb和ccc文件夹这多级文件夹,因此创建失败)
public boolean mkdirs() 创建多级文件夹
解释:比如你的路径是D:\\aaa\\bbb\\ccc\\ddd,其中aaa文件夹是真实存在的,而bbb,ccc文件夹还没创建,那么mkdirs会帮你把中间的bbb和ccc文件夹补上,
创建bbb和ccc后再创建ddd
细节1:mkdirs既可以创建多级文件夹,也可以创建单级文件夹

public boolean delete() 删除文件、空文件夹(delete方法直接删除,不会走回收站)
public boolean delete() 删除文件、空文件夹(delete方法直接删除,不会走回收站)
细节1:
如果删除的是文件,则直接删除,不走回收站
如果删除的是空文件夹，则直接删除，不走回收站
如果删除的是有内容的文件夹，则删除失败
*/


//65 File的成员方法(所有获取并遍历的方法)
/*
public File[] listFiles() 获取当前路径下的所有内容-文件+文件夹(包括隐藏的文件或者文件夹)
使用方法Ex:
File test = new File("C://照片");
File[] files = test.listFiles();
for (File file : files){
    System.out.println(file);
}
此时将返回C盘照片文件夹中所有文件或文件夹的绝对地址
当调用者File表示的路径不存在时，返回null
当调用者File表示的路径是文件时，返回null
当调用者File表示的路径是一个空文件夹时，返回一个长度为0的数组
当调用者File表示的路径是一个有内容的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回
当调用者File表示的路径是一个有隐藏文件的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回，包含隐藏文件
当调用者File表示的路径是需要权限才能访问的文件夹时，返回null(这点很重要,因为当你要遍历所有磁盘时,难免会遇到像回收站等没有权限进入的文件)
*/


//P66 File的成员方法(所有获取并遍历的方法)
/*
public static File[] listRoots()
列出可用的文件系统根(用于获取系统中的所有的盘符,也就是CDE等硬盘)

public string[ ] list()
获取当前该路径下所有内容(返回的将是包含所有文件/文件夹名字的数组)

public string[ ] list(FilenameFilter filter)
利用文件名过滤器获取当前该路径下所有内容
Ex:我们想获取D盘中aaa文件夹里面所有的txt文件
File f2 = new File("D:\\aaa");
//我们发现FilenameFilter是一个仅含有一个方法(accept)的接口,因此我们可以用匿名内部类的方式去调用它
//accept方法:如果return true:表示当前路径保留;如果return false:表示当前路径舍弃不要
String[] arr3 = f2.list(new FilenameFilter(){
    @Override
    public boolean accept(File dir, String name){
        File src = new File(dir,name);//将父级路径和子级路径进行拼接
        if (src.isFile() && name.endWith(".txt")){
            return true;
        }else{
            return false;
        }
    }
});

(重点掌握)public File[] listFiles()
获取当前该路径下所有内容()

public File[] listFiles(FileFilter filter)
利用文件名过滤器获取当前该路径下所有内容

public File[] listFiles(FilenameFilter filter)
利用文件名过滤器获取当前该路径下所有内容
*/


//IO流原理以及分类
/*
Java的IO流:
    字节流:
        InputStream
        OutputStream
    字符流:
        Reader
        Writer


*/

    }
}
