package bean;

public class person {
    private String username;
    private String name;
    private int age;
    private String teleno;

    public person() {
    }

//    public person(String username, String name, int age, String teleno) {
//        this.username = username;
//        this.name = name;
//        this.age = age;
//        this.teleno = teleno;
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTeleno() {
        return teleno;
    }

    public void setTeleno(String teleno) {
        this.teleno = teleno;
    }

    @Override
    public String toString() {
        return "person{" +
                "username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", teleno='" + teleno + '\'' +
                '}';
    }
}
