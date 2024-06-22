public class UserApp {
    public static void main(String[] args) throws Exception {
        /* object */
        var user1 = new User();
        User user2 = new User();
        User user3 ;
        user3 = new User();

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);

        /* field */
        var user = new User();
        user.username = "Fiona"; 
        user.password = "123456";
        user.phoneNumber = "085364515101";
        user.email = "anggiliafiona@gmail.com";
        // user.country = "indonesia";
        System.out.println(user.username);
        System.out.println(user.password);
        System.out.println(user.country);


        var user4 = new User();
        user4.userMe();
        user4.login("Fiona","123456");

        var user5 = new User();
        user5.username = "fiona";
        user5.password = "123456";
        user5.userMe();
        user5.login("fiona","123456");

        var user6 = new User("username", "123456", "085364515101", true);
        user6.userMe();
        user6.login("fiona","123456");

        var user7 = new User("username7", "123456");
        user7.userMe();
        user7.login("fiona","123456");
    }
}

