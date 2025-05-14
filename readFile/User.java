public class User {
    public String name;
    public int age;
    public String email;

    // Optional: toString() for easy printing
    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + ", email='" + email + "'}";
    }
}
