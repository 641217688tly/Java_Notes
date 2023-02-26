import java.util.Scanner;

public class Java_Learning {
    public static void main(String[] args) {
        // Weeks 1 & 2 - 2022-08-29 -> 2022-09-09 Lecture 02 - Java Syntax 01-Summary
        /*
         * 简单介绍了本周课程的教学目标(contents)，忽略
         */


        // Weeks 1 & 2 - 2022-08-29 -> 2022-09-09 Lecture 02 - Java Syntax 02-Data Types
        /*
         * Java需要知道任意变量的类型，所以我们需要在变量前添加额外的信息
         * Syntax: variable_type varName = XX
         * 另外，Java只在第一次创建变量时需要得知变量的类型，在创建变量后再次使用变量时就不需要再添加额外信息了
         * Ex：
         */
        int number1 = 666;
        number1 = 999;
        number1 = 1000;

        /*
         * 编程语言有着不同的方式去使用变量，其中两种较为常见的策略是：
         * Types are dynamic(动态-一些事情会发生改变) or static(静态-一些事不会改变)
         * Types are strong or weak(比如一个变量被赋值为整数1，在一个function中变量可以是整数1，但在另一个function中变量是string,代表语言为JavaScript)
         * Java和Python都是strong types，即变量的类型在变量被赋值后不会改变，是string就永远是string，是int就永远是int,不会因为在不同的function里表现出不同的类型
         * 但Python是dynamic(动态的)，可以通过重新给变量赋值来改变变量的类型，Ex：
         * var_name = "Hello" # 注意这是模拟在Python中的情况
         * var_name = 100 # 注意这是模拟在Python中的情况
         * 结果就是该变量最终的类型由原先的string变为int
         * 在Java中，变量在被赋值以及赋数据类型后其数据类型将不再改变，这使得我们的程序less flexible，但是这有利于Java知道所有变量的数据类型并及时反馈错误(Ex:当a(string)*b(int)时Java会及时报错)
         */


        // Weeks 1 & 2 - 2022-08-29 -> 2022-09-09 Lecture 02 - Java Syntax 03-Primitive Types

        /*
         * Python中的int在Java中有着多种表现类型:
         * Data Type —— Size —— Value Range
         * 布尔boolean   1byte   true, false,==,<,>,||,&& # 注意，在Python中要大写：True/False
         * 字符char      2byte   0 - 65,535   # 注意，char类型占据2个字节，一个字节=16位=2个字母=1个数字=2个数字 # byte,short,char在运算时都会自动升格为int后再计算
         * 整数byte      1byte   -128 - 127  # byte,short,char在运算时都会自动升格为int后再计算
         * 整数short     2byte   -32,768 - 32,767  # byte,short,char在运算时都会自动升格为int后再计算
         * 整数int       4byte   -2,147,483,649 - 2,147,483,647
         * 整数long      8byte   -10的18次方 - 10的18次方  # 注意，在给变量定义Long类型时需要在数的最后加上"L"(大小写都可，但小写l容易与1弄混，故常写作L): long number = 12345L;
         * 浮点float     4byte    -3,4e-38 - 3.4e+38  # 注意，在给变量定义float类型时需要在数的最后加上"F"
         * 浮点double    8byte    -4.9e-324 - 1.7e+308
         *
         * 在Python中    在Java中
         *    and          &&
         *    or           ||
         *    not          !
         *
         * Operators: +,-,*,%(两数相除取余数)；**：在Python中可用但在Java中不可用；/(除法)(Python中的//(整除)在Java中不可用)
         * 需要注意的是，今后我们在Java中做四则运算时需要考虑运算结果的数据类型，比如 float number = 3/5;float number = 3.0/2;float number = 3/2.0;float number = 3.0/2.0
         */


        //Weeks 1 & 2 - 2022-08-29 -> 2022-09-09 Lecture 02 - Java Syntax 04-Strings

        /*
         * 在Java中变量在被定义字符串类型时需要首字母大写且全称：String varname = XX
         * Java中string的运算符使用规则和Python中相同，String var = "Hello" * 5;String var = "Hello"+ "World"
         * 特殊地，Java允许不同数据类型的变量使用运算符：String var = "Hello" + 5 此时数字将被自动地转变成string并与"Hello"连接在一起
         * 需要注意的是，如果在将数字和string连接时涉及到数字间的四则运算，需要给额外给数字加上括号，EX：
         */
        System.out.println("The price is " + (10 + 5));


        //Weeks 1 & 2 - 2022-08-29 -> 2022-09-09 Lecture 02 - Java Syntax 05-Representing Integer Values

        /*
         * 听傻了，以后要是考到了再听吧
         */


        //Weeks 1 & 2 - 2022-08-29 -> 2022-09-09 Lecture 02 - Java Syntax 06-Names

        /*
         * 在Java中我们给一些东西起的名字叫做标识符，关于标识符有着很多规则：
         * 标识符可以包含字母，数字和下划线；标识符不能以数字开头；标识符不能包含符号；标识符不能包含空格；标识符不能使用Java中的关键词(如不能给一个变量取名为if/while/class/public等)
         * 注意：Java会识别标识符的大小写，比如heLlo和hEllo将被视作不同的名字/标识符
         * 传统：变量的名字应该以小写字母开头；类的名字应该以大写字母开头；超过一个词的标识符应该遵循大小驼峰原则
         *
         */


        //Weeks 1 & 2 - 2022-08-29 -> 2022-09-09 Lecture 02 - Java Syntax 07-Comments

        /*
         * 在Java中有两种添加注释的方法：
         * 第一种是//,"//"后面的内容会被忽略
         * 第二种如我们的笔记所示
         *
         * 递增操作符：++； i++等同于i=i+1
         * 递减操作符：--； i--等同于i=i-1
         * post-increment(算后增量-符号在变量i后)：Ex:(i=2)int x = i++ * 10 => i=3,x=20；int x = i-- * 10 => i=1,x=20(这里i * 10中用到的i的值是i改变前的值)
         * pre-increment(算前增量-符号在变量i前)：Ex:(i=2)int x = ++i * 10 => i=3,x=30；int x = --i * 10 => i=1,x=10(这里i * 10中用到的i的值是i改变后的值)
         */


        //Weeks 1 & 2 - 2022-08-29 -> 2022-09-09 Lecture 02 - Java Syntax 08-Variable Scope

        /*
         * 在Python中:
         * x=20
         * def f():
         *     global x
         *     x=10 # 由于我们不知道我们是要(1)创造一个新的局部变量x，还是说(2)将在上面创建过的全局变量更改赋值，所以我们在遇到(2)情况时必须还要额外给变量加上global关键词，此时Python将知道我们想改变的是全局变量
         *
         * 在Java中：
         * 由于我们每次创建新的变量(无论是全局变量还是局部变量)，我们都必须在第一次创建时为变量定义类型，所以我们就不需要像Python一样使用关键词来区分情况(1)或情况(2)了
         * 同时，大多数IDE(集成开发环境)会用不同的颜色区别不同范围的变量(比如IDEA会将实例变量(instance variables)标紫；将局部变量(local variables)标灰)
         * 另外，特别地，在IDEA中，如果你改变了一个局部变量的值，那么IDEA将自动给这些局部变量加上下划线
         *
         * Printing 语法：
         * Java的System.out.println("Hello")与Python的Print("Hello")相同
         * Java的System.out.print("Hello")与Python的print("Hello",end="")相同
         * 另外Java的这两张printing方法都只能接受一个形参，所以如果我们想添加更多的信息需要使用"+"(即：System.out.println("Hello"+"World")，不能使用","连接，不然会被识别作多个形参)
         */


        //Weeks 1 & 2 - 2022-08-29 -> 2022-09-09 Lecture 02 - Java Syntax 09-Statements

        /*
         * 本节介绍了Java中几种常见的语句：
         * Simple Statements:
         * Variable declaration：
         * Syntax：type name;
         * ex:int number;
         *
         * Variable assignment:
         * Syntax: name = expression;
         * ex:number = 7;
         *
         * Calling a method:
         * Syntax: object.methodName(parameters);
         * ex: System.out.println("Hello")  # System.out是object
         *
         * Return from a method:
         * Syntax: return expression;
         * ex: return true
         *
         * Compound Statements:
         * Defining a new class
         * Defining a new method
         * If statements(including else-if and else)
         * Loop statements
         */


        //Weeks 1 & 2 - 2022-08-29 -> 2022-09-09 Lecture 02 - Java Syntax 10-Expressions

        /*
         * 如何推断表达式的类型？
         * 一般情况下，如果所有部分的类型都相同，那么表达式往往也是同样的类型(Ex. 7+7+67+9)
         * 如果所有部分的类型都相同，但数据类型不同，那么选择最大的数据类型(ex. int+short+byte+long,最终结果应该为long)
         * 如果组成部分是不同的类型，比如是整数+浮点+字符串，那么尝试用一种能统合这些类型的类型去定义结果
         */


        //Weeks 1 & 2 - 2022-08-29 -> 2022-09-09 Lecture 02 - Java Syntax 11-Conditional Statements

        /*
         * IF Statement:
         * Python:
         * if x>5:
         *     print("Hello")
         * Java:
         * if (x>5){
         *     System.out.println("Hello");
         * }
         *
         * ELSE Statement:
         * Python:
         * if x<100:
         *     print("hello")
         * else:
         *     print("goodbye")
         * Java:
         * if (x<100){
         *     System.out.println("hello");
         * }else{
         *     System.out.println("goodbye");
         * }
         *
         * ELIF Statement:
         * Python:
         * if x<100:
         *     print("a")
         * elif x<500:
         *     print("n")
         * else:
         *     print("c")
         * Java:
         * if (x<100){
         *     System.out.println("a");
         * } else if(x<500){
         *     System.out.println("b");
         * }else{
         *     System.out.println("c");
         * }
         *
         * WHILE Statement:
         * Python:
         * x=0
         * while x>5:
         *     print("hi")
         *     x=x+1
         * Java:
         * int x=0
         * while (x>5){
         *     System.out.println("hi");
         *     x=x+1
         * }
         *
         * For Statement:
         */
        int x = 0;
        while (x < 5) {
            System.out.println("hi");
            x = x + 1;
        }

        for (int i = 0; i < 5; i = i + 1) {
            System.out.println("hi");
        }


        //Weeks 1 & 2 - 2022-08-29 -> 2022-09-09 Lecture 02 - Java Syntax 12-Arrays

        /*
         * Array区别于Python中的list的地方是：
         * 1.所有在Array中的元素必须是相同的类型
         * 2.Array的尺寸是固定的，不能够增长或减小
         * 所以在创造一个Array时必须事先知道它的size以及元素的类型
         *
         * 数组的创建分为两步：数组的定义(规定元素的类型与数组的数组名)与数组的赋值(添加元素)
         * 定义数组有两种方法：
         * 1.数据类型 [] 数组名
         * ex:int [] array
         * 2.数据类型 数组名 []
         * ex:int array []
         *
         * 数组的静态初始化(初始化就是在内存中，为数组容器开辟空间，并将数据存入容器中的过程)：
         * 完整格式：数据类型 [] 数组名 = new 数据类型[]{元素1,元素2,元素3,元素4};
         * 简化格式：数组类型[]数组名={元素1,元素2,元素3};
         * 也可以在构造时先为数组内的元素赋值: type [] varName = new type[size];
         *
         * 数组是基于索引的数据结构(这与list相似)；数组一次只允许访问一个元素(不能使用slices)
         * 访问元素：arrayName[index]  Ex：System.out.println(numbers[0])
         * 通过索引改变数组中元素的值：arrayName[index]=value;  Ex：numbers[0]=100;
         *
         * 当一个数组首次被构建后,数组内的每个元素都被设置为该类型的默认值:
         * Ex:
         * int[] studentsNumber = new int[10];
         * 此时数组内的10个元素的初始值都是0
         * 对于像int和double这样的基本数,元素的初始值是0或0.0
         * 对于布尔类型,初始值为false
         * 对于所有对象,初始值是一个被称为null的特殊引用
         *
         * 得到数组的长度：arrayName.length  # 与Python的length(listName)相似，数组通过实例变量length来记住它自己的size
         *
         * 遍历数组：
         */
        int[] Arrayname = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < Arrayname.length; i++) {
            System.out.println(Arrayname[i]);
        }


        //Weeks 1 & 2 - 2022-08-29 -> 2022-09-09 Lecture 02 - Java Syntax 13-Errors

        /*
         * 以下为常见的需要避免的错误：
         * 类名要和文件名保持一致
         * 当给一个变量赋值并定义了类型之后，再次为其赋值时不能再定义类型
         * 注意Java中key world的大小写(Ex:class(√)，Class(×))
         * 变量名不能用数字作首位(否则会报错：cannot find symbol)
         * cannot find symbol-有可能是没有插入某个模组就使用了其中的类导致该类名无法被Java找到
         */


        //Weeks 1 & 2 - 2022-08-29 -> 2022-09-09 Lecture 03 - Objects and Classes 03-Objects and Classes

