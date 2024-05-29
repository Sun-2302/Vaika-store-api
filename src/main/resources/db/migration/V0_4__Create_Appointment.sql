CREATE TABLE "appointment"
(
    id               VARCHAR PRIMARY KEY DEFAULT uuid_generate_v4(),
    message          VARCHAR NOT NULL,
    contact          VARCHAR,
    appointment_date TIMESTAMP           DEFAULT now(),
    status           VARCHAR NOT NULL,
    user_id          VARCHAR REFERENCES "user" (id),
    car_id           VARCHAR REFERENCES "car" (id)

)