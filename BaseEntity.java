package AnimalManagementSystem;

public abstract class BaseEntity {

    private int Id;


    public BaseEntity(int id) {
        Id = id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
