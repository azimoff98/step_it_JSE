package az.stepit.lambdas.login;

public class AuthenticationService {

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin";



    public static void fbAuth(String username, String password){

        Authentication authentication = (username1, password1) -> {

            if(USERNAME.equals(username1) && PASSWORD.equals(password1)){
                System.out.println("Authentication is granted, you are signed in with facebook account");
            }else{
                System.err.println("Wrong credentials");
            }
        };

        authentication.authenticate(username, password);
    }

    public static void googleAuth(String username, String password){
        Authentication authentication = (username1, password1) -> {

            if(USERNAME.equals(username1) && PASSWORD.equals(password1)){
                System.out.println("Authentication is granted, you are signed in with google account");
            }else{
                System.err.println("Wrong credentials");
            }
        };

        authentication.authenticate(username, password);
    }


}
