package 结构型模式.组合模式;

/**
 * @author duanfuqiang
 * @date 2023/1/10 14:14
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Folder hi = new Folder("hi");
        Folder subFolder = new Folder("subFolder");
        File file1 = new File("file1");
        File file2=new File("file2");
        hi.add(subFolder);
        hi.add(file1);
        subFolder.add(file2);
        hi.print();
    }
}
