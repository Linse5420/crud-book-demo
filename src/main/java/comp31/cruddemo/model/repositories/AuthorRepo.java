package comp31.cruddemo.model.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import comp31.cruddemo.model.entities.Author;

@Repository
public interface AuthorRepo extends CrudRepository<Author,Long> {
    //findByLatName sorts the autors and finds the author with the matching last name
    List<Author> findByLastName(String lastName);
    //the second query is used to find the author by using the first and last name
    List<Author> findByFirstNameAndLastName(String firstName,String lastName);
Author findOneByLastName(String lastName);
}

