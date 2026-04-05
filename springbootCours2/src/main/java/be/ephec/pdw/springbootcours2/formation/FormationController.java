package be.ephec.pdw.springbootcours2.formation;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/formations")
@RequiredArgsConstructor
public class FormationController {

    private final FormationService formationService;
    private final FormationMapper formationMapper;


    @GetMapping(produces = "application/json")
    public List<FormationDTO> getFormations() { return formationMapper.toDtoList(formationService.findAll()); }

    @GetMapping(path = "/angular", produces = "application/json")
    public List<FormationDTO> getAngularRelatedFormations()
    {
        return formationMapper.toDtoList(formationService.findAllAngularRelatedFormations());
    }

    @GetMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<FormationDTO> formationById(@PathVariable("id") UUID id) {
        return ResponseEntity.of(
                formationService.findById(id)
                        .map(formationMapper::toDto)
        );
    }

    @PostMapping(consumes = "application/json")
    public void addFormation(@RequestBody FormationDTO formationDto) {

        Formation formation = formationMapper.toEntity(formationDto);
        formationService.addFormation(formation);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteFormationById(@PathVariable("id") UUID id) {
        formationService.deleteFormationById(id);
    }

}