        /*
         * 对象是类的实例产物，我们在类中书写的代码定义了这个类能够记住什么(instance variables-实例变量)以及这个类能做什么(methods)
         * Java已经为我们提供了数千种必须的类，因此我们能够不需要新建类然后再写代码设计，也能使用string/println等常用的方法或对象
         * 我们在为变量定义类型的过程就是在基于不同类型的类实例化对象，比如String varname,String类下的所有对象能够享用同样的方法和实例变量(约等于Python中的属性)
         *
         * 对象间的交流是通过calling方法实现的，我们能将这一过程想象成问问题或提出请求。在这一过程中它们将分享数据(参数，并return values)
         * 比如我们实例化一个String对象并命名为s: String s = "abcdefg"，我们能够调用String类中的方法来查询s中的第一个符号: s.charAt(0)，这就像在问：index0处的符号是什么？
         * 再比如代码：System.out.println("Hello")就像是请求"请打印文本"Hello"到屏幕上"
         * System.out是一个特殊的类，因此我们在使用它时不需要创建对象。但事实上，大多数的类需要在我们调用它们之前创建一个变量(即创建一个实例/对象)，之后我们才能使用类中的属性和方法
         */


        //Weeks 1 & 2 - 2022-08-29 -> 2022-09-09 Lecture 03 - Java Syntax 04-Defining Classes

        /*
         * Cohesion:类应该包含变量和方法，这些变量和方法能够remember things以及do things，所有这些变量和方法应该与创建类的目的紧密相关，这种思想称之为凝聚力
         *
         * 一个类相当于是一个收集了许多变量和方法的集合，而一个对象则是一个类的实例，我们能通过相同的类创造许多对象
         *
         * 实例变量(instance variables)：一个实例变量指的是一个创建于类中的，但不存在于任何方法(methods)中的变量
         * 按照传统，实例变量通常被放置在类的顶部(就像Python将__init__方法放在最前面一样)
         */


        //Weeks 1 & 2 - 2022-08-29 -> 2022-09-09 Lecture 03 - Java Syntax 05-Creating Objects

        /*
         * Construction:创建对象的过程被称作构建
         * Syntax: new Type(parameters)
         *
         * 我们通常用变量来记住被创建的对象：
         * Syntax: Type varName = new Type(parameters)
         *
         * 如何访问实例变量？
         * Syntax: object_Name.instance_Variable_Name # object_Name是我们用来记住对象的变量名；"."相当于of；instance_Variable_Name是类中我们定义的实例变量名
         *
         * 如何改变实例变量？
         * Syntax: object_Name.instance_Variable_Name = XX;
         *
         * Ex:
         * class Date{
         *     int day;
         *     int month;
         *     int year;
         * }
         * Date today = new Date()
         * today.day = 4
         * today.month = 9
         * today.year = 2022
         */


        //Weeks 1 & 2 - 2022-08-29 -> 2022-09-09 Lecture 03 - Java Syntax 06-Defining Methods

        /*
         * Methods只能在类中进行定义
         *
         * 在Methods中，我们可以
         *
         * 在静态(static)计算机语言中，我们需要为方法定义额外的信息：
         * 指定parameters(参数) —— 在Java中，我们还需要定义参数的名称以及类型
         * 指定return type —— 如果该方法return了某个答案，我们需要提前定义这个答案的类型
         *
         * 如果想定义一个无return值，无参数的方法：
         * void method_name(){
         */


        //Weeks 1 & 2 - 2022-08-29 -> 2022-09-09 Lecture 03 - Java Syntax 07-Using Methods

        /*
         * 为了调用方法(call a method)，我们需要：
         * 一个实例化得到的对象以及储存它的变量名
         * 方法(method)的名字
         * 方法所需的参数
         * Syntax：objectName.methodName(parameters);
         *
         * 通过同一个类实例化的对象有着共同的实例变量(属性)，但不同的对象的实例变量的值可能不同，这就要求我们在调用方法时指明是哪一个对象要执行方法
         */


        //Weeks 1 & 2 - 2022-08-29 -> 2022-09-09 Lecture 03 - Java Syntax 08-Defining Constructors

        /*
         * Constructor的基本介绍：
         * Constructor是一类特殊的method，它是一种每次创造新的实例/对象时都会被自动调用到的method(有点类似于Python的__init__)，中文常称之为构造器/构造(的)方法
         * 每个class都会自动的拥有一个默认的constructor(默认的constructor不需要任何参数，也不需要为任何实例变量赋值)
         * Constructor的名称要与类名保持一致
         * 可以理解成Constructor返回了对应的实例，但严格意义上讲constructor不存在返回
         *
         * 为什么要使用Constructor？
         * 1.可以要求用户去输入必要的信息(有些不重要的属性/实例变量可以不在constructor中赋值，这样就不要求用户强制为这些实例变量添加参数了)
         * 2.去简化创建对象的过程
         * 3.当对象被创建时可以执行一些代码
         *
         * Syntax：
         * className(dataType parameter1,dataType parameter2,dataType parameter3){
         *     instance_Variable1 = parameter1;
         *     instance_Variable2 = parameter2;
         *     instance_Variable3 = parameter3;
         * }
         *
         *
         * 以下是对constructor的具象化理解：
         */
        /*
        未使用constructor之前：
        File:Hero.java
        package main;
        public class Hero{
            int level;
            boolean isFree;
        }

        File:Main.java
        package main;
        public class Main{
            public static void main(String args[]){
                Hero h1 = new Hero();
                h1.level = 1;
                h1.isFree = true;
            }
        }

        使用了Constructor之后：
        File:Hero.java
        package main;
        public class Hero{
            int level;
            boolean isFree;

            Hero(int paramLevel,boolean paramIsFree){  //Constructor
                level = paramLevel;
                isFree = paramIsFree;
                System.out.println("我们甚至能在Constructor中在为实例变量赋值之外加入其他代码，并在对象被创建后运行它们")
            }
        }

        File:Main.java
        package main;
        public class Main{
            public static void main(String args[]){
                Hero h1 = new Hero(1,true);
        }
            }
        可见constructor省略了为对象的实例变量赋值的过程，constructor的运行原理大概为：创建对象并给出参数之后，Constructor方法将被自动调用，
        给出的参数将传递给Constructor，之后通过Constructor方法内的赋值代码改变对象实例变量的值
         */


        //Weeks 1 & 2 - 2022-08-29 -> 2022-09-09 Lecture 03 - Java Syntax 09-Using Constructors

        /*
         * 这节的内容与上述对constructor的具象化理解内容一致
         */


        //Weeks 1 & 2 - 2022-08-29 -> 2022-09-09 Lecture 03 - Java Syntax 10-The Implicit Parameter

        /*
         * 当我们通过对象名调用实例属性或方法后，再次调用相同的实例变量或方法时，Java会假设你操作的对象仍然时上一次的对象。
         * 此时即便省去了对象名不写，依旧能调用实例变量或方法：
         * tdy.day = 7
         * tmrw.changeToNextYear()
         * day = 8
         * changeToNextYear()
         * 此处我们用来调用实例变量或方法的对象被称作隐式参数
         *
         * key word: this
         * 作用1：类似于Python中的self，当我们constructor方法的参数与实力变量名字相同时，我们可以给实例变量前加上this关键词避免这种冲突：
         */

        /*
        class Date{
            int day;
            int month;
            int year;

            public Date(int day,int month,int year){
                this.day = day;
                this.month = month;
                this.year = year;
            }
        }
         */

        /*
         * 作用2：如果我们需要将一个对象作为参数传递给另一个方法
         * 假如我们的Date类中存在一个方法daysBetween，我们通过Date类创建了一个名为counter的对象，我们用它来记录另一个Date对象与counter对象间的间隔天数
         * 说实话没听懂
         *
         */

        /*
        public int numDaysBetween(Date d){
            int days = counter.daysBetween(this,d);
            return days;
        }
         * 总结：调用函数的对象(名)就是隐式参数，显示参数就是我们通常所说的参数(parameter)
         */


        //Weeks 1 & 2 - 2022-08-29 -> 2022-09-09 Lecture 03 - Java Syntax 11-References

        /*
         * Java在运行时，JVM会占用计算机的一小部分内存。JVM为了更好地利用自己分到的内存，因此会将这些内存分配成五部分：
         * 本地方法栈，寄存器，栈，元空间，堆
         * 方法区：在JDK8之前，方法区和堆是合二为一的，在JDK8之后，取消了方法区并从中分离出了元空间，目前加载字节码文件的功能由元空间负责，但我们一般还习惯性地叫它方法区
         * 栈(stack)内存：方法在运行时所进入的内存，方法中的变量也是在这里，方法被执行完后就会出栈
         * 堆(heap)内存：new出来的东西会在这块内存中开辟新的空间并产生地址
         *
         * Java中的所有对象都存储在堆(heap)内存中
         *
         * 我们用来记忆对象的变量名被称作引用(references)
         *
         *
         */


        //Weeks 1 & 2 - 2022-08-29 -> 2022-09-09 Lecture 03 - Java Syntax 12-Packages

        /*
         * Package：每一个package都是用于存储具有关联性代码/Java文件的文件夹，比如老师给我们是上课时用到的例子都会存放进一个package中(比如example)
         *
         * 如果想将一个Java文件归类于一个package，我们需要在Java文件的开头进行声明
         * Syntax：package PackageName;
         *
         * 如果一个包中仍然有过多的文件，我们可以把这些文件归类进一个更小的包(相当于在example文件夹里再创建一个子文件夹week1)
         * 我们称上述这样更小的包(或者更小的文件夹)为：sub-packages
         * Syntax: package PackageName.sub-packageName
         */


        //Weeks 1 & 2 - 2022-08-29 -> 2022-09-09 Lecture 03 - Java Syntax 13-Application Programmer Interface (API，应用程序接口)

        /*
         * API：API是一个包含了所有在Java中可用的libraries的列表
         * API记载了各种类的功能，实例变量，构建函数，方法
         *
         * 在我们使用library中的类之前，我们需要：
         * 了解该类的功能
         * 插入我们要用的类
         * Syntax：import package.className  (ex：import java.awt.Rectangle)
         * 为我们要用的类实例化对象
         */


        //Week 3 - 2022-09-12 -> 2022-09-16 Lecture 04 - Object Oriented Programming 02-The Start of an Arcade Game

        /*
         * 太空入侵者-一款经典的街机游戏，下面我们会经历它的开发过程
         *
         * 游戏功能：
         * 允许玩家移动飞船；发射子弹；摧毁敌机
         *
         * # 这款游戏最初是由Java编写的，在编写时并没有使用到面向对象的技巧
         * 我们将创建一个新的Java文件来还原当开发过程
         */


        //Week 3 - 2022-09-12 -> 2022-09-16 Lecture 04 - Object Oriented Programming 03-Adding Functionality to the Code

        /*
         * 该节内容见Game.java
         */


        //Week 3 - 2022-09-12 -> 2022-09-16 Lecture 04 - Object Oriented Programming 04-Making Changes

        /*
         * 在实际开发中我们常常面临各种突发的需求
         * 比如本节中我们想为玩家和敌人添加"冷却时间"这一属性
         * 操作见Game.java
         */


        //Week 3 - 2022-09-12 -> 2022-09-16 Lecture 04 - Object Oriented Programming 05-Recreating the Same in OOP

        /*
         * 与上几节课不同，我们将不再用不同的数组来储存ship的信息，在本节中我们将尝试使用OOP的知识专门为船创建一个类
         * 这个类将包含船只的所有实例变量：位置，生命值，冷却
         * 这意味着每条船可以被一个单一的数组表示了
         * 我们来创建一个新类：Ship.java，同时创建一个新的Game1.java来创建Ship类的对象
         *
         * 在创建了Ship类之后，我们还需要实装射子弹的功能，我们需要有：
         * 子弹的位置；子弹的移动方向；子弹的杀伤力
         * 我们将在下节课中完成它
         */


        //Week 3 - 2022-09-12 -> 2022-09-16 Lecture 04 - Object Oriented Programming 06-Adding More Functionality

        /*
         * 上节课我们在创建了Ship类之后还打算实装射子弹的功能，我们需要有：
         * 子弹的位置；子弹的移动方向；子弹的杀伤力(为了简化问题，我们默认只要子弹命中就能摧毁飞行器)
         *
         * 我们还需要写一个方法来判断玩家的飞船是否被子弹击中
         *
         */


        //Week 4 - 2022-09-19 -> 2022-09-23 Lecture 05 - Text Processing 01 - Introduction

        /*
         * 本周的课程主讲Input与Output
         */


        //Week 4 - 2022-09-19 -> 2022-09-23 Lecture 05 - Text Processing 02 - The Scanner

        /*
         * 与Python通过调用input()方法不同的是,Java在获取用户输入的信息时需要创建对象,之后通过该对象来调用输入的方法
         * 我们将要使用的类被称作:Scanner,它所在的package是:java.util
         *
         * 我们需要在使用Scanner类前导入它:
         * import java.util.Scanner;
         *
         * 创建Scanner对象:
         * Syntax: Scanner varName = new Scanner(System.in);
         *
         * Tokens (Explanation):
         * 一个Scanner总是会a group of characters,这些groups被称作tokens
         * tokens会被空格符号(如new line/space/tab characters)分隔开
         * Ex:
         * //user输入:"My name is TLY"
         * Scanner input = new Scanner(System.in);
         * String inputContent = input.next() //next()方法将return:"My"
         * 这个例子中,用户输入的语句中一共有:My,name,is,TLY这四个tokens
         *
         * 使用Scanner:
         * 当我们使用Scanner时,我们可以每次只读取用户输入信息的一部分,也可以读取整段文字
         * 由于Scanner读取tokens时是从头到尾一个token一个token来读取的,因此所有读取信息的方法的前缀都是:nextXXX
         * Scanner能被用于多种类型的输入,因此我们必须告诉它什么将要被读取且被作为变量传递给构造函数(constructor)
         * Method       Type        Explanation
         * nextInt      int         Reads the next token as an int
         * nextDouble   double      Reads the next token as a double
         * nextLong     long        Reads the next token as a long
         * nextFloat    float       Reads the next token as a float //上述nextType()型方法会判断用户输入的token是否为所规定的Type,如果是则读取该token,不是则会报错
         * next         String      Reads the next token as a String //next()以及nextType()方法将读取用户输入的内容直到读取到空格.这些方法不能一次读取两个由空格或符号隔开的tokens.此外,next()在读取输入后将光标放在同一行中.(next()只读空格之前的数据,并且光标指向本行)
         * nextLine     String      Reads all of the remaining tokens on the line //nextLine():读取输入,包括单词之间的空格和除回车以外的所有符号(即,它读到行尾).读取输入后,nextLine()将光标定位在下一行
         *
         * 辨析:next/nextLine
         * Ex:
         * //user输入:"My name is TLY"
         * Scanner input = new Scanner(System.in);
         * String inputContent = input.next(); //它会读取第一个token:My
         * String inputContent = input.next(); //它会读取第二个token:name
         * String inputContent2 = input.nextLine(); //它会读取已被读取过的tokens之后的内容:" is TLY""
         */


