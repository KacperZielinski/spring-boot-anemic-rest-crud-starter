package pl.rest.crud.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DummyDto implements Serializable {
    private static final long serialVersionUID = 2471539214785929291L;

    private long id;
    private String dummyName;
    private int dummyAge;
}
