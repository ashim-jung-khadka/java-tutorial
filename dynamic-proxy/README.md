# Dynamic Proxy

## Summary
- Simple dynamic proxy using Proxy and InvocationHandler.
- Generic Method Interceptor
- Decorator with/without using Proxy.

## JDK Complex Example
### Problem
- Person class contains the properties Name, Address, and PhoneNumber.
- Employee class, which is a Person subclass and contains the additional properties SSN, Department, and Salary.
- Manager class which is a Employee subclass, adds the properties Title and one or more Departments for which Manager is responsible.

Lets take a step back and think about how the architecture is to be used.
Promotion is one idea that we might want to implement in our design.
How would we take a person object and make it an employee object, 
and how would we take an employee object and make it a manager object?
What about the reverse? Also, it might not be necessary to expose a manager object 
as anything more than a person object to a particular client.

### Solution
- Using Proxy Interface and its concrete implementation, we can resolve this issue.
- It is low level solution, need to think before doing it.