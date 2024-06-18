package kr.hs.dgsw.iidx.controller;

import kr.hs.dgsw.iidx.dto.IIDXDto;
import kr.hs.dgsw.iidx.entity.IIDXEntity;
import kr.hs.dgsw.iidx.service.UploadService;
import kr.hs.dgsw.iidx.service.UploadServiceImpl;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/upload")
@RequiredArgsConstructor
@Slf4j
public class UploadController {
    private final UploadService uploadService;
    @PostMapping("create-iidx")
    public IIDXDto createIIDX(@RequestBody IIDXDto dto) {
        return uploadService.createIIDX(dto);
    }
}
