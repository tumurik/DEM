-- Database: oop

-- DROP DATABASE oop;

CREATE DATABASE dem
    WITH
    OWNER = dem
    ENCODING = 'UTF8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

CREATE SCHEMA dem;

COMMENT ON DATABASE oop
    IS 'Database for Delivery Energy Marketplace';
