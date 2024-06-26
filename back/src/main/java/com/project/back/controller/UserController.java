package com.project.back.controller;

import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.project.back.dto.UserDTO;
import com.project.back.dto.UserPasswordDTO;
import com.project.back.entity.UserEntity;
import com.project.back.repository.UserRepository;
import com.project.back.service.UserService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
public class UserController {
    
    private final UserService userService;
    private final UserRepository userRepository;
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    public UserController(UserService userService, UserRepository userRepository){
        this.userService = userService;
        this.userRepository=userRepository;
    }


    //회원가입 요청
    @PostMapping("pedal/join")
    public Boolean joinProcess(@RequestBody UserDTO userDTO) {
        
        System.out.println(userDTO.getUId());
        System.out.println(userDTO.getUPwd());
        System.out.println(userDTO.getUaddrdetail());
        userService.joinProcess(userDTO);

        return true;
    }
    
    //마이페이지 유저 정보 불러오기 (수정 시 필요)
    @GetMapping("/pedal/normal")
public ResponseEntity<UserDTO> callUserInfo(@RequestParam String uId) {
    UserEntity userEntity = userService.callUserInfo(uId);
    if (userEntity == null) {
        return ResponseEntity.notFound().build();
    }

    UserDTO userDTO = new UserDTO();
    userDTO.setUId(userEntity.getUId());
    userDTO.setUName(userEntity.getUName());
    userDTO.setUPhone(userEntity.getUPhone());
    userDTO.setUAddress(userEntity.getUAddress());
    userDTO.setUaddrdetail(userEntity.getUAddrDetail());
    userDTO.setUSaveFileName(userEntity.getUSaveFileName());
    userDTO.setUOriginalFileName(userEntity.getUOriginalFileName());
    userDTO.setUIdRole(userEntity.getUIdRole());
    // 비밀번호와 같은 민감한 정보는 DTO에 설정하지 않습니다.

    return ResponseEntity.ok(userDTO);
}

@PutMapping("/pedal/normal")
public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO userDTO) {
    logger.info("Starting updateUser in UserController");
    UserEntity updatedUserEntity = userService.updateUserInfo(userDTO.getUId(), userDTO);
    if (updatedUserEntity == null) {
        return ResponseEntity.notFound().build();
    }

    UserDTO updatedUserDTO = new UserDTO();
    updatedUserDTO.setUId(updatedUserEntity.getUId());
    updatedUserDTO.setUName(updatedUserEntity.getUName());
    updatedUserDTO.setUPhone(updatedUserEntity.getUPhone());
    updatedUserDTO.setUAddress(updatedUserEntity.getUAddress());
    updatedUserDTO.setUaddrdetail(updatedUserEntity.getUAddrDetail());
    updatedUserDTO.setUSaveFileName(updatedUserEntity.getUSaveFileName());
    updatedUserDTO.setUOriginalFileName(updatedUserEntity.getUOriginalFileName());
    updatedUserDTO.setUIdRole(updatedUserEntity.getUIdRole());
    // 비밀번호는 DTO에 포함하지 않습니다.

    return ResponseEntity.ok(updatedUserDTO);
}

    @PostMapping("/pedal/check-password")
    public ResponseEntity<Boolean> checkPassword(@RequestBody UserPasswordDTO userPasswordDTO) {
    UserEntity user = userService.callUserInfo(userPasswordDTO.getUid());
    if (user != null && userService.getPasswordEncoder().matches(userPasswordDTO.getUpwd(), user.getUPwd())) {
        return ResponseEntity.ok(true);
    }
    return ResponseEntity.ok(false);
}

@PutMapping("/pedal/update-password")
public ResponseEntity<?> updatePassword(@RequestBody UserPasswordDTO userPasswordDTO) {
    try {
        UserEntity user = userService.callUserInfo(userPasswordDTO.getUid());
        if (userPasswordDTO.getUid() == null || userPasswordDTO.getUid().trim().isEmpty()) {
            return ResponseEntity.badRequest().body("User ID is missing or invalid");
        }
        if (userPasswordDTO.getUpwd() == null || userPasswordDTO.getUpwd().trim().isEmpty()) {
            return ResponseEntity.badRequest().body("Password is missing or invalid");
        }
        if (user != null) {
            System.out.println(user);
            user.setUPwd(userService.getPasswordEncoder().encode(userPasswordDTO.getUpwd()));
            System.out.println(user);
            userRepository.save(user);
            return ResponseEntity.ok("Password updated successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    } catch (Exception e) {
        e.printStackTrace();  // 서버 로그에 예외 스택 트레이스를 출력
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
    }
}



}
    


