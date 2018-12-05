package AnimalManagementSystem;

import java.util.List;

public interface IRepository<T extends BaseEntity> {

    List<T> collection() throws Exception;
    void commit();
    void delete(int Id);
    T find(int Id);
    void insert(T t);
    void update(T t);


}
