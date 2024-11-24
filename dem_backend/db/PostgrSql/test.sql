BEGIN;

CREATE TABLE dem.users (
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

BEGIN;

CREATE TABLE dem.iot_devices (
    device_id UUID PRIMARY KEY,
    user_id UUID,
    serial_number INT,
    CONSTRAINT user_id FOREIGN KEY (user_id) REFERENCES dem.users(user_id) ON UPDATE CASCADE ON DELETE RESTRICT
);

COMMIT;

BEGIN;

CREATE TABLE dem.wallets (
    public_key UUID PRIMARY KEY,
    user_id UUID NOT NULL,
    private_key_hash VARCHAR(255) NOT NULL,
    balance NUMERIC(20, 2),
    creation_date TIMESTAMP NOT NULL,
    CONSTRAINT user_id FOREIGN KEY (user_id) REFERENCES dem.users(user_id) ON UPDATE CASCADE ON DELETE RESTRICT
);

COMMIT;

BEGIN;

CREATE TABLE dem.transaction_ledger (
    transaction_id UUID PRIMARY KEY,
    datetime TIMESTAMP,
    iot_device_id UUID,
    from_wallet UUID,
    to_wallet UUID,
    token_amount INT,
    transaction_type TEXT,
    block_number INT,
    transaction_hash TEXT,
    status TEXT,
    CONSTRAINT iot_device_id FOREIGN KEY (iot_device_id) REFERENCES dem.iot_devices(device_id) ON UPDATE CASCADE ON DELETE RESTRICT,
    CONSTRAINT from_wallet FOREIGN KEY (from_wallet) REFERENCES dem.wallets(public_key) ON UPDATE CASCADE ON DELETE RESTRICT,
    CONSTRAINT to_wallet FOREIGN KEY (to_wallet) REFERENCES dem.wallets(public_key) ON UPDATE CASCADE ON DELETE RESTRICT
);

COMMIT;

INSERT INTO dem.users (
    user_id, username, name, region, address, email, total_energy_produced, total_energy_consumed
)
VALUES
(
    'f4a70ac9-8a2f-46b2-b287-6e72fa21a2e9',
    'john_doe',
    'John Doe',
    'North Region',
    '1234 Elm St, Springfield, IL',
    'john.doe@example.com',
    500000,
    200000
);

INSERT INTO dem.users (
    user_id, username, name, region, address, email, total_energy_produced, total_energy_consumed
)
VALUES
(
    'f4a70ac9-8a2f-46b2-b287-6e72fa21a2e8',
    'johnessa',
    'Johne',
    'South Region',
    '1234 Elm St, Springfield, IL',
    'john.doe@example.com',
    800000,
    100
);


INSERT INTO dem.dem.iot_devices (device_id, user_id, serial_number)
VALUES
  ('d7b9f7c3-5fc4-4b9e-8bbf-8b43e35a7b70', 'f4a70ac9-8a2f-46b2-b287-6e72fa21a2e9', 1234567);

INSERT INTO dem.wallets (public_key, user_id, private_key_hash, balance, creation_date)
VALUES
  ('f4b9b5b1-3cbe-4876-b7d3-cf9e5c7d2db2', 'f4a70ac9-8a2f-46b2-b287-6e72fa21a2e9', 'abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890', 1000.50, '2024-11-24 12:30:00'),
  ('f4a70ac9-8a2f-46b2-b287-6e72fa21a2e9', 'f4a70ac9-8a2f-46b2-b287-6e72fa21a2e9', 'abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567891', 500.00, '2024-11-24 12:45:00');

INSERT INTO dem.transaction_ledger (
    transaction_id,
    datetime,
    iot_device_id,
    from_wallet,
    to_wallet,
    token_amount,
    transaction_type,
    block_number,
    transaction_hash,
    status
)
VALUES
  ('e7b7c5f9-5fd8-466f-b9da-3bba8e4c7847',
   '2024-11-24 12:30:00',
   'd7b9f7c3-5fc4-4b9e-8bbf-8b43e35a7b70',
   'f4b9b5b1-3cbe-4876-b7d3-cf9e5c7d2db2',
   'f4a70ac9-8a2f-46b2-b287-6e72fa21a2e9',
   100,
   'SALE',
   123456,
   '0xabcdef1234567890',
   'PENDING');
