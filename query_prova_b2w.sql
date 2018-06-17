select ev1.event_type, (ev1.value - ev2.value) as value from db_b2w_prova.events ev1
inner join
db_b2w_prova.events ev2
on
ev1.event_type = ev2.event_type
and
ev1.time = (SELECT time FROM db_b2w_prova.events t1 WHERE t1.event_type = ev1.event_type ORDER BY time DESC LIMIT 1)
and
ev2.time = (SELECT time FROM db_b2w_prova.events t2 WHERE t2.event_type = ev2.event_type ORDER BY time DESC LIMIT 1 OFFSET 1)
