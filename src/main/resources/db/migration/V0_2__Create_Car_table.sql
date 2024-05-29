CREATE TYPE  status AS ENUM  ('pending,validated,rejected,archived');
CREATE TABLE IF NOT EXISTS "car"
(
    id           VARCHAR PRIMARY KEY DEFAULT uuid_generate_v4(),
    price        DOUBLE PRECISION NOT NULL,
    status       Status,
    type         VARCHAR          NOT NULL,
    brand        VARCHAR          NOT NULL,
    model        VARCHAR          NOT NULL,
    color        VARCHAR          NOT NULL,
    engine       VARCHAR          NOT NULL,
    place_number INT              NOT NULL,
    power        INT              NOT NULL
)