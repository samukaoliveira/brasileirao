package br.com.cbf.repository;

import br.com.cbf.entity.Time;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class JogoRepository extends JpaRepository<Time, Integer> {
}
