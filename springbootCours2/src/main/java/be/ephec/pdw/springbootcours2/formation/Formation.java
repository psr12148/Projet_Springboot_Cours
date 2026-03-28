package be.ephec.pdw.springbootcours2.formation;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "formation")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Formation {
    @Id
    private UUID id;
    @Column(nullable = false)
    private String title;
    @Column(length = 1000)
    private String description;
    private String location;
    private LocalDate date;
    @OneToMany(mappedBy = "formation", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FormationTag> tags = new ArrayList<>();

    public void setTags(List<FormationTag> tags) {
        this.tags = tags;
        for (FormationTag tag : tags) {
            tag.setFormation(this); // On lie le tag à cette formation
        }
    }
}
