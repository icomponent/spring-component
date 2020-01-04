package club.icomponent.spec.domain;

/**
 * 数据表 - 列
 */
public class Column<T> {

    private final Specification<T> specification;
    private final String name;

    public Column(Specification<T> specification, String name) {
        this.specification = specification;
        this.name = name;
    }
}
