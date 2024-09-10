package domain;

public class User {

    private final String name;
    private final String lastName;
    private final int age;

    private final String phone; // atrributo opcional
    private final String direction;

    /*
     * patron builder de diseño para la clase
     * el patron buider es el que asigna por eso no se debe
     * crear los metodos set solo se debe tener los get
     */
    public User(UserBuilder builder) {
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = phone;
        this.direction = direction;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getDirection() {
        return direction;
    }

    // el constructor de la clase builder crea los atributos obligatorioas
    public static class UserBuilder {
        private final String name;
        private final String lastName;
        private int age;
        private String phone;
        private String direction;

        public UserBuilder(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        //este metodo retorna la clase buider
        public UserBuilder phone(String phone){
            this.phone= phone;
            return this;
        }

        public UserBuilder direction(String direction){
            this.direction= direction;
            return this;
        }

        public User build(){
            User user= new User(this);
            return user;
        }

        public void validarUser(User user){
            System.out.print("se valido");
        }
      

    }

}
