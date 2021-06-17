package com.southwind.repository;

import com.southwind.entity.Reader;

public interface ReaderRepository {//对应表
    public Reader login(String username,String password);
}
