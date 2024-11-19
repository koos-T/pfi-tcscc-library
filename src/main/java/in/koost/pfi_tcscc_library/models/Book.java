package in.koost.pfi_tcscc_library.models;

import in.koost.pfi_tcscc_library.enums.Genre;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private java.lang.String name;
    private double price;

    @Enumerated(value = EnumType.STRING )
    private Genre genre;

    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY)
    private List<Transaction> transaction;

    @ManyToOne
    @JoinColumn
    private Author author;

    @ManyToOne
    @JoinColumn
    private Student student;

    @CreationTimestamp
    private Date createdOn;

    @UpdateTimestamp
    private Date updatedOn;


}
