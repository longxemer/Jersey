package java.Demo;


public class Call {
    private String id;
    private String name;
    private String time;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Call{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
