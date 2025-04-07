package hung.practice.app.IOBANK.service;

import hung.practice.app.IOBANK.dto.UserDto;
import hung.practice.app.IOBANK.entity.User;
import hung.practice.app.IOBANK.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public User registerUser(UserDto userDto) {
        User user = User.builder()
                .lastname(userDto.getLastname())
                .firstname(userDto.getFirstname())
                .username(userDto.getUsername())
                .password(userDto.getPassword())
                .build();
        return userRepository.save(user);
    }
}
