import java.util.ArrayList;
import java.util.List;

/**
 * @author lsr
 * @ClassName PECS
 * @Date 2020-02-15
 * @Desc 容器的泛型：PECS法则
 * @Vertion 1.0
 */
public class PECS {

    public static void main(String[] args) {
        // 容器的泛型：PECS法则
    }

    public void PE_principle(List<? extends Fruit> fruits) {
        // 我们经常看到的<? extends T>的泛型多是用在形参上，因为这时容器是作为provider的，要往外取东西
//        List<? extends Fruit> fruits = new ArrayList<>();

        // 下面这三行都会报错，因为我们只知道 "?" 表示Fruit的子类型，而无法确定 "?" 究竟是什么，为了保证类型安全，事实上这个fruits里什么都不能添加
//        fruits.add(new Strawberry());
//        fruits.add(new Apple());
//        fruits.add(new Fruit());

        Fruit fruit = fruits.get(0); // 我们能保证的是get出来的总是Fruit或其子类型
    }

    public List<? super Fruit> CS_principle() {
        // 这时的容器就作为consumer了，要往里加东西
        List<? super Fruit> fruits = new ArrayList<>();

        // 我们此时能知道容器里的事物一定是Fruit的子类型，因此这时候往容器中塞水果是安全的
        fruits.add(new Strawberry());
        fruits.add(new Apple());
        fruits.add(new Fruit());

        Object object = fruits.get(0); // 然而我们无法确定取出来的是什么水果，因此只能取出Object

        return fruits;
    }


    public class Fruit{

    }

    public class Apple extends Fruit{

    }

    public class Strawberry extends Fruit{

    }
}
