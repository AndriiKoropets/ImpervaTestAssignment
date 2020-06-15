CREATE TABLE IF NOT EXISTS Vendor_Machine(
    id integer PRIMARY KEY,
    uuid varchar(36) NOT NULL UNIQUE,
    location varchar(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS Beverages(
    id integer PRIMARY KEY,
    name varchar(50) NOT NULL,
    address varchar(100) NOT NULL,
    consist varchar(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS Product_Beverage(
    id integer PRIMARY KEY,
    beverage_id integer NOT NULL REFERENCES Beverages,
    vendor_machine_id integer REFERENCES Vendor_Machine,
    code_barres varchar(100) UNIQUE,
    price double NOT NULL
);

INSERT INTO Vendor_Machine(id, uuid, location) VALUES (1, '167e9020-af10-11ea-b3de-0242ac130001', 'Kyiv');
INSERT INTO Vendor_Machine(id, uuid, location) VALUES (2, '167e9020-af10-11ea-b3de-0242ac130002', 'Tel-Aviv');
INSERT INTO Vendor_Machine(id, uuid, location) VALUES (3, '167e9020-af10-11ea-b3de-0242ac130003', 'San Francisco');

INSERT INTO Beverages(id, name, address, consist) VALUES (1, 'Coca-Cola', 'USA, Washington', 'Phosphoric acid');
INSERT INTO Beverages(id, name, address, consist) VALUES (2, 'Fanta', 'Germany, Berlin', 'Orange juce, Phosphoric acid');
INSERT INTO Beverages(id, name, address, consist) VALUES (3, 'Sandora', 'Ukraine, Odesa', 'Orange');

INSERT INTO Product_Beverage(id, beverage_id, vendor_machine_id, code_barres) VALUES (1,3,1,'12345', 2);
INSERT INTO Product_Beverage(id, beverage_id, vendor_machine_id, code_barres) VALUES (2,3,1,'1234', 2);
INSERT INTO Product_Beverage(id, beverage_id, vendor_machine_id, code_barres) VALUES (3,2,1,'1234a', 1.5);
INSERT INTO Product_Beverage(id, beverage_id, vendor_machine_id, code_barres) VALUES (4,1,1,'12345a', 1);
INSERT INTO Product_Beverage(id, beverage_id, vendor_machine_id, code_barres) VALUES (5,3,2,'12345ab', 5);
INSERT INTO Product_Beverage(id, beverage_id, vendor_machine_id, code_barres) VALUES (6,3,2,'12345abc', 5);
INSERT INTO Product_Beverage(id, beverage_id, vendor_machine_id, code_barres) VALUES (7,2,2,'12345abcd', 3.5);
INSERT INTO Product_Beverage(id, beverage_id, vendor_machine_id, code_barres) VALUES (8,1,3,'12345abcde', 2.7);
INSERT INTO Product_Beverage(id, beverage_id, vendor_machine_id, code_barres) VALUES (9,1,3,'12345abcedf', 2.7);