package kr.hs.dgsw.iidx.controller;

import kr.hs.dgsw.iidx.dto.IIDXDto;
import kr.hs.dgsw.iidx.entity.IIDXEntity;
import kr.hs.dgsw.iidx.service.IIDXService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("iidx")
@Slf4j
@RequiredArgsConstructor
public class IIDXController {
    private final IIDXService iidxService;

    @GetMapping("get-iidx")
    public IIDXDto getIIDX(@RequestParam("id") Long id) {
        return iidxService.getIIDX(id);
    }

    @GetMapping("getAll-iidx")
    public List<IIDXEntity> getAllIIDX() {
        return iidxService.getAllIIDX();
    }

    @GetMapping("get-version")
    public List<IIDXEntity> getVersion(@RequestParam("version") Integer version) {
        return iidxService.getVersion(version);
    }

    @GetMapping("get-nameOrArtistDetail")
    public List<IIDXEntity> getNameOrArtistDetail(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "artist", required = false) String artist) {
        return iidxService.getNameOrArtistDetail(name, artist);
    }
}
