package pl.rest.crud.mapper;

import org.springframework.stereotype.Component;
import pl.rest.crud.dto.DummyDto;
import pl.rest.crud.model.Dummy;

@Component
public class DummyMapper {
    public DummyDto toDummyDto(Dummy dummy) {
        DummyDto dummyDto = new DummyDto();
        dummyDto.setId(dummy.getId());
        dummyDto.setDummyAge(dummy.getDummyAge());
        dummyDto.setDummyName(dummy.getDummyName());

        return dummyDto;
    }

    public Dummy toDummy(DummyDto dummyDto) {
        Dummy dummy = new Dummy();
        dummy.setId(dummyDto.getId());
        dummy.setDummyAge(dummyDto.getDummyAge());
        dummy.setDummyName(dummyDto.getDummyName());

        return dummy;
    }
}
