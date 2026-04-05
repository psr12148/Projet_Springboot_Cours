package be.ephec.pdw.springbootcours2.formation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FormationService {
    private final FormationRepository formationRepository;

    public List<Formation> findAll()
    {
        return formationRepository.findAll();
    }

    public List<Formation> findAllAngularRelatedFormations()
    {
        return formationRepository.findAllAngularRelatedFormations();
    }

    public Optional<Formation> findById(UUID id)
    {
        return formationRepository.findById(id);
    }

    public void addFormation(Formation formation)
    {
        formationRepository.save(formation);
    }

    public void deleteFormationById(UUID id)
    {
        formationRepository.deleteById(id);
    }

}
