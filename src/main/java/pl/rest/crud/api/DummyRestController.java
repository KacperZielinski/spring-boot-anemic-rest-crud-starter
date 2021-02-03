package pl.rest.crud.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.rest.crud.dto.DummyDto;
import pl.rest.crud.service.DummyService;

@RestController
@RequestMapping("/dummy")
public class DummyRestController {

    private DummyService dummyService;

    public DummyRestController(DummyService dummyService) {
        this.dummyService = dummyService;
    }

    @GetMapping
    public DummyDto dummyAnemicGet() {
        return dummyService.dummyBusiness();
    }
}
