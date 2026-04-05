CREATE TABLE formation (
   id UUID NOT NULL,
   title VARCHAR(255) NOT NULL,
   description VARCHAR(1000),
   location VARCHAR(255),
   date DATE,
   CONSTRAINT pk_formation PRIMARY KEY (id)
);

CREATE TABLE formation_tag (
   id UUID NOT NULL,
   text VARCHAR(255) NOT NULL,
   formation_id UUID NOT NULL,
   CONSTRAINT pk_formation_tag PRIMARY KEY (id)
);

ALTER TABLE formation_tag
    ADD CONSTRAINT fk_formation_tag_formation
    FOREIGN KEY (formation_id)
    REFERENCES formation(id)
    ON DELETE CASCADE;

CREATE INDEX idx_formation_tag_formation_id ON formation_tag(formation_id);
