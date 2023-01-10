package 结构型模式.组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author duanfuqiang
 * @date 2023/1/10 14:10
 * @description
 */
public class Folder extends AbstractFile{

    List<AbstractFile> list=new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    protected void add(AbstractFile file) {
        list.add(file);
    }

    @Override
    protected void remove(AbstractFile file) {
        list.remove(file);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    protected void print() {
        System.out.println(getName());
        for (AbstractFile file:list) {
            file.print();
        }
    }

}
