CREATE TABLE Usuario (
senha VARCHAR(10),
idUsuario INTEGER PRIMARY KEY,
email VARCHAR(30),
cpf VARCHAR(15),
nome VARCHAR(50)
);

CREATE TABLE Reserva (
checkout VARCHAR(10),
checkin VARCHAR(10),
idReserva INTEGER PRIMARY KEY,
idDestino INTEGER,
idUsuario INTEGER,
FOREIGN KEY(idUsuario) REFERENCES Usuario (idUsuario)
);

CREATE TABLE Destino (
idDestino INTEGER PRIMARY KEY,
nome VARCHAR(50)
);

ALTER TABLE Reserva ADD FOREIGN KEY(idDestino) REFERENCES Destino (idDestino);
