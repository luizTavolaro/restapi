package ps2.restapi;

import java.sql.SQLException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class TimeController {

	@Autowired
	private TimesRepo timesRepo;


	@GetMapping("/api/times")
	Iterable<Time> getTimes() throws SQLException {
		return timesRepo.findAll();
	}
	
	@GetMapping("/api/times/{id}")
	Optional<Time> getTime(@PathVariable long id) {
		return timesRepo.findById(id);
	}

	@GetMapping("/api/times/cidade")
	Iterable<Time> getTimeByCidade(@RequestParam(name = "cidade") String cidade) {
		return timesRepo.findByCidade(cidade);
	}
	
	@PostMapping("/api/times")
	Time createTime(@RequestBody Time t) {
		Time createTime = timesRepo.save(t);
		return createTime;
	}

	
	@PutMapping("/api/times/{timeId}")
	Optional<Time> updateTime(@RequestBody Time timeRequest, @PathVariable long timeId) {
		Optional<Time> opt = timesRepo.findById(timeId);
		if(opt.isPresent()){
			if(timeRequest.getId()==timeId){
				timesRepo.save(timeRequest);
				return opt;
			}
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erro ao alterar dados do time com id " + timeId);
	}	
	
	@DeleteMapping("/api/times/{id}")
	void deleteTime(@PathVariable long id) {
		timesRepo.deleteById(id);
	}		
}


