ALTER TABLE post
DROP
COLUMN date;

ALTER TABLE post
    ADD date TIMESTAMP WITHOUT TIME ZONE;
