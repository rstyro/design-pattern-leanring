# Design-Pattern 学习笔记
```
'  ██████╗ ███████╗███████╗██╗ ██████╗ ███╗   ██╗    ██████╗  █████╗ ████████╗████████╗███████╗██████╗ ███╗   ██╗
'  ██╔══██╗██╔════╝██╔════╝██║██╔════╝ ████╗  ██║    ██╔══██╗██╔══██╗╚══██╔══╝╚══██╔══╝██╔════╝██╔══██╗████╗  ██║
'  ██║  ██║█████╗  ███████╗██║██║  ███╗██╔██╗ ██║    ██████╔╝███████║   ██║      ██║   █████╗  ██████╔╝██╔██╗ ██║
'  ██║  ██║██╔══╝  ╚════██║██║██║   ██║██║╚██╗██║    ██╔═══╝ ██╔══██║   ██║      ██║   ██╔══╝  ██╔══██╗██║╚██╗██║
'  ██████╔╝███████╗███████║██║╚██████╔╝██║ ╚████║    ██║     ██║  ██║   ██║      ██║   ███████╗██║  ██║██║ ╚████║
'  ╚═════╝ ╚══════╝╚══════╝╚═╝ ╚═════╝ ╚═╝  ╚═══╝    ╚═╝     ╚═╝  ╚═╝   ╚═╝      ╚═╝   ╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝
'                                                                                                                
```
## 设计模式是什么
百科：是一套被反复使用、多数人知晓的、经过分类的、代码设计经验的总结
## 设计模式有什么用
在项目开发中构建一个优秀的系统最困难之处不在于编码（coding），而是在早期做出的设计（design）上的决定。
设计是软件开发生命周期中的关键阶段，好的设计能产生好的产品，而不当的设计则会影响最终产品的质量。
设计模式是拥有多年开发设计经验的人给我们的经验传承，它是作为专家的建议而引入的，它背后的真正威力是其对真实世界的抽象。
如果我们没有足够的经验，我们很难做出好的设计，但是富有经验的开发者和设计者以设计模式的形式将他们的经验传授给我们，拥有了这些经验之后，我们也能做出好的设计来了。
不仅如此，设计模式还提高了我们软件复用的水平，从而提高了生产效率

### 设计模式的六大原则
+ 单一职责原则  
定义：不要存在多于一个导致类变更的原因。通俗的说，即一个类只负责一项职责。  
遵循单一职责原的优点有：
    + 可以降低类的复杂度，一个类只负责一项职责，其逻辑肯定要比负责多项职责简单的多；
    + 提高类的可读性，提高系统的可维护性；
    + 变更引起的风险降低，变更是必然的，如果单一职责原则遵守的好，当修改一个功能时，可以显著降低对其他功能的影响。
+ 里氏替换原则  
    定义：所有引用基类的地方必须能透明地使用其子类的对象。  
    通俗讲就是：子类可以扩展父类的功能，但不能改变父类原有的功能
+ 依赖倒置原则  
    定义：高层模块不应该依赖低层模块，二者都应该依赖其抽象；抽象不应该依赖细节；细节应该依赖抽象。  
    依赖倒置原则的核心就是要我们面向接口编程，理解了面向接口编程，也就理解了依赖倒置  
    通俗的讲就是：降低类之间的耦合性，提高系统的稳定性  
+ 接口隔离原则  
定义：客户端不应该依赖它不需要的接口；一个类对另一个类的依赖应该建立在最小的接口上。  
简单的说就是：  
将臃肿的接口拆分为独立的几个接口，提高内聚，减少对外交互，接口尽量小，但是要有限度。但是如果过小，则会造成接口数量过多，使设计复杂化。所以一定要适度。
+ 迪米特法则  
    定义：一个对象应该对其他对象保持最少的了解。  
    通俗讲就是：尽量降低类与类之间的耦合。
+ 开闭原则  
    定义：一个软件实体如类、模块和函数应该对扩展开放，对修改关闭。  
    简单理解：当软件需要变化时，尽量通过扩展软件实体的行为来实现变化，而不是通过修改已有的代码来实现变化。


## 设计模式列表：  
23 种设计模式，可分三大类别
### 创建型模式
+ 工厂模式（Factory Pattern）
+ 抽象工厂模式（Abstract Factory Pattern）
+ 单例模式（Singleton Pattern）
+ 建造者模式（Builder Pattern）
+ 原型模式（Prototype Pattern）
 	
### 结构型模式
+ 适配器模式（Adapter Pattern）
+ 桥接模式（Bridge Pattern）
+ 过滤器模式（Filter、Criteria Pattern）
+ 组合模式（Composite Pattern）
+ 装饰器模式（Decorator Pattern）
+ 外观模式（Facade Pattern）
+ 享元模式（Flyweight Pattern）
+ 代理模式（Proxy Pattern）
	
### 行为型模式
+ 责任链模式（Chain of Responsibility Pattern）
+ 命令模式（Command Pattern）
+ 解释器模式（Interpreter Pattern）
+ 迭代器模式（Iterator Pattern）
+ 中介者模式（Mediator Pattern）
+ 备忘录模式（Memento Pattern）
+ 观察者模式（Observer Pattern）
+ 状态模式（State Pattern）
+ 空对象模式（Null Object Pattern）
+ 策略模式（Strategy Pattern）
+ 模板模式（Template Pattern）
+ 访问者模式（Visitor Pattern）

## 一、工厂模式（Factory Pattern）
定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。  
优点：  
 1、一个调用者想创建一个对象，只要知道其名称就可以了。  
 2、扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。  
 3、屏蔽产品的具体实现，调用者只关心产品的接口。
 
