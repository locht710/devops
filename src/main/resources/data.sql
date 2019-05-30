insert into advertisement (id, content, sale) values
(1, 'Christmas', 10) on conflict(id) DO NOTHING;