BEGIN;

CREATE TABLE iot_devices (
    device_id UUID PRIMARY KEY,
    user_id UUID,
    serial_number INT,
    CONSTRAINT user_id FOREIGN KEY (user_id) REFERENCES dem.users(user_id) ON UPDATE CASCADE ON DELETE RESTRICT
);

COMMIT;