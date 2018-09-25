package eleicao.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import eleicao.domain.Candidato;
import eleicao.repositories.CandidatoRepository;

@Service
public class CandidatoService {
	
	private  CandidatoRepository repo;
	
	public Candidato buscarCandidatos (Integer id) {
		Optional<Candidato> obj = repo.findById(id);
				
				return obj.orElse(null);
	}
	
	
	

} 
