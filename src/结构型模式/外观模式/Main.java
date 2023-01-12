package 结构型模式.外观模式;

/**
 * @author duanfuqiang
 * @date 2023/1/12 16:11
 * @description
 */
public class Main {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker(new Circle(), new Square());
        shapeMaker.drawCircle();
        shapeMaker.drawSquare();
    }
}
