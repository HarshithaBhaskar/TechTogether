# TechTogether
Hello, ReadMe Please!
 

create table AVAILABILITY
(
  SNAME   VARCHAR(100),
  PRODUCT VARCHAR(100),
  PRICE   DECIMAL(18, 2),
  STOCK   VARCHAR(10)
);

create table ITEM
(
  UPC      BIGINT not null
    constraint ITEM_PK
      primary key,
  INAME    VARCHAR(100),
  CATEGORY VARCHAR(100)
);

create table STORE
(
  BRAND    VARCHAR(100) not null
    constraint STORE_PK
      primary key,
  LOCATION VARCHAR(100)
);

insert into item values
(124879348312, 'oranges', 'groceries'),
(792347013478, 'phone case', 'accessories'),
(713413488807, 'toothbrush', 'toiletries'),
(526153961086, 'earrings', 'accessories'),
(098341374823, 'night stand', 'furniture'),
(123634896381, 'plastic spoons', 'kitchenware'),
(661348791243, 'carrots', 'groceries'),
(234233798211, 'plastic forks', 'kitchenware');

select * from ITEM;

insert into store values
('Walmart', '33 Kilmarnock St, Boston, MA 02215'),
('Target', '860 Commonwealth Avenue, Boston, MA 02215'),
('Costco', '899 Boylston St, Boston, MA 02115'),
('Sam''s Club', '15 Westland Ave, Boston, MA 02115');

select * from STORE;

insert into availability values
('Walmart', 'oranges', '4.28', 'yes'),
('Target', 'oranges', '4.99', 'yes'),
('Costco', 'oranges', '10.67', 'yes'),
('Sam''s Club', 'oranges', '8.57', 'yes'),
('Walmart', 'phone case', '6.95', 'yes'),
('Target', 'phone case', '9.99', 'yes'),
('Walmart', 'toothbrush', '1.50','yes'),
('Target', 'toothbrush', '1.00' ,'yes'),
('Costco', 'toothbrush', '10.50','yes'),
('Sam''s Club', 'toothbrush', '11.99','yes'),
('Walmart','mouthwash','2.90','yes'),
('Target','mouthwash','2.95','yes'),
('Walmart','earrings','7.65','yes'),
('Target','earrings','9.55','yes'),
('Walmart','night stand','23.99','yes'),
('Target','night stand','25.00','yes'),
('Cotsco','night stand','44.00','yes'),
('Sam''s Club','night stand','40.00','yes'),
('Costco','plastic spoons','5.00','yes'),
('Sam''s Club', 'plastic forks','5.00','yes'),
('Costco', 'carrots', '6.39','yes'),
('Sam''s Club','carrots','5.41','yes');

select * from AVAILABILITY;

select distinct *
from item join availability on
    iname = product join store on
    sname = brand
where product = 'night stand'
order by price asc;

select price from AVAILABILITY join store on sname = brand
where product = 'night stand' and store.brand ='Walmart';

delete from AVAILABILITY where sname = 'Walmart' and price = 24.00;

select price from AVAILABILITY join store on sname = brand
where product = 'night stand' and store.brand ='Walmart';

select distinct *
from item join availability on
    iname = product join store on
    sname = brand
where product = 'night stand'
order by price asc;

select distinct * from STORE
    join AVAILABILITY on BRAND = SNAME
    join ITEM on PRODUCT = INAME
where CATEGORY = 'groceries';



