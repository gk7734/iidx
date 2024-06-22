package kr.hs.dgsw.iidx.service;

import kr.hs.dgsw.iidx.dto.UserDto;

public interface UserService {
    UserDto getUserRank(Long id);
    UserDto getAllUserRank(String username);
    UserDto createUserRank(UserDto dto);
    void updateUserRank(UserDto dto);
    void deleteUserRank(Long id);

}
