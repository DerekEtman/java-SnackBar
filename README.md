# Project Snack Bar:

A student that completes this project shows that they can:

* use the Java Development Kit (JDK)
* use and manipulate Java base data types
* construct Java classes including instantiating and using Java Objects
* use and manipulate Java base data types

# Introduction

Variations on the Snack Bar Project have been part of Java Education 
since Java was created. So, we will do one. The point is to set up 
vending machines where a person buys snacks from those machines.

# Instructions

## Snack

Snack has fields (so knows)
* id
* name
* quantity 
* cost
* vending machine id

Snack has methods (so can) 
* set and get id
* set and get name
* set and get cost
* set and get vending machine id
* get quantity
* add quantity when given how many to add
* buy snack when given how many to buy
* get total cost given a quantity


## Vending Machine

Vending machine has fields (so knows)
* id
* name 

Vending Machine has methods (so can)
* set and get id
* set and get name


## Customer

Customer has id, name, cash on hand. 
Customer can add cash, buy given total cash used in purchase, get and set name, get cash on hand.  


## Instructions

* Instantiate 2 customers
    * Jane with $45.25
    * Bob with $33.14

* Instantiate 3 Vending Machines
    * Food
    * Drink
    * Office

* Instantiate 5 snacks
    * In Vending Machine Food
        * 36 Chips at $1.75
        * 36 Chocolate Bar at $1.00
        * 30 Pretzel at $2.00
    * In Vending Machine Drink
        * 24 Soda at $2.50
        * 20 Water at $2.75
	
* Processing

1. jane buys 3 sodas. Print janes Cash on hand. Print quantity of soda.
2. jane buys 1 of Pretzels. Print jane Cash on hand. Print quantity of Pretzels.
3. bob buys 2 of soda. Print bob Cash on Hand. Print quantity of soda.
4. jane finds $10. Print jane Cash on Hand.
5. jane buys 1 of Chocolate Bar. Print jane Cash on Hand. Print quantity of Chocolate Bar.
6. Add 12 more items to Pretzels. Print quantity of Pretzels.
7. bob buys 3 of Pretzels. Print bob Cash on hand. Print quantity of Pretzels.

* Stretch Goals

    * Display each snack with
        * Name
        * Vending Machine Name
        * Quantity on hand
        * Total cost of all of the quantities of this snack on hand
	
