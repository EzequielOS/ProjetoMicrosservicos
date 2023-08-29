package br.edu.iftm.ProjetoMicrosservicos.repositories;

import br.edu.iftm.ProjetoMicrosservicos.models.Developer;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperRepository extends MongoRepository<Developer, ObjectId>{
}
