package String;

final class CustomImmutableClass {
    private int id;
    private String name;

    public CustomImmutableClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
