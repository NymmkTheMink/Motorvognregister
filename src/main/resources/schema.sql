CREATE TABLE motorvogn
(
    id INTEGER AUTO_INCREMENT NOT NULL,
    persNum VARCHAR(255) NOT NULL,
    navn VARCHAR(255) NOT NULL,
    adresse VARCHAR(255) NOT NULL,
    kjennetegn VARCHAR(255) NOT NULL,
    bilmerke VARCHAR(255) NOT NULL,
    biltype VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);