package com.cc.service;

import com.cc.dao.BookMapper;
import com.cc.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService {

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    /**
     * 增加一本书
     *
     * @param books
     */
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    /**
     * 删除一本书
     *
     * @param id
     */
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    /**
     * 更新一本书
     *
     * @param books
     */
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    /**
     * 查询一本书
     *
     * @param id
     */
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    /**
     * 查询所有书
     */
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