        //Week 4 - 2022-09-19 -> 2022-09-23 Lecture 05 - Text Processing 03 - Scanner API Entries

        /*
         * 一直走神,没看懂
         *
         *
         */


        //Week 4 - 2022-09-19 -> 2022-09-23 Lecture 05 - Text Processing 04 - User Prompts and Exceptions

        /*
         * 需要注意的是,next方法在等待用户input时可能block
         * 这意味着scanner等一直等待知道用户输入信息
         * 当上述情况发生时,它通常会被混淆为程序冻结或者进入无限循环
         * 所以当用户进行输入时,设置一行信息提示用户应该输入什么是很重要的
         *
         * 常见错误:用户输入的信息类型与预设类型不匹配
         * Scanner类提供了一些方法能够允许我们检查下一个token是否能够转换成我们想要的类型
         * 例如我们read数据类型为double的信息,我们通过上述方法询问下一个token是double,如果是,就继续;如果不是,我们可以选择使用next()方法去读取
         * Syntax:
         * boolean hasNextInt()
         * 解释:
         * 如果通过使用nextInt()方法，此扫描器输入信息中的下一个标记可以解释为默认基数中的一个long值，则返回true;或者说:当下一个token是有效的/正确的int value时,return true;否则return false
         * Ex:
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an int:");
        if (input.hasNextInt()) {
            int message = input.nextInt();
            System.out.println("You entered:" + message);
        }else{
            System.out.println("Not an int");
        }
        /*
         * 类似的方法还有很多:
         * hasNextByte()
         * hasNextFloat()
         * hasNextInt()
         * hasNextLong()
         * hasNextLine() //判断用户输入的内容中是否还有下一行
         * 等等
         * //可以将这些方法的名字理解成: Whether next token is XXType?
         */

        //Week 4 - 2022-09-19 -> 2022-09-23 Lecture 05 - Text Processing 05 - String Processing

        /*
         * If we already have all the information in one string, how do we read information piece by piece?
         * There are 2 simple solution:
         * 1.Creat an extra scanner to divide the string;
         * 2.Use other method to get it;
         *
         * Scanner类有着许多构造函数,其中一个能选取String作为参数
         * 我们能创建一个新的scanner并使用相同的方法(nextInt/nextFloat/...)去得到一段一段的信息
         *
         * Scanner中一些常用的方法:
         * (1):public int indexOf(String s)
         * Function: indexOf能够返回指定字符串在Strings内第一次出现的index
         * Ex: "hello".indexOf("l") //返回结果为2(从0开始,l在index=2第一次出现)
         *
         * (2):public String[] split(String s)
         * Function: 作用于Python中的split类似,能够将Strings沿着指定字符串进行切割,并返还一个包含了多个Strings片段的数组
         * Ex: "Sean is great".split(" ") //将返还一个array:["Sean","is","great"]
         * Ex: "hello".split("l") //将返还一个array:["he","","o"]
         *
         * (3):String subString(int b, int e)
         * Function: substring允许我们输入2个参数-star index和end index,之后它将返还你一段子字符串,它将包含原Strings中[start index,end index)的内容(左闭右开)
         * Ex: "Sean is great".substring(4,8) //返回结果为:" is "
         * Ex: "hello".substring(0,2) //返还结果为: "he"
         *
         * (4):char charAt(int index)
         * Function: 能够从Strings中获取单个字符
         * Ex: "Sean".charAt(2) //将返还"a"
         *
         * (5):public boolean equalsIgnoreCase(String s)(忽略大小写) 或 public boolean equals(String s)(不忽略大小写)
         * Function:比较两个Strings内容是否相同(由于Java为了节约内存,会将两个value相同的变量用同一内存存储,而逻辑符号"=="是根据内存进行判断的,因此保险起见最好用equal方法来判断两String是否相同)
         * "Sean".equals("sean") //将返还false(不忽略大小写)
         * "Sean".equalsIgnoreCase("sean") //将返还true(忽略大小写)
         */


        //Week 4 - 2022-09-19 -> 2022-09-23 Lecture 05 - Text Processing 06 - Example

        /*
         * 我们可以通过一个while循环来使用户能够不断输入直到输入了正确的变量类型
         */
    Scanner example = new Scanner(System.in);
    System.out.println("请输入整数:");
    while (!input.hasNextInt()){ //hasNextType()方法可判断当前是否有输入，当键盘有输入后执行循环
        System.out.println("请输入整数:");
        input.next(); //当输入的是int类型后,该语句会被while跳过,所以下一句中的input.nextInt()将接收到int的值
    }
    int b = input.nextInt();
    System.out.println(b);

        //Week 5 - 2022-09-26 -> 2022-09-30 Lecture 06 - Encapsulation  02 - Visibility(可视性)

        /*
         * 在团队中工作时，我们希望其他人按我们希望的方式使用我们的类
         * 为此，我们使用访问级别修饰符(access level modifiers):
         * Access levels:
         * public
         * protected
         * default
         * private
         * 这些访问级别修饰符能够用来修饰:
         * classes,methods,instance variables,constructors,enumerator types,interfaces
         * 基本上Java里的所有东西都能够被修饰
         *
         * Syntax + Ex:
         * public int day;
         * protected int year;
         * int month; // 注意:不加访问修饰符时将默认是default类修饰符,即default没有keyword
         * private int hour;
         *
         * 该表显示了每个访问级别允许访问的位置:
         * Modifier     The same class      The same package     A subclass     everywhere
         * public           Yes                 Yes                  Yes            Yes
         * protected        Yes                 Yes                  Yes            No
         * default          Yes                 Yes                  No             No
         * private          Yes                 No                   No             No
         * everywhere指的是任何执行access的代码,所有这些代码都可以访问public的数据
         *
         * public:
         * public访问修饰符意味着它将能够被任何代码访问
         * Ex:一个Date对象的实例变量day如果是public的,那么user能够设置day的值,无论是-1234,还是+3412331
         * 这些值对于day这一变量明显是不合理的,所以我们最好不要将实例变量day设为public
         *
         * protected:
         * protected意味着只能在同一个类,包或该类的子类中调用该类型的数据
         *
         * default:
         * 当访问修饰符没有被定义,这意味着该类型的数据只能在同一个类或package(文件夹)内被访问
         *
         * private:
         * private意味着只能在同一个java文件中被访问,更改或者使用
         * 如果我们将Date类的实例变量修饰为private,那么其他程序员只能通过调用方法来访问或更改它们
         */


        //Week 5 - 2022-09-26 -> 2022-09-30 Lecture 06 - Encapsulation  03 - Choosing Access Levels

        /*
         * 在使用访问修饰符之前,我们需要判断什么类型的修饰符是合适的
         * 我们可以从"谁需要去更改或访问它们?"的角度来思考
         *
         * 对于类,我们一般都使用public
         *
         * 方法通常用不同级别的声明
         * 如果我们定义了一个我们希望其他人使用的方法,那么它将被声明为公共的
         * 如果我们定义了一个不希望其他人使用的方法,但是我们希望在包的其他部分使用它,那么我们将它声明为默认值
         * 如果我们编写的方法只在类内部使用,那么它应该声明为private
         *
         * 对于实例变量
         * 在声明类的实例变量时,我们会反向思考
         * 大多数实例变量都应该声明为private
         * 只有当实例变量需要被另一个类使用时,我们才会使用任何其他访问级别
         * 这种想法被称为信息隐藏
         * 这意味着我们可以控制他们如何改变信息
         * 隐藏是被称为封装的思想的一部分
         */


        //Week 5 - 2022-09-26 -> 2022-09-30 Lecture 06 - Encapsulation  04 - Black Box Programming

        /*
         * 本节课教授了一种编程思想:黑箱思想
         * 我们人类很擅长使用我们并不真正了解其原理的物品,比如汽车,我们并不知道汽车内部各组件之间的工作原理,但我们就是会使用汽车
         * 在编程项目中也是这样:
         * 假设我们的Date类被应用于一个大型项目,我们的责任是定义如何表达日期
         * 其他负责项目的其他部分的组员不需要知道Date类里面有什么,他们只需要知道怎么使用Date类的constructor和methods
         */


        //Week 5 - 2022-09-26 -> 2022-09-30 Lecture 06 - Encapsulation  05 - Consequences of these Changes

        /*
         * 本节课主要是讲getter()(又叫做accessor方法)和setter()方法
         * 我们在之前的例子中提到,为了防止Date类中的实例变量被用户赋予不恰当的信息,我们将它们的访问等级设为private
         * 但是这样之后其他用户该怎么得到或更改这些实例变量的值呢?
         * 这时我们就需要在Date类中为这些实例变量设置getter()和setter()方法
         * 以实例变量int day为例:
         * public int getDay() {
         *     return day;
         * }
         *
         * public void setDay(int day) {
         *     if (this.day < 31 && this.day > 0) {
         *         this.day = day;
         *     }
         * }
         * getter()方法可以帮助用户访问private级别的实例变量的值
         * setter()方法可以帮助用户设置private级别的实例变量的值,我们可以在setter()方法里设置if条件句来保证用户输入恰当的值
         */




        //Week 5 - 2022-09-26 -> 2022-09-30 Lecture 06 - Encapsulation  06 - The Interface of a Class

        /*
         * 很困,很懵,但这个视频只有5分钟,似乎不太重要
         */


        //Week 5 - 2022-09-26 -> 2022-09-30 Lecture 06 - Encapsulation  07 - Class Variables(or Static Variables)

        /*
         * 在本节开开始之前,我们先回忆一下Python的实例变量(属性)和类变量
         */
/*
class Test():
    var1 = 0 //类变量
    def __init__(self,var2):
        self.var2 = var2 //实例变量
可以看到,与Java不同的是,Python更习惯于将类变量放在最上方,而实例变量(属性)则存放进__init__()/constructor里
 */
        /*
         * 在Java中,类里的实例变量在创建对象时可以通过constructor给不同的对象赋予不同的值
         * 而类里的类变量(或者叫静态变量)则被所有的对象所共享
         * 在类中创建类变量/静态变量后,静态变量只会在内存中被创建一次,因此在用类创建多个对象后,所有对象的静态变量都共用一个内存,也就是说静态变量的值都相同
         * 而通过一个对象(利用其对象名作为隐函数)更改了静态变量之后,其余所有对象的该静态变量的值也会随之更改
         *
         * Syntax (keyword: static):
         * Level_Modifiers static dataType varName;
         * Ex: public static int example;
         *
         * 一般来讲,静态变量很少被用到,除非某些情况下所有的对象都需要一个值固定且必须的变量(比如汽车的初始里程值,每台汽车的初始里程都为0公里)
         * 下面我们将给出一个使用静态变量的例子:
         */
/*
public class Person{
    private String name;
    private String email;
    private static int numPeople; //该静态变量的作用是记录被创建的对象数
    //可见与Python不同的是,Java将实例变量和类变量写在了一起

    public Person(String n,String e){
        name = n;
        email = e;
        numPeople = numPeople + 1;
    }
    public int getNumPeople(){
        return numPeople;
    }
}
 */
        /*
         * 另外,类变量之所以被称作类变量,一个原因是它不仅能通过:对象名.类变量名;这样的方式被调用
         * 它还能通过:类名.类变量名;这样的方式被调用
         * Syntax:
         * ClassName.variableName
         */



        //Week 5 - 2022-09-26 -> 2022-09-30 Lecture 06 - Encapsulation  08 - Final Variables and Constants(最终变量与常量)

        /*
         * Final Variables(最终变量):
         * 最终变量只能被赋值一次,一旦这个值被设定,那么它将不再改变
         * Keyword: final(+ static)
         * 出了final,我们还可以加上其他修饰词,Ex:
         * public final static int VAR_Name = 114514;
         * 如果我们试图改变一个已经被赋值的最终变量,那么编辑器将报错
         *
         * Constants(常量):
         * 常量兼具这两张变量的特性
         * 常量通常被用来存储将不会或不应该被改变的值(比如电脑类中电脑显示屏的长度与宽度等)
         * Java中有很多非常有用的常量供我们使用,比如当我们计算圆的面积时,我们需要用到π
         * 而Math类中就提供了π这一常量,因此我们在计算圆的面积时可以有:double area = Math.PI * radius * radius;
         * 由于有些常量同时也被static关键词修饰变成了类变量,因此我们可以不创建对象只使用类名来调用它们
         *
         * 常量的命名:
         * 规定常量的变量名只能使用大写字母,词与词之间用下划线分隔,如:
         * SCREEN_HEIGHT; SCREEN_WIDTH等等
         */


