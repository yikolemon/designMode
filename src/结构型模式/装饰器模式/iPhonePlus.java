package 结构型模式.装饰器模式;

/**
 * @author duanfuqiang
 * @date 2023/1/10 14:32
 * @description
 */
public class iPhonePlus extends SmartPhone{

    public iPhonePlus(Phone phone) {
        super(phone);
    }

    @Override
    public void call() {
        System.out.println("recod this call");
        phone.call();
    }
}
