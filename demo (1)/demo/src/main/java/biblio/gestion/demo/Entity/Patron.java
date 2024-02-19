package biblio.gestion.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patron {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private long id;
 private String name;
 private String email;
 @ManyToOne
 private List<Book> books = new ArrayList<>();
}
