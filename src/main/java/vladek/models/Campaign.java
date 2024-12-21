package vladek.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="Campaigns")
public class Campaign {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;
}
