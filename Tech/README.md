# TechTogether
Hello, ReadMe Please!
 

DROP DATABASE IF EXISTS techTogetherItemizeSample;
CREATE DATABASE techTogetherItemizeSample;

USE techTogetherItemizeSample;

CREATE TABLE item(
upc BIGINT NOT NULL, 
iname VARCHAR(100),
icategory VARCHAR(100),

CONSTRAINT upc_pk PRIMARY KEY (upc)
);

CREATE TABLE store(
brand VARCHAR(100) NOT NULL,
location VARCHAR(100),

CONSTRAINT brand_pk PRIMARY KEY (brand)
);

CREATE TABLE availability(
sname VARCHAR(100) NOT NULL,
product BIGINT NOT NULL,
price DECIMAL(18, 2),
stock BOOLEAN,

CONSTRAINT sname_fk FOREIGN KEY (sname) REFERENCES store(brand),
CONSTRAINT product_fk FOREIGN KEY (product) REFERENCES item(upc)
);

insert into item values (124879348312, 'oranges', 'groceries'), 
(792347013478, 'phone case', 'accessories'), 
(713413488807, 'toothbrush', 'toiletries'), 
(526153961086, 'earrings', 'accessories'), 
(098341374823, 'night stand', 'furniture'), 
(123634896381, 'plastic spoons', 'kitchenware'), 
(661348791243, 'carrots', 'groceries'), 
(234233798211, 'plastic forks', 'kitchenware'),
(832933472120, 'mouthwash', 'toiletries');

#select * from ITEM;

insert into store values 
('Walmart', '33 Kilmarnock St, Boston, MA 02215'), 
('Target', '860 Commonwealth Avenue, Boston, MA 02215'), 
('Costco', '899 Boylston St, Boston, MA 02115'), 
('Sam''s Club', '15 Westland Ave, Boston, MA 02115');

#select * from STORE;

insert into availability values 
('Walmart', 124879348312, '4.28', True), 
('Target', 124879348312, '4.99', True),
('Costco', 124879348312, '10.67', True),
('Sam''s Club', 124879348312, '8.57', True),
('Walmart', 792347013478, '6.95', True),
('Target', 792347013478, '9.99', True),
('Walmart', 713413488807, '1.50',True),
('Target', 713413488807, '1.00' ,False),
('Costco', 713413488807, '10.50',True), 
('Sam''s Club', 713413488807, '11.99',True),
('Walmart',832933472120,'2.90',True),
('Target',832933472120,'2.95',True),
('Walmart',526153961086,'7.65',False),
('Target',526153961086,'9.55',True),
('Walmart',098341374823,'23.99',True),
('Target',098341374823,'25.00',True),
('Costco',098341374823,'44.00',False),
('Sam''s Club',098341374823,'40.00',True),
('Costco',123634896381,'5.00',True), 
('Sam''s Club', 234233798211,'5.00',False), 
('Costco', 661348791243, '6.39',False), 
('Sam''s Club',661348791243,'5.41',False);
