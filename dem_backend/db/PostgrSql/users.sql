BEGIN;

CREATE TABLE users (
    user_id UUID PRIMARY KEY,
    username TEXT,
    name TEXT,
    region TEXT,
    address TEXT,
    email TEXT,
    total_energy_produced INT,
    total_energy_consumed INT
);

COMMIT;
