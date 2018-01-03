package org.jminiorm.query.jpa;

import org.jminiorm.query.IQuery;

import java.util.Collection;

/**
 * Represents an insert query for objects of a JPA annotated class.
 *
 * @param <T>
 */
public interface IJPAInsertQuery<T> extends IQuery {

    /**
     * Add an object to those to be inserted.
     *
     * @param obj
     * @return
     */
    IJPAInsertQuery<T> addOne(T obj);

    /**
     * Add a collection of objects to those to be inserted.
     *
     * @param objs
     * @return
     */
    IJPAInsertQuery<T> addMany(Collection<T> objs);

    /**
     * Inserts the objects collected so far.
     */
    void execute();

}