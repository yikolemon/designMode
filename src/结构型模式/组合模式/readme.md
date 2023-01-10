组合模式又称为部分整体模式

组合模式使的用户对单个对象和组合对象访问具有一致性：
用户以一致的方式处理个别对象和组合的对象。

1.Component：实现所有类共有的接口默认行为，用于方位和管理Component子部件
2.Leaf，叶子节点无子节点
3.Composite：非叶子节点，用于存储子不见，在Composite中实现子部件操作：如add，delete等

如Composite为院系，Leaf为专业，Component抽出两者的公共行为