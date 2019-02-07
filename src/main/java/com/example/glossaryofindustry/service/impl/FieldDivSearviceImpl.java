package com.example.glossaryofindustry.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.glossaryofindustry.domains.Fields;
import com.example.glossaryofindustry.domains.FieldsChildren;
import com.example.glossaryofindustry.mappers.FieldsChildrenMapper;
import com.example.glossaryofindustry.mappers.FieldsMapper;
import com.example.glossaryofindustry.service.FieldDivService;

@Service
public class FieldDivSearviceImpl implements FieldDivService {

    @Autowired
    private FieldsMapper fieldsMapper;

    @Autowired
    private FieldsChildrenMapper fieldsChildrenMapper;

    @Override
    public List<Fields> searchAllFields() {
        List<Fields> fieldList = fieldsMapper.all();
        return fieldList;
    }

    @Override
    public List<FieldsChildren> searchAllFieldsChildren() {
        List<FieldsChildren> fieldsChildrenList = fieldsChildrenMapper.all();
        return fieldsChildrenList;
    }

}
