package 结构型模式.过滤器模式;

import 结构型模式.过滤器模式.Criteria.AndCriteria;
import 结构型模式.过滤器模式.Criteria.MaleCriteria;
import 结构型模式.过滤器模式.Criteria.SingleCriteria;
import 结构型模式.过滤器模式.entity.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author duanfuqiang
 * @date 2023/1/10 10:55
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Person one = new Person("one", "male", true);
        Person two=new Person("two","female",true);
        Person three = new Person("three", "male", false);
        Person four = new Person("four", "female", false);
        List<Person> list = Arrays.asList(one, two, three, four);
        MaleCriteria maleCriteria = new MaleCriteria();
        List<Person> res1 = maleCriteria.meetCriteria(list);
        for (int i = 0; i < res1.size(); i++) {
            System.out.println(res1.get(i));
        }
        System.out.println("===========");
        SingleCriteria singleCriteria = new SingleCriteria();
        List<Person> res2 = singleCriteria.meetCriteria(list);
        for (int i = 0; i < res2.size(); i++) {
            System.out.println(res2.get(i));
        }
        System.out.println("===========");
        AndCriteria andCriteria = new AndCriteria(maleCriteria,singleCriteria);
        List<Person> res3 = andCriteria.meetCriteria(list);
        for (int i = 0; i < res3.size(); i++) {
            System.out.println(res3.get(i));
        }
        //or同理
    }
}
