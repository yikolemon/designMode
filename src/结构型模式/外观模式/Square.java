package 结构型模式.外观模式;

/**
 * @author duanfuqiang
 * @date 2023/1/12 16:09
 * @description
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("画个方形");
    }
}
