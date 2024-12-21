package vladek.services.interfaces;

public interface IPasswordService {
    String encode(String password);
    boolean matches(String rawPassword, String encodedPassword);
}
