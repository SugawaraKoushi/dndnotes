package vladek.services;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import vladek.services.interfaces.IPasswordService;

@Service
@RequiredArgsConstructor
public class BCryptPasswordService implements IPasswordService {
    private final PasswordEncoder encoder;

    @Override
    public String encode(String password) {
        return encoder.encode(password);
    }

    @Override
    public boolean matches(String rawPassword, String encodedPassword) {
        return encoder.matches(rawPassword, encodedPassword);
    }

    public PasswordEncoder getEncoder() {
        return encoder;
    }
}
