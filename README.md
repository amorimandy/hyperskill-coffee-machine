# hyperskill-coffee-machine

## Module 1 - Making Coffee

The first version of the program just makes you a coffee. It should print to the standard output what it is doing as it
makes the drink.

Example:

- Take a look at the sample output below and print all the following lines.

Output:

```text
Starting to make a coffee
Grinding coffee beans
Boiling water
Mixing boiled water with crushed coffee beans
Pouring coffee into the cup
Pouring some milk into the cup
Coffee is ready!
```

## Module 2 - Ingredient Calculator

Now let's consider a case where you need a lot of coffee. Maybe you're hosting a party with a lot of guests! In these
circumstances, it's better to make preparations in advance.

So, we will ask a user to enter the desired amount of coffee, in cups. Given this, you can adjust the program by
calculating how much water, coffee, and milk are necessary to make the specified amount of coffee.

Of course, all this coffee is not needed right now, so at this stage, the coffee machine doesn't actually make any
coffee.

The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.

Example 1

- a dialogue with a user might look like this:

```text
Write how many cups of coffee you will need:
> 25
For 25 cups of coffee you will need:
5000 ml of water
1250 ml of milk
375 g of coffee beans
```

Example 2:

- here is another dialogue:

```text
Write how many cups of coffee you will need:
> 125
For 125 cups of coffee you will need:
25000 ml of water
6250 ml of milk
1875 g of coffee beans
```

## Module 3 - Estimate the number of servings

A real coffee machine doesn't have an infinite supply of water, milk, or coffee beans. And if you input a huge
number, it's almost certain that a real coffee machine wouldn't have the supplies needed to make all that coffee for
you.

In this stage, you need to improve the previous program. Now you will check amounts of water, milk, and coffee beans
available in your coffee machine at the moment.

Example 1:

- The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.

```text
Write how many ml of water the coffee machine has:
> 300
Write how many ml of milk the coffee machine has:
> 65
Write how many grams of coffee beans the coffee machine has:
> 100
Write how many cups of coffee you will need:
> 1
Yes, I can make that amount of coffee
```

Example 2:

```text
Write how many ml of water the coffee machine has:
> 500
Write how many ml of milk the coffee machine has:
> 250
Write how many grams of coffee beans the coffee machine has:
> 200
Write how many cups of coffee you will need:
> 10
No, I can make only 2 cup(s) of coffee
```

Example 3:

```text
Write how many ml of water the coffee machine has:
> 1550
Write how many ml of milk the coffee machine has:
> 299
Write how many grams of coffee beans the coffee machine has:
> 300
Write how many cups of coffee you will need:
> 3
Yes, I can make that amount of coffee (and even 2 more than that)
```

Example 4:

```text
Write how many ml of water the coffee machine has:
> 0
Write how many ml of milk the coffee machine has:
> 0
Write how many grams of coffee beans the coffee machine has:
> 0
Write how many cups of coffee you will need:
> 1
No, I can make only 0 cup(s) of coffee
```

Example 5:

```text
Write how many ml of water the coffee machine has:
> 0
Write how many ml of milk the coffee machine has:
> 0
Write how many grams of coffee beans the coffee machine has:
> 0
Write how many cups of coffee you will need:
> 0
Yes, I can make that amount of coffee 
```

Example 6:

```text
Write how many ml of water the coffee machine has:
> 200
Write how many ml of milk the coffee machine has:
> 50
Write how many grams of coffee beans the coffee machine has:
> 15
Write how many cups of coffee you will need:
> 0
Yes, I can make that amount of coffee (and even 1 more than that)
```

## Module 4 - Buy, fill, take!

Let's simulate an actual coffee machine! What do we need for that? This coffee machine will have a limited supply of
water, milk, coffee beans, and disposable cups. Also, it will calculate how much money it gets for selling coffee.

