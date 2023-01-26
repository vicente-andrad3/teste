package academy.devdojo.springboot2.domain;

public class Anime {

    private long id;
    private String name;

    public Anime() {
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
