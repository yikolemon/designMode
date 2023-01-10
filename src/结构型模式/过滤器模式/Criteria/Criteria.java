package 结构型模式.过滤器模式.Criteria;

import java.util.List;

//过滤器接口
public interface Criteria<T> {
    public List<T> meetCriteria(List<T> list);
}
