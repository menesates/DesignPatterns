package com.menesates.objectpool;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    static DataSource instance = new DataSource();
    List<Connection> pool = new ArrayList<>();

    public DataSource() {
        init();
    }

    public void init() {
        for (int i = 0; i < 3; i++) {
            pool.add(new Connection());
        }
    }

    static Connection getConnection() throws NoConnectionInPool {
        if (instance.pool.size() == 0) {
            throw new NoConnectionInPool();
        }

        Connection con = instance.pool.get(0);
        instance.pool.remove(0);

        System.out.println(con);

        return con;
    }

    static void release(Connection connection) {
        if (connection != null) {
            instance.pool.add(connection);
        }
    }

}
