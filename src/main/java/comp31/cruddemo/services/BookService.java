package comp31.cruddemo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comp31.cruddemo.model.entities.Author;
import comp31.cruddemo.model.entities.Book;
import comp31.cruddemo.model.repositories.AuthorRepo;
import comp31.cruddemo.model.repositories.BookRepo;

@Service
public class BookService {
    
    BookRepo bookRepo;
    AuthorRepo authorRepo;
    
    @Autowired
    public BookService (BookRepo bookRepo, AuthorRepo authorRepo) {
        super();
        this.bookRepo = bookRepo;
        this.authorRepo = authorRepo;
    }

/// the find all function is used  to find all the authors
    public Iterable<Author> findAuthors()
    {
        return authorRepo.findAll();
    }
// the following function is used to find all th books from the array
    public Iterable<Book> findBooks()
    {
        return bookRepo.findAll();
    }
// the following is used to extract the name of the customer by their name based upon the given condition statements
    public Iterable<Book> findBooksByAuthor(String firstName, String lastName)
    {        
        List <Book> bookList = new ArrayList<>();
        List<Author> authorList = authorRepo.findByFirstNameAndLastName(firstName,lastName);
        if (!authorList.isEmpty())
        {
            Author author = authorList.get(0);
            bookList = author.getBooks();            
        }
        return bookList;
    }
    public List<Book>test()
    {
        //tring out diffrent functions
        //return bookRepo.findByYearOrderByAuthorLastNameAsc("2019");
        Author author=authorRepo.findOneByLastName("savich");
       return bookRepo.findByAuthorAndTitleContaining(author, "java");

    }
    public List<Author>findAuthorsByLastNameStartingWithLetter(char letter)
    {
        return authorRepo.findByLastNameStartingWith(letter);
    }
    public List<Author>findAuthorslastNameThatBeginWithLetters(String letters){
        return authorRepo.findByLastNameStartingWithIgnoreCase(letters);
    }
    public List<Book>findBooksByPriceIncreasingly()
    {
        return bookRepo.findAllByOrderByPriceAsc();

    }
    public List<Book>findBooksContainKeywords(String keyword1, String keyword2)
    {
        return bookRepo.findByTitleContainingAndTitleContaining(keyword1,keyword2);
    }
    public List<Book>findBooksByTitleContainingKeyword(String keyword)
    {
        return bookRepo.findByTitleNotContaining(keyword);
    }
    public List<Book>findBooksByTitleContainingKeywordAndNotContaingKeyword(String keyword1, String keyword2)
    {
        return bookRepo.findByTitleContainingAndTitleNotContaining(keyword1,keyword2);
    }

}
