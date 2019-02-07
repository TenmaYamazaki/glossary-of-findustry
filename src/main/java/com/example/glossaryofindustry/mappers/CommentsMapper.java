package com.example.glossaryofindustry.mappers;

import java.util.List;

import com.example.glossaryofindustry.domains.Comments;

public interface CommentsMapper {

    /**
     * すべてのコメントを取得する
     * 
     * @return
     */
    List<Comments> all();

    List<Comments> findById(String id);
}
