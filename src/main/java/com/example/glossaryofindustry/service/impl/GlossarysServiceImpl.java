package com.example.glossaryofindustry.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.glossaryofindustry.container.searchcondition.GlossarysSearchCondition;
import com.example.glossaryofindustry.domains.Glossarys;
import com.example.glossaryofindustry.mappers.GlossarysMapper;
import com.example.glossaryofindustry.service.GlossarysService;

@Service
public class GlossarysServiceImpl implements GlossarysService {

    @Autowired
    private GlossarysMapper glossarysMapper;

    @Override
    public List<Glossarys> findBySearchCondition(GlossarysSearchCondition searchCondition) {
        List<Glossarys> glossarysList = glossarysMapper.findBySearchCondition(searchCondition);
        return glossarysList;
    }

    @Override
    public void addGlossarys(int fieldChildId, String terminology, String desc) {
        glossarysMapper.addGlossarys(fieldChildId, terminology, desc);

    }

}
