CREATE DATABASE IF NOT EXISTS PRODUCT_CATALOGUE;
USE PRODUCT_CATALOGUE;

CREATE TABLE IF NOT EXISTS CATALOGUE (
    ID INT NOT NULL AUTO_INCREMENT;
    BRAND VARCHAR(30) NOT NULL,
    PRODUCT VARCHAR(30) NOT NULL,
    PRICE DOUBLE NOT NULL,
    PRIMARY KEY (ID)
);

SET @CATALOGUE_COUNT = (SELECT COUNT(ID) FROM CATALOGUE);
DELIMITER $
BEGIN NOT ATOMIC
    IF @CATALOGUE_COUNT = 0 THEN
        INSERT INTO CATALOGUE(BRAND, PRODUCT, PRICE) VALUES ("Apple", "iPhone 11", 615.00);
        INSERT INTO CATALOGUE(BRAND, PRODUCT, PRICE) VALUES ("Samsung", "Galaxy S10", 989.00);
        INSERT INTO CATALOGUE(BRAND, PRODUCT, PRICE) VALUES ("Nokia", "7.2", 313.39);
        INSERT INTO CATALOGUE(BRAND, PRODUCT, PRICE) VALUES ("Sony", "Xperia 5", 785.88);
        INSERT INTO CATALOGUE(BRAND, PRODUCT, PRICE) VALUES ("Google", "Pixel 4 XL", 123456.00);
    END IF;
END $
DELIMITER ;