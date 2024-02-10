package troxya.NEP.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity(name = "expenses")
@Getter
@Setter
@NoArgsConstructor
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,  generator = "expense_generator")
    @SequenceGenerator(name = "expense_generator", sequenceName = "expenses_id_seq", allocationSize = 1)
    private Long id;
    private Integer sum;
    private Long monthId;
    private Long categoryId;
    private Date spentAt;
    private String description;
}
