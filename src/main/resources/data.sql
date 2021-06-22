DROP TABLE IF EXISTS Utenti;

CREATE TABLE Utenti (
                        id INT AUTO_INCREMENT  PRIMARY KEY,
                        nome VARCHAR(250) NOT NULL,
                        cognome VARCHAR(250) NOT NULL
);

INSERT INTO Utenti (id,nome, cognome) VALUES
(1,'Aliko', 'Dangote'),
(3,'Bill', 'Gates'),
(4,'Folrunsho', 'Alakija');