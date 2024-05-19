package ps2.restapi;

import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface TimesRepo extends CrudRepository<Time, Long> {
    @Query("SELECT t FROM Time t WHERE t.cidade = :cidade")
    Iterable<Time> findByCidade(@Param("cidade") String cidade);
}

