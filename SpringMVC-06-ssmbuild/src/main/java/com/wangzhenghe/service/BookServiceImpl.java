package com.wangzhenghe.service;

import com.wangzhenghe.dao.BookMapper;
import com.wangzhenghe.pojo.Books;

public class BookServiceImpl implements BookService  {
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }
}