缺点：  
每次增加一个产品时，都需要增加一个具体类和对象实现工厂，使得系统中类的个数成倍增加，  
在一定程度上增加了系统的复杂度，同时也增加了系统具体类的依赖。这并不是什么好事。
代码实现：  
```java
public interface Fruits {
    public String getFruits();
}

public class Banana implements Fruits {
    public String getFruits() {
        return "香蕉";
    }
}

public class Lemon implements Fruits {
    public String getFruits() {
        return "柠檬";
    }
}

public class Orange implements Fruits {
    public String getFruits() {
        return "橙子";
    }
}

public class Pear implements Fruits {
    public String getFruits() {
        return "梨子";
    }
}

public class FruitsFactory {
    public Fruits getFruits(String name){
        if("banana".equalsIgnoreCase(name)){
            return new Banana();
        }else if("lemon".equalsIgnoreCase(name)){
            return new Lemon();
        }else if("orange".equalsIgnoreCase(name)){
            return new Orange();
        }else if("pear".equalsIgnoreCase(name)){
            return new Pear();
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        FruitsFactory fruitsFactory = new FruitsFactory();
		//需要什么水果直接从工厂里面取即可
        Fruits fruits = fruitsFactory.getFruits("orange");
        System.out.println(fruits.getFruits());

        fruits = fruitsFactory.getFruits("banana");
        System.out.println(fruits.getFruits());

        fruits = fruitsFactory.getFruits("pear");
        System.out.println(fruits.getFruits());

        fruits = fruitsFactory.getFruits("lemon");
        System.out.println(fruits.getFruits());
    }
}
```
## 二、抽象工厂模式
抽象工厂模式 是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式.  
抽象工厂模式是工厂方法模式的升级版本，他用来创建一组相关或者相互依赖的对象。他与工厂方法模式的区别就在于，工厂方法模式针对的是一个产品等级结构；  而抽象工厂模式则是针对的多个产品等级结构。在编程中，通常一个产品结构，表现为一个接口或者抽象类，也就是说，工厂方法模式提供的所有产品都是衍生自同一个接口或抽象类，而抽象工厂模式所提供的产品则是衍生自不同的接口或抽象类  


## 三、单例模式
单例应该是最简单的设计模式之一了。  
优点：  
在内存中只有一个对象，节省内存空间。避免频繁的创建销毁对象，可以提高性能。避免对共享资源的多重占用。可以全局访问。  
缺点：  
没有接口，不能继承，与单一职责原则冲突，一个类应该只关心内部逻辑，而不关心外面怎么样来实例化。
单例模式根据实例化对象时机的不同分为两种：  
一种是饿汉式单例，一种是懒汉式单例。  
饿汉式单例在单例类被加载时候，就实例化一个对象交给自己的引用；而懒汉式在调用取得实例方法的时候才会实例化对象
```java
/**
 * 饿汉式单例
 */
public class SingleonHunger {
    private static SingleonHunger singleonLazy = new SingleonHunger();

    private SingleonHunger(){}
    public static SingleonHunger getInstance(){
        return singleonLazy;
    }

    public void show(){
        System.out.println("这是一个展示方法");
    }
}

/**
 * 懒汉式单例
 */
public class SingleonLazy {
    private static SingleonLazy singleonLazy;

    private SingleonLazy(){}
    public static SingleonLazy getInstance(){
        if(singleonLazy == null){
            synchronized (SingleonLazy.class){
                if(singleonLazy == null) {
                    singleonLazy = new SingleonLazy();
                }
            }
        }
        return singleonLazy;
    }

    public void show(){
        System.out.println("这是一个展示方法");
    }
}

/**
* demo
*/
public class Main {
    public static void main(String[] args) {
        SingleonLazy singleonLazy = SingleonLazy.getInstance();
        singleonLazy.show();

        SingleonHunger singleonHunger = SingleonHunger.getInstance();
        singleonHunger.show();
    }
}
```

## 四、建造者模式
使用多个简单的对象一步一步构建成一个复杂的对象。  
比如吃饭，可以单点一份饭，也可以点套餐（饭+汤+小吃），多种饭，可以组成多种套餐，部分代码如下
```java

public class MealBuilder {

    public Meal chickenMeal(){
        List<Item> items = new ArrayList<>();
        Item burger = new ChickenBurger();
        Item drink = new Coke();
        items.add(burger);
        items.add(drink);
        Meal meal = new Meal();
        meal.setItems(items);
        meal.setMealName("鸡肉套餐");
        return meal;
    }

    public Meal vegetableMeal(){
        List<Item> items = new ArrayList<>();
        Item burger = new VegetableBurger();
        Item drink = new Milk();
        items.add(burger);
        items.add(drink);
        Meal meal = new Meal();
        meal.setItems(items);
        meal.setMealName("蔬菜套餐");
        return meal;
    }
}
```

## 五、原型模式  
用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。当直接创建对象的代价比较大时，则采用这种模式.  
代码思路：实现Cloneable 接口，重写 clone() 方法，demo 如下：
```java
public abstract class Shape implements Cloneable{
    private Integer id;
    public String name;
    abstract  void draw();

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

public class Circle extends  Shape{
    public Circle(){
        this.name="圆形";
    }
    @Override
    void draw() {
        System.out.println("draw menthod");
    }
}

```

