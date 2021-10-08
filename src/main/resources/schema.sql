DROP TABLE IF EXISTS ITEMS;

CREATE TABLE ITEM_AVAILABILITY (
    ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    COUNTRY_ISO_CODE VARCHAR(10) NOT NULL,
    ENABLE CHAR(1) NOT NULL,
    CREATE_AT TIMESTAMP NOT NULL,
    UPDATE_AT TIMESTAMP NULL,
    DELETE_AT TIMESTAMP NULL
);

DROP TABLE IF EXISTS ITEMS;

CREATE TABLE ITEMS (
    ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    STORE VARCHAR(255) NOT NULL,
    SKU INT(8) NOT NULL,
    OWNER VARCHAR(255) NULL,
    DEPARTMENT VARCHAR(255) NOT NULL,
    UPC VARCHAR(255) NOT NULL,
    DESCRIPTION VARCHAR(255) NOT NULL,
    BRAND VARCHAR(255) NOT NULL,
    STYLE VARCHAR(255) NOT NULL,
    COLOR VARCHAR(255) NULL,
    ON_HAND VARCHAR(255) NULL,
    ID_ITEM_AVAILABILITY BIGINT NOT NULL,
    ENABLE CHAR(1) NOT NULL,
    CREATE_AT TIMESTAMP NOT NULL,
    UPDATE_AT TIMESTAMP NULL,
    DELETE_AT TIMESTAMP NULL
);

COMMIT;

ALTER TABLE
    ITEMS
ADD
    CONSTRAINT FK_ITEM_AVAILABILITY_TO_ITEM FOREIGN KEY (ID_ITEM_AVAILABILITY) REFERENCES ITEM_AVAILABILITY(ID);

ALTER TABLE
    ITEM_AVAILABILITY
ADD
    CONSTRAINT UNIQUE_COUNTRY_ISO_CODE_ITEM_AVAILABILITY UNIQUE (COUNTRY_ISO_CODE);

ALTER TABLE
    ITEMS
ADD
    CONSTRAINT UNIQUE_STORE_ITEM UNIQUE (STORE);

INSERT INTO
    ITEM_AVAILABILITY(ID, COUNTRY_ISO_CODE, ENABLE, CREATE_AT)
VALUES
    (1, 'SV', 'E', { ts '2021-07-10 18:47:52.69' });

INSERT INTO
    ITEMS (
        STORE,
        SKU,
        OWNER,
        DEPARTMENT,
        UPC,
        DESCRIPTION,
        BRAND,
        STYLE,
        COLOR,
        ON_HAND,
        ID_ITEM_AVAILABILITY,
        ENABLE,
        CREATE_AT
    )
VALUES
    (
        'CDD 1',
        500597,
        null,
        '305',
        '444666611111',
        'REFRI 12P SILVER SILVER M',
        '000009',
        'TT32H500JS8',
        '   ',
        252,
        1,
        'E',
        { ts '2021-07-10 18:47:52.69' }
    );

INSERT INTO
    ITEMS (
        STORE,
        SKU,
        OWNER,
        DEPARTMENT,
        UPC,
        DESCRIPTION,
        BRAND,
        STYLE,
        COLOR,
        ON_HAND,
        ID_ITEM_AVAILABILITY,
        ENABLE,
        CREATE_AT
    )
VALUES
    (
        'CRC PROCERES',
        500597,
        null,
        '305',
        '444666611111',
        'REFRI 12P SILVER SILVER M',
        '000009',
        'TT32H500JS8',
        '   ',
        1,
             1,
        'E',
        { ts '2021-07-10 18:48:52.69' }
    );

INSERT INTO
    ITEMS (
        STORE,
        SKU,
        OWNER,
        DEPARTMENT,
        UPC,
        DESCRIPTION,
        BRAND,
        STYLE,
        COLOR,
        ON_HAND,
        ID_ITEM_AVAILABILITY,
        ENABLE,
        CREATE_AT
    )
VALUES
    (
        'CRC LA GRAN VIA',
        500597,
        null,
        '305',
        '444666611111',
        'REFRI 12P SILVER SILVER M',
        '000009',
        'TT32H500JS8 ',
        '   ',
        1,
        1,
        'E',
        { ts '2021-07-10 18:49:52.69' }
    );

INSERT INTO
    ITEMS (
        STORE,
        SKU,
        OWNER,
        DEPARTMENT,
        UPC,
        DESCRIPTION,
        BRAND,
        STYLE,
        COLOR,
        ON_HAND,
        ID_ITEM_AVAILABILITY,
        ENABLE,
        CREATE_AT
    )
VALUES
    (
        'CRC Metro centro',
        500567,
        null,
        '305',
        '444666611112',
        'Celular Samsumg Golden ',
        '000001',
        'TJ32H500JS8 ',
        '   ',
        3,
        1,
        'E',
        { ts '2021-07-10 18:50:52.69' }
    );