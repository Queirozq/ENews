INSERT INTO tb_user (first_name, last_name, email, password) VALUES ('Matheus', 'Queiroz', 'matheus@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_name, last_name, email, password) VALUES ('Silva', 'Silva', 'silva@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_name, last_name, email, password) VALUES ('Queiroz', 'Queiroz', 'queiroz@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_MEMBER');
INSERT INTO tb_role (authority) VALUES ('ROLE_EDITOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);

INSERT INTO tb_news(text, moment, image, subject) VALUES('Novo patch no CS vem com tudo', TIMESTAMP WITH TIME ZONE '2020-07-14T10:00:00Z', null, 'CS');
INSERT INTO tb_news(text, moment, image, subject) VALUES('Novo patch no Dota vem com tudo', TIMESTAMP WITH TIME ZONE '2020-07-14T10:00:00Z', null, 'DOTA');