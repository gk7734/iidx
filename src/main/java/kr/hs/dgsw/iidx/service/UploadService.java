package kr.hs.dgsw.iidx.service;


import kr.hs.dgsw.iidx.dto.IIDXDto;
import kr.hs.dgsw.iidx.entity.IIDXEntity;
import org.apache.coyote.BadRequestException;

public interface UploadService {
    IIDXDto createIIDX(IIDXDto dto);
    IIDXDto updateIIDX(IIDXDto dto) throws BadRequestException;
    void deleteIIDX(Long id) throws BadRequestException;
}
