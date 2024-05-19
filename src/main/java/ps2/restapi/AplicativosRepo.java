package ps2.restapi;

import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AplicativosRepo extends CrudRepository<Aplicativo, Long> {
    @Query("SELECT a FROM Aplicativo a WHERE a.nome = :nome")
    Iterable<Aplicativo> findByNome(@Param("nome") String nome);
}

