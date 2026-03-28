package be.ephec.pdw.springbootcours2.formation;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FormationRepositoryInMemory {
    private static final List<Formation> FORMATIONS = new ArrayList<Formation>();
    static {
        Formation f1 = new Formation(UUID.fromString("59f5cc12-05fe-4771-b7db-d130c7440585"),
                "Angular - premiers pas",
                "Fais tes premiers pas avec Angular",
                "EPHEC",
                LocalDate.of(2026, Month.OCTOBER, 20),
                new ArrayList<>()
        );
        FormationTag tag1 = new FormationTag(
                UUID.fromString("89933487-9ae6-47f9-b0b3-55579e4bfed3"),
                "Angular",
                f1
        );
        FormationTag tag2 = new FormationTag(
                UUID.fromString("393f5024-5053-4ea6-ade6-6e070b5e28a0"),
                "TypeScript",
                f1
        );

        List<FormationTag> listTags1 = new ArrayList<>();
        listTags1.add(tag1);
        listTags1.add(tag2);
        f1.setTags(listTags1);

        Formation f2 = new Formation(
                UUID.fromString("48a94fdb-ec3e-4982-8c18-8f37d4ad7fba"),
                "Java - Springboot",
                "Découvrez Springboot",
                "Remote",
                LocalDate.of(2026, Month.JUNE, 7),
                new ArrayList<>()
        );
        FormationTag tag3 = new FormationTag(
                UUID.fromString("6bdd715d-0003-4480-8dbe-85fffe65538a"),
                "Java",
                f2
        );
        FormationTag tag4 = new FormationTag(
                UUID.fromString("b2472526-e4a1-4e40-9deb-826918621c64"),
                "Springboot",
                f2
        );
        List<FormationTag> listTags2 = new ArrayList<>();
        listTags2.add(tag3);
        listTags2.add(tag4);
        f2.setTags(listTags2);
    }

    /*
    static {
        FORMATIONS.add(new Formation(UUID.fromString("59f5cc12-05fe-4771-b7db-d130c7440585"),
                "Angular - premiers pas",
                "Fais tes premiers pas avec Angular",
                "EPHEC",
                LocalDate.of(2025, Month.OCTOBER, 20),
                new ArrayList<>();
                new FormationTag("71d997a0-ea1c-4959-8ea0-0d0ede245fb7", "Angular"),
                Set.of("Angular", "TypeScript")));
        FORMATIONS.add(new Formation(UUID.fromString("48a94fdb-ec3e-4982-8c18-8f37d4ad7fba"),
                "Java - Springboot",
                "Découvrez Springboot",
                "Remote",
                LocalDate.of(2026, Month.JUNE, 7),
                Set.of("Java", "Springboot")));
        FORMATIONS.add(new Formation(UUID.fromString("1c8e8c77-2e6e-4f09-b703-17d4f2fb2d9c"),
                "Git",
                "Plongez dans Git",
                "Remote",
                LocalDate.of(2026, Month.APRIL, 18),
                Set.of("Git","Gud")));
    }
     */

    /*
    public List<Formation> findAll()
    {
        return FORMATIONS;
    }

    public Optional<Formation> findById(UUID id)
    {
        return FORMATIONS.stream().filter(f -> f.id().equals(id)).findFirst();
    }

    public void addFormation(Formation formation)
    {
        FORMATIONS.add(formation);
    }

    public void deleteFormationById(UUID id)
    {
        FORMATIONS.removeIf(f -> f.id().equals(id));
    }

     */

}
