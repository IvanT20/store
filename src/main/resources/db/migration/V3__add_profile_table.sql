CREATE TABLE profiles
(
    id              BIGINT PRIMARY KEY,
    bio             TEXT,
    phone_number    VARCHAR(15),
    date_of_birth   DATE,
    loyalty_points  INT UNSIGNED DEFAULT 0,
    CONSTRAINT profiles_users_id_fk
        FOREIGN KEY (id) REFERENCES users (id)
);