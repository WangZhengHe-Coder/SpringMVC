package com.wangzhenghe.dao;

import com.wangzhenghe.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //添加一本书
    public int addBook(Books book);

    //查询所有书
    public List<Books> queryBook();

    //根据id删除一本书
    public int deleteBookById(@Param("bookID") int bookID);

    //更新Book
    public int updateBook(Books books);

    //根据id查询返回一本书
    public Books queryBookById(@Param("bookID") int bookID);

}
