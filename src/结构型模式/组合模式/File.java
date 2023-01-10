package 结构型模式.组合模式;

/**
 * @author duanfuqiang
 * @date 2023/1/10 14:12
 * @description
 */
public class File extends AbstractFile{
    public File(String name) {
        super(name);
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
