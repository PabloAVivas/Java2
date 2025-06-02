package BuenSabor_V4.Entities;

public abstract class Base {
    private Long id;

    public Base(){

    }

    public Base(Long id) {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
