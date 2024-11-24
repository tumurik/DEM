-- Role: dem
-- DROP ROLE dem;
--right click on database open query tool
CREATE USER dem WITH PASSWORD '123';
CREATE DATABASE dem
    WITH
    OWNER = dem
    ENCODING = 'UTF8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;
--open dem database
CREATE SCHEMA dem AUTHORIZATION dem;


COMMENT ON DATABASE dem
    IS 'Database for Delivery Energy Marketplace';

GRANT ALL PRIVILEGES ON DATABASE dem TO dem;
ALTER USER dem CREATEDB;