## 六、适配器模式
适配器模式（Adapter Pattern）是作为两个不兼容的接口之间的桥梁  
优点： 1、可以让任何两个没有关联的类一起运行。 2、提高了类的复用。 3、增加了类的透明度。 4、灵活性好。  
缺点： 1、过多地使用适配器，会让系统非常零乱，不易整体进行把握。比如，明明看到调用的是 A 接口，其实内部被适配成了 B 接口的实现，一个系统如果太多出现这种情况，无异于一场灾难。因此如果不是很有必要，可以不使用适配器，而是直接对系统进行重构。 2.由于 JAVA 至多继承一个类，所以至多只能适配一个适配者类，而且目标类必须是抽象类。
```java

public interface MediaPlayer {
    public void play(String audioType, String fileName);
}

public interface AdvancedMediaPlayer {
    public void playVlc(String fileName);
    public void playMp4(String fileName);
}


public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
    }
    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}

// 适配器
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}

// 最终的多媒体播放器
public class AudioPlayer implements MediaPlayer {

    //适配器
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        //播放 mp3 音乐文件的内置支持
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else{
            System.err.println("Invalid media. "+  audioType + " format not supported");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
```

## 七、桥接模式
将抽象部分与实现部分分离，使它们都可以独立的变化。  
有多种可能会变化的情况下，用继承会造成类爆炸问题，扩展起来不灵活。所以可以多角度分类分离出来，让它们独立变化，减少它们之间耦合
```java

/**
 * 画画 API
 */
public interface DrawAPI {
    public void drawCircle(int radius, int x, int y);
}

// 抽象一个形状接口
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}

//画绿色
public class GreenDraw implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println(String.format("draw Cricle color:green,radius=%s,x=%s,y=%s", radius,x,y));
    }
}

//画红色
public class RedDraw implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println(String.format("draw Cricle color:red ,radius=%s,x=%s,y=%s",radius,x,y));
    }
}

// 一个圆
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedDraw());
        Shape greenCircle = new Circle(-100,100, 10, new GreenDraw());

        redCircle.draw();
        greenCircle.draw();
    }
}
```
## 八、过滤器模式
顾名思义就是筛选出符合条件的数据。  
下面的例子，就是从一推人中，过滤获取到 单身的人 和 性别是女性的人，然后再 过滤 单身并且是女性的集合
```java

@Data
@AllArgsConstructor
public class Person {
    private String name;
    // 1 -- 男，0 -- 女
    private int gender;

    private boolean isMarry;
}


public interface Filter {
    public List<Person> filterPerson(List<Person> persons);
}
/**
 * 筛选 所有单身的
 */
public class SingleFilter implements Filter {
    @Override
    public List<Person> filterPerson(List<Person> persons) {
        List<Person> result = new ArrayList<>();
        for(Person person:persons){
            if(!person.isMarry()){
                result.add(person);
            }
        }
        return result;
    }
}
/**
 * 获取所有女性
 */
public class FemaleFilter implements Filter {
    @Override
    public List<Person> filterPerson(List<Person> persons) {
        List<Person> result = new ArrayList<>();
        for(Person person:persons){
            if(person.getGender() == 0){
                result.add(person);
            }
        }
        return result;
    }
}

/**
 * 并集 过滤器
 */
public class AddFilter implements Filter {

    private Filter one;
    private Filter two;

    public AddFilter(Filter one, Filter two) {
        this.one=one;
        this.two=two;
    }

    @Override
    public List<Person> filterPerson(List<Person> persons) {
        List<Person> filterPerson1 = one.filterPerson(persons);
        return two.filterPerson(filterPerson1);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("刘一",0, false));
        persons.add(new Person("陈二",0, true));
        persons.add(new Person("张三",1, false));
        persons.add(new Person("李四",1, true));
        persons.add(new Person("王五",0, false));
        persons.add(new Person("赵六",0, false));
        persons.add(new Person("孙七",1, true));
        persons.add(new Person("周八",0, false));
        persons.add(new Person("吴九",1, false));
        persons.add(new Person("郑十",1, true));

        Filter singleFilter = new SingleFilter();
        Filter femaleFilter = new FemaleFilter();

        //所有单身女士
        Filter singleFemaleFilter = new AddFilter(singleFilter,femaleFilter);

        System.out.println("\n还单身的女士:");
        List<Person> singleFemale = singleFemaleFilter.filterPerson(persons);
        printPersons(singleFemale);
    }
}

```

## 九、组合模式
组合模式，就是在一个对象中包含其他对象，这些被包含的对象可能是终点对象（不再包含别的对象），也有可能是非终点对象（其内部还包含其他对象，或叫组对象），我们将对象称为节点，即一个根节点包含许多子节点，这些子节点有的不再包含子节点，而有的仍然包含子节点，以此类推。  
就跟电脑的磁盘很像，磁盘下有很多文件夹或文件，然后文件夹下又有文件或文件夹.....
又如公司，老板之下有主管经理，之下还有组长员工...
```java

@Data
@ToString
@AllArgsConstructor
public class Employee {
    /**
     * 职称
     */
    private String name;
    /**
     * 部门
     */
    private String dept;
    /**
     * 薪水
     */
    private int salary;

    /**
     * 手下
     */
    private List<Employee> subordinates;

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public void showMeInfo(int index){
        String tt = "";
        for (int i = 0; i < index; i++) {
            tt=tt+"\t";
        }
        System.out.println(tt+"name="+name+",dept="+dept+",salary="+salary);
        index++;
        for (Employee employee:subordinates){
            employee.showMeInfo(index);
        }
    }
}

//公司示例：
public class Main {
    public static void main(String[] args) {
        Employee CEO = new Employee("John","CEO", 30000,new ArrayList<Employee>());

        Employee headSales = new Employee("Robert","Head Sales", 20000,new ArrayList<Employee>());

        Employee headMarketing = new Employee("Michel","Head Marketing", 20000,new ArrayList<Employee>());

        Employee clerk1 = new Employee("Laura","Marketing", 10000,new ArrayList<Employee>());
        Employee clerk2 = new Employee("Bob","Marketing", 10000,new ArrayList<Employee>());

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000,new ArrayList<Employee>());
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000,new ArrayList<Employee>());

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //打印该组织的所有员工
        CEO.showMeInfo(0);
    }
}

```

