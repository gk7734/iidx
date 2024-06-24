package kr.hs.dgsw.iidx.controller;

import jakarta.validation.Valid;
import kr.hs.dgsw.iidx.dto.UserDto;
import kr.hs.dgsw.iidx.entity.UserEntity;
import kr.hs.dgsw.iidx.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("get-userRank")
    public UserDto getUserRankById(@RequestParam("id") Long id) throws BadRequestException {
        return userService.getUserRank(id);
    }

    @GetMapping("get-AllUserRank")
    public List<UserEntity> getAllUserRank() throws BadRequestException {
        return userService.getAllUserRank();
    }

    @PostMapping("create-userRank")
    public UserDto createUserRank(@Valid @RequestBody UserDto dto) {
        return userService.createUserRank(dto);
    }

    @PatchMapping("update-userRank")
    public UserDto updateUserRank(@Valid @RequestBody UserDto dto) throws BadRequestException {
        return userService.updateUserRank(dto);
    }

    @DeleteMapping("delete-userRank")
    public void deleteUserRank(@RequestParam("id") Long id) throws BadRequestException {
        userService.deleteUserRank(id);
    }
}
