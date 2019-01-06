DROP TABLE users;

CREATE TABLE users (
	user_id SERIAL PRIMARY KEY,
	user_name VARCHAR(50) NOT NULL,
	pasword VARCHAR(10) NOT NULL,
	admin_flg BOOLEAN NOT NULL,
	create_date_time DATE
)