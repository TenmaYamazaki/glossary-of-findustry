package com.example.glossaryofindustry.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.glossaryofindustry.domains.Fields;
import com.example.glossaryofindustry.mappers.FieldsMapper;
import com.example.glossaryofindustry.service.FieldDivService;

@Service
public class FieldDivSearviceImpl implements FieldDivService {

    @Autowired
    private FieldsMapper fieldsMapper;

    @Override
    public List<Fields> searchAllFields() {
        List<Fields> fieldList = fieldsMapper.all();
        return fieldList;
    }

}
