package 结构型模式.过滤器模式.Criteria;

import 结构型模式.过滤器模式.entity.Person;

import java.util.ArrayList;
import java.util.List;

public class SingleCriteria implements Criteria<Person> {
    @Override
    public List<Person> meetCriteria(List<Person> list) {
        List<Person> res=new ArrayList<>();
        for (Person p : list) {
            if (p.isSingle()==true){
                res.add(p);
            }
        }
        return res;
    }
}
