import com.wangzhenghe.pojo.Books;
import com.wangzhenghe.service.BookService;
import com.wangzhenghe.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void myTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookServiceImpl bean = (BookServiceImpl) context.getBean("BookServiceImpl");
        for (Books books : bean.queryBook()) {
            System.out.println(books);
        }
    }
}
