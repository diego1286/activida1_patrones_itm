import domain.User;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        User user1 = new User.UserBuilder("diego", "ardila")
                .build();

        User user2 = new User.UserBuilder("diego", "Sanchez")
                .phone("34736346")
                .build();

        User user3 = new User.UserBuilder("diego", "Sanchez")
                .phone("34736346")
                .direction("calle larga")
                .age(30)
                .build();
        /*
         * El patron builder crea objetos personalizados
         * por etapas
         */

         System.out.println(user1);
         System.out.println(user2);
         System.out.println(user3);
         

    }
}
