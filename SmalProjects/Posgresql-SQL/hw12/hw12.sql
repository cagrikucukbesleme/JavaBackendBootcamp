1-select count(film) from film where length >(select avg(length) from film);
2-select count(select max(rental_rate) from film) from film;
3-select max(rental_rate),min(rental_rate) from film;
4-select customer from payment where shop>(select max(shop) from payment)