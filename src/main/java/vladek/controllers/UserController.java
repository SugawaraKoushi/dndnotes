package vladek.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import vladek.dto.SignUpRequest;
import vladek.models.Role;
import vladek.models.User;
import vladek.services.interfaces.IUserService;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final IUserService userService;
    private final PasswordEncoder passwordEncoder;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody SignUpRequest request) {
        User user = User.builder()
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .firstName(request.getFirstName())
                .firstName(request.getLastName())
                .role(Role.ROLE_USER)
                .build();

        try {
            userService.create(user);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/is-exist")
    public ResponseEntity<Boolean> isExist(@RequestParam String username) {
        Boolean isExist = userService.userExists(username);
        return new ResponseEntity<>(isExist, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<User> getCurrentUser() {
        User user = userService.getCurrentUser();

        if (user == null) {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }

        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
