package 结构型模式.享元模式;

/**
 * @author duanfuqiang
 * @date 2023/1/12 17:13
 * @description
 */
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getCircle(1);
        System.out.println(circle);
        Shape circle1 = shapeFactory.getCircle(1);
        System.out.println(circle1);
    }
}
