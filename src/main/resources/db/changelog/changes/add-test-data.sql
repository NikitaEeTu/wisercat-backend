-- liquibase formatted sql
-- changeset Liquibase nikita podkopaev:add-test-data
-- preconditions onFail:MARK_RAN
-- precondition-sql-check expectedResult:1 SELECT COUNT(*) FROM information_schema.tables WHERE table_name = 'filter'
INSERT INTO filter (name, selection)
VALUES
    ('Filter 1', 'Selection 1'),
    ('Filter 2', 'Selection 2');

-- preconditions onFail:MARK_RAN
-- precondition-sql-check expectedResult:1 SELECT COUNT(*) FROM information_schema.tables WHERE table_name = 'criteria'
INSERT INTO criteria (name, condition, value, filterId)
VALUES
    ('Amount', 'More', '0', 1),
    ('Title', 'Ends with', 'Meow', 1),
    ('Amount', 'Less', '2', 2);