## 十、装饰器模式
装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。  
这种模式创建了一个装饰类，用来包装原有的类，并在保持类方法签名完整性的前提下，提供了额外的功能，动态地给一个对象添加一些额外的职责。就增加功能来说，装饰器模式相比生成子类更为灵活。  
优点：装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能。  
缺点：多层装饰比较复杂。

## 十一、外观模式
隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口  
```java
// 接口
public interface Shape {
    public void draw();
}
// 具体实现
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个圆形");
    }
}

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个方形");
    }
}
/**
 * 对外暴露的方法
 */
public class ShapeMarker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMarker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }
    public void drawCircle(){
        this.circle.draw();
    }
    public void drawRectangele(){
        this.rectangle.draw();
    }
    public void drawSquare(){
        this.square.draw();
    }
}
//示例
public class Main {
    public static void main(String[] args) {
        ShapeMarker shapeMarker = new ShapeMarker();

        shapeMarker.drawCircle();
        shapeMarker.drawRectangele();
        shapeMarker.drawSquare();
    }
}

```
## 十二、享元模式
享元模式，换句话说就是共享对象，在某些对象需要重复创建，且最终只需要得到单一结果的情况下使用。因为此种模式是利用先前创建的已有对象，通过某种规则去判断当前所需对象是否可以利用原有对象做相应修改后得到想要的效果，如以下教程的实例，创建了20个不同效果的圆，但相同颜色的圆只需要创建一次便可，相同颜色的只需要引用原有对象，改变其坐标值便可。此种模式下，同一颜色的圆虽然位置不同，但其地址都是同一个，所以说此模式适用于结果注重单一结果的情况。  
```java
public interface Shape {
    void draw();
}

public class Circle implements Shape {

    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color){
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                +", x : " + x +", y :" + y +", radius :" + radius);
    }
}

public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}

//示例
public class Main {

    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

    public static void main(String[] args) {
        for(int i=0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
```
打印结果：
```
Creating circle of color : White
Circle: Draw() [Color : White, x : 23, y :19, radius :100
Creating circle of color : Blue
Circle: Draw() [Color : Blue, x : 50, y :93, radius :100
Circle: Draw() [Color : Blue, x : 64, y :11, radius :100
Circle: Draw() [Color : White, x : 55, y :95, radius :100
Creating circle of color : Red
Circle: Draw() [Color : Red, x : 70, y :27, radius :100
Creating circle of color : Green
Circle: Draw() [Color : Green, x : 21, y :95, radius :100
Circle: Draw() [Color : Green, x : 51, y :72, radius :100
Creating circle of color : Black
Circle: Draw() [Color : Black, x : 6, y :82, radius :100
Circle: Draw() [Color : Green, x : 93, y :47, radius :100
Circle: Draw() [Color : Black, x : 42, y :18, radius :100
Circle: Draw() [Color : Red, x : 33, y :94, radius :100
Circle: Draw() [Color : Blue, x : 84, y :64, radius :100
Circle: Draw() [Color : Black, x : 86, y :30, radius :100
Circle: Draw() [Color : Black, x : 57, y :80, radius :100
Circle: Draw() [Color : White, x : 9, y :18, radius :100
Circle: Draw() [Color : Green, x : 30, y :83, radius :100
Circle: Draw() [Color : Black, x : 81, y :43, radius :100
Circle: Draw() [Color : White, x : 40, y :69, radius :100
Circle: Draw() [Color : Black, x : 83, y :47, radius :100
Circle: Draw() [Color : Green, x : 55, y :53, radius :100
```

优点：大大减少对象的创建，降低系统的内存，使效率提高。  
缺点：提高了系统的复杂度，需要分离出外部状态和内部状态，而且外部状态具有固有化的性质，不应该随着内部状态的变化而变化，否则会造成系统的混乱。  


## 十三、代理模式 
为其他对象提供一种代理以控制对这个对象的访问,我们创建具有现有对象的对象，以便向外界提供功能接口  
比如要找 仙剑大佬 - 胡歌 表演、拍戏，直接通过经纪人谈即可。  
抽象一个 明星 接口
```java
/**
 * 明星 接口
 */
public interface Star {
    public void sing(String name);
    public void dance();
}

/**
 * 具体明星：胡歌，要访问的对象
 */
public class HuGe implements Star {
    @Override
    public void sing(String name) {
        System.out.println("胡歌 唱歌："+name);
    }

    @Override
    public void dance() {
        System.out.println("胡歌 跳舞");
    }
}

/**
* 胡歌经纪人，代理类
*/
public class HugeProxy implements Star {

    private Star huge = new Huge();

    @Override
    public void sing(String name) {
        huge.sing(name);
    }

    @Override
    public void dance() {
        huge.dance();
    }
}
//示例
public class Main {
    public static void main(String[] args) {
        Star huge = new HugeProxy();
        huge.sing("六月的雨");
        huge.dance();
    }
}
```
上面就是简单的静态代理。  
静态代理在使用时,需要定义接口或者父类,被代理对象与代理对象一起实现相同的接口或者是继承相同父类.  
优点：可以做到在不修改目标对象的功能前提下,对目标功能扩展.  
缺点:因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.同时,一旦接口增加方法,目标对象与代理对象都要维护.  
要解决上述缺点，可以使用动态代理  
#### 动态代理有以下特点:  
+ 代理对象,不需要实现接口  
+ 代理对象的生成,是利用JDK的API,动态的在内存中构建代理对象(需要我们指定创建代理对象/目标对象实现的接口的类型)  
+ 动态代理也叫做:JDK代理,接口代理  

