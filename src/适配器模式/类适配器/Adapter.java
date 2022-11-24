package 适配器模式.类适配器;

public class Adapter extends charge220V implements chargePane5V{

    @Override
    public int getFive() {
        int v = this.get220v();
        //进行一些处理
        return v;
    }

}
