package springonespoon.four.service;

import org.springframework.stereotype.Service;
import springonespoon.four.DTO.LoginDTO;
import springonespoon.four.DTO.TokenDTO;
import springonespoon.four.entity.User;
import springonespoon.four.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public String Signup(User user){
        if(userRepository.existsByUsername(user.getUsername())){
            throw new RuntimeException();
        }
        userRepository.save(user);
        return "";
    }
    public TokenDTO Signin(LoginDTO user){
        if(userRepository.findOneByUsername(user.getUsername()).getPassword().equals(user.getPassword())){
            return TokenDTO.builder().token("JWT").build();
        }else {
            throw new RuntimeException();
        }
    }
}
