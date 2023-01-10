package 结构型模式.过滤器模式.entity;


/**
 *
 * @author yikolemon
 */
public class Person {
    /**
     *male female
     */
    private String name;
    private String sex;

    /**
     * true Single false not Single
     */
    private boolean isSingle;

    public Person(String name, String sex, boolean isSingle) {
        this.name = name;
        this.sex = sex;
        this.isSingle = isSingle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isSingle() {
        return isSingle;
    }

    public void setSingle(boolean single) {
        isSingle = single;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", isSingle=" + isSingle +
                '}';
    }
}
