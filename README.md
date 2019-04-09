# Design-Pattern

### 介绍
设计模式学习，常规的 23 种设计模式

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


### 设计模式列表：
#### 创建型模式
+ 工厂模式（Factory Pattern）
+ 抽象工厂模式（Abstract Factory Pattern）
+ 单例模式（Singleton Pattern）
+ 建造者模式（Builder Pattern）
+ 原型模式（Prototype Pattern）
 	
#### 结构型模式
+ 适配器模式（Adapter Pattern）
+ 桥接模式（Bridge Pattern）
+ 过滤器模式（Filter、Criteria Pattern）
+ 组合模式（Composite Pattern）
+ 装饰器模式（Decorator Pattern）
+ 外观模式（Facade Pattern）
+ 享元模式（Flyweight Pattern）
+ 代理模式（Proxy Pattern）
	
#### 行为型模式
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

#### 码云特技

1. 使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2. 码云官方博客 [blog.gitee.com](https://blog.gitee.com)
3. 你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解码云上的优秀开源项目
4. [GVP](https://gitee.com/gvp) 全称是码云最有价值开源项目，是码云综合评定出的优秀开源项目
5. 码云官方提供的使用手册 [https://gitee.com/help](https://gitee.com/help)
6. 码云封面人物是一档用来展示码云会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)