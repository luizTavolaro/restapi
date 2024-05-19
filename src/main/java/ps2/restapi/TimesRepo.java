package ps2.restapi;

// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.CrudRepository;

public interface TimesRepo extends CrudRepository<Time, Long> {
}

