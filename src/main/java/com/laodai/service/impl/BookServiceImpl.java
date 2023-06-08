package com.laodai.service.impl;


import com.laodai.dao.BookDao;

import com.laodai.service.BookService;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;
    public void save(){
        System.out.println("------");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
