package org.jminiorm.query.orm;

import org.jminiorm.exception.DBException;
import org.jminiorm.exception.UnexpectedNumberOfItemsException;

import java.util.List;

/**
 * Represents a select query that returns objects of a JPA annotated class. The select and from clauses are infered from
 * the JPA annotations.
 *
 * @param <T>
 */
public interface IORMSelectQuery<T> extends IORMQuery<T> {

    IORMSelectQuery<T> forClass(Class<T> clazz);

    /**
     * Sets the where clause and returns this. Optional.
     *
     * @param where
     * @param params
     * @return this
     */
    IORMSelectQuery<T> where(String where, Object... params);

    /**
     * Sets the limit and returns this.
     *
     * @param limit
     * @return
     */
    IORMSelectQuery<T> limit(Long limit);

    /**
     * Sets the offset and returns this.
     *
     * @param offset
     * @return
     */
    IORMSelectQuery<T> offset(Long offset);

    /**
     * Sets the order by clause and returns this. Optional.
     *
     * @param orderBy
     * @return this
     */
    IORMSelectQuery<T> orderBy(String orderBy);

    /**
     * Extracts the first result of the result set. Throws an exception if there is more than or less than one element
     * in the result set.
     *
     * @return
     * @throws UnexpectedNumberOfItemsException when there are more than one or zero items in the result set.
     * @throws DBException
     */
    T one() throws UnexpectedNumberOfItemsException, DBException;

    /**
     * Extracts the first result of the result set.
     *
     * @return
     * @throws DBException
     */
    T first() throws DBException;

    /**
     * Returns all the items in the result set.
     *
     * @return
     * @throws DBException
     */
    List<T> list() throws DBException;

}
