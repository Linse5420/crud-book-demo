package comp31.cruddemo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import comp31.cruddemo.services.BookService;

//books the service fornthe author
@Controller
public class BookController {
    
    BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        super();
        this.bookService = bookService;
    }

    Logger logger = LoggerFactory.getLogger(BookController.class);
    //the getmapping lab

    @GetMapping("/")
    public String getIndex()
    {
            return "index";
    }
    @GetMapping("/test")
    public String getTest(Model model)
    {
            model.addAttribute("books",bookService.test());
            return "books";
    }

     //getMapping method
    @GetMapping("/books")
    public String getBooks(
        @RequestParam(required=false) String firstName, 
        @RequestParam(required=false) String lastName, 
        Model model)
    {
        //check to confirm wherther author name is valid
        boolean authorNameInvalid = 
            firstName == null || firstName.isEmpty() || 
            lastName  == null || lastName.isEmpty();
        //continues if the author name is valid
        if (authorNameInvalid)
        {   model.addAttribute("books", bookService.findBooks());
        }
        else
        {   logger.info("Author Name: ", firstName + " " + lastName);
            model.addAttribute("books", bookService.findBooksByAuthor(firstName,lastName));
        }
        return "books";
    }

    @GetMapping("/authors")
    public String getAuthors(Model model)
    {
        model.addAttribute("authors" , bookService.findAuthors());
        return "authors";
    }
    @GetMapping("/test1")
    public String getTest1( @RequestParam(required=false) String letters,Model model)
    {
        model.addAttribute("authors",bookService.findAuthorslastNameThatBeginWithLetters(letters));
        return "authors";
    }
    @GetMapping("/test2")
    public String getTest2(@RequestParam(required=false) String letter,Model model)
    {
        model.addAttribute("authors",bookService.findAuthorsByLastNameStartingWithLetter(letter));
        return "authors";
    }
    @GetMapping("/test3")
    public String getTest3(@RequestParam(required=false) Model model)
    {
        model.addAttribute("books",bookService.findAllByOrderByPriceAsc());
        return "books";
    }
    @GetMapping("/test4")
    public String getTest4(@RequestParam(required=false) String letter, Model model)
    {
        model.addAttribute("books",bookService.findBooksByTitleContainingKeyword(letter));
        return "books";
    }
    @GetMapping("/test5")
    public String getTest5(@RequestParam(required=false) String letter1,String letter2, Model model)
    {
        model.addAttribute("books",bookService.findBooksContainKeywords(letter1,letter2));
        return "books";
    }
    @GetMapping("/test6")
    public String getTest6(@RequestParam(required=false)String letter1,String letter2, Model model)
    {
        model.addAttribute("books",bookService.findBooksByTitleContainingKeywordAndNotContaingKeyword("l","n"));
        return "books";
    }




}