        //Week 5 - 2022-09-26 -> 2022-09-30 Lecture 06 - Encapsulation  09 - Static Methods

        /*
         * 静态方法:
         * 除了修饰变量,static也能用来修饰方法.
         * 一个静态方法/类方法不与对象相联系,而只与类有关.
         * 因此一个静态方法中不能使用实例变量,但可以使用类变量/静态变量
         *
         * 以Date类为例,许多方法并没有实例变量的参与:
         * isLeapYear,numberDaysMonth,usValidDate等等方法都与实例变量无关
         * 将这些方法用static关键词修饰后变成类方法/静态方法,不仅对程序没有影响,而且能允许我们不创建对象即可调用这些方法
         * 比如当用户想要判断2022是否为闰年,如果我们将isLeapYear设为静态方法,那我们就不需要再创建一个Date对象,只需要直接用Date.isLeapYear(2022);来判断
         * 这使得我们的方法更加灵活和实用
         *
         * Syntax(调用方法):
         * ClassName.methodName(parameters);
         *
         * Main Method:
         * 在我们学习了public,static,void等一系列关键词后,我们终于能够理解初学时充满神秘感的Main方法了
         * public static void main(String[] args)
         * public:规定了这个方法能够在任意地方被调用
         * static:规定了我们在调用该方法前不需要创建对象
         * void:规定了main方法不返回值
         * main:方法的名字
         * parameters:参数(String[] args)是一个string类型的数组
         */


        //Week 5 - 2022-09-26 -> 2022-09-30 Lecture 06 - Encapsulation  10 - Enumerated Types(枚举类型)

        /*
         * 在我们创建一个变量时,我们要首先为它设定类型,一个变量可能是一个类的对象,也可能是一个数据类型的reference,Ex:
         * Date days = new Date(9,28,2022);
         * int number = 2;
         * 而在Java中,枚举是一个特殊的类,它的作用就是创建一个新的数据类型.枚举类一般表示一组常量,比如一年的 4 个季节,一个年的12个月份,一个星期的7天,方向有东南西北等
         * java枚举类使用enum关键字来定义,各个常量使用逗号","来分割。
         * Ex:
         */
/*
public class Test
{
    enum Color
    {
        RED, GREEN, BLUE;
    }

    // 执行输出结果
    public static void main(String[] args)
    {
        Color c1 = Color.RED;
        System.out.println(c1);
    }
}
 */
        /*
         * 如上所示,创建枚举类的Syntax是:
         * enum ClassName{ELEMENT1,ELEMENT2,...}
         * 或:
         * enum ClassName
         * {
         *  ELEMENT1,ELEMENT2,...;
         * }
         *
         * 声明变量:
         * 枚举类类名 变量名;
         *
         * 赋值:
         * 变量名 = 枚举类类名.元素名;
         */


        //Week 6 - 2022-10-03 -> 2022-10-07 Lecture 07 - Interfaces  02 - Common Code

        /*
         * 通俗的讲,接口就是一个对象能够做的一系列行为,接口中包含有一个对象作为某类事物必须要用的方法
         * 比如通过青蛙类创建的对象,它们必须拥有"游泳","觅食","交配"等行为,而一个借口就可能包含有实现这些行为的方法
         *
         * 接口的核心思想是:通过对代码实现重复利用来提高编程效率
         *
         *
         * 我们为什么要使用接口?
         * 在Python中我们能输入任何类型的变量作为参数,但这可能造成运行时错误如果我们使用了错误的类型
         * 在Java中type检查器会确保左右所有的参数类型都是正确的,但这也造成了reuse方法时的不便利
         * (比如我们想使用搬家()这一方法,按理说搬家公司(搬家公司类的对象)和货拉拉(货拉拉类的对象)都可以作为搬家()的参数,
         * 但由于在设定搬家()这一方法时参数的类型是确定的,故无法同时做到搬家(货拉拉)和搬家(搬家公司))
         * 或许上述例子口述并不直观,我们用下方的代码作为实例:
         */
/*
// 写一个类去计算一组数的平均值和最大值
public class DataSet{
    private double sum;
    private double max;
    private int count;

    public void add(double x){
        sum += x;
        if (count == 0 || x > max){
            max = x;
        }
        count++;
    }
    public double getAverage(){
        if (count == 0){
            return 0;
        }else{
            return sum/count;
        }
    }
    public double getMaximum(){
        return max;
    }
}
问题在于,我们无法重复利用这些方法除非参数是double类型
比如我们输入的参数的类型是银行账户/硬币/等等除了double类之外的其他对象,这些方法就无法使用,因为add(double x)这个方法只接收double类型的参数
如果我们把方法改成add(Coin x);并在类中定义一实例变量:private Coin max;
public class DataSet{
    private double sum;
    private Coin max;
    private int count;

    public void add(Coin x){
        sum += x.getValue();
        if (count == 0 || x.getValue() > max.getValue()){
            max = x;
        }
        count++;
    }
    public double getAverage(){
        if (count == 0){
            return 0;
        }else{
            return sum/count;
        }
    }
    public double getMaximum(){
        return max;
    }
}
我们此时的确可以使用硬币的对象作为add(Coin x);的参数,但double和
BankAccount就无法作为参数被输入了,这波是拆了东墙补西墙
 */


        //Week 6 - 2022-10-03 -> 2022-10-07 Lecture 07 - Interfaces  03 - Interface

        /*
         * Interface Syntax:
public interface InterfaceName{
    public void requiredMethod(); //在JDK7以前的版本接口中只能定义抽象方法
    double otherRequiredMethod(int p1,String p2); //在JDK7以前的版本接口中只能定义抽象方法
}
         */


        //Week 6 - 2022-10-03 -> 2022-10-07 Lecture 07 - Interfaces  04 - Implementing Interfaces

        /*
         * 一个接口可以指定一个对象能做什么而不是如何做,也就是说,接口内的所有方法都是public,final且abstract(抽象的)(抽象方法要求某个类在implement一个接口后必须重写/具象化里面的抽象方法)
         * 一个接口不能被用来创建对象,因而在一个接口内也没有constructors或者实例变量
         * 接口内的所有类变量/成员变量都是常量,默认的修饰符为:public static final
         * Syntax of implementing an Interface:
         */
/*
public class ClassName implements InterfaceName{}
 */
        /*
         * 再次提醒:由于接口中所有方法都是抽象的,因此某个类在implement一个接口后必须重写/具象化里面的抽象方法
         */


        //Week 6 - 2022-10-03 -> 2022-10-07 Lecture 07 - Interfaces  05 - Multiple Interfaces

        /*
         * multiple Interfaces Syntax:
         */
/*
public class ClassName implements InterfaceName1, InterfaceName2, ...{}
 */
        /*
         * 总结来讲,接口在表达不同类的相同功能时非常有用
         * 我们能够通过implement interface使得我们能在所有类中使用这些共同的功能
         *
         */

        //Week 6 - 2022-10-03 -> 2022-10-07 Lecture 07 - Interfaces  06 - Interface as a Type(将Interface当类型使用,也就是Interface的多态)

        /*
         * 接口的多态特性:
         * (1)多态参数:
         * 虽然接口不能创建子类,但是接口可以当作一种类型来修饰变量,被修饰的变量并非该接口的子类,而是实现了该接口的实现类的对象
         * Ex:
         */
/*
接口:
public interface MoveHome{ //创建一个"搬家"的接口
    public abstract void moveHome();
}

Javabean类:
车类
public class Car implements MoveHome{
    @Override
    public void moveHome(){
        System.out.println("用车搬家");
    }
}
搬家公司类
public class MoveHomeCompany implements MoveHome{
    @Override
    public void moveHome(){
        System.out.println("联系搬家公司来搬家");
    }
}

Test类:
public class Test{
    public static void banjia(MoveHome x){
        x.moveHome()
    }

    public static void main(String[] args){
        Car truck = new Car();
        MoveHomeCompany huoLaLa = new MoveHomeCompany();
        Test.banjia(truck);
        Test.banjia(huoLaLa)
    }
}
 */
        /*
         * 上述实例中,虽然我们在Test类创建的实例方法banjia(MoveHome x),在参数位置MoveHome虽然是接口,但x并不是接口的对象(事实上接口也不能有对象)
         * x其实是实现了MoveHome接口的实现类的对象(比如上述例子中的Car类和搬家公司类)
         *
         * (2)多态数组
         * 在理解了接口可作为一种类型来修饰变量后,我们就可以用它来创建一个多态数组:
         * Syntax: InterfaceName[] arrayName = new InterfaceName[size];
         * 该数组内的所有元素都必须是实现了该接口的实现类的对象
         * 拓展:
         * 我们在遍历多态数组的时候可能会访问多种实现类的对象,我们固然可以用这些实现类的对象调用这些类的同名方法
         * 但如果我们想调用某个类中的特有方法怎么办?
         * 比如 MoveHome[] arrayEx = {truck,huoLaLa};(依旧使用上述代码中的例子)
         * 我们想使用truck对应的Car类中特有的"加油"方法,那么我们可以用写一个由instanceof组成的判断语句:
         * if (arrayEx[i] instanceof Car){加油方法};
         *
         * (3)多态传递现象
         * Ex:
         * 背景:
         * //假如有两个独立的接口:
         * interface InterfaceA {}
         * interface InterfaceB {}
         * //某个实现类实现了接口B
         * class Ex implements InterfaceB{}
         * 运行:
         * InterfaceB ex1 = new Ex(); //正常运行
         * InterfaceA ex2 = new Ex(); //报错,因为Ex类明显没实现接口A
         *
         * 但是,如果我们令接口B继承接口A:
         * interface InterfaceA {}
         * interface InterfaceB extends InterfaceA {}
         * InterfaceB ex2 = new Ex(); //正常运行
         * InterfaceA ex2 = new Ex(); //正常运行,因为接口A由接口B继承,而实现类实现了接口B相当于同时实现了接口A+接口B
         * 上述例子就是接口的多态传递现象,该现象是由接口间的继承导致的
         */


        //Week 6 - 2022-10-03 -> 2022-10-07 Lecture 07 - Interfaces  07 - Typecasting(类型的强制转换)

        /*
         * Syntax:
         * newType/newObject newVar = (newType/newObject) oldVar;
         *
         * 强制转换不仅能将大的数据类型变为小的,也可以用于克服多态的弊端,即将通过多态语法创建的对象变回子类类型
         * 其中的(newType/newObject)是强制转换的关键
         * Ex: int x = (int) 55.67; //结果为 x = 55,float被强制转换为了int
         *
         * 有时我们的强制转换可能会报错,为了保证代码的安全性,我们使用instance方法在转换前去检测两个类型能否转换成功:
         * if (X instance Y){
         *     Y a = (Y) x; //x是X的对象/X类型
         * }
         * (X instance Y)的结果是boolean类型,如果结果是true,说明X可以转成Y;如果结果为false,那么则不可以.
         *
         */


        //Week 6 - 2022-10-03 -> 2022-10-07 Lecture 07 - Interfaces  08 - Polymorphism

        /*
         * 本节侧重于讲方法(method)的多态:
         * 目前我已知两种途径来创建方法的多态:
         * (1)同名方法的形参不同导致的多态:
         * ex: public void Example(int a){
         *         System.out.print(a)
         *     }
         *     public void Example(int a, String b){
         *         System.out.print(a+b)
         *     }
         * (2)不同种类实现了同一个接口:
         * 比如一个接口(命名为Shape)定义了计算面积的方法(getArea()),而正方形类和圆形类都实现了该接口
         * 那么实现了Shaper的对象s它在调用计算面积的方法时,根据对象s所在类的不同(正方形类/圆形类),所调用的方法也就不同
         * 可能是s.getArea() = pi * r * r;也可能是s.getArea() = outline * outline(边长的平方)
         *
         * 同时也稍微涉及了一些数组(Array)的多态:
         * 依旧是上述例子:
         * 在没有多态这一概念之前,假如我们创建了5个正方形对象和5个圆形对象,我们想计算它们的总面积
         * 由于没有借口,我们需要创建两个不同类型的数组来储存对象,然后遍历数组的同时计算正方形/圆形的面积以及5个正方形/5个圆形的和面积,之后将两个和面积再相加才能得到结果
         * 在有了多态之后,我们只需要创建一个以接口为类型的数组,之后将正方形和圆形的对象都储存数组,简单便捷
         */


        //由于继承已经自学过了,因此本节的笔记只会记B站上自学时没学到的内容
        //Weeks 7 & 8 - 2022-10-10 -> 2022-10-21 Lecture 08 - Inheritance  02 - What is Inheritance?

        /*
         * 父类的英文:superclass;子类的英文:subclass
         *
         * 再次强调,由于Java中没有多继承,因此每个子类都只能有一个父类,但是一个子类可以有间隔父类
         */


        //Weeks 7 & 8 - 2022-10-10 -> 2022-10-21 Lecture 08 - Inheritance  04 - The Object Class

        /*
         * 如果在创建一个类时不继承别的类,那么该类将默认继承Object类(超级父类,Java中的所有类都是它的子类)
         * Object类能为我们提供一些常用且有效的方法:
         * boolean equals(Object obj)
         * int hashCode()
         * String toString()
         * ...
         * instanceof:
         * instanceof是Java的保留关键字.它的作用是测试它左边的对象是否是它右边的类的实例,返回boolean的数据类型
         * instanceof左边显式声明的类型与右边操作元必须是同种类或存在继承关系.也就是说需要位于同一个继承树,否则会编译错误
         * 一下为instanceof常见的应用场景:
         * (1) object instanceof Class,当object是Class的对象,return true
         * (2) object instanceof Interface,当object是Interface的实现类的对象,或者object是Interface的实现类的子类的对象,return true
         * (3) object instanceof superClass(即: 子类的object instanceof 父类或间接父类),当生成object的类是superClass的子类/孙类时,return true
         *
         * 注意:
         * 左边的对象实例不能是基础数据类型: object instanceof Double //此时Java会报错
         * 左边的对象实例和右边的类不在同一个继承树上: "String的对象" instanceof Double //此时Java会报错
         * null用instanceof跟任何类型比较时都是false: null instanceof String //返还false
         */


