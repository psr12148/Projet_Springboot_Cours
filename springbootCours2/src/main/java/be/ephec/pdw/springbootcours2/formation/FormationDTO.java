package be.ephec.pdw.springbootcours2.formation;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public record FormationDTO(UUID id,
                           String title,
                           String description,
                           String location,
                           LocalDate date,
                           List<FormationTagDTO> tags) {
}
