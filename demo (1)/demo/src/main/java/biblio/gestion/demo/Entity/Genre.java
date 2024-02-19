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
public class Genre {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String name;
@OneToMany
private List<Book> books = new ArrayList<>();


}
