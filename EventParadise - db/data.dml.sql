DELETE FROM events;
DELETE FROM locations;
DELETE FROM topics;

INSERT INTO locations
	(name)VALUES
	('Paris'), ('Rennes'), ('Marseille');
	
INSERT INTO topics
	(name) VALUES
	('Ecologie'), ('Ressources humaines'), ('tech');
	