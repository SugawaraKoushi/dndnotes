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

    @Column(nullable = false)
    private String name;

    @Column
    private String shortDescription;

    @Column(length = 5000)
    private String description;
}
