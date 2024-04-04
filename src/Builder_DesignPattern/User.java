package Builder_DesignPattern;

public class User {

    private  String User_id;
    private  String User_name;
    private  String User_email;

    private User(Userbuilder userbuilder)
    {
        this.User_id=userbuilder.User_id;
        this.User_name=userbuilder.User_name;
        this.User_email=userbuilder.User_email;

    }

    public String getUser_id() {
        return User_id;
    }

    public String getUser_name() {
        return User_name;
    }

    public String getUser_email() {
        return User_email;
    }

    //Inner Class


    @Override
    public String toString() {
        return "User{" +
                "User_id='" + User_id + '\'' +
                ", User_name='" + User_name + '\'' +
                ", User_email='" + User_email + '\'' +
                '}';
    }

    public static class Userbuilder
    {
        private  String User_id;
        private  String User_name;
        private  String User_email;

        public Userbuilder()
        {

        }

        public Userbuilder setUser_id(String user_id) {
            User_id = user_id;
            return this;
        }

        public Userbuilder setUser_name(String user_name) {
            User_name = user_name;
            return this;
        }

        public Userbuilder setUser_email(String user_email) {
            User_email = user_email;
            return this;
        }

        public User build()
        {
            User user = new User(this);
            return user;
        }
    }

    public static void main(String[] args) {
        User aryan = new Userbuilder().setUser_id("1").setUser_name("Aryan").setUser_email("aryan@gmail").build();
        System.out.println(aryan);

    }
}
