package vladek.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class CorsConfig {
    @Bean
    public UrlBasedCorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        String corsOriginsEnv = System.getenv("CORS_ALLOWED_ORIGINS");
        List<String> corsAllowedOrigins = corsOriginsEnv != null
                ? new ArrayList<>(List.of(corsOriginsEnv.split(",")))
                : new ArrayList<>();
        corsAllowedOrigins.add("http://localhost:3000");
        corsAllowedOrigins.add("http://127.0.0.1:3000");
        corsAllowedOrigins.forEach(System.out::println);
        configuration.setAllowedOrigins(corsAllowedOrigins);
        configuration.setAllowedHeaders(List.of("Authorization", "Content-Type", "X-Requested-With"));
        configuration.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        configuration.setExposedHeaders(List.of("Set-Cookie"));
        configuration.setAllowCredentials(true);
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }
}
