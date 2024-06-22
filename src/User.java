class User {
    String username;
    String password;
    String phoneNumber;
    String email;
    Boolean admin = false;
    final String country = "Indonesia";


    void userMe() throws Exception {
        System.out.println("My username is "+username+
        "password"+password+
        "phoneNumber "+ phoneNumber+
        "email "+ email+
        (admin? " is_admin ": "")+
        "country "+ country
        );
    }

    void login(String paramUsername, String paramPassword) {
        if (username == paramUsername && paramPassword == password) {
            System.out.println("Succes login with username "+ username);
        }else {
            System.out.println("Failed login with username "+ username);
        }
     }


    User(String paramUsername, String paramPassword, String paramPhoneNumber, Boolean paramAdmin){
        username = paramUsername;
        password = paramPassword;
        phoneNumber = paramPhoneNumber;
        admin = paramAdmin;
    }

    User(String paramUSername, String paramPassword, String paramPhoneNumber){
        this(paramUSername, paramPassword, paramPhoneNumber,false);
    }


    User(String paramUsername, String paramPassword){
        this(paramUsername, paramPassword,null);

    }  
    
    User(String paramUsername){
        this(paramUsername,null);
    }

    User(){
        this(null);
    }
}
     
