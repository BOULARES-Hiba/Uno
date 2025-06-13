# UNO Game - Object-Oriented Programming Project

## Overview
This project is an implementation of the classic UNO card game using Java and object-oriented programming principles. The game supports both human and AI (bot) players, with customizable game settings, developed as an academic project for  Object-Oriented Programming course.

## Features
- **Multiplayer support**: Play with 1-4 human players and optional AI opponents
- **Full UNO rules implementation**:
  - Number cards (0-9 in four colors)
  - Action cards (Skip, Reverse, Draw Two)
  - Wild cards (Wild, Wild Draw Four)
- **Turn management** with proper game flow
- **Input validation** for all user interactions
- **AI opponents** with basic card-playing logic
- **Proper game initialization** with card dealing and first card rules

## How to Run
1. Compile all Java files: `javac *.java`
2. Run the main class: `java Main`
3. Follow the on-screen instructions to set up players

## Key OOP Concepts Demonstrated
- **Inheritance**: Card hierarchy and player types
- **Polymorphism**: Different card behaviors through `applyEffect()`
- **Encapsulation**: Private fields with public getters/setters
- **Abstraction**: `Card` as abstract base class
- **Composition**: `Deck` contains `Card` objects, `Game` contains `Player` objects
