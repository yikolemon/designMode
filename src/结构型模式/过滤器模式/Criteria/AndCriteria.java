package 结构型模式.过滤器模式.Criteria;

import 结构型模式.过滤器模式.entity.Person;

import java.util.List;

/**
 * merge person that meet two criteria at the same time
 * @author yikolemon
 */
public class AndCriteria implements Criteria<Person>{

    private Criteria<Person> criteria;
    private Criteria<Person> otherCriteria;

    public AndCriteria(Criteria<Person> criteria, Criteria<Person> otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> list) {
        List<Person> people = criteria.meetCriteria(list);
        List<Person> res = otherCriteria.meetCriteria(people);
        return res;
    }

}
