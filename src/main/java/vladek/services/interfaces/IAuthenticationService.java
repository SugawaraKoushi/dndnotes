package vladek.services.interfaces;

import vladek.dto.JwtAuthenticationResponse;
import vladek.dto.SignInRequest;
import vladek.dto.SignUpRequest;

public interface IAuthenticationService {
    /**
     * Регистрация пользователя
     * @param request данные пользователя
     * @return токен
     */
    JwtAuthenticationResponse signUp(SignUpRequest request);

    /**
     * Аутентификация пользователя
     * @param request данные пользователя
     * @return токен
     */
    JwtAuthenticationResponse signIn(SignInRequest request);
}
