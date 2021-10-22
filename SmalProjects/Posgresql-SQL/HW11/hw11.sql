1-select actor.firstname from actor union select firstname from  customer 
2-select actor.firstname from actor inner join customer where actor.firstname=customer.firstname
3-select actor.firstname from actor left join customer where actor.firstname=customer.firstname
