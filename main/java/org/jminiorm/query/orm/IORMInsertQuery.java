package org.jminiorm.query.orm;

import org.jminiorm.query.IQuery;

import java.util.Collection;

/**
 * Represents an insert query for objects of a JPA annotated class.
 *
 * @param <T>
 */
public interface IORMInsertQuery<T> extends IQuery {

    /**
     * Add an object to those to be inserted.
     *
     * @param obj
     * @return
     */
    IORMInsertQuery<T> addOne(T obj);

    /**
     * Add a collection of objects to those to be inserted.
     *
     * @param objs
     * @return
     */
    IORMInsertQuery<T> addMany(Collection<T> objs);

    /**
     * Inserts the objects collected so far.
     */
    void execute();

}