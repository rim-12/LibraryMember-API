package biblio.gestion.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.internal.bytebuddy.dynamic.loading.InjectionClassLoader;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String titre;
private String Date_Publication;
private String Langue;
@OneToMany
 private List<Genre> genres = new ArrayList<>();
}
