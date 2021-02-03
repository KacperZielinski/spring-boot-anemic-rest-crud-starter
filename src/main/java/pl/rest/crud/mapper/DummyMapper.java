package pl.rest.crud.mapper;

import org.mapstruct.Mapper;
import pl.rest.crud.dto.DummyDto;
import pl.rest.crud.model.Dummy;

@Mapper(componentModel = "spring")
public interface DummyMapper {
    DummyDto toDummyDto(Dummy dummy);

    Dummy toDummy(DummyDto dummyDto);
}
