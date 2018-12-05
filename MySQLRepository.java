package AnimalManagementSystem;

import java.util.List;

public class MySQLRepository<T> implements IRepository<T> {

    private DbContext context;



    @Override
    public List<T> collection() {
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
