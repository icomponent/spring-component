package club.icomponent.spec.build;

import club.icomponent.spec.Spec;
import club.icomponent.spec.domain.ConnectionType;

import javax.persistence.criteria.Predicate;

/**
 * 查询条件构造器
 * @param <T> 规格类型
 */
public class Builder<T> {

    private final Spec<T> spec;
    private final Predicate predicate;

    public Builder(Spec<T> spec, Predicate predicate) {
        this.spec = spec;
        this.predicate = predicate;
    }

    /**
     * 追加查询条件，且下一连接符使用 and
     */
    public Spec<T> and() {
        return this.spec.append(predicate, ConnectionType.AND);
    }

    /**
     * 追加查询条件，且下一连接符使用 or
     */
    public Spec<T> or() {
        return this.spec.append(predicate, ConnectionType.OR);
    }

    /**
     * 直接构造查询条件，并返回
     */
    public Predicate build() {
        return this.spec.append(predicate, ConnectionType.NONE).getPredicate();
    }
}
