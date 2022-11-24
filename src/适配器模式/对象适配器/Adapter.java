package 适配器模式.对象适配器;

public class Adapter implements chargePane5V {

    private charge220V a_instance=new charge220V();
    @Override
    public int getFive() {
        int v = a_instance.get220v();
        //进行一些处理
        return v;
    }

}
