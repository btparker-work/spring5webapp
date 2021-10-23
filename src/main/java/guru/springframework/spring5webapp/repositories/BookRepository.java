package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.*;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 5/16/17.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
