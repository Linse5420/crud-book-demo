package comp31.cruddemo.model.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import comp31.cruddemo.model.entities.Author;
import comp31.cruddemo.model.entities.Book;

@Repository
public interface BookRepo extends CrudRepository<Book,Long>{
    //variety of functions that can be used for extracting information
    List<Book> findByAuthor(Author author);
    List<Book> findByYear(String year);
    List<Book> findByYearOrderByAuthorLastNameAsc(String year);
    List<Book> findByYearOrderByAuthorLastNameDesc(String year);
    List<Book> findByTitleContaining(String Keyword);
    List<Book> findByAuthorAndTitleContaining(Author author,String keyword);

    List<Book>findAllByOrderByPriceAsc();
    List<Book>findByTitleContainingAndTitleContaining(String keyword1, String keyword2);
    List<Book>findByTitleNotContaining(String keyword);
    List<Book>findByTitleContainingAndTitleNotContaining(String keyword1,String keyword2);
    
}