只需改变代理类即可  
```java

public class HuGeProxy {
    private Star huGe = new HuGe();

    public Star getProxy(){

        //使用Proxy.newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)返回某个对象的代理对象
        /**
         * ClassLoader loader:Java类加载器; 可以通过这个类型的加载器，在程序运行时，将生成的代理类加载到JVM即Java虚拟机中，以便运行时需要！
         * Class<?>[] interfaces:被代理类的所有接口信息; 便于生成的代理类可以具有代理类接口中的所有方法
         * InvocationHandler h:调用处理器; 调用实现了InvocationHandler 类的一个回调方法
         * */


        return (Star) Proxy.newProxyInstance(this.getClass().getClassLoader(), huGe.getClass().getInterfaces(), new InvocationHandler() {


            /**
             * InvocationHandler接口只定义了一个invoke方法，因此对于这样的接口，我们不用单独去定义一个类来实现该接口，
             * 而是直接使用一个匿名内部类来实现该接口，new InvocationHandler() {}就是针对InvocationHandler接口的匿名实现类
             */
            /**
             * 在invoke方法编码指定返回的代理对象干的工作
             * proxy : 把代理对象自己传递进来
             * method：把代理对象当前调用的方法传递进来
             * args:把方法参数传递进来
             *
             * 当调用代理对象的star.sing("逍遥叹");或者 star.dance()方法时，
             * 实际上执行的都是invoke方法里面的代码，
             * 因此我们可以在invoke方法中使用method.getName()就可以知道当前调用的是代理对象的哪个方法
             */

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if(method.getName().equals("sing")){
                    System.out.println("这是胡歌唱歌前代理要做的事情");
                    return method.invoke(huGe,args);
                }else if(method.getName().equals("dance")){
                    System.out.println("这是胡歌跳舞前代理要做的事情");
                    return method.invoke(huGe,args);
                }
                return null;
            }
        });
    }
}
```
代理对象不需要实现接口,但是目标对象一定要实现接口,否则不能用动态代理

## 十四、责任链模式
通常每个接收者都包含对另一个接收者的引用。如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者，依此类推。  
就比如项目中，有些请求我们会加一些过滤器，如果编码过滤器、敏感词过滤器、加解密过滤器等等  
优点： 
+ 1、降低耦合度。它将请求的发送者和接收者解耦。 
+ 2、简化了对象。使得对象不需要知道链的结构。
+ 3、增强给对象指派职责的灵活性。通过改变链内的成员或者调动它们的次序，允许动态地新增或者删除责任。 
+ 4、增加新的请求处理类很方便。

缺点： 
+ 1、不能保证请求一定被接收。 
+ 2、系统性能将受到一定影响，而且在进行代码调试时不太方便，可能会造成循环调用。 
+ 3、可能不容易观察运行时的特征，有碍于除错。  
代码示例

```java
public interface Filter {
    void doFilter(Request request, Response response, FilterChain chain);
}

public class CharsetFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println(request.getParameter()+"编码过滤");
        chain.doFilter(request,response,chain);
    }
}

public class SensitiveFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println(request.getParameter()+"敏感词过滤");
        chain.doFilter(request,response,chain);
    }
}

public class OtherFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println(request.getParameter()+"其他过滤");
        chain.doFilter(request,response,chain);
    }
}

// 过滤器的链
public class FilterChain implements Filter {
    //用List集合来存储过滤规则
    List<Filter> filters = new ArrayList<Filter>();

    //用于标记规则的引用顺序
    int index=0;

    //往规则链条中添加规则
    public FilterChain addFilter(Filter f) {
        filters.add(f);
        //代码的设计技巧:Chain链添加过滤规则结束后返回添加后的Chain，方便我们下面doFilter函数的操作
        return this;
    }
    public void doFilter(Request request,Response response,FilterChain chain){
        //index初始化为0,
        if(index==filters.size()){
            return;
        }
        //每添加一个过滤规则，index自增1
        Filter f=filters.get(index);
        index++;
        //根据索引值获取对应的规律规则对字符串进行处理
        f.doFilter(request, response, chain);
    }
}

// 示例
public class Main {
    public static void main(String[] args) {
        FilterChain chain = new FilterChain();
        chain.addFilter(new CharsetFilter()).addFilter(new SensitiveFilter()).addFilter(new OtherFilter());
        chain.doFilter(new Request("test"),new Response(),chain);
    }
}
```

