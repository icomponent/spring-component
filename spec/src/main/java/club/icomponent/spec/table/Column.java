package club.icomponent.spec.table;

import club.icomponent.spec.Spec;
import club.icomponent.spec.build.Builder;
import club.icomponent.spec.domain.Kit;

import javax.persistence.criteria.Predicate;

/**
 * 数据表 - 列
 * @param <T> 规格类型
 */
public class Column<T> {

    private final Spec<T> spec;
    private final Kit<T> kit;
    private final String name;

    public Column(Spec<T> spec, Kit<T> kit, String name) {
        this.spec = spec;
        this.kit = kit;
        this.name = name;
    }

    /**
     * 构造该字段的 is null 查询条件
     */
    public Builder<T> isNull() {
        Predicate predicate = this.kit.getRoot().get(this.name).isNull();
        return new Builder<>(this.spec, predicate);
    }
}
