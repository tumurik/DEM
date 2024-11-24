BEGIN;

CREATE TABLE transaction_ledger (
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
