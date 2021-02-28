package com.wangzhenghe.service;

import com.wangzhenghe.dao.BookMapper;
import com.wangzhenghe.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService  {
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    public List<Books> queryBook() {
        return bookMapper.queryBook();
    }

    public int deleteBookById(int bookID) {
        return bookMapper.deleteBookById(bookID);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int bookID) {
        return bookMapper.queryBookById(bookID);
    }
}
