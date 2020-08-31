import com.cc.pojo.Books;
import com.cc.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean("bookServiceImpl", BookService.class);

        List<Books> books = bookService.queryAllBook();
        for (Books book : books) {
            System.out.println(book);
        }

    }
}
