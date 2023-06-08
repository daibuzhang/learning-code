package com.laodai.dao.impl;

import com.laodai.dao.BookDao;

public class BookDaoImpl implements BookDao {
    @Override
    public void save(){
        System.out.println("book dao save");
    }
}
