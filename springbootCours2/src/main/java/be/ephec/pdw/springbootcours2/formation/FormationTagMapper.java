package be.ephec.pdw.springbootcours2.formation;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FormationTagMapper {

    FormationTagDTO toDto(FormationTag formationTag);

    @Mapping(target = "formation", ignore = true)
    FormationTag toEntity(FormationTagDTO formationTagDTO);

    List<FormationTagDTO> toDtoList(List<FormationTag> formationTags);

    List<FormationTag> toEntityList(List<FormationTagDTO> formationTagDTOs);
}
