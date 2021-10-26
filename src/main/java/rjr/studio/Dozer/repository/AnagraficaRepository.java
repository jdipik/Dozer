package rjr.studio.Dozer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rjr.studio.Dozer.entity.AnagraficaEntity;

@Repository
public interface AnagraficaRepository extends JpaRepository<AnagraficaEntity, Long> {

}
