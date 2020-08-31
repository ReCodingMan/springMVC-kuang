package com.cc.controller;

import com.cc.pojo.Books;
import com.cc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * controller 调 service
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    /**
     * 查询全部的书籍，并且返回到一个书籍展示页面
     */
    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }

    /**
     * 新增书籍页面
     */
    @RequestMapping("/toAddBook")
    public String toAddBook() {
        return "addBook";
    }

    /**
     * 新增书
     */
    @RequestMapping("/addBook")
    public String addBook(Books books) {
        System.out.println(books);
        bookService.addBook(books);
        return "redirect:/book/allBook";//重定向到列表页
    }

    /**
     * 修改书籍页面
     */
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(int id, Model model) {
        Books books = bookService.queryBookById(id);
        model.addAttribute("books", books);
        return "updateBook";
    }

    /**
     * 修改书
     */
    @RequestMapping("/updateBook")
    public String updateBook(Books books) {
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    /**
     * 删除书
     */
    @RequestMapping("/deleteBook")
    public String deleteBook(int id) {
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    /**
     * 查询书籍
     */
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model) {
        List<Books> books = bookService.queryBookByName(queryBookName);
        System.out.println(books);
        model.addAttribute("list", books);
        return "redirect:/book/allBook";
    }

}
