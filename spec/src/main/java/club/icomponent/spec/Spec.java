package club.icomponent.spec;

import club.icomponent.spec.domain.ConnectionType;
import club.icomponent.spec.domain.Kit;
import club.icomponent.spec.table.Column;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * 规格构造核心类
 * @param <T> 规格类型
 */
public class Spec<T> {

    /**
     * 综合查询套件规格 用于传递
     */
    private final Kit<T> kit;

    /**
     * 生成的查询谓语
     */
    private Predicate predicate;

    /**
     * 当前连接类型
     */
    private ConnectionType type;

    public Spec(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        this.kit = new Kit<>(root, query, builder);
        this.type = ConnectionType.NONE;
    }

    /**
     * 数据表 - 列配置
     * @param name 列名
     * @return 列对象
     */
    public Column<T> column(String name) {
        return new Column<>(this, this.kit, name);
    }

    /**
     * 当前基础条件下追加查询条件
     * @param predicate 查询条件
     * @param type 后续连接类型
     * @return 返回当前对象
     */
    public Spec<T> append(Predicate predicate, ConnectionType type) {
        if (this.type.equals(ConnectionType.NONE)) {
            this.predicate = predicate;
        } else if (this.type.equals(ConnectionType.AND)) {
            this.predicate = this.kit.getBuilder().and(this.predicate, predicate);
        } else if (this.type.equals(ConnectionType.OR)) {
            this.predicate = this.kit.getBuilder().or(this.predicate, predicate);
        }
        this.type = type;
        return this;
    }

    /**
     * 获取查询条件
     * @return 当前查询条件
     */
    public Predicate getPredicate() {
        return this.predicate;
    }
}
