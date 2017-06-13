# # JPMorgan
Small Message Processing Application

## The problem

Implement a small message processing application that satisfies the below requirements for

processing sales notification messages. You should assume that an external company will be sending

you the input messages, but for the purposes of this exercise you are free to define the interfaces.

**Processing requirements**

* All sales must be recorded

* All messages must be processed

* After every 10th message received your application should log a report detailing the number of sales of each product
  and their total value.

* After 50 messages your application should log that it is pausing, stop accepting new messages and log a report of the
  adjustments that have been made to each sale type while the application was running.

**Sales and Messages**

* A sale has a product type field and a value – you should choose sensible types for these.

* Any number of different product types can be expected. There is no fixed set.

* A message notifying you of a sale could be one of the following types

* Message Type 1 – contains the details of 1 sale E.g apple at 10p

* Message Type 2 – contains the details of a sale and the number of occurrences of that sale. E.g 20 sales of apples at 10p each.

* Message Type 3 – contains the details of a sale and an adjustment operation to be applied to all stored sales of this product type.
  Operations can be add, subtract, or multiply e.g Add 20p apples would instruct your application to add 20p to each sale
  of apples you have recorded.


## The Solution

 The solution implements a Sales class that uses custom data structures defined for Product, and, AdjustPrice, and SaleLog which
 solves the above defined problem.

## Assumptions

* The sale items are always fruits.
* There may be invalid messages but only null and empty string and String length are considered.
* The incoming messages have fixed format based on the message type e.g.;
      - Message Type 1 contains 3 words.
      - Message Type 2 contains 6 words.
      - Message Type 3 contains 3 words but always begin with an operational instruction such as Add, Subtract, and Multiply.
* Execution to continue processing messages until 50 sales details are logged that includes the instruction message type 3 as
   well.
* Util.Logging omitted instead System.out.println used since there was no request on explicit exception handling on incoming messages other than
   neglecting it and recording only parsed messages.

## Algorithm
1. Parse incoming message for product details such as type, price, quantity, and instruction set.
2. Store the product type if new or fecth the existing from a HashMap and do this on each iteration for sale processing.
3. Maintain an AdjustPrice class to process price adjustment and populate adjustment report of sales.
4. Update the processed product details on to a sales log.
6. Perform modulo for identifying iteration and log output to console on every 10th iteration and stop on 50th producing
   the adjustment logs.

## How to use?

You can use any IDE of your choice e.g, Intellij, Netbeans or Eclipse.


## Requirements
- Java 1.8

## Junit

run the JRunTesting.java file  as Junit

