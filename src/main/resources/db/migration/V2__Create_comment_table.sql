CREATE TABLE comments (
	glossarys_id INTEGER NOT NULL,
	comment VARCHAR(1000) NOT NULL,
	create_user VARCHAR(100),
	create_date_time DATE,
	update_user VARCHAR(100),
	update_date_time DATE,
	update_no INTEGER
);