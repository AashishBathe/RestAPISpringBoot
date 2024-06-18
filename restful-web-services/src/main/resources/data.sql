insert into user_details(id, birth_date, name) values (1001, current_date(), 'Aashish')
insert into user_details(id, birth_date, name) values (1002, current_date(), 'Hash')
insert into user_details(id, birth_date, name) values (1003, current_date(), 'Ant')

insert into post(id, description, user_id) values (2001, 'Learn SB', 1002)
insert into post(id, description, user_id) values (2002, 'Learn AWS', 1001)
insert into post(id, description, user_id) values (2003, 'Learn JS', 1003)