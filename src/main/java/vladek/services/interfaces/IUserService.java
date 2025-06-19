package vladek.services.interfaces;

import org.springframework.security.core.userdetails.UserDetailsService;
import vladek.models.User;

public interface IUserService extends UserDetailsService {
    void create(User user);
    boolean userExists(String username);
    User getCurrentUser();
}
