package troxya.NEP.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "months")
@Getter
@Setter
@NoArgsConstructor
public class Month {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,  generator = "month_generator")
    @SequenceGenerator(name = "month_generator", sequenceName = "months_id_seq", allocationSize = 1)
    private Long id;
    private Integer budget;
    private Integer year;
}
