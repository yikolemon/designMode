package 结构型模式.外观模式;

/**
 * @author duanfuqiang
 * @date 2023/1/12 16:10
 * @description
 * 类似于Service注入Dao，提供接口调用
 */
public class ShapeMaker {
    Circle circle=new Circle();

    Square square=new Square();

    public ShapeMaker(Circle circle, Square square) {
        this.circle = circle;
        this.square = square;
    }

    public void drawCircle(){
        circle.draw();;
    }

    public void drawSquare(){
        square.draw();
    }
}
