BEGIN;

CREATE TABLE wallets (
    public_key UUID PRIMARY KEY,
    user_id UUID NOT NULL,
    private_key_hash VARCHAR(255) NOT NULL,
    balance NUMERIC(20, 2),
    creation_date TIMESTAMP NOT NULL,
    CONSTRAINT user_id FOREIGN KEY (user_id) REFERENCES dem.users(user_id) ON UPDATE CASCADE ON DELETE RESTRICT
);

COMMIT;