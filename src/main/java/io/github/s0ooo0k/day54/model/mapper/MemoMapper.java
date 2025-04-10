package io.github.s0ooo0k.day54.model.mapper;

import io.github.s0ooo0k.day54.model.domain.Memo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

// Spring
@Repository
// MyBatis
@Mapper
public interface MemoMapper {
    @Select("SELECT * FROM memo")
    List<Memo> findAll();

    @Insert("INSERT INTO memo (text) VALUES (#{text})")
//  Supabase는 알아서 Auto로 증가를 하고 있는데... 이걸 개입하려고 하니까...
//    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Memo memo);

    // TIL : 소프트 딜리트 (Soft Delete) <-> 하드 딜리트 (Hard Delete)
    @Delete("DELETE FROM memo")
    void deleteAll();

    @Delete("DELETE FROM memo WHERE id = (#{id})")
    void deleteById(Long id);

    @Select("SELECT * FROM memo WHERE id = (#{id})")
    Memo findById(Long id);

    @Update("UPDATE memo SET text = (#{text}) WHERE id = (#{id})")
    void update(Memo memo);
}