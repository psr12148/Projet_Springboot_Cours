insert into formation (id, title, description, location, date)
values ('c79b747e-9c0c-479c-ba34-a9975ecaf8b0',
        'Angular & Java',
        'Description',
        'Bruxelles',
        '2026-02-01');

insert into formation_tag (id, text, formation_id)
values ('e62b418d-8b51-48fc-8bbd-15874857d50a',
        'Angular',
        'c79b747e-9c0c-479c-ba34-a9975ecaf8b0'),
       ('6b061fad-a065-4de9-aa7c-b1d24dcc83e0',
        'Java',
        'c79b747e-9c0c-479c-ba34-a9975ecaf8b0');