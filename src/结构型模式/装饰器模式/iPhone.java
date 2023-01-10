package 结构型模式.装饰器模式;

/**
 * @author duanfuqiang
 * @date 2023/1/10 14:24
 * @description
 */
public class iPhone implements Phone{
    @Override
    public void call() {
        System.out.println("call");
    }
}
