package kr.hs.dgsw.iidx.service;

import kr.hs.dgsw.iidx.dto.IIDXDto;
import kr.hs.dgsw.iidx.entity.IIDXEntity;

import java.util.List;

public interface IIDXService {
    IIDXDto getIIDX(Long id);

    List<IIDXEntity> getAllIIDX();

    List<IIDXEntity> getVersion(Integer version);

    List<IIDXEntity> getNameOrArtistDetail(String name, String artist);
}
