package kr.hs.dgsw.iidx.controller;

import kr.hs.dgsw.iidx.dto.IIDXDto;
import kr.hs.dgsw.iidx.service.UploadService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.BadRequestException;
import org.springframework.web.bind.annotation.*;

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

    @PatchMapping("update-iidx")
    public IIDXDto updateIIDX(@RequestBody IIDXDto dto) throws BadRequestException  {
        return uploadService.updateIIDX(dto);
    }

    @DeleteMapping("delete-iidx")
    public void deleteIIDX(@RequestParam Long id) throws BadRequestException {
        uploadService.deleteIIDX(id);
    }
}
