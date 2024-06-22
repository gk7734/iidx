package kr.hs.dgsw.iidx.service;

import jakarta.persistence.EntityNotFoundException;
import kr.hs.dgsw.iidx.dto.IIDXDto;
import kr.hs.dgsw.iidx.entity.IIDXEntity;
import kr.hs.dgsw.iidx.repository.IIDXRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class IIDXServiceImpl implements IIDXService {
    private final IIDXRepository repository;

    @Override
    public IIDXDto getIIDX(Long id) {
        Optional<IIDXEntity> entity = repository.findById(id);

        if (entity.isPresent()) {
            return new IIDXDto(entity.get());
        } else {
            throw new EntityNotFoundException();
        }
    }

    @Override
    public List<IIDXEntity> getAllIIDX() {
        List<IIDXEntity> entityList = repository.findAll();

        if (entityList.isEmpty()) {
            throw new EntityNotFoundException();
        }

        return entityList;
    }

    @Override
    public List<IIDXEntity> getVersion(Integer version) {
        List<IIDXEntity> entityList = repository.findByVersion(version);

        if (entityList.isEmpty()) {
            throw new EntityNotFoundException();
        }

        return entityList;
    }

    @Override
    public List<IIDXEntity> getNameOrArtistDetail(String name, String artist) {
        System.out.println(artist);
        if (name != null && artist != null && !name.isEmpty() && !artist.isEmpty()) {
            System.out.println(1);
            List<IIDXEntity> entities = repository.findByNameAndArtist(name, artist);

            return entities;
        } else if (name != null && !name.isEmpty()) {
            System.out.println(1);
            List<IIDXEntity> entities = repository.findByName(name);

            return entities;
        } else if (artist != null && !artist.isEmpty()) {
            System.out.println(1);
            List<IIDXEntity> entities = repository.findByArtist(artist);

            return entities;
        } else {
            return new ArrayList<>(); // name과 artist가 모두 null이거나 빈 문자열인 경우 빈 리스트를 반환합니다.
        }
    }

}
