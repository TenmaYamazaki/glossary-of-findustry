drop table glossarys;

CREATE TABLE glossarys (
	glossary_id SERIAL PRIMARY KEY,
	terminology VARCHAR(100) NOT NULL,
	field_id INTEGER NOT NULL,
	word_description VARCHAR(1000),
	coment_flg BOOLEAN NOT NULL,
	create_user VARCHAR(100),
	create_date_time DATE,
	update_user VARCHAR(100),
	update_date_time DATE,
	update_no INTEGER
);
