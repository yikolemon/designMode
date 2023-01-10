package 结构型模式.过滤器模式.Criteria;

import 结构型模式.过滤器模式.entity.Person;

import java.util.List;

/**
 * @author duanfuqaing
 * @date 2023/1/10 10:53
 * @description
 */
public class OrCriteria implements Criteria<Person>{
    private Criteria<Person> criteria;
    private Criteria<Person> otherCriteria;

    public OrCriteria(Criteria<Person> criteria, Criteria<Person> otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }
    @Override
    public List<Person> meetCriteria(List<Person> list) {
        List<Person> list1 = criteria.meetCriteria(list);
        List<Person> list2 = criteria.meetCriteria(list);
        for (Person p:
             list1) {
            if (!list2.contains(p)){
                list2.add(p);
            }
        }
        return list2;
    }
}
