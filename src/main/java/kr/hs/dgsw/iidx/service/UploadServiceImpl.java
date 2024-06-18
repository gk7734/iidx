package kr.hs.dgsw.iidx.service;

import kr.hs.dgsw.iidx.dto.IIDXDto;
import kr.hs.dgsw.iidx.entity.IIDXEntity;
import kr.hs.dgsw.iidx.repository.IIDXRepository;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UploadServiceImpl implements UploadService{
    private final IIDXRepository repository;

    @Override
    public IIDXDto createIIDX(IIDXDto dto) {
        IIDXEntity entity = new IIDXEntity(dto);
        IIDXEntity _savedEntity = repository.save(entity);

        return new IIDXDto(_savedEntity);
    }

    @Override
    public IIDXDto updateIIDX(IIDXDto dto) throws BadRequestException {
        Optional<IIDXEntity> result = repository.findById(dto.getId());

        if (result.isPresent()) {
            IIDXEntity entity = new IIDXEntity(dto);
            repository.save(entity);

            return dto;
        } else {
            throw new BadRequestException();
        }
    }

    @Override
    public void deleteIIDX(Long id) throws BadRequestException {
        Optional<IIDXEntity> result = repository.findById(id);

        if (result.isPresent()) {
            repository.deleteById(id);
        } else {
            throw new BadRequestException();
        }
    }
}
