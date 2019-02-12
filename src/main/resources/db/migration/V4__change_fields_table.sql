drop table fields_children;
drop table fields;

create table fields (
    field_id serial primary key,
    field_name varchar(10) not null,
    field_genre  varchar(10) not null,
    create_user varchar(100),
    create_date_time date,
    update_user varchar(100),
    update_date_time date,
    update_no integer
);


insert into fields (
    field_name,
    field_genre,
    create_user,
    update_no
) values (
    'java',
    'IT',
    'tenma.yamazaki',
    1
);
insert into fields (
    field_name,
    field_genre,
    create_user,
    update_no
) values (
    'JavaScript',
    'IT',
    'tenma.yamazaki',
    1
);
insert into fields (
    field_name,
    field_genre,
    create_user,
    update_no
) values (
    '会計',
    '会計',
    'tenma.yamazaki',
    1
);
insert into fields (
    field_name,
    field_genre,
    create_user,
    update_no
) values (
    'AWS',
    'IT',
    'tenma.yamazaki',
    1
);