## 十五、命令模式
以命令的形式包裹在对象中，并传给调用对象。调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令  
就比如睡觉的时候，你女朋友叫你`关灯`，这就是一条`命令`。那么你就会去调用`灯`的`开关按钮`去执行`命令`内容  
代码示例：
```java
/**
 * 抽象命令接口Command：
 */
public interface Command {
    /**
     * 执行命令的接口
     */
    void execute();
}

/**
 * 传递命令对象 Invoker
 */
public class Xiaoming {


    private Command command;

    /**
     * 设置命令
     * @param command
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 执行命令
     */
    public void doCommand(){
        command.execute();
    }
}

/**
 *  接受者对象Receiver：
 */
public class Light {

    /**
     * 开灯方法
     */
    public void lightOn() {
        System.out.println("灯打开了！！");
    }

    /**
     * 关灯方法
     */
    public void lightOff() {
        System.out.println("灯关上了！！");
    }

}

/**
 * 具体的命令对象ConcreteCommand：：关灯命令
 */
public class LightOffCommand implements Command {

    private Light light;

    /**
     * 创建关灯命令的时候，传入具体的灯对象，由灯对象操作自己
     * @param light
     */
    public LightOffCommand(Light light){
        this.light=light;
    }

    /**
     * 具体的灯对象调用自己的关灯方法
     */
    @Override
    public void execute() {
        light.lightOff();
    }
}

/**
 * 具体的命令对象ConcreteCommand：：开灯命令
 */
public class LightOnCommand implements Command {
    private Light light;
    /**
     * 创建开灯命令的时候，传入具体的灯对象，由灯对象操作自己
     * @param light
     */
    public LightOnCommand(Light light){
        this.light=light;
    }
    /**
     * 具体的灯对象调用自己的开灯方法
     */
    @Override
    public void execute() {
        light.lightOn();
    }
}

public class Main {
    public static void main(String[] args) {
        Xiaoming xiaoming = new Xiaoming();
        // 创建具体的等对象，相当于具体的命令接受者
        Light light = new Light();
        // 创建了开灯的命令，你就是命令的发起者
        System.out.println("小明，帮我把灯开一下！");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        // 小明同学接受到了你发出的命令,并执行命令
        xiaoming.setCommand(lightOnCommand);
        xiaoming.doCommand();

        System.out.println("-------------------------------------------------");
        System.out.println("小明，帮我关一下灯！");
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        xiaoming.setCommand(lightOffCommand);
        xiaoming.doCommand();
    }
}
```
优点： 1、降低了系统耦合度。 2、新的命令可以很容易添加到系统中去。  
缺点：使用命令模式可能会导致某些系统有过多的具体命令类。  

## 十六、解释器模式
1、可以将一个需要解释执行的语言中的句子表示为一个抽象语法树。  
2、一些重复出现的问题可以用一种简单的语言来进行表达。  
3、一个简单语法需要解释的场景  
```java
/**
 * 抽象表达式(Expression)角色
 */
public interface Expression {
    public boolean interpret(String context);
}

/**
 * 终结符表达式(Terminal Expression)角色
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
/**
 * 非终结符表达式
 */
public class AndExpression implements Expression {
    private Expression expr1 = null;
    private Expression expr2 = null;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
/**
 * 非终结符表达式
 */
public class OrExpression implements Expression {
    private Expression expr1 = null;
    private Expression expr2 = null;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}

//执行
public class Main {

    //规则：Robert 和 John 是男性
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //规则：Julie 是一个已婚的女性
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
    }
}
```

## 十七、迭代器模式
提供一种方法顺序访问一个聚合对象中的各种元素，而又不暴露该对象的内部表示  
在Java 中，遍历集合的时候，很常用：`Collection.iterator()` 即可得到一个 迭代器。  
看简单的实现  
```java
/**
 * 迭代器角色
 */
public interface Iterator {
    public boolean hasNext();
    public Object next();
}

/**
 * 容器角色
 */
public interface Container {
    public Iterator getIterator();
}

// 容器的实现类
public class NameRepository implements Container {
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    /**
     * 具体容器角色
     */
    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
// 执行
public class Main {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
```
## 十八、中介者模式
中介者模式是用来降低多个对象和类之间的通信复杂性，处理不同类之间的通信，并支持松耦合，使代码易于维护  
在现实生活中，有很多中介者模式的身影，例如QQ游戏平台、微信，聊天室、QQ群、短信平台和房产中介。  
就说微信吧，几乎天天都要用吧，在我们和朋友聊天的时候，它就充当一个中介的角色。通过它我们就可以和朋友远程联系。  
讲着讲着，感觉和代理模式、外观模式 有点像。  区别如下  
+ 中介者模式：  
A，B之间的对话通过C来传达。A,B可以互相不认识（减少了A和B对象间的耦合）
+ 代理模式：  
A要送B礼物，A,B互相不认识，那么A可以找C来帮它实现送礼物的愿望（封装了A对象）
+ 外观模式：  
A和B都要实现送花，送巧克力的方法，那么我可以通过一个抽象类C实现送花送巧克力的方法（A和B都继承C）。（封装了A，B子类）  
代理模式和外观者模式这两种模式主要不同就是代理模式针对的是单个对象，而外观模式针对的是所有子类  

看看中介模式的代码示例：
```java
@Data
public class User {
    private String name;
	
    public User(String name) {
        this.name = name;
    }
    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}

/**
 * 中介，微信聊天室
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()  + " [" + user.getName() +"] : " + message);
    }
}

// 交流
public class Main {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        // 通过weChar聊天室 把信息展示出来
        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
```
## 十九、备忘录模式
保存一个对象的某个状态，以便在适当的时候恢复对象  
玩过单机版游戏的大佬应该深有体会，那就是游戏存档。比如游戏到达某一关卡时会自动存档，或者当你退出游戏的时候手动存档  
来看看代码示例：  
```java
/**
 * 备忘录的类，可以回退的类
 *
 */
@Data
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }
}

@Data
public class Originator {
    private String state;

    // 存档
    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}

/**
 * 管理类
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}

/**
 * 备忘录 模式
 * 保存一个对象的某个状态，以便在适当的时候恢复对象
 *
 */
public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");	// 通第1关
        originator.setState("State #2");	// 通第2关
        careTaker.add(originator.saveStateToMemento());		// 存档 2关
        originator.setState("State #3");	// 通第3关
        careTaker.add(originator.saveStateToMemento());// 存档 3关
        originator.setState("State #4");	// 通第4关

        System.out.println("Current State: " + originator.getState());	//打印当前 关卡 数 第4关
        originator.getStateFromMemento(careTaker.get(0));		// 获取第一次 存档的 数据
        System.out.println("First saved State: " + originator.getState());	// 打印第一次存档关卡数 2关
        originator.getStateFromMemento(careTaker.get(1));		// 获取第二次 存档的 数据
        System.out.println("Second saved State: " + originator.getState());		//打印第二次存档关卡数	3关
    }
}
```
优点：   
    1、给用户提供了一种可以恢复状态的机制，可以使用户能够比较方便地回到某个历史的状态。  
    2、实现了信息的封装，使得用户不需要关心状态的保存细节。  
