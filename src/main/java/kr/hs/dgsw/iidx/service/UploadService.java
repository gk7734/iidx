package kr.hs.dgsw.iidx.service;


import kr.hs.dgsw.iidx.dto.IIDXDto;
import kr.hs.dgsw.iidx.entity.IIDXEntity;

public interface UploadService {
    IIDXDto createIIDX(IIDXDto dto);
    IIDXDto updateIIDX(IIDXDto dto);
    void deleteIIDX(Long id);
}
