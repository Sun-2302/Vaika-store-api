CREATE TABLE IF NOT EXISTS "image"
(
    id     VARCHAR PRIMARY KEY DEFAULT uuid_generate_v4(),
    url    VARCHAR NOT NULL,
    car_id VARCHAR REFERENCES "car"(id)

)