CREATE TABLE glossarys (
	glossary_id SERIAL PRIMARY KEY,
	terminology VARCHAR(100) NOT NULL,
	field_div INTEGER NOT NULL,
	field_child_div INTEGER,
	word_description VARCHAR(1000),
	coment_flg BOOLEAN NOT NULL,
	create_user VARCHAR(100),
	create_date_time DATE,
	update_user VARCHAR(100),
	update_date_time DATE,
	update_no INTEGER
);

CREATE TABLE fields (
	field_id SERIAL PRIMARY KEY,
	field_name VARCHAR(10) NOT NULL,
	create_user VARCHAR(100),
	create_date_time DATE,
	update_user VARCHAR(100),
	update_date_time DATE,
	update_no INTEGER
);

CREATE TABLE fields_children (
	field_child_id SERIAL PRIMARY KEY,
	filed_id INTEGER NOT NULL,
	field_child_name VARCHAR(10) NOT NULL,
	create_user VARCHAR(100),
	create_date_time DATE,
	update_user VARCHAR(100),
	update_date_time DATE,
	update_no INTEGER
);

CREATE TABLE users (
	user_id SERIAL PRIMARY KEY,
	user_name VARCHAR(10) NOT NULL,
	pasword VARCHAR(10) NOT NULL,
	admin_flg BOOLEAN NOT NULL,
	create_date_time DATE
)