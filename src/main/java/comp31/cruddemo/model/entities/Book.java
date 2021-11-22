package comp31.cruddemo.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="BOOK")
public class Book {
    //public class is used to extract all info regarding books
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="BOOK_ID")
    private Long id;

//title of the book
    @Column(name="BOOK_TITLE")
    private String title;
    //
    @Coloumn(name="BOOK_PRICE")
    private Double price;
//year of the book

    @Column(name="BOOK_YEAR")
    private String year;
    @ManyToOne 
    @JoinColumn(name = "AUTHOR_ID", nullable = true)
    private Author author;
}
