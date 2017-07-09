package hello;

class Greeting {

    private final String content;
    private final long id;

    Greeting(Long id, String name) {
        this.content = name;
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public long getId() {
        return id;
    }
}
