CREATE TABLE app_user
(
    id   BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    name VARCHAR(255)                            NOT NULL,
    CONSTRAINT pk_appuser PRIMARY KEY (id)
);

CREATE TABLE comments
(
    id      BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    text    VARCHAR(255)                            NOT NULL,
    date    date                                    NOT NULL,
    user_id BIGINT                                  NOT NULL,
    CONSTRAINT pk_comments PRIMARY KEY (id)
);

CREATE TABLE posts
(
    id      BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    text    VARCHAR(255)                            NOT NULL,
    date    date                                    NOT NULL,
    user_id BIGINT                                  NOT NULL,
    CONSTRAINT pk_posts PRIMARY KEY (id)
);

ALTER TABLE comments
    ADD CONSTRAINT FK_COMMENTS_ON_USERID FOREIGN KEY (user_id) REFERENCES app_user (id);

ALTER TABLE posts
    ADD CONSTRAINT FK_POSTS_ON_USERID FOREIGN KEY (user_id) REFERENCES app_user (id);