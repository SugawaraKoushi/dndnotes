package vladek.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vladek.dto.UserDTO;
import vladek.models.User;
import vladek.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController (UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/get-by-username")
    public ResponseEntity<User> getByUsername(String username) {
        User userFromDb = (User) userService.loadUserByUsername(username);
        return new ResponseEntity<>(userFromDb, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<?> addUser(@RequestBody UserDTO dto) {
        userService.save(dto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
