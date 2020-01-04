package club.icomponent.spec.domain;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * 综合查询套件规格
 * @param <T> 规格类型
 */
public class Kit<T> {

    private final Root<T> root;
    private final CriteriaQuery<?> query;
    private final CriteriaBuilder builder;

    public Kit(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        this.root = root;
        this.query = query;
        this.builder = builder;
    }

    public Root<T> getRoot() {
        return root;
    }

    public CriteriaQuery<?> getQuery() {
        return query;
    }

    public CriteriaBuilder getBuilder() {
        return builder;
    }
}
