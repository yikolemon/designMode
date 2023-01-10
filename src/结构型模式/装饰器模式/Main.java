package 结构型模式.装饰器模式;

/**
 * @author duanfuqiang
 * @date 2023/1/10 14:30
 * @description
 */
public class Main {
    public static void main(String[] args) {
        iPhonePlus iPhonePlus = new iPhonePlus(new iPhone());
        iPhonePlus.call();
    }
}
