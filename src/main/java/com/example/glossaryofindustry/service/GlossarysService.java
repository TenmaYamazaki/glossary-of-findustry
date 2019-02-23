package com.example.glossaryofindustry.service;

import java.util.List;

import com.example.glossaryofindustry.container.searchcondition.GlossarysSearchCondition;
import com.example.glossaryofindustry.domains.Glossarys;

public interface GlossarysService {

    /**
     * 検索条件を元に用語集情報を取得する
     * 
     * @param searchCondition 検索条件
     * @return 用語集リスト
     */
    public List<Glossarys> findBySearchCondition(GlossarysSearchCondition searchCondition);

    /**
     * 用語集情報を追加する
     * 
     * @param fieldChild
     * @param terminology
     * @param desc
     */
    public void addGlossarys(int fieldId, String terminology, String desc);
}
