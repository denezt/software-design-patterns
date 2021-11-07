# The 23 Gang of Four Design Patterns (Cheat Sheet)

- [The 23 Gang of Four Design Patterns (Cheat Sheet)](#the-23-gang-of-four-design-patterns-cheat-sheet)
  - [Abstract Factory](#abstract-factory)
  - [Adapter](#adapter)
  - [Bridge](#bridge)
  - [Builder](#builder)
  - [Chain of Responsibility](#chain-of-responsibility)
  - [Command](#command)
  - [Composite](#composite)
  - [Decorator](#decorator)
  - [Façade](#fa%c3%a7ade)
  - [Factory Method](#factory-method)
  - [Flyweight](#flyweight)
  - [Interpreter](#interpreter)
  - [Iterator](#iterator)
  - [Mediator](#mediator)
  - [Memento](#memento)
  - [Observer](#observer)
  - [Prototype](#prototype)
  - [Proxy](#proxy)
  - [Singleton](#singleton)
  - [State](#state)
  - [Strategy](#strategy)
  - [Template](#template)
  - [Visitor](#visitor)

## Abstract Factory

- Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

## Adapter

- Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn’t otherwise because of incompatibility interfaces.

## Bridge

- Decouple an abstraction from its implementation so that the two can vary independently.

## Builder

- Separate the construction of a complex object from its representation so that the same construction processes can create different representations.

## Chain of Responsibility

- Avoid coupling the sender of a request to its receiver by giving more then one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.

## Command

- Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

## Composite

- Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.

## Decorator

- Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

## Façade

- Provide a unified interface to a set of interfaces in a system. Façade defines a higher-level interface that makes the subsystem easier to use.

## Factory Method

- Define an interface for creating an object, but let the subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

## Flyweight

- Use sharing to support large numbers of fine-grained objects efficiently. A flyweight is a shared object that can be used in multiple contexts simultaneously. The flyweight acts as an independent object in each context; it’s indistinguishable from an instance of the object that’s not shared.

## Interpreter

- Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.

## Iterator

- Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

## Mediator

- Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and lets you vary their interaction independently.

## Memento

- Without violating encapsulation, capture and externalize an object’s internal state so that the object can be restored to this state later.

## Observer

- Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

## Prototype

- Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

## Proxy

- Provide a surrogate or placeholder for another object to control access to it.

## Singleton

- Ensure a class only has one instance, and provide a global point of access to it.

## State

- Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.

## Strategy

- Defines a family of algorithms, encapsulates each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients who use it.

## Template

- Define a skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithms structure.

## Visitor

- Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.
