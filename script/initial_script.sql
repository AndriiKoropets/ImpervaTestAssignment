CREATE TABLE IF NOT EXISTS Vendor_Machine(
    id bigint PRIMARY KEY,
    uuid varchar(36) NOT NULL UNIQUE,
    location varchar(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS Beverages(
    id bigint,
    name varchar(50) NOT NULL,
    address varchar(100) NOT NULL,
    consist varchar(255) NOT NULL,
    code_barres varchar(100) UNIQUE,
    price double precision NOT NULL,
    vendor_machine_id bigint REFERENCES Vendor_Machine(id),
    PRIMARY KEY (id, vendor_machine_id)
);


INSERT INTO Vendor_Machine(id, uuid, location) VALUES (1, '167e9020-af10-11ea-b3de-0242ac130001', 'Kyiv');
INSERT INTO Vendor_Machine(id, uuid, location) VALUES (2, '167e9020-af10-11ea-b3de-0242ac130002', 'Tel-Aviv');
INSERT INTO Vendor_Machine(id, uuid, location) VALUES (3, '167e9020-af10-11ea-b3de-0242ac130003', 'San Francisco');

INSERT INTO Beverages(id, name, address, consist, code_barres, price, vendor_machine_id) VALUES (1, 'Coca-Cola', 'USA, Washington', 'Phosphoric acid','12345', 2, 1);
INSERT INTO Beverages(id, name, address, consist, code_barres, price, vendor_machine_id) VALUES (2, 'Fanta', 'Germany, Berlin', 'Orange juce, Phosphoric acid', '12345a', 2, 1);
INSERT INTO Beverages(id, name, address, consist, code_barres, price, vendor_machine_id) VALUES (3, 'Sandora', 'Ukraine, Odesa', 'Orange', '12345abc', 2, 1);