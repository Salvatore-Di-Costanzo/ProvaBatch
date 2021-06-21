DROP TABLE IF EXISTS Utenti;

CREATE TABLE Utenti (
                              id INT AUTO_INCREMENT  PRIMARY KEY,
                              nome VARCHAR(250) NOT NULL,
                              cognome VARCHAR(250) NOT NULL
);

INSERT INTO Utenti (nome, cognome) VALUES
                                            ('Aliko', 'Dangote'),
                                            ('Bill', 'Gates'),
                                            ('Folrunsho', 'Alakija');