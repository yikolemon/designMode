package 结构型模式.组合模式;

/**
 * @author duanfuqiang
 * @date 2023/1/10 14:08
 * @description
 */
public abstract class AbstractFile {
    private String name;

    public AbstractFile(String name) {
        this.name = name;
    }

    protected void add(AbstractFile file){
        throw new UnsupportedOperationException();
    }

    protected void remove(AbstractFile file){
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract void print();

}
