package ps2.restapi;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.CrudRepository;

public interface ProdutosRepo extends CrudRepository<Produto, Long> {
    @Query("SELECT p FROM Produto p WHERE p.marca = :marca")
    Iterable<Produto> findByMarca(@Param("marca") String marca);
}

