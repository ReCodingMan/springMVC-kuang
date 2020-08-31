package com.cc.dao;

import com.cc.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

    /**
     * 增加一本书
     */
    int addBook(Books books);

    /**
     * 删除一本书
     */
    int deleteBookById(@Param("bookID") int id);

    /**
     * 更新一本书
     */
    int updateBook(Books books);

    /**
     * 查询一本书
     */
    Books queryBookById(@Param("bookID") int id);

    /**
     * 查询所有书
     */
    List<Books> queryAllBook();

    /**
     * 通过名字查询
     */
    List<Books> queryBookByName(@Param("bookName") String bookName);
}
