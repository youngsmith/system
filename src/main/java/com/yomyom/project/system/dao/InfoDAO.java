package com.yomyom.project.system.dao;

import com.yomyom.project.system.dto.InfoDTO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface InfoDAO {
    public List<InfoDTO> selectAllInfo(Map<String,String> searchingConditions);
}