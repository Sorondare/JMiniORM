package org.jminiorm.query.orm;

import java.sql.SQLException;

/**
 * Represents a create table statement that creates the table for a JPA annotated class.
 */
public interface IORMCreateTableQuery<T> {

    /**
     * Sets the class to create the table for.
     *
     * @param clazz
     * @return
     */
    IORMCreateTableQuery<T> forClass(Class<T> clazz);

    /**
     * Creates the table.
     *
     * @throws SQLException
     */
    void execute() throws SQLException;

}