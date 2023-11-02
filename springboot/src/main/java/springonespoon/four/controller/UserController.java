package springonespoon.four.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springonespoon.four.DTO.LoginDTO;
import springonespoon.four.entity.User;
import springonespoon.four.service.UserService;

@RestController
@CrossOrigin(origins = "*",originPatterns = "http://localhost:8080")
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/signup")
    public ResponseEntity<?> UserSignup(@RequestBody User user){
        try {
            return ResponseEntity.ok().body(userService.Signup(user));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("아이디나 비밀번호를 다시 확인해주세요");
        }
    }
    @PostMapping("/signin")
    public ResponseEntity<?> UserSignin(@RequestBody LoginDTO user){
        try {
            return ResponseEntity.ok().body(userService.Signin(user));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("아이디나 비밀번호를 다시 확인해주세요");
        }
    }
}
