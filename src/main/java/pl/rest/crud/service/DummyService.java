package pl.rest.crud.service;

import org.springframework.stereotype.Service;
import pl.rest.crud.dto.DummyDto;
import pl.rest.crud.mapper.DummyMapper;
import pl.rest.crud.model.Dummy;
import pl.rest.crud.repository.DummyRepository;

@Service
public class DummyService {

    private DummyRepository dummyRepository;
    private DummyMapper dummyMapper;

    public DummyService(DummyRepository dummyRepository, DummyMapper dummyMapper) {
        this.dummyRepository = dummyRepository;
        this.dummyMapper = dummyMapper;
    }

    public DummyDto dummyBusiness() {
        return dummyMapper.toDummyDto(Dummy.builder()
                .id(1L)
                .dummyAge(13)
                .dummyName("Really dummy..")
                .build()
        );
    }
}