        //Weeks 7 & 8 - 2022-10-10 -> 2022-10-21  Lecture 08 - Inheritance  05 - Changing Inherited Functionality

        /*
         * 重写父类方法:Override
         * (规则)在子类中对父类的方法进行重写时:
         * 方法的名字(Name)和参数(parameters)都必须与父类方法保持一致
         * 返回的类型(return type)可以不相同,但必须是父类返回值的派生类
         * 访问权限不能比父类中被重写的方法的访问权限更低(比如父类的方法声明的是protected,那么子类中的重写方法就不能是private)
         *
         * 当需要在子类中调用父类的被重写方法时,要使用super关键字
         */


        //Weeks 7 & 8 - 2022-10-10 -> 2022-10-21  Lecture 08 - Inheritance  06 - The Super Keyword

        /*
         * super的三种用法:
         * 1.区分并调用子类和父类中同名的实例变量(this.varName;/super.varName)
         * 注意!!!Sean很讨厌这种用法,因为子类中特有的实例变量,我们明明可以创建一个新的实例变量来保存它,为什么非得让子类里的实例变量与父类中的重名?
         * 因此Sean说如果他发现了这种用法,他会扣分
         * 2.区分并调用子类和父类中的同名方法
         *
         * 3.用于在子类的构造函数中初始化父类(或者说,为父类的构造函数传递参数)
         * 每当我们创建一个子类并为它创建构造函数时,我们要做的第一件事就是调用父类的构造方法
         * 由于我们的子类继承了父类,如果父类的构造函数需要参数,那么我们必须在子类中为父类传递这些参数
         * 所以在父类的构造函数需要参数的情况下,我们子类的构造函数的第一行必须调用super(parameters);来完成对父类的构造函数参数的传递
         */


        //Weeks 7 & 8 - 2022-10-10 -> 2022-10-21  Lecture 08 - Inheritance  07 - Method Overloading

        /*
         * 重载方法:Overload
         * 在一个类中,多个方法的名字相同,但它们需要的参数不同,这就是方法的重载(或者说,多态)
         * 被重载的方法必须改变参数列表(即参数的个数和类型不能相同)
         * 被重载的方法可以改变返回类型
         * 被重载的方法可以改变访问修饰符
         */


        //Weeks 7 & 8 - 2022-10-10 -> 2022-10-21 Lecture 08 - Inheritance  08 - Overriding Methods from Object

        /*
         * 当然,这种方法并不局限于将父类中的方法进行重写,我们也可以根据自己的需求对Object类提供的方法进行重写
         * 比如经典的equals()方法,如果我们想比较两个Date类是否完全相同,如果我们直接利用equals类来比较:
         * date1.equals(date2);由于equals()方法在Object中设置的是比较两个对象的内存地址,date1和date2的内存地址肯定不相同,因此将return
         * 此时我们就可以对equals()方法进行重写,令方法体内比较两个Date类的实例变量:
         */
/*
@Override
public boolean equals(Object object){
    if (object instanceof Date){
        Date date1 = (Date) object1; //尽管object通过了if条件句,但它仍有可能是Date的子类,因此通过铸字将它强制转换为Date类
        return (this.day == date1.day && this.month == date1.month && this.year == date1.year);
    }
    return false;
}
 */
        /*
         * 类似的,对于toString()等Object类中常用的方法,针对不同的情景我们可以对它们进行不同程度的重写以满足任务要求
         */


        //Weeks 7 & 8 - 2022-10-10 -> 2022-10-21 08 - Inheritance  09 - Inheritance in Interfaces

        /*
         * 接口的继承更加简单,继承父接口的子接口包含了更多待实现类实现的类方法
         * Syntax:
         * public interface B extends A{} //也是使用extends关键字
         */


        //Weeks 7 & 8 - 2022-10-10 -> 2022-10-21 08 - Inheritance  10 - Abstract Classes

        /*
         * 在接口中,Java会自动的帮我们的方法加上abstract的关键字
         * 这节其实没讲啥
         */


        //Weeks 7 & 8 - 2022-10-10 -> 2022-10-21 Lecture 08 - Inheritance  11 - Final Classes

        /*
         * final除了可以修饰变量,还可以用来修饰一个类,或者一个方法:
         * 被final修饰的类不能够被子类继承
         * final类常用于以下情景:我们创建了类供他人使用,但是我们不希望别人修改这个类的功能
         * 比如最常用的String类(这是一个我们最常用的final类之一),如果我们重写了String类里的某个方法,那Java中基于该方法实现的功能可能全部会被颠覆
         * Syntax: public final class className{}
         *
         * 如果我们不想整那么极端,我们可以给不想被别人更改的方法用final修饰而非直接修饰整个类
         * 这种情况下该类可以被继承,但是被final修饰的方法无法被重写
         * Syntax: public final void method(){}
         *                  ↑ final的位置要放在返回类型的前面
         *
         * 在Java中,我们可以在一个类的任何地方去调用方法,这当然表示我们也可在构造函数里进行方法的调用
         * 但需要注意的是,我们在构造函数中调用的方法,它必须被final修饰
         * 这样规定的原因是,当这个类被继承,这个类的功能可能会被重写,我们不确定这是否会对构造函数造成影响
         * 比如在构造函数里我用一个方法将某个数据处理后给实例变量赋值;但我们重写了这个方法后,可能就会导致这个环节出错
         * 因此我们规定在构造函数中我们只能调用不能被重写的final方法
         */


        //Weeks 7 & 8 - 2022-10-10 -> 2022-10-21 Lecture 08 - Inheritance  12 - Immutable Objects

        /*
         * 怎么使得一个对象是绝对不可变的?
         * 1.所有的实例变量和类变量都被final修饰(通常也可以用private修饰)
         * 2.不提供Setter方法,不提供其他能修改实例变量的方法
         * 3.子类不被允许重写方法(通常是用final修饰类)
         * 4.(??没看懂)声明对象的实例变量不能够被改变: final classType varName = new classType(); 此时作为对象的reference的varName无法被修改
         */

        //Weeks 7 & 8 - 2022-10-10 -> 2022-10-21 Lecture 08 - Inheritance  13 - Composition vs Inheritance

        /*
         * 通常认为:能使用Composition就别使用Inheritance
         * 所谓Composition(复合)指使用现有对象作为类的一部分,而不是继承它的行为
         * 比如前一段时间我们写的那个Grade类,GradeCombiner类等,那几个类互相调用折腾就叫复合
         * 不过在一些情景下继承回避复合更好用
         */


        //Week 9 - 2022-10-24 -> 2022-10-28 Lecture 09 - Nested Classes  02 - Nested Classes

        /*
         * 虽然我们在开始学习Java时就被告知:类名必须和文件名保持一致
         * 但事实上,我们可以在一个文件中定义多个类/接口/枚举
         *
         * 如果想要采取上述的做法(一个文件中定义多个类/接口/枚举),那么该文件中只能有一个类/接口/枚举是public的
         * 其他的类/接口/枚举的访问权限必须小于public.此时文件名应该与public修饰的类名保持一致
         *
         * 这种写法多在互联网上被使用,比如CSDN这种网站,作者为了能在一页图片里列举多个类,于是将多个类写进了一个文件中
         * Sean不推荐平常用这种写法,会增大check代码时的难度
         *
         * 上述过程并不是真正意义上的"嵌套类"(nested class)
         * 嵌套类是指在一个类的内部再定义其他的类,新定义的这些内部类仅供外部类调用/使用
         * 在这种情况下,嵌套类的写法是可取的,因为用这种方式嵌套类可以使包和代码结构更加整洁
         *
         * 嵌套类的使用在日常的编程中非常少见,但匿名内部类(anonymous inner classes)是个例外
         *
         * 嵌套类有两种类型:
         * 非静态嵌套类/Non-static nested classes(称为内部类/inner classes)
         *     还有一种我们不进行命名的内部类:匿名内部类
         * 静态嵌套类(Static nested classes)
         */


        //Week 9 - 2022-10-24 -> 2022-10-28 Lecture 09 - Nested Classes  03 - Inner Classes

        /*
         * 这部分已自学,见Self_Learning文件
         */


        //Week 9 - 2022-10-24 -> 2022-10-28 Lecture 09 - Nested Classes  04 - Anonymous Inner Classes

        /*
         * 这部分已自学,见Self_Learning文件
         */


        //Week 9 - 2022-10-24 -> 2022-10-28 Lecture 09 - Nested Classes  05 - Static Nested Classes

        /*
         * 这部分已自学,见Self_Learning文件
         */


        //Week 9 - 2022-10-24 -> 2022-10-28 Lecture 09 - Nested Classes  06 - Lambda Functions(Lambda表达式?)

        /*
         * Lambda表达式的使用场景:
         * 匿名内部类的使用需要大量的语法,此时Lambda表达式被引入去简化它
         * 然而有一点需要注意的是:他仅对包含单一方法的接口有效
         *
         * Syntax:
         * (parameter-list) -> {body}
         * parameter-list:必须包含我们正在实现的接口中的方法所需求的所有参数,我们不需要注明这些参数的类型,因为Java已经知道了
         * body:包含了要重写/要实现的方法所需要的代码块
         *
         * 下面有两种Syntax简写的特殊情况:
         * 如果方法所需求的参数只有一个,Lambda表达式可以简写为: parameter -> {body}
         * 如果方法中只有一句代码(one statement),Lambda表达式可以简写为:(parameter-list) -> body
         *
         * Example:
         */
/*
假如我们有一个接口:
interface ExampleInterface{//这个接口只包含了一个抽象方法,此时我们可以使用Lambda表达式
    String requiredMethod();
}

在学习Lambda表达式之前,我们可以通过匿名内部类来调用该方法
public class Test{

    public static void main(String[] args) {
        ExampleInterface anon = new ExampleInterface(){
            public String requiredMethod(){
                return "这个anon变量是由匿名内部类创建的";
            }
        };
        System.out.println(anon.requiredMethod);

        //在学习了lambda表达式之后,我们通过以下方法实现上述过程:
        ExampleInterface lam = () -> {
            return "这个anon变量是由匿名内部类创建的";
        };
        System.out.println(lam.requiredMethod);
    }
}

下面我们再来看一个更复杂一些的例子:
interface ExampleInterface{//这个接口只包含了一个抽象方法,此时我们可以使用Lambda表达式
    int performCalculation(int a, int b);
}

public class Test{

    public static void main(String[] args) {
        Calculator lam = (a,b) -> a * (b + 1);
        System.out.println(lam.performCalculation(5,9));
    }
}
 */
        /*
         * 总结:Lambda表达式感觉就像匿名内部类阉割版本,它的使用条件仅限于接口中仅有一个待实现的抽象方法,它的本质依旧是创建一个对象
         */


        //Week 9 - 2022-10-24 -> 2022-10-28 Lecture 10 - Graphics  02 - When will drawing code be executed?

        /*
         * Java为我们提供了很多开发GUI(图形用户界面)的工具,比如:AWT,Swing和JavaFX
         * AWT是最旧但也是最容易使用的工具,但它的功能比较少
         * Swing是一个较新的框架,它使用AWT使应用程序在不同的系统上看起来相同(或非常相似)
         * JavaFX是功能最强大的最现代框架,但使用起来可能更复杂
         *
         * 我们需要学习:
         * (1)我们在屏幕上绘制的代码何时被执行?
         * (2)屏幕的几何形状是如何表现的?
         * (3)用户如何与我们的应用程序交互?
         *
         * (1)我们在屏幕上绘制的代码何时被执行?
         * 代码将需要在以下情况下执行:
         * 形状首先在屏幕上绘制
         * 窗口被移动了
         * 另一个窗口被移到它的前面
         * 窗口的大小被调整
         * (对于我们来说,知道这些情况何时发生是非常复杂的,但幸运的是,框架将为我们做到这一点)
         * 我们使用的框架将决定何时执行绘图代码
         * 这个概念被称为控制反转,我们不再能够/需要控制代码何时执行
         *
         * 创建窗口并在屏幕上绘制的步骤如下:
         * 1.创建一个窗口(称作JFrame,是Java的一个类)
         * 2.设置窗口的尺寸
         * 3.告诉窗口在何时关闭
         * 4.设置窗口是可视的(窗口在设置前默认是不可视的)
         * EX:
         */
/*
import Javax.swing.JFrame;
public class WindowApplication{
    public static void main(String[] args){
        JFrame window = new JFrame();
        window.setSize(666,777);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}

 */

        //Week 9 - 2022-10-24 -> 2022-10-28 Lecture 10 - Graphics  03 - Classes we use to draw

