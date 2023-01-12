package 结构型模式.享元模式;

/**
 * @author duanfuqiang
 * @date 2023/1/12 16:28
 * @description
 */
public class Circle implements Shape{
    private int radis;

    public int getRadis() {
        return radis;
    }

    public void setRadis(int radis) {
        this.radis = radis;
    }

    public Circle(int radis) {
        this.radis = radis;
    }
}
