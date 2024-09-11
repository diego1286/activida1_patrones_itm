import domain.User;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        User user1 = new  User.UserBuilder("diego", "ardila")
        .build();
        User user2 = new  User.UserBuilder("diego", "Sanchez")
        .phone("34736346")
        .build();



    }
}
