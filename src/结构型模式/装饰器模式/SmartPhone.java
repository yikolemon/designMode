package 结构型模式.装饰器模式;

/**
 * @author duanfuqiang
 * @date 2023/1/10 14:25
 * @description
 * SmartPhone对Phone进行了功能增强
 */
public abstract class SmartPhone implements Phone{
    protected Phone phone;

    public SmartPhone(Phone phone) {
        this.phone = phone;
    }


    @Override
    public abstract void call();
}
