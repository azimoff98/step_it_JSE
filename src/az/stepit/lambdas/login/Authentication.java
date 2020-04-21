package az.stepit.lambdas.login;

@FunctionalInterface
public interface Authentication {
    void authenticate(String username, String password);
}
