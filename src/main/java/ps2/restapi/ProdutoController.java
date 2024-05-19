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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class ProdutoController {

	@Autowired
	private ProdutosRepo produtosRepo;


	@GetMapping("/api/produtos")
	Iterable<Produto> getProdutos() throws SQLException {
		return produtosRepo.findAll();
	}
	
	@GetMapping("/api/produtos/{id}")
	Optional<Produto> getProduto(@PathVariable long id) {
		return produtosRepo.findById(id);
	}

	@GetMapping("/api/produtos/marca")
	Iterable<Produto> getProdutosByMarca(@RequestParam(name = "marca") String marca) {
		return produtosRepo.findByMarca(marca);
	}
	
	@PostMapping("/api/produtos")
	Produto createProduto(@RequestBody Produto p) {
		Produto createProd = produtosRepo.save(p);
		return createProd;
	}

	
	@PutMapping("/api/produtos/{produtoId}")
	Optional<Produto> updateProduto(@RequestBody Produto produtoRequest, @PathVariable long produtoId) {
		Optional<Produto> opt = produtosRepo.findById(produtoId);
		if(opt.isPresent()){
			if(produtoRequest.getId()==produtoId){
				produtosRepo.save(produtoRequest);
				return opt;
			}
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erro ao alterar dados do time com id " + produtoId);
	}	
	
	@DeleteMapping("/api/produtos/{id}")
	void deleteProduto(@PathVariable long id) {
		produtosRepo.deleteById(id);
	}		
}


