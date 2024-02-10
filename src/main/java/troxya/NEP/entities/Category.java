package troxya.NEP.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "categories")
@Getter
@Setter
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,  generator = "category_generator")
    @SequenceGenerator(name = "category_generator", sequenceName = "categories_id_seq", allocationSize = 1)
    private Long id;
    private Long monthId;
    private Integer percent;
    private Integer remains;
    private String name;
}
