package kr.hs.dgsw.iidx.controller;

import kr.hs.dgsw.iidx.dto.IIDXDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("iidx")
@RequiredArgsConstructor
public class IIDXController {
    public void getIIDX(@RequestParam Long id) {

    }
}
