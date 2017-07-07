package org.baeldung.web.dto;

public class Dummy {
    private long id;
    private String name;

    public Dummy() {
        super();
    }

    public Dummy(final long id, final String name) {
        super();

        this.id = id;
        this.name = name;
    }

    //

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

}