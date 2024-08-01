package br.com.cbf.repository;

import br.com.cbf.entity.Jogo;
import br.com.cbf.entity.Time;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeRepository extends JpaRepository<Time, Integer> {

}
