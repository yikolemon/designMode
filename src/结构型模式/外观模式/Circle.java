package 结构型模式.外观模式;

/**
 * @author duanfuqiang
 * @date 2023/1/12 16:08
 * @description
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("画个圆");
    }

}