        /*
         * 如果希望在窗口中显示任何内容,则必须通过调用add方法将其添加到JFrame对象中
         * Syntax: JFrame的对象.add(Component comp);
         * add方法将选取Component类型的数据作为参数,由于多态的存在,这意味我们也可以输入Component的子类作为参数
         * Component类的子类包括JPanel类(我们将在Assignment中用到)
         *
         * 让我们来看一看JPanel类吧(Panel的意思是画板)
         * 在JPanel类中有一paintComponent方法,当绘制JPanel的内容时,将自动调用此方法
         * 一般来讲,我们想通过JPanel的功能在窗口上画图像时要通过以下三步:
         * (1)创建一个JPanel的子类
         * (2)在该子类中重写paintComponent方法,并在重写方法内加入我们要画的图像所需的代码(注意,该方法会被自动调用)
         * (3)将该子类的对象用add方法添加到JFrame中
         * Ex:
         */
/*
在Skyline.Java中:
import javax.swing.JPanel;
import java.awt.Graphics;
public class Skyline extends JPanel{
    protected void paintComponent(Graphics g){
        //shape drawing code goes here
    }
}

在WindowApplication中:
import Javax.swing.JFrame;
public class WindowApplication{
    public static void main(String[] args){
        JFrame window = new JFrame();
        window.setSize(666,777);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Skyline picture = new Skyline(); //paintComponent方法将被自动调用
        window.add(picture);
        window.setVisible(true);
    }
}
 */


        //Week 9 - 2022-10-24 -> 2022-10-28 Lecture 10 - Graphics  04 - Screen Coordinates and drawing

        /*
         * 关于GUI中的坐标系,它的规则是:
         * 选取屏幕的左上角作为原点;
         * 向下移动时y的坐标会增加;
         * 向右移动时x的坐标会增加;
         * (这与我们在几何数学中传统的坐标系有些不同)
         *
         * 在上节课中我们提到绘图代码将存放在方法paintComponent中,现在我们必须看看我们是如何实际绘图的
         * 绘图是通过传递给该方法的参数Graphics g来完成的,以下是一些常用的方法:
         * void drawLine(int x1, int y1, int x2, int y2); //从点(x1,y1)到点(x2,y2)画一条直线
         * void drawOval(int x, int y, int width, int height);//画一个椭圆
         * void drawPolygon(Polygon p);//利用Polygon类画一个多边形(通过设置多个点来画多边形)
         * void drawRect(int x, int y, int width, int height);//画一个矩形,矩形的左顶点为(x,y),矩形的长和宽分别是width和height
         * void fillOval(int x, int y, int width, int height); //为指定椭圆位置填色
         * void fillRect (int x, int y, int width, int height);//为指定矩形位置填色
         * void fillPolygon(Polygon p);//为指定多边形位置填色
         *
         * 此外,可以通过调用setColor方法来更改绘制这些形状的颜色,该方法以颜色对象为参数一个参数
         * 通常,我们将使用在Color类中已经表示为常量的(final类型的)颜色,比如:Color.BLACK,Color.GREEN,Color.BLUE
         */


        //Week 9 - 2022-10-24 -> 2022-10-28 Lecture 10 - Graphics  05 - OOP approach to drawing

        /*
         * 接下来我们将用面向对象的方法去实现绘画的过程
         * 我们的所有图片都将由许多更小的图画组成
         * 如果其中某些小图画较为复杂,我们可以专门为他们创建一个类来实现
         *
         * 我们首先将定义Drawable接口并在每个类中实现它:
         */
/*
import java.awt.Graphics;
public interface Drawable{
    public void draw(Graphics g); //Graphic类相当于一根画笔,上述的那些方法就是通过调用Graphic的对象完成的
}
 */
        /*
         * 我们将首先定义一个类来表示一个非常基本的建筑形状
         * 这个建筑将是200像素高,50像素宽
         * 我们将包括实例变量和一个构造函数,它允许我们通过x和y参数设置建筑物的位置
         * 这将允许我们在“不同的位置”创建同一幅画的多个副本
         * Ex:
         */
/*
在Building类中:
//这个类的作用类如其名,就是创建一栋栋建筑物,建筑物的宽高已经固定,宽50高200,其位置不固定,可以通过构造函数放置它的位置
import java.awt.Graphics;
import java.awt.Color;

public class Building implements Drawable{
    protected int x,y;
    public Building(int x1, int y1){
        this.x = x1;
        this.y = y1;
    }
    public void draw(Graphics g){
        g.setColor(BLACK);
        g.fillRect(x,y,50,200);
    }
}

在Skyline类中:
//这个类是一个主类,我们将所有类似Building类的小图画在这里汇总得到完整的图像
import javax.swing.*;
import java.awt.*;
public class Skyline extends JPanel{
    private Building[] buildings = new Building[2];

    public Skyline(){
        buildings[0] = new Building(150,250);
        buildings[1] = new Building(250,250);
    }

    protected void paintComponent(Graphics g){
        g.setColor(Color.BLUE);//设置画笔颜色
        g.fillRect(0,0,768,450);//填充天空的颜色

        g.setColor(Color.DARK_GRAY);//设置画笔颜色
        g.fillRect(0,450,768,100);//填充大地的颜色

        buildings[0].draw(g);
        buildings[1].draw(g);
    }
}
 */
        /*
         * 如果想为Building类的建筑加上窗户(一个正方形),我们可以使用两个嵌套的loop去实现
         * 内层的loop负责为Building的同一行内不断添加窗户;外层的loop负责在同一行添加过窗户后跳转到下一行
         * Ex:
         */
/*
public void draw(Graphics g){
    g.setColor(Color.BLACK);
    g.fillRect(x,y,50,200);
    g.setColor(Color.YELLOW);
    for(int i = x + 5; i < x + 50; i = i + 15){
        for(int j = y + 5; j < y + 200; j = j + 15){
            g.fillRect(i,j,10,10);
        }
    }
}
 */
        /*
         * 如果我们想对已有的小的图像类上做出些改动,比如我们想给Building类的建筑加上屋顶,那么我们可以创建它的一个子类
         * 比如叫RoofBuilding,之后在子类中重写父类里的draw()方法,为建筑我屋顶添加上一个三角形
         * Ex:
         */
/*
在RoofBuilding类中:
import java.awt.*;
public class RoofBuilding extends Building{
    public RoofBuilding(int x, int y){
        super(x, y+20); //y+20的原因是要记录屋顶尖端部分y的坐标
    }
    public void draw(Graphics g){
        //调用父类的draw方法来造建筑
        super.draw(g);
        //开始造屋顶
        g.setColor(Color.BLACK);
        Polygon p = new Polygon();
        p.addPoint(x,y);
        p.addPoint(x,y-20);
        p.addPoint(x+50,y);
        g.fillPolygon(p);
    }
}
 */


        //Week 9 - 2022-10-24 -> 2022-10-28 Lecture 10 - Graphics  06 - Preperation for mouse interaction

        /*
         * 我们将通过添加效果来介绍使用鼠标进行用户输入的概念
         * 用户可以通过点击右键将图片从夜晚改为白天
         * 用户可以通过点击左键添加星星
         * 然而,为了使这成为可能,我们需要向对象添加方法
         * 这将使他们能够交流和传递信息
         *
         * 让我们梳理一下我们目前所创建的所有类和对象的关系:
         */
/*
main method(WindowApplication类):
    (1)(负责windows功能)JFrame
                ↑ Skyline对象被添加到JFrame中
    (2)(负责picture)Skyline
        (a)Building
        (b)RoofBuilding
 */
        /*
         * 如果我们想设置通过鼠标点击切换白天和黑夜的效果
         * 我们需要在Skyline类中设置相应的方法,使得在黑夜时,天空和建筑物的颜色发生改变
         *
         * 首先我们可以在Skyline中添加一个实例变量,用它来记录天是白天还是黑夜的状态:
         * private boolean nightTime = true;
         * 之后我们需要添加一个if从句来改变天空的颜色:
         * if(nightTime){
         *     g.setColor(Color.BLUE);
         * }else{
         *     g.setColor(Color.LIGHT_BLUE);
         * }
         * 我们也需要在Building类里添加类似的方法来控制建筑物是否亮灯
         * Ex:
         */
/*
在Skyline类中:
public void changeNightTime(){
    this.nightTime = !nightTime;
    for(int i = 0; i < buildings.length; i++){
        buildings[i].setNightTime(nightTime);
    }
}

在Building类中:
public void setNightTime(boolean nightTime){
    this.nightTime = nightTime;
}
 */

        //Week 9 - 2022-10-24 -> 2022-10-28 Lecture 10 - Graphics  07 - Mouse Interaction

        /*
         * 我们很难知道这只鼠标什么时候用过
         * 我们可以用JVM的一部分来告知鼠标何时发生了不同的事情
         * 这种工作原理基于回调(callback)方法的概念
         * 回调方法是这样一种方法,我们在实现时知道,每当发生特定事件时,例如单击鼠标时,就会调用它
         * 回调的功能是使用Java中的接口实现的,实现这些接口的类通常称为侦听器(listeners)
         * 让我们来看一下负责监控鼠标状况的接口:
         */
/*
import java.awt.event;
public interface MouseListener{
    void mouseClicked(MouseEvent e);//每当按下并释放鼠标时调用
    void mousePressed(MouseEvent e);//每当按下鼠标时调用
    void mouseReleased(MouseEvent e);//每当释放鼠标时调用
    void mouseEntered(MouseEvent e);//每当鼠标移动到窗口内时调用
    void mouseExited(MouseEvent e);//当鼠标移动到窗口外时调用
}
 */
        /*
         * 在我们的需求中,我们只需要实现接口中的少数几个方法即可满足需求
         * 我们可以在 void mouseClicked(MouseEvent e){changeNightTime();}方法里添加changeNightTime()方法
         * Ex:
         */
/*
在LightListener类中:
import java.awt.event.*;
public class LightListener implements MouseListener{
    private Skyline skylinePicture;

    public LightListener(Skyline p){//构造函数
        skylinePicture = p;
    }

    public void mouseClicked(MouseEvent e){
        skylinePicture.changeNightTime();//将Skyline的对象的天改变状态
        skylinePicture.repaint();//切换完白天或黑夜后必须重新呈现画布才能呈现最新的图画效果
    }

    //剩下的抽象方法用不到
    void mousePressed(MouseEvent e){}
    void mouseReleased(MouseEvent e){}
    void mouseEntered(MouseEvent e){}
    void mouseExited(MouseEvent e){}
}

在WindowApplication中:
public class WindowApplication{
    public static void main(String[] args){
        JFrame window = new JFrame();
        window.setSize(768,512);
        window.serDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        Skyline picture = new Skyline();
        LightListener ll = new LightListener(picture);
        picture.addMouseListener(ll);//这个方法是JPanel类中的方法,由于Skyline继承了JPanel,因此我们可以通过这个方法来添加Skyline的监控者类-LightListener类
        window.add(picture);
    }
}
 */


        //Week 9 - 2022-10-24 -> 2022-10-28 Lecture 10 - Graphics  08 - More about Mouse Interaction

        /*
         * 为了看得更深入了解MouseListener接口一点,我们将添加在图片中放置星星的能力
         * 首先,我们需要一些代码来记住星星并绘制它们(添加到Skyline类中)
         * 其次,我们需要找出用户在窗口中单击的位置以及他们按下了哪个按钮
         * 该信息包含在方法的参数中
         * 对象MouseEvent e
         * 我们可以使用方法getButton(),getX()和getY()
         * Ex:
         */
/*
public void mouseClicked(MouseEvent e){
    if (e.getButton() == MouseEvent.BUTTON1){
        skylinePicture.changeNightTime();
    }else{
        skylinePicture.addStar(e.getX(),e.getY());
    }
    skylinePicture.repaint();
}
 */
        /*
         * 我们可以使用鼠标的运动来控制我们的应用程序
         * 这是通过使用MouseMotionListener接口来实现的
         * 这一接口只包含了两个抽象方法:
         */
/*
public interface MouseMotionListener{
    void mouseDragged(MouseEvent e);
    void mouseMoved(MouseEvent e);
}
 */
        /*
         * 我们能用JPanel的对象调用addMouseMotionListener方法,该方法需要一个MouseMotionListener的实现类的对象作为参数
         * picture.addMouseMotionListener(MouseMotionListener m);
         * 这样就可以监测图像中鼠标的移动,并用不同的方法响应不同的移动轨迹
         *
         * 另外,如果我们想同时对鼠标的按键和鼠标的移动轨迹进行监控
         * 我么可以使用MouseInputAdapter类(它相当于一个适配器)
         * 该适配器同时包含了MouseMotionListener和MouseListener两个接口中的所有方法,不过这些方法都是抽象方法,MouseInputAdapter类也是一个抽象类
         * 我们在使用它的时候需要继承并重写该类和它其中的方法
         * 在使用时,我们需要先创建MouseInputAdapter类的子类,之后重写方法,然后创建该子类的对象,之后调用JPanel对象添加该子类的对象
         */

        //Week 9 - 2022-10-24 -> 2022-10-28 Lecture 10 - Graphics  09 - Keyboard Interaction

        /*
         * 上文讲述了我们的GUI是怎么和鼠标进行互动的
         * 下面我们将学习键盘是怎么和GUI互动的
         * 我们采取与上几节课类似的方法来实现键盘与GUI的互动:
         * 我们引入KeyListener接口:
         */
/*
public interface KeyListener{
    void keyTyped(KeyEvent e); //每当按下和释放字符键(不是功能键)时调用
    void keyPressed(KeyEvent e); //每当按下任何键时调用
    void keyReleased(KeyEvent e); //每当释放任何键时调用
}
 */
        /*
         * 3:53 不想看了,开摆
         */


        //Week 9 - 2022-10-24 -> 2022-10-28 Lecture 10 - Graphics  10 - GUI Design

