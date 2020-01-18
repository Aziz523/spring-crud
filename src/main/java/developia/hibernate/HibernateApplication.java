package developia.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateApplication implements CommandLineRunner {

    @Autowired
    BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(HibernateApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
//        Book book = new Book();
//        Book.setTitle();
//        Book.setIsbn();
//        Book.setAuthor();
//
//        bookRepository.save(car);
//
//		Book book = bookRepository.findById(10L).get();
//		bookRepository.delete(car);
    }
}
