CREATE TABLE product
(
    id          serial PRIMARY KEY,
    name        VARCHAR   NOT NULL,
    description VARCHAR   NOT NULL,
    brand       VARCHAR   NOT NULL,
    category    VARCHAR   NOT NULL,
    price       NUMERIC   NOT NULL,
    existence   NUMERIC   NOT NULL,
    created_at  TIMESTAMP NOT NULL DEFAULT now()
);