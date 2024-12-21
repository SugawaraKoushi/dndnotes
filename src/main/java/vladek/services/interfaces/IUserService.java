package vladek.services.interfaces;

import org.springframework.security.core.userdetails.UserDetailsService;
import vladek.dto.UserDTO;

public interface IUserService extends UserDetailsService {
    void save(UserDTO dto);
}
