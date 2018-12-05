package AnimalManagementSystem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MySQLRepository<T extends BaseEntity> implements IRepository<T> {

    private DbContext context;

    public MySQLRepository(DbContext context) {
        this.context = context;

    }

    @Override
    public List<T> collection() throws Exception {

       //

        return null;
    }

    @Override
    public void commit() {

    }

    @Override
    public void delete(int Id) {

    }

    @Override
    public T find(int Id) {
        return null;
    }

    @Override
    public void insert(T o) {

    }

    @Override
    public void update(T o) {

    }
}
