package Oop;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }
    public void greet(){
        System.out.println("hello"+ name);
    }

    public static void main(String[] args) {
        User user1 = new User("jake");
        User user2 = new User("mercy");
        user1.greet();
        user2.greet();
    }
}
