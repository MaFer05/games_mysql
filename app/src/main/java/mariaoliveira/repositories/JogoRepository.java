package mariaoliveira.repositories;

import org.springframework.data.repository.CrudRepository;

import mariaoliveira.models.Jogo;

public interface JogoRepository extends CrudRepository<Jogo, Integer> {
    
}