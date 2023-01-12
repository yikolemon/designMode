package 结构型模式.享元模式;

import java.util.HashMap;

/**
 * @author duanfuqiang
 * @date 2023/1/12 16:28
 * @description
 */
public class ShapeFactory {
    private static final HashMap<Integer, Shape> circleMap = new HashMap<>();

    //不考虑多线程情况
    public Shape getCircle(int radis){
        if (circleMap.containsKey(radis)){
            return  circleMap.get(radis);
        }else {
            System.out.println("create Circle");
            Circle circle = new Circle(radis);
            circleMap.put(radis, circle);
            return circle;
        }
    }
}