        /*
         * 本节将介绍一下IT行业在设计GUI时约定俗成的原则:
         * 创建用户界面和管理用户交互的代码应该始终与执行实际工作的代码分离
         * 在游戏例子中,实际的工作是计算游戏中所有物体的位置,管理它们的移动,检测碰撞,计算分数生命值和其他与游戏相关的内容
         * 而呈现ship的画面到屏幕上的代码不应该与ship类中的代码混在一起,而应该储存在与GUI有关的代码中
         *
         * 使用这些原则/准则的优点:
         * 它允许在必要时分别优化代码的各个部分
         * 它允许我们在其他应用程序中重用我们的代码的一部分
         * 它允许我们更容易地改变我们正在使用的接口
         * 对界面进行更改更容易,因为我们只需要更改用户界面代码
         * (记住:你的Assignment分数很大一部分是基于你的代码设计)
         */


        //Week 10 - 2022-10-31 -> 2022-11-04 Lecture 11 - Exceptions  02 - Errors

        /*
         * 最常见也是最主要的编程错误:
         * Syntactic(Syntax) errors (语法错误,最容易被检查出)
         * Semantic errors (语义错误:比如想得到1+1,却写成了1-1)
         * Input/resource errors(Input指的是:用户的输入方式不同时造成的错误)
         *
         * 语义错误(semantic error)会在造成报错前能够正常运行,当报错后Java会终止并报出"异常"(exception)
         */


        //Week 10 - 2022-10-31 -> 2022-11-04 Lecture 11 - Exceptions  03 - Stack and Stack Traces

        /*
         * 本小节我们将学习Java是如何储存局部变量的
         * 1.寄存器：最快的存储区, 由编译器根据需求进行分配,我们在程序中无法控制.
         * 2.栈：存放基本类型的变量数据和对象的引用，但对象本身不存放在栈中，而是存放在堆（new 出来的对象）或者常量池中（字符串常量对象存放在常量池中。）
         * 3.堆：存放所有new出来的对象。
         * 4.静态域：存放静态成员（static定义的）
         * 5.常量池：存放字符串常量和基本类型常量（public static final）。
         * 6.非RAM存储：硬盘等永久存储空间
         *
         * Java的异常:
         * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -1
         *      at ArrayTest.findMax(ArrayTest.java:11)
         *      at ArrayTest.main(ArrayTest.java:16)
         */


        //Week 10 - 2022-10-31 -> 2022-11-04 Lecture 11 - Exceptions  04 - Error Recovery

        /*
         * 我们引入try-catch语句来帮助修复异常
         */
/*
try{
    //在这里写下可能存在问题的代码
    //attempt the code
}catch (Exception e){
    //仅当try语句中的代码出现报错后catch语句中的代码才会运行
    //what to do when there is a problem
}
catch语句里的Exception类型的变量指的是异常本身,
我们可以在catch语句里添加 e.printStackTrace()来在屏幕上打印出报错的信息(仅当错误发生时会打印)
这样做的好处是Java不会因为报错终止编译/运行
 */
        /*
         * 健壮的程序(Robust programs):
         * 如果一个程序能从意外错误中恢复，那么它就是健壮的。所谓“意外错误”，我们指的是程序员无法控制的资源错误。
         * 通常，一个健壮的程序会在出错时捕获异常，并在必要时告诉用户，如果可能的话继续执行。
         * 例如，假设我们正在编写一个程序从文件中读取学生数据。如果用户输入错误的文件名，程序将无法找到数据。
         * 如果没有错误恢复，这将导致程序崩溃。如果从错误中恢复，允许用户再次输入文件名，则可以继续执行。这是稳健行为的一个例子。
         *
         */

        //Week 10 - 2022-10-31 -> 2022-11-04 Lecture 11 - Exceptions  05 - Types of Exceptions

        /*
         * Exceptions:
         * 有许多不同类型的异常，每一种都定义为一个类。层次结构的根是一个称为Throwable的类(Throwable类是所有异常exception和错误error类的父类)。但是，通常我们只处理它的两个直接子类Error和Exception。
         *
         * Error:
         * Error类代表了大多数应用程序不应该捕捉到的严重问题。它们代表了不应该发生的情况。因此，我们将不再详细研究这些问题。
         *
         * Exception:
         * Exception类代表了程序员期望恢复的大多数问题。我们处理的所有异常都将是Exception的子类，尽管许多不是直接的。
         * 异常可以分为两类:受控(Checked)异常和未受控(Unchecked)异常
         *
         * Unchecked exceptions:
         * 未受控的异常表示可能发生但通常发生的可能性不大的错误。如果异常是类RunTimeException的子类(直接或间接)，则它是Unchecked的。
         * 未受控异常的典型例子是IndexOutOfBoundsException、NullPointerException或InputMismat chException。
         * 当可能出现这些异常时，程序员不需要实现错误恢复代码。
         * 原因是:
         * 每次使用数组时都可能出现IndexOutOfBoundsException异常。想象一下，如果每次访问数组时都需要使用try-catch语句，那么代码将会多么复杂。
         * 每次使用对象(访问实例变量或调用方法)时都可能出现NullPointerException。
         * 当我们试图从String(或用户或文件)中读取某种类型的信息时，就可能出现InputMismat chException。
         * 如果在上述所有情况下都要求我们在代码中添加try-catch语句，那么我们的代码将非常难以理解，比所需的代码更长，编写时间也更长。
         *
         * Checked exceptions:
         * 受控异常表示在执行代码时可能发生的错误。如果异常是exception的子类，而不是RunTimeException的子类，则是受控(Checked)异常。
         * 只要可能出现受控(Checked)异常，程序员就需要实现错误恢复代码。通常，这意味着执行操作(如文件或网络访问)的代码可能存在问题。
         * 如果我们想读取一个文件，可能会发生很多问题，比如它的位置发生了变化或格式不正确。
         * 如果我们想要访问互联网服务器上的信息，可能会发生许多问题，如我们的互联网连接或服务器连接的问题。
         * 在大多数应用程序中，错误恢复代码只针对受控(Checked)异常编写。在这种情况下，我们将在后面更详细地讨论这些问题。
         */


        //Week 10 - 2022-10-31 -> 2022-11-04 Lecture 11 - Exceptions  06 - Recovering from Errors

        /*
         * 我们将可能导致问题的代码放入语句的try部分，如果代码有问题，程序可以继续执行。
         * 这意味着，try语句中的代码会在异常发生的地方停止,try语句后面的任何代码都不会被执行，
         * 而是执行语句catch部分中的代码，然后执行该语句后面的任何代码。如果没有异常，则代码正常执行，catch部分中的代码不执行。
         * 这意味着每当我们看到try-catch语句时，代码要么被正确执行，要么抛出异常并执行catch语句。
         * 示例中的代码将捕获exception类的子类中的任何异常，因为这是我们声明的异常类型。
         * 然而，如果我们想要更具体，我们可以用catch(NumberFormatException e)替换它。这使它更清楚地预期发生什么异常并从中恢复。
         *
         *
         * Multiple catch sections:
         * 多个捕获段不同类型的错误可能发生在相同的代码中。在我们的例子Integer中:
         * parseInt(s)有两种可能的异常，NumberFormatException(如果字符串不包含数字)和NullPointerException(如果变量s为空)。
         * 很可能我们希望以不同的方式从这些错误中恢复
         * 在这种情况下，我们可以向同一个try-catch语句添加多个catch部分
         * 这允许我们指定我们希望对每种类型的错误发生什么。
         * Ex:
         */
/*
报错的源码:
public static void main(String[] args) {
    String s = ""; // string with some value
    try {
    int x = Integer.parseInt(s);
    } catch (Exception e) {
    System.out.println("Not a valid int");
}

Multiple try-catch语句:
try {
    int x = Integer.parseInt(s);
    } catch (NumberFormatException e){
    System.out.println("Not a valid int");
    } catch (NullPointerException npe){
    System.out.println("s has no value");
}

多重catch语句的检测顺序:
当在try部分中抛出异常时，JVM将按顺序检查catch的异常列表，直到找到匹配的异常。
这包括可声明的任何超类异常.例如，如果第一个catch语句是针对Exception的，第二个是针对NumberFormatException的，
那么第一个catch语句将始终匹配，因为NumberFormatException是Exception的子类。

Finally语句:
这个语句可在需要时加在catch section之后。在抛出异常(try中代码报错,catch语句运行)和未抛出异常(try中代码未报错,catch语句未运行)的情况下都将执行finally语句中的代码。
它们通常用于管理语句的try部分中使用的资源。例如，如果我们正在使用一个网络流，它应该在使用后关闭。
放置在finally语句中的代码无论在try-catch语句哪方运行的情况下都能让网络流实现关闭。
*/

        //Week 10 - 2022-10-31 -> 2022-11-04 Lecture 11 - Exceptions  07 - Checked Exceptions(受控异常)

        /*
         * 受控异常表示在执行代码时可能发生的错误。如果异常是exception的子类，而不是RunTimeException的子类，则为受控异常。
         * 只要可能出现受控异常，程序员就需要实现错误恢复代码。
         * 下图将给出Throwable类以及Error类和Exception类和它们子类的关系:
         */
/*
Throwable
    Error
        VirtualMachineError
            StackOverFlowError
            OutOfMemoryError
        AWTError
    Exception
        IOException
            EOFException
            FileNotFoundException
        RuntimeException
            ArithmeticException
            MissingResourceException
            ClassNotFoundException
            NullPointerException
            IllegalArgumentException
            ArrayIndexOutOfBoundsException
            UnKnownTypeException
 */
        /*
         * 当系统抛出异常之后,程序员有两种选择:
         * 使用try-catch语句捕获异常(称为handling)
         * 将异常传递给对象从而调用它对应的类(称为advertising)
         *
         * BufferedInputStream类中为我们提供了名叫read的方法
         * API中该方法的声明为:public int read() throws IOException
         * 这意味着该方法能够抛出一个IOException(可能抛出,但不是一定)
         * 在使用该方法前,如果我们不先进行handling或advertising报错,那么这个方法将不会被编译(会报错
         * 正确的使用方法Ex:
         */
/*
handling:
public int readInt(BufferedInputStream b){
    try{
        return b.read();
    }catch(IOException e){
        return -1;
    }
}

advertising:
这个方法的作用和上放的一样,它告诉使用它的用户:这个方法可能会抛出一个IOException并读取它
public int readInt(BufferedInputStream b) throws IOException{
    return b.read();
}
 */
        /*
         * 如果在执行方法时发生了报错，我们有两个选项:
         * 我们可以返还一个特殊值,比如-1或者null
         * 我们也可以抛出一个异常并且允许问题在别处被解决
         * 不过需要注意的是,我们需要在该方法中添加注释来说明:当异常发生时,屏幕上会显示一个特殊值/异常;这样当别的程序员使用你的代码时就能理解
         */


        //Week 10 - 2022-10-31 -> 2022-11-04 Lecture 11 - Exceptions  08 - Defining Custom Exception Types

        /*
         * 异常和Java中的其他东西一样是一个对象
         * 当我们面对一个问题时，我们可以创建一个异常对象并抛出它来表示有什么地方出错了
         * Java中已经定义了许多有用的异常类
         * 比如: throw new IllegalArgumentException();
         * 我们自己也可以定制我们需要的异常类:
         * 比如:public class QueueEmptyException extends Exception{}
         *
         * 下面我们假设,如果我们有一个队列类,其中的一个方法是dequeue(移除)队列里的数据
         * 如果队列为空,那么此时再移除数据将会报错
         * 在这种情况下,我们就可以自己定义一个异常类,当队列为空且调用dequeue()方法后,我们就将报错的信息返还给用户:
         */
/*
public class QueueEmptyException extends Exception{
    public QueueEmptyException(){
        super("你不能从一个已空的数列里移除数据");
    }
}
 */


        //Week 11 - 2022-11-07 -> 2022-11-11 Lecture 12 - Files  03 - Streams

        /*
         * 最基本的流类型是字节流
         * 这些流每次只读取或写入一个字节的数据
         * 当程序需要理解数据的含义时，字节流不是很好
         * 如果我们希望读取一个int，它是4个字节的信息
         */


        //Week 11 - 2022-11-07 -> 2022-11-11 Lecture 12 - Files  04 - Character Streams

        /*
         * Java使用Unicode存储字符值
         * 字符流自动将这种内部格式与本地字符集进行转换
         *
         * FileReader API:
         * read:
         * public int read() throws IOException{}
         * 每次调用该方法将会得到一个char,如果读到了文件(Stream)的最末端,那么该方法将会返还一个负数:-1(这也是为什么返回值的类型不设置成char,
         * 因为char的范围中没有负数,因此为了能在文件读取完后返回-1,返回值类型设置为了int)
         *
         * write:
         * 我们需要创建FileWriter类的对象来调用该方法
         * public void write(int c) throws IOException{}
         * 该方法的参数本应该设置成char,但Java的设计者为了与read方法的返回值类型照应,所以也设成了int
         * 不过放心,如果你输入了一个int,那么超出char的部分会被Java自动忽略掉
         */


        //Week 11 - 2022-11-07 -> 2022-11-11 Lecture 12 - Files  05 - Closing Streams and the Try with Resources Statement

        /*
         * 需要注意的是,我们需要在使用完write方法后,应该关闭文件流:
         * filewriterObject.close();
         * 如果不关闭文件流,那么你所做的write或者其他操作都不会被执行(猜测)
         * 一般是咱try语句的最后一行来调用该关闭语句.或者是设置finally语句来关闭
         *
         * Java7之后的版本新增加了一个特性,那就是try语句中涉及IO资源调用时,在try语句结束或者发生异常后,Java会自动帮我们关闭IO操作
         * Syntax:
         * try(在此处写声明并构建Stream的语句,比如FileWriter fw = new FileWriter("test.txt");){
         *  //语句
         * }catch(){
         *  //语句
         * }
         */


