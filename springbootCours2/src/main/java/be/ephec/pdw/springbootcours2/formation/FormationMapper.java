package be.ephec.pdw.springbootcours2.formation;

import org.mapstruct.*;


import java.util.List;

@Mapper(componentModel = "spring", uses = {FormationTagMapper.class})
public interface FormationMapper {

    FormationDTO toDto(Formation formation);

    Formation toEntity(FormationDTO formationDTO);

    List<FormationDTO> toDtoList(List<Formation> formations);

    @AfterMapping
    default void linkTags(@MappingTarget Formation formation) {
        if (formation.getTags() != null) {
            formation.getTags().forEach(tag -> tag.setFormation(formation));
        }
    }
}
