CREATE TABLE history_product (
    id VARCHAR(36) PRIMARY KEY,
    product_id VARCHAR(36) NOT NULL,
    stock DECIMAL(10, 2) NOT NULL,
    event_type VARCHAR(15) NOT NULL,
    registration_date TIMESTAMP NOT NULL
);