There are several options for the coffee machine we want you to implement: first, it should sell coffee. It can make
different types of coffee: espresso, latte, and cappuccino. Of course, each variety requires a different amount of
supplies, however, in any case, you will need only one disposable cup for a drink. Second, the coffee machine must get
replenished by a special worker. Third, another special worker should be able to take out money from the coffee machine.

An espresso should be number 1 in the list, a latte number 2, and a cappuccino number 3.
Options are named as `buy`, `fill`, `take`.

The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.

Example 1:

```text
The coffee machine has:
400 ml of water
540 ml of milk
120 g of coffee beans
9 disposable cups
$550 of money

Write action (buy, fill, take): 
> buy
What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: 
> 3

The coffee machine has:
200 ml of water
440 ml of milk
108 g of coffee beans
8 disposable cups
$556 of money
```

Example 2:

```text
The coffee machine has:
400 ml of water
540 ml of milk
120 g of coffee beans
9 disposable cups
$550 of money

Write action (buy, fill, take): 
> fill
Write how many ml of water you want to add: 
> 2000
Write how many ml of milk you want to add: 
> 500
Write how many grams of coffee beans you want to add: 
> 100
Write how many disposable cups you want to add: 
> 10

The coffee machine has:
2400 ml of water
1040 ml of milk
220 g of coffee beans
19 disposable cups
$550 of money
```

Example 3:

```text
The coffee machine has:
400 ml of water
540 ml of milk
120 g of coffee beans
9 disposable cups
$550 of money

Write action (buy, fill, take): 
> take
I gave you $550

The coffee machine has:
400 ml of water
540 ml of milk
120 g of coffee beans
9 disposable cups
$0 of money
```

## Module 5

Just one action is not so interesting, is it? Let's improve the program so it can do multiple actions, one after
another. It should repeatedly ask a user what they want to do. If the user types `buy`, `fill` or `take`, then the
program should do exactly the same thing it did in the previous step. However, if the user wants to switch off the
coffee machine, they should type `exit`. The program should terminate on this command. Also, when the user types `
remaining`, the program should output all the resources that the coffee machine has. This means that you shouldn't show
the remaining stock levels at the beginning/end of the program.

Remember, that:

- For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
- For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
- And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6.

Your coffee machine should have the same initial resources as in the example (400 ml of water, 540 ml of milk, 120 g of
coffee beans, 9 disposable cups, $550 in cash).

The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.

Example:

```text
Write action (buy, fill, take, remaining, exit): 
> remaining

The coffee machine has:
400 ml of water
540 ml of milk
120 g of coffee beans
9 disposable cups
$550 of money

Write action (buy, fill, take, remaining, exit): 
> buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: 
> 2
I have enough resources, making you a coffee!

Write action (buy, fill, take, remaining, exit): 
> remaining

The coffee machine has:
50 ml of water
465 ml of milk
100 g of coffee beans
8 disposable cups
$557 of money

Write action (buy, fill, take, remaining, exit): 
> buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: 
> 2
Sorry, not enough water!

Write action (buy, fill, take, remaining, exit): 
> fill

Write how many ml of water you want to add: 
> 1000
Write how many ml of milk you want to add: 
> 0
Write how many grams of coffee beans you want to add: 
> 0
Write how many disposable cups you want to add: 
> 0

Write action (buy, fill, take, remaining, exit): 
> remaining

The coffee machine has:
1050 ml of water
465 ml of milk
100 g of coffee beans
8 disposable cups
$557 of money

Write action (buy, fill, take, remaining, exit): 
> buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: 
> 2
I have enough resources, making you a coffee!

Write action (buy, fill, take, remaining, exit): 
> remaining

The coffee machine has:
700 ml of water
390 ml of milk
80 g of coffee beans
7 disposable cups
$564 of money

Write action (buy, fill, take, remaining, exit): 
> take

I gave you $564

Write action (buy, fill, take, remaining, exit): 
> remaining

The coffee machine has:
700 ml of water
390 ml of milk
80 g of coffee beans
7 disposable cups
$0 of money

Write action (buy, fill, take, remaining, exit): 
> exit
```