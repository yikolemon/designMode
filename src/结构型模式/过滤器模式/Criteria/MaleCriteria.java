package 结构型模式.过滤器模式.Criteria;

import 结构型模式.过滤器模式.entity.Person;

import java.util.ArrayList;
import java.util.List;

//男性过滤器：过后为全为男
public class MaleCriteria  implements Criteria<Person>{
    @Override
    public List<Person> meetCriteria(List<Person> list) {
        List<Person> res=new ArrayList<>();
        for (Person p :list) {
            if ("male".equals(p.getSex())){
                res.add(p);
            }
        }
        return res;
    }
}
