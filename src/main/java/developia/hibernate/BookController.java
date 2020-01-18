package developia.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/create")
    public void create(@ModelAttribute Book book){
        bookRepository.save(book);
    }
    @GetMapping("/view")
    public String view(Model model, @RequestParam Long id){
        try {
            Book book = bookRepository.findById(id).get();
            model.addAttribute("book", book);
            return "view";
        } catch (Exception e){
            return "NotFound";
        }
    }
    @PostMapping("/update")
    public String update(@ModelAttribute Book book){
        try{
            bookRepository.save(book);
            return "update";
        }catch (Exception e){
            return "NotFound";
        }
    }

    @PostMapping("/delete")
    public String delete(@RequestParam Long id){
        try{
            Book book = bookRepository.findById(id).get();;
            bookRepository.delete(book);
            return "delete";
        }catch (Exception e){
            return "NotFound";
        }
    }

    @GetMapping("/books")
    public String getBooks(Model model){
        Iterable<Book> books = bookRepository.findAll();
        model.addAttribute("books", books);
        return "books";
    }

}
