package be.ephec.pdw.springbootcours2.formation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface FormationRepository extends JpaRepository<Formation, UUID> {

    @Query("SELECT f FROM Formation f join f.tags t where t.text = \"Angular\"")
    List<Formation> findAllAngularRelatedFormations();
}