缺点：  
    消耗 资源。如果类的成员变量过多，势必会占用比较大的资源，而且每一次保存都会消耗一定的内存。  
 
## 二十、观察者模式
在对象之间定义了一对多的依赖，这样一来，当一个对象改变状态，依赖它的对象会收到通知并自动更新。  
其实就是发布订阅模式，发布者发布信息，订阅者获取信息，订阅了就能收到信息，没订阅就收不到信息。  
比如，`帅大叔` 微信订阅号，不定时发布一些消息，关注这个订阅号就可以收到推送消息，取消关注就收不到推送消息。  
代码示例：
```java
/**
 * 被观察者接口
 */
public interface Observerable {
    //订阅
    public void registerObserver(Observer o);
    // 取消订阅
    public void removeObserver(Observer o);
    //通知
    public void notifyObserver();
}

/**
 * 抽象观察者
 * 定义了一个update()方法，当被观察者调用notifyObservers()方法时，观察者的update()方法会被回调。
 */
public interface Observer {
    public void update(String message);
}

// 用户即是 观察者
@Data
public class User implements Observer {

    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message=message;
        read();
    }
    public void read() {
        System.out.println(name + " 收到推送消息： " + message);
    }
}

/**
 * 帅大叔 微信订阅号，也就是被观察的对象
 * 被观察者
 */
public class WechatServer implements Observerable {

    //注意到这个List集合的泛型参数为Observer接口，设计原则：面向接口编程而不是面向实现编程
    private List<Observer> list;
    private String message;

    public WechatServer() {
        this.list = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        this.list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(list != null && list.size()>0){

            if(o instanceof User){
                User u = (User) o;
                System.out.println(u.getName() + "取消了订阅");
            }

            list.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer o:list){
            o.update(this.message);
        }
    }

    // 更新消息
    public void setInfomation(String s) {
        this.message = s;
        System.out.println("微信服务更新消息： " + s);
        //消息更新，通知所有观察者
        notifyObserver();
    }

}

/**
 * 观察者模式
 */
public class Main {
    public static void main(String[] args) {
        WechatServer server = new WechatServer();

        Observer userZhang = new User("张三");
        Observer userLi = new User("李四");
        Observer userWang = new User("王五");

        server.registerObserver(userZhang);
        server.registerObserver(userLi);
        server.registerObserver(userWang);
        server.setInfomation("第一条信息：地球准备被黑洞吞噬了，全球人民逃离地球！");

        System.out.println("----------------------------------------------");
        server.removeObserver(userZhang);
        server.setInfomation("第二条信息：虚惊一场，原来是做梦");
    }
}
```
张三 收到了第一条信息，因为恐慌过度取消了关注，当第二条信息发布的时候，张三并没有收到   
优点：   
1、观察者和被观察者是抽象耦合的。 2、建立一套触发机制。  
缺点：   
1、如果一个被观察者对象有很多的直接和间接的观察者的话，将所有的观察者都通知到会花费很多时间。  
2、如果在观察者和观察目标之间有循环依赖的话，观察目标会触发它们之间进行循环调用，可能导致系统崩溃。  
3、观察者模式没有相应的机制让观察者知道所观察的目标对象是怎么发生变化的，而仅仅只是知道观察目标发生了变化。

## 二十一、状态模式 
在状态模式（State Pattern）中，类的行为是基于它的状态改变的。这种类型的设计模式属于行为型模式。  
在状态模式中，我们创建表示各种状态的对象和一个行为随着状态对象改变而改变的 context 对象。  
比如人，人有很多种情绪，喜怒哀乐。现实生活中，可能会遇到一些不如意的事，所以我们的情绪就会变化无常。  
代码如下：  
```java
/**
 * 状态接口，它定义了每一个状态的行为集合，这些行为会在Context中得以使用。
 */
public interface State {
    public void doAction();
}

/**
 * 它就是那个含有状态的对象，它可以处理一些请求，这些请求最终产生的响应会与状态相关
 */
@Data
public class Context {
    private State state;

    public Context() {
        this.state = new NormalState();
        getSate();
    }

    public void angry(){
        state = new AngryState();
        getSate();
    }
    public void happy(){
        state = new HappyState();
        getSate();
    }
    public void joy(){
        state = new JoyState();
        getSate();
    }
    public void sorrow(){
        state = new SorrowState();
        getSate();
    }
    public void getSate(){
        state.doAction();
    }
}

//具体状态，实现相关行为的具体状态类
@Data
@ToString
public class NormalState implements State {
    private String stateName;

    public void doAction() {
        this.setStateName("Normal State");
        System.out.println("今天和往常一样，过了一个平凡的一天");
    }
}
@Data
@ToString
public class HappyState implements State {
    private String stateName;

    public void doAction() {
        this.setStateName("Happy state");
        System.out.println("今天天气很好，我很开心");
    }
}

@Data
@ToString
public class AngryState implements State {
    private String stateName;
    @Override
    public void doAction() {
        this.setStateName("Angry State");
        System.out.println("别烦我，我现在很愤怒");
    }
}

@Data
@ToString
public class SorrowState implements State {
    private String stateName;

    public void doAction() {
        this.setStateName("Sorrow State");
        System.out.println("哎，我家的二狗生病了，好伤心");
    }
}
@Data
@ToString
public class JoyState implements State {
    private String stateName;

    public void doAction() {
        this.setStateName("Joy State");
        System.out.println("今天有人请吃海底捞，贼开心");
    }
}

// 生活变化
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        //切换状态
        context.angry();
        context.happy();
        context.joy();
        context.sorrow();
    }
}
```
通过Context 进行 状态的切换

