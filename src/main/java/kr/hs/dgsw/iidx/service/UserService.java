package kr.hs.dgsw.iidx.service;

import kr.hs.dgsw.iidx.dto.UserDto;
import kr.hs.dgsw.iidx.entity.UserEntity;
import org.apache.coyote.BadRequestException;

import java.util.List;

public interface UserService {
    UserDto getUserRank(Long id) throws BadRequestException;

    List<UserEntity> getAllUserRank() throws BadRequestException;

    UserDto createUserRank(UserDto dto);

    UserDto updateUserRank(UserDto dto) throws BadRequestException;

    void deleteUserRank(Long id) throws BadRequestException;

}
