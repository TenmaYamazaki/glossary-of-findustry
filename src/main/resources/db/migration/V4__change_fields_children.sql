drop table fields_children;

CREATE TABLE fields_children (
	field_child_id SERIAL PRIMARY KEY,
	field_id INTEGER NOT NULL,
	field_child_name VARCHAR(10) NOT NULL,
	create_user VARCHAR(100),
	create_date_time DATE,
	update_user VARCHAR(100),
	update_date_time DATE,
	update_no INTEGER
);