-- Popolazione tabella products
insert into products (name, price, description) values
('T-shirt Basic', 15, 'T-shirt in cotone, taglia M'),
('Jeans Slim Fit', 50, 'Jeans aderenti colore blu'),
('Sneakers Sport', 80, 'Scarpe da ginnastica leggere e resistenti');

-- Popolazione tabella variants
insert into variants (product_id, attribute, value) values
(1, 'Colore', 'Bianco'),
(1, 'Colore', 'Nero'),
(1, 'Taglia', 'M'),
(1, 'Taglia', 'L'),
(2, 'Colore', 'Blu'),
(2, 'Taglia', '32'),
(2, 'Taglia', '34'),
(3, 'Colore', 'Rosso'),
(3, 'Taglia', '40'),
(3, 'Taglia', '42');

-- Popolazione tabella providers
insert into providers (name) values
('Fornitore A'),
('Fornitore B'),
('Fornitore C');

-- Popolazione tabella pivot product_provider
insert into product_provider (product_id, provider_id) values
(1, 1),
(1, 2),
(2, 1),
(3, 3);
