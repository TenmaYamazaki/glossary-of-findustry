package com.example.glossaryofindustry.service;

import java.util.List;

import com.example.glossaryofindustry.domains.Fields;
import com.example.glossaryofindustry.domains.FieldsChildren;

public interface FieldDivService {

    /**
     * すべての分野区分を取得する
     * 
     * @return 分野区分リスト
     */
    public List<Fields> searchAllFields();

    /**
     * すべての分野子区分を取得する
     * 
     * @return 分野子区分
     */
    public List<FieldsChildren> searchAllFieldsChildren();
}
