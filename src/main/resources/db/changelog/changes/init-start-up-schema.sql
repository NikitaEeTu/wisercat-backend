-- liquibase formatted sql
-- changeset Liquibase nikita podkopaev:init-start-up-schema
-- preconditions onFail:MARK_RAN
-- precondition-sql-check expectedResult:0 SELECT COUNT(*) FROM information_schema.tables WHERE table_name = 'filter'
CREATE TABLE filter (
                        id SERIAL PRIMARY KEY,
                        name VARCHAR(50),
                        selection VARCHAR(16)
);

-- preconditions onFail:MARK_RAN
-- precondition-sql-check expectedResult:0 SELECT COUNT(*) FROM information_schema.tables WHERE table_name = 'criteria'
CREATE TABLE criteria(
                         id        SERIAL PRIMARY KEY,
                         name      VARCHAR(50),
                         condition VARCHAR(20),
                         value     VARCHAR(50),
                         filterId  INT,
                         FOREIGN KEY (filterId) REFERENCES filter(id)
);