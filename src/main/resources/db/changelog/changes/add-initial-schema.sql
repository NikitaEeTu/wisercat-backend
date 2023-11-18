-- liquibase formatted sql
-- changeset Liquibase nikita podkopaev:add-initial-schema
-- preconditions onFail:MARK_RAN
-- precondition-sql-check expectedResult:0 SELECT COUNT(*) > 0 FROM Filter
CREATE TABLE Filter (
                        id SERIAL PRIMARY KEY,
                        name VARCHAR(50),
                        selection VARCHAR(16)
);

-- preconditions onFail:MARK_RAN
-- precondition-sql-check expectedResult:0 SELECT COUNT(*) > 0 FROM Filter
CREATE TABLE Criteria(
                         id        SERIAL PRIMARY KEY,
                         name      VARCHAR(50),
                         condition VARCHAR(20),
                         value     VARCHAR(50),
                         filterId  INT,
                         FOREIGN KEY (filterId) REFERENCES Criteria(id)
);