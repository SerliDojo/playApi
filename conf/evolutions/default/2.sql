# --- !Ups

insert into book (name, category) values
  ('coucou tu veux voir', 'porn'),
  ('blanche fesse et les sept mains', 'porn'),
  ('spécial octo pénétration anal', 'porn'),
  ('édition france profonde', 'porn'),
  ('Play2 pour les nulls', 'dev'),
  ('Je peux le prouver', 'esotérrisme');

# --- !Downs

truncate table book;
