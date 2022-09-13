INSERT INTO tbl_categories VALUES (default, 'SHOES');
INSERT INTO tbl_categories VALUES (default, 'BOOKS');
INSERT INTO tbl_categories VALUES (default, 'ELECTRONICS');

INSERT INTO tbl_products ( name, description, stock, price, status, create_at, category_id) VALUES ('ADIDAS CLOUD', 'WALK IN THE AIR', 18, 200, 'CREATED', '2010-09-05', 1);
INSERT INTO tbl_products ( name, description, stock, price, status, create_at, category_id) VALUES ('EN EL CAMINO', 'GOOD BOOK', 9, 79, 'CREATED', '2010-09-05', 2);
INSERT INTO tbl_products ( name, description, stock, price, status, create_at, category_id) VALUES ('TV LCD', 'BIG TV', 5, 400, 'CREATED', '2010-09-05', 3);