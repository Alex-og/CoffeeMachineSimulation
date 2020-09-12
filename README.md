# CoffeeMachineSimulation


This is a program that makes you a coffee â€“ virtual coffee, of course. But in this project,
implemented functionality that simulates a real coffee machine. It can run out of milk,
it can run out of coffee beans, it can make different varieties of coffee: espresso, latte, and cappuccino,
and it can take the money for making a coffee. The coffee machine should be able to get replenished by a special worker.
Another special worker should be able to take money from the coffee machine. Only one of these actions can do at a time.
If you want to buy some coffee, input "buy". If you are a special worker and you think that it is time to fill out all
the supplies for the coffee machine, input "fill". If you are another special worker and it is time to take
the money from the coffee machine, input "take".

If the user writes "buy" then he must choose one of three varieties of coffee that
the coffee machine can make: espresso, latte, or cappuccino.
 - For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
 - For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
 - And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee beans. It costs $6.
If the user writes "fill", the program should ask him how much water, milk, coffee, and how many disposable cups
he wants to add to the coffee machine.
If the user writes "take" the program should give him all the money that it earned from selling coffee.

<h4>Write action (buy, fill, take, remaining, exit):</h4>
> remaining

<h4>The coffee machine has:</h4>
<h4>400 of water</h4>
<h4>540 of milk</h4>
<h4>120 of coffee beans</h4>
<h4>9 of disposable cups</h4>
<h4>$550 of money</h4>

<h4>Write action (buy, fill, take, remaining, exit):</h4>
> buy

<h4>What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:</h4>
> 2                                                                                                                                                                              
<h4>I have enough resources, making you a coffee!</h4>

<h4>Write action (buy, fill, take, remaining, exit):</h4>
> remaining

<h4>The coffee machine has:</h4>
<h4>50 of water</h4>
<h4>465 of milk</h4>
<h4>100 of coffee beans</h4>
<h4>8 of disposable cups</h4>
<h4>$557 of money</h4>

<h4>Write action (buy, fill, take, remaining, exit):</h4>
> buy

<h4>What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:</h4>
> 2                                                                                                                                                                              
<h4>Sorry, not enough water!</h4>

<h4>Write action (buy, fill, take, remaining, exit):</h4>
> fill

<h4>Write how many ml of water do you want to add:</h4>
> 1000
<h4>Write how many ml of milk do you want to add:</h4>                                                                                                                                    
> 0                                                                                                                                                                              
<h4>Write how many grams of coffee beans do you want to add:</h4>                                                                                                                       
> 0                                                                                                                                                                              
<h4>Write how many disposable cups of coffee do you want to add:</h4>                                                                                                                     
> 0                                                                                                                                                                              

<h4>Write action (buy, fill, take, remaining, exit):</h4>
> remaining

<h4>The coffee machine has:</h4>
<h4>1050 of water</h4>
<h4>465 of milk</h4>
<h4>100 of coffee beans</h4>
<h4>8 of disposable cups</h4>
<h4>$557 of money</h4>

<h4>Write action (buy, fill, take, remaining, exit):</h4>
> buy

<h4>What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:</h4>
> 2                                                                                                                                                                              
<h4>I have enough resources, making you a coffee!</h4>

<h4>Write action (buy, fill, take, remaining, exit):</h4>
> remaining

<h4>The coffee machine has:</h4>
<h4>700 of water</h4>
<h4>390 of milk</h4>
<h4>80 of coffee beans</h4>
<h4>7 of disposable cups</h4>
<h4>$564 of money</h4>

<h4>Write action (buy, fill, take, remaining, exit):</h4>
> buy

<h4>What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:</h4>
> back

<h4>Write action (buy, fill, take, remaining, exit):</h4>
> take

<h4>I gave you $564</h4>

<h4>Write action (buy, fill, take, remaining, exit):</h4>
> remaining

<h4>The coffee machine has:</h4>
<h4>700 of water</h4>
<h4>390 of milk</h4>
<h4>80 of coffee beans</h4>
<h4>7 of disposable cups</h4>
<h4>0 of money</h4>

<h4>Write action (buy, fill, take, remaining, exit):</h4>
> exit

