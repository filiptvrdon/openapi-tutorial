DROP TABLE IF EXISTS todo;

CREATE TABLE todo (
  id INTEGER AUTO_INCREMENT NOT NULL  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  description VARCHAR(250) NOT NULL,
  due_at DATETIME NOT NULL,
  created_at DATETIME NOT NULL,
  completed Boolean DEFAULT false
);

INSERT INTO todo (name, description, created_at, due_at, completed) VALUES
  ('Apicur.io', 'Create my first OpenAPI Spec', CURRENT_DATE, CURRENT_DATE, true);

INSERT INTO todo (name, description, created_at, due_at, completed) VALUES
  ('OAG Templating', 'Add DB persistance to my Springboot App', CURRENT_DATE, CURRENT_DATE, true);

INSERT INTO todo (name, description, created_at, due_at, completed) VALUES
  ('OpenApi Generator', 'Generate my OpenAPI Springboot App', CURRENT_DATE, CURRENT_DATE, true);


