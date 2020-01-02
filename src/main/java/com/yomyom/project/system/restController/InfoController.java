package com.yomyom.project.system.restController;

import com.yomyom.project.system.dto.InfoDTO;
import com.yomyom.project.system.service.InfoService;
import org.apache.ibatis.jdbc.Null;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@RestController
@RequestMapping(path = "/api")
public class InfoController {
    private InfoService infoService;

    public InfoController(InfoService infoService) {
        this.infoService = infoService;
    }

    @GetMapping(path = "/info")
    public List<InfoDTO> getInfoList(@RequestParam Map<String,String> searchingConditions) {
        System.out.println(searchingConditions.entrySet());
        return infoService.getInfoList(searchingConditions);
    }
}
