package kr.hs.dgsw.iidx.service;

import kr.hs.dgsw.iidx.dto.IIDXDto;
import kr.hs.dgsw.iidx.entity.IIDXEntity;
import kr.hs.dgsw.iidx.repository.IIDXRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UploadServiceImpl implements UploadService{
    private final IIDXRepository repository;

    @Override
    public IIDXDto createIIDX(IIDXDto dto) {
        IIDXEntity entity = new IIDXEntity(dto);
        repository.save(entity);

        return dto;
    }

    @Override
    public IIDXDto updateIIDX(IIDXDto dto) {
        return null;
    }

    @Override
    public void deleteIIDX(Long id) {

    }
}