        //Week 11 - 2022-11-07 -> 2022-11-11 Lecture 12 - Files  06 - Buffered Streams for Text

        /*
         * 在Character Stream中我们讲到了如何读取一个个字母,但我们平时更常用到的是一次读取一行信息,并对一整个String进行读写操作
         * Java为我们提供了一些这样的类,比如buffered streams
         * buffered streams是从缓冲区中被读取的,因此读取速度比传统的I/O操纵快很多
         * 当缓冲区中的数据被写满时,缓冲区中的数据一起被写入文件;当缓冲区被读空后,数据有被读入文件
         * 也就是说,如果使用缓冲流,在缓冲区满之前不会向磁盘写入任何内容
         *
         * 所有的数据流字符类字节流都可以通过包装成为缓冲流,具体方法是将前者中的数据填入缓冲流中
         *
         * 针对不同类型的数据有不同类型的缓冲流.
         * 例如,要创建一个缓冲字节流,我们可以使用BufferedInputStream或BufferedOutputStream
         * 对于字符流,我们将使用BufferedReader和BufferedWriter
         * Ex:
         * 为了能一次对多个字符进行操作,我们首先创建一个字符流,之后再将其变为缓冲流:
         * FileReader fr = new FileReader("ex.txt");
         * 当字符流创建完毕,我们是用BufferedReader对象:
         * BufferedReader br = new BufferedReader(fr);
         * 上述过程可以合成一句:
         * BufferedReader br = new BufferedReader(new FileReader("ex.txt"));
         *
         * 当使用缓冲流写入数据时，只有在缓冲区满时才写入数据
         * 但是，如果缓冲区没有满，而我们希望现在写入数据，该怎么办呢?
         * Java提供了一种方法，我们可以随时使用该方法将当前缓冲区中的任何数据写入目标
         * 该方法称作:flush()
         *
         * 缓冲流提供了读和写的方法，其工作方式与我们已经看到的字符流和字节流完全相同
         * 不过，它们还添加了一些方法，在大量读取或写入数据时使用起来要容易得多
         * readLine(位于BufferedReader API):
         * public String readLine() throws IOException;
         * 功能:读取一行文本。换行('\n')、回车(r')或回车后紧接着换行的任何一个都被认为终止了一行。
         * 返回:一个包含行内容的字符串，不包括任何行结束字符，如果已经到达流的末尾则返回null
         *
         * write(位于BufferedWriter API):
         * public void write(String str) throws IOException;
         * 功能:写入String
         * Ex:
         */
/*
public static void main(String[] args){
    String[] words = new String[] {"Hi","my","name","is","TlY"};
    try(BufferedWriter bw = new BufferedWriter(new FileWriter("ex.txt"))){
        for(int i=0; i < words.length; i++){
            bw.write(words[i]+"\n");
        }
    }catch(IOException e){
        e.printStackTrace();
    }
}
 */
        /*
         * 与上述字节流在Stream被读完后返回-1不同,缓冲流在Stream被读完后会返回null
         * 因此我们需要用!null作为while语句的终止条件:
         */
/*
public static void main(String[] args){
    try(BufferedWriter bw = new BufferedWriter(new FileWriter("words.txt"));
        BufferedReader br = new BufferedReader(new FIleReader("chars.txt"))){
        String line = br.readLine();
        while (line != null){
            bw.write(line.replace("silence","music") + "\n");
            line = br.readLine();
        }
    }catch(IOException e){
        e.printStackTrace();
    }
}
 */


        //Week 11 - 2022-11-07 -> 2022-11-11 Lecture 12 - Files  07 - Data Streams

        /*
         * 对于读写数据,我们将使用DataInputStream和DataOutputStream类
         * 这些流的构造方式与缓冲流相同事实上，它们通常是使用缓冲流构造的
         * 这意味着，如果我们希望程序高效，就需要总共创建三个流来读取或写入数据:
         * 首先我们需要构造一个FileInputStream:
         * FileInputStream fis = new FileInputStream("grades.txt");
         * 然后使用它构造一个BufferedInputStream:
         * BufferedInputStream bis = new BufferedInputStream(fis);
         * 最后使用它构造一个DataInputStream:
         * DataInputStream ids = new DataInputStream(bis);
         * 如果不使用缓冲的输入流，而是简单地将文件输入流传递给数据输入流是可以接受的，但是这将导致程序效率较低
         *
         * 因为我们可以存储不同类型的数据，并且每种数据都将以与内存中相同的格式存储，所以我们需要针对每种类型的数据使用一个方法
         * 例如，如果我想将一个整数写入文件，我不能使用写入double类型的相同方法，因为这两种类型的存储方式不同
         * 我们有写数据的方法有:
         * 为int提供有: writeInt()
         * 为char提供有: writeChar()
         * 为double提供有: writerDouble()
         *
         * DataInputSteam的readInt():
         * public int readInt() throws IOException
         * 功能:读取文件中的四个字节(4 bytes)并将他们转换成int返还
         * 返回:输入流的下四个字节，解释为int类型。
         *
         * DataInputSteam的readUTF():
         * public final String readUTF() throws IOException
         * 功能:读入已使用修改的UTF-8格式编码的字符串。readUTF的一般约定是，它读取以修改后的UTF-8格式编码的Unicode字符串的表示;
         * 返回:一个Unicode字符串
         *
         * DataOutputStream的writeInt():
         * public final void writeInt(int v) throws IOException //(参数:v -一个要写入的int)
         * 将int型变量以四个字节的形式写入底层输出流，首先是高字节
         *
         * DataOutputStream的writeUTF():
         * public final void writeUTF(String str) throws IOException //(参数为将要被写入的string)
         * 功能:以独立于机器的方式使用修改的UTF-8编码将字符串写入底层输出流。首先，将两个字节写入输出流，
         * 就像通过writeShort方法给出后面的字节数一样。这个值是实际写入的字节数，而不是字符串的长度。在长度之后，依次输出字符串的每个字符，使用修改后的字符UTF-8编码。
         *
         * 
         *
         */


        //Week 12 - 2022-11-14 -> 2022-11-18 Lecture 15 - Generics   02 - The Problems With Data Structures and How To Use Generics

        /*
         * 泛型在不同的计算机语言中有着不同的叫法:泛型、参数多态性、模板和参数化类型
         *
         * 泛型编程允许在稍后为指定的数据结构或类定义类型
         * 它们的实际类型在构造对象时指定
         * 这种编程风格对于创建数据结构非常有用
         */


        //Week 12 - 2022-11-14 -> 2022-11-18 Lecture 15 - Generics   03 - Defining Generic Classes and Interfaces

        /*
         * <T>常用于形容Type
         * <E>常用于形容Element
         * <V>常用于形容Value
         *
         * 对于单一的泛型类型，我们通常使用字母T:
         * public interface Stack<T>{}
         *
         * 如果要声明多个泛型形参，我们为每个类型使用不同的字母，用逗号分隔:
         * public interface Map<K,V>{}
         *
         * 需要注意的是,我们无法为一个泛型创建对象
         * 数组是一个较为特殊的例子,我们可以在实例变量中定义一个泛型数组:
         * T[] arr;
         * 之后我们必须在构造一个Object数组并将其铸字为<T>:
         * this.arr = (T[]) new Object[];
         */


        //Week 12 - 2022-11-14 -> 2022-11-18 Lecture 15 - Generics   04 - Defining Generic Methods

        /*
         * 在Java已知你想要提供什么类型给泛型时可以省写,比如:
         * LinkedList<String> strings = new LinkedList<可以省略>();
         *
         * 应用程序程序员很少需要定义泛型类
         * 泛型在开发数据结构时最有用
         * 程序员大多时候只需要理解和使用可用的泛型类即可
         *
         * 在我们的应用程序中使用泛型类主要有两个原因:
         * 它支持更有力的类型检查(就像黑马程序员里的比喻,泛型就像一个集合门口的看门大爷,只有正确类型的元素才能进入集合)
         * 它减少了类型转换(想想咱们双向列表里,一大堆从Object类到Position类再到Node类的转换)
         */


        //Week 12 - 2022-11-14 -> 2022-11-18 Lecture 15 - Generics   05 - Primitive Types and Generics

        /*
         * 泛型必须被传递对象而不能是基本数据类型,如果想传递基本数据类型,那也必须传递他们对应的封装类:
         * byte-Byte
         * short-Short
         * int-Integer
         * long-Long
         * float-Float
         * double-Double
         * boolean-Boolean
         * char-Character
         *
         * 在平时的编程中,Java会自动帮你将一些基本数据类型在需要的时候转变成其相应的对象
         * 这一过程称作自动装箱,Ex:
         * int i = 233;
         * s.push(i); 调用这个方法时Java就会将int i自动装箱成Integer i
         *
         * Java在必要时自动将对象转换为基本数据类型,这个过程称为开箱,Ex:
         * int i = s.pop();
         */


        //Week 12 - 2022-11-14 -> 2022-11-18 Lecture 16 - Collections  02 - Data Structures

        /*
         * 本节内容已自学了一部分
         * Collection类在使用时需要导入java.util
         */


        //Week 12 - 2022-11-14 -> 2022-11-18 Lecture 16 - Collections  03 - Lists

        /*
         * List接口的实现类全依赖于索引(index)进行数据的查找和删减
         * List的实现类有ArrayList,Vector,LinkedList
         * 以下为List接口中的方法:
         */
/*
public boolean add(E e);
public void add(int index,E e);
public boolean addAll(Collection<E> c);
public boolean addAll(int index,Collection<E> c);
public E set(int index,E e);
public E get(int index);
public void clear();
public int size();
public void sort(Comparator<E> c);
public boolean contains(Object e);
public boolean isEmpty();
同时,List接口也继承(?)实现了Iterable(迭代器):
public Iterator<E> iterator(); //用于遍历列表
public boolean remove(Object e);
public E remove(int index);
public int indexOf(Object o); //用于查找某对象在集合中的位置

 */

        //Week 12 - 2022-11-14 -> 2022-11-18 Lecture 16 - Collections  04 - Maps

        /*
         * Map代表着双列集合,它的实现类似于Python中的dictionary
         * Map的实现类有:HashMap,TreeMap,EnumMap
         * 以下为Map接口中的方法:
         */
/*
public V put(K key, V value);
public void putAll(Map<K,V> m);
public void putIfAbsent(K key, V value);
public V replace(K key,V value);
public V get(Object key); //通过key查找其保存的数值
public V getOrDefault(Object key, V defaultValue);//通过key查找其保存的数值,如果所查找的数值不存在,为了避免保存,Java会返还V defaultValue
public Collection<V> values();//我们可以从一个map中得到储存在里面的全部values并返还给一个集合中???
public Set<K> keySet(); //将会返还一个Set,它包含了Map中的所有的key值
public Set<Map.Entry<K,V>> entrySet(); //好像能用于访问Map中所有key=K,value=V的元素
public void clear();
public int size();
public boolean containsKey(Object key);
public boolean containsValue(Object value);
public boolean isEmpty();
 */

        //Week 12 - 2022-11-14 -> 2022-11-18 Lecture 16 - Collections  05 - Array Algorithms

        /*
         * 本节讲细说一下Arrays类中提供的一些有用的方法
         *
         * Arrays中提供了许多将元素排序的方法
         * 除了对基本数据类型的排序,Arrays也提供对对象的排序,这些方法是基于Comparable和Comparator接口实现的
         * Arrays提供了更有效的搜索方法,但数据必须事先排序
         *
         * Arrays.sort(arrName); 这个类方法能够实现将一个int[]内的数值排序
         *
         * 如果想实现对象间的排序,我们可以实现Comparable接口,之后重写compareTo方法,使其返还要比较的内容(比如实例变量)
         * 之后我们就能对一个实现了Comparable的实现类使用sort方法了
         * 比如我们在Student类中实现了Comparable接口,之后重写了compareTo方法,令其返还name.compareTo(o.name):
         * public int compareTo(Student o){
         *     return name.compareTo(o.name);
         * }
         * return 正数: 表示this.实例变量 > o.实例变量; return 0: 表示this.实例变量 = o.实例变量; return 负数: 表示this.实例变量 < o.实例变量;
         * 此时Student类的对象就可以使用sort方法了:
         * Student[] students = new Student[]{
         * new Student("B",36),
         * new Student("A",37),
         * new Student("D",18),
         * new Student("C",21)
         * }
         * Arrays.sort(students);此时数组内的学生对象将按照实例变量name的字母的顺序排列
         *
         * 如果我们无法实现Comparable接口,我们可以实现Comparator接口
         * comparator是一个独立的对象，它将比较两个参数并告诉我们顺序
         * Ex:
         * public int compare(Student o1, Student o2){
         *     return Integer.compare(o1.age,o2.age); //o1.age和o2.age的前后顺序决定了比较sort时排序的顺序(比如o1.age=10,o2.age=12,那么就是年龄小的在前)
         * }
         * 在重写了compare方法后,类似地,我们也可以对一个Student[]使用Arrays.sort()方法
         */


        //Week 12 - 2022-11-14 -> 2022-11-18 Lecture 16 - Collections  06 - List Algorithms

        /*
         * Collection类也定义了两种方法去为列表排序
         * 一种方法为为comparable的实现类提供的:
         * public static <T extends Comparable<T>> void sort(List<T> list);
         * 另一种是需要一个comparator对象作为参数:
         * public static <T> void sort(List<T> list, comparator<T> c);
         */
    }
}
