package com.menesates.creational.objectpool;

import org.junit.Test;

public class DataSourceTest {

    @Test
    public void poolTest() throws NoConnectionInPool {
        Connection connection1 = DataSource.getConnection();
        Connection connection2 = DataSource.getConnection();
        Connection connection3 = DataSource.getConnection();

    }

    @Test(expected = NoConnectionInPool.class)
    public void poolTestException() throws NoConnectionInPool {
        Connection connection1 = DataSource.getConnection();
        Connection connection2 = DataSource.getConnection();
        Connection connection3 = DataSource.getConnection();
        Connection connection4 = DataSource.getConnection();
    }

    @Test
    public void poolTest2() throws NoConnectionInPool {
        Connection connection1 = DataSource.getConnection();
        Connection connection2 = DataSource.getConnection();
        Connection connection3 = DataSource.getConnection();

        DataSource.release(connection1);
        Connection connection4 = DataSource.getConnection();
    }
}