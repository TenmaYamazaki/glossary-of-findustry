package com.example.glossaryofindustry.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.glossaryofindustry.container.searchcondition.GlossarysSearchCondition;
import com.example.glossaryofindustry.domains.Glossarys;

@Mapper
public interface GlossarysMapper {

    /**
     * すべての用語情報を取得する
     * 
     * @return
     */
    public List<Glossarys> all();

    /**
     * 検索条件に基づいて用語情報を取得する
     * 
     * @param searchCondition
     * @return
     */
    public List<Glossarys> findBySearchCondition(@Param("searchCondition") GlossarysSearchCondition searchCondition);

    public void addGlossarys(int fieldId, String terminology, String desc, String createUser);
}
