package pl.rest.crud.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Dummy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String dummyName;
    private int dummyAge;
}
