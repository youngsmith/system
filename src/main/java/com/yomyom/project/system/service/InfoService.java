package com.yomyom.project.system.service;

import com.yomyom.project.system.dao.InfoDAO;
import com.yomyom.project.system.dto.InfoDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class InfoService {
    private InfoDAO infoDAO;

    public InfoService(InfoDAO infoDAO){
        this.infoDAO = infoDAO;
    }

    public List<InfoDTO> getInfoList(Map<String,String> searchingConditions){
        return infoDAO.selectAllInfo(searchingConditions);
    }
}
