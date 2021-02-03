package pl.rest.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rest.crud.model.Dummy;

public interface DummyRepository extends JpaRepository<Dummy, Long> {
}
