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
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class AplicativoController {

	@Autowired
	private AplicativosRepo aplicativosRepo;


	@GetMapping("/api/aplicativos")
	Iterable<Aplicativo> getAplicativo() throws SQLException {
		return aplicativosRepo.findAll();
	}
	
	@GetMapping("/api/aplicativos/{id}")
	Optional<Aplicativo> getAplicativo(@PathVariable long id) {
		return aplicativosRepo.findById(id);
	}
	
	@PostMapping("/api/aplicativos")
	Aplicativo createAplicativo(@RequestBody Aplicativo a) {
		Aplicativo createAplicativo = aplicativosRepo.save(a);
		return createAplicativo;
	}

	
	@PutMapping("/api/aplicativos/{aplicativoId}")
	Optional<Aplicativo> updateAplicativo(@RequestBody Aplicativo aplicativoRequest, @PathVariable long aplicativoId) {
		Optional<Aplicativo> opt = aplicativosRepo.findById(aplicativoId);
		if(opt.isPresent()){
			if(aplicativoRequest.getId()==aplicativoId){
				aplicativosRepo.save(aplicativoRequest);
				return opt;
			}
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erro ao alterar dados do Aplicativo com id " + aplicativoId);
	}	
	
	@DeleteMapping("/api/aplicativos/{id}")
	void deleteAplicativo(@PathVariable long id) {
		aplicativosRepo.deleteById(id);
	}		
}


