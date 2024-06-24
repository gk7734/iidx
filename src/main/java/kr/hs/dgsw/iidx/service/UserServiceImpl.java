package kr.hs.dgsw.iidx.service;

import kr.hs.dgsw.iidx.dto.UserDto;
import kr.hs.dgsw.iidx.entity.IIDXEntity;
import kr.hs.dgsw.iidx.entity.UserEntity;
import kr.hs.dgsw.iidx.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository repository;

    @Override
    public UserDto getUserRank(Long id) throws BadRequestException {
        Optional<UserEntity> entity = repository.findById(id);

        if (entity.isPresent()) {
            return new UserDto(entity.get());
        } else {
            throw new BadRequestException();
        }
    }

    @Override
    public List<UserEntity> getAllUserRank(String username) throws BadRequestException {
        List<UserEntity> entities = repository.findByUsername(username);

        if (entities.isEmpty()) {
            throw new BadRequestException();
        }
        return entities;
    }

    @Override
    public UserDto createUserRank(UserDto dto) {
        UserEntity entity = new UserEntity(dto);
        UserEntity _saveEntity = repository.save(entity);

        return new UserDto(_saveEntity);
    }

    @Override
    public UserDto updateUserRank(UserDto dto) throws BadRequestException {
        Optional<UserEntity> result = repository.findById(dto.getId());

        if (result.isPresent()) {
            UserEntity entity = new UserEntity(dto);
            UserEntity _updateEntity = repository.save(entity);

            return new UserDto(_updateEntity);
        } else {
            throw new BadRequestException();
        }
    }

    @Override
    public void deleteUserRank(Long id) throws BadRequestException {
        Optional<UserEntity> result = repository.findById(id);

        if (result.isPresent()) {
            repository.deleteById(id);
        } else {
            throw new BadRequestException();
        }
    }
}
