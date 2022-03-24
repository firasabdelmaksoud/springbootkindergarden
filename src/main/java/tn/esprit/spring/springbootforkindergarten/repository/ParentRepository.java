package tn.esprit.spring.springbootforkindergarten.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.springbootforkindergarten.entity.Parents;

@Repository

public interface ParentRepository extends CrudRepository<Parents,Integer >{

}