## 二十二、空对象模式
一个空对象取代 NULL 对象实例的检查。Null 对象不是检查空值，而是反应一个不做任何动作的关系。这样的 Null 对象也可以在数据不可用的时候提供默认的行为  
为了解决什么问题：  
1、避免程序抛出NullPointerException异常  
2、去掉null 检查  
代码示例:
```java
/**
 * 抽象
 */
public abstract class AbstractCustomer {
    protected String name;
    public abstract boolean isNil();
    public abstract String getName();
}
/**
 * 具体的实现类
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name=name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}

public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "this is null Object not Available name";
    }
}
/**
 * 自定义工厂类
 */
public class CustomerFactory {
    public static final String[] names = {"Rob", "Joe", "Julie","张三","王五"};

    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("张三");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("李四");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("王五");
        AbstractCustomer customer5 = CustomerFactory.getCustomer("赵六");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
        System.out.println(customer5.getName());
    }
}
```
上面的代码，虽然工厂中没有找到`赵六`,但是程序并不会报错
## 二十三、策略模式
在策略模式（Strategy Pattern）中，一个类的行为或其算法可以在运行时更改。这种类型的设计模式属于行为型模式。  
在策略模式中，我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的 context 对象。策略对象改变 context 对象的执行算法。  
和状态模式有点像呢  
代码示例:  
```java
/**
 * 策略接口
 */
public interface Strategy {
    public int doOperation(int num1, int num2);
}
/**
 * 加 的操作
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1+num2;
    }
}
/**
 * 减 的操作
 */
public class OperationSub implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1-num2;
    }
}
/**
 * 乘 的操作
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
/**
 * 除 的操作
 */
public class OperationDivide implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 / num2;
    }
}

@Data
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public int execute(int num1, int num2){
        return  strategy.doOperation(num1,num2);
    }
}

// 改变策略，结果不同
public class Main {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 8;
        Context context = new Context(new OperationAdd());
        System.out.println(num1 +" + "+num2+" = "+context.execute(num1,num2));

        context = new Context(new OperationSub());
        System.out.println(num1 +" - "+num2+" = "+context.execute(num1,num2));

        context = new Context(new OperationMultiply());
        System.out.println(num1 +" * "+num2+" = "+context.execute(num1,num2));

        context = new Context(new OperationDivide());
        System.out.println(num1 +" / "+num2+" = "+context.execute(num1,num2));
    }
}
```
优点： 1、算法可以自由切换。 2、避免使用多重条件判断。 3、扩展性良好。  
缺点： 1、策略类会增多。 2、所有策略类都需要对外暴露。

## 二十四、模板模式
一个抽象类公开定义了执行它的方法的方式/模板。它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行  
定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。  
主要解决：一些方法通用，却在每一个子类都重新写了这一方法。  
```java
public abstract class Game {
    protected abstract void initialize();
    protected abstract void startPlay();
    protected abstract void endPlay();

    //模板
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
/**
 * 象棋游戏
 */
public class ChessGame extends Game {
    @Override
    protected void initialize() {
        System.out.println("创建一盘象棋");
    }

    @Override
    protected void startPlay() {
        System.out.println("开始下棋");
    }

    @Override
    protected void endPlay() {
        System.out.println("获得胜利，游戏结束");
    }


}
/**
 * 围棋游戏
 */
public class WeiQiGame extends Game {
    @Override
    protected void initialize() {
        System.out.println("创建一盘围棋");
    }

    @Override
    protected void startPlay() {
        System.out.println("开始下棋");
    }

    @Override
    protected void endPlay() {
        System.out.println("获得胜利，游戏结束");
    }
}
public class Main {

    public static void main(String[] args) {
        Game game = new ChessGame();
        game.play();

        System.out.println("===============");
        game = new WeiQiGame();
        game.play();
    }
}
```

优点：  
 1、封装不变部分，扩展可变部分。   
 2、提取公共代码，便于维护。   
 3、行为由父类控制，子类实现。  

缺点：  
每一个不同的实现都需要一个子类来实现，导致类的个数增加，使得系统更加庞大。
 
## 二十五、访问者模式
我们使用了一个访问者类，它改变了元素类的执行算法,通过这种方式，元素的执行算法可以随着访问者改变而改变。
这种类型的设计模式属于行为型模式。根据模式，元素对象已接受访问者对象，这样访问者对象就可以处理元素对象上的操作。  
以，电脑、鼠标、键盘、显示器 举例，代码如下：  
```java
/**
 * 表示元素的接口。
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
// 如下 具体的元素
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
public class Keyboard  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}

/**
 * 访问者的接口。
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
public class Main {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}

```
优点：  
1、符合单一职责原则。   
2、优秀的扩展性。   
3、灵活性。

缺点：   
1、具体元素对访问者公布细节，违反了迪米特原则。   
2、具体元素变更比较困难。   
3、违反了依赖倒置原则，依赖了具体类，没有依赖抽象。


#### 这份笔记大部分通过 [`菜鸟教程`](http://www.runoob.com/design-pattern/design-pattern-intro.html) 进行抄录。
##### 我是在学完23种设计模式之后才写的笔记。  
### 学的时候有种如梦初醒的感觉。当记完这个笔记之后，又有种知其然知其所以然的感觉。
