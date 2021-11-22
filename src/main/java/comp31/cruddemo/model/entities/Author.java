package comp31.cruddemo.model.entities;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="AUTHOR")
public class Author {
//public class author is used to extract the author information
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //id of the author
    @Column(name="AUTHOR_ID")
    private Integer authorId;
    //first name 
    @Column(name="FIRST_NAME")
    private String firstName;
    //last name
    @Column(name="LAST_NAME")
    private String lastName;
//list of books
    @OneToMany(mappedBy = "author")
    private List<Book> books;

    public Author()
    {
        authorId = 0;
        firstName = "";
        lastName = "";
        books = null;
    }

}
