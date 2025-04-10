package io.github.s0ooo0k.day54.service;


import io.github.s0ooo0k.day54.model.domain.Memo;

import java.util.List;


public interface MemoService {
    List<Memo> findAll();

    void create(Memo memo) throws Exception;

    void deleteAll();

    void deleteById(Long id);

    Memo findById(Long id);

    void update(Memo newMemo);
}