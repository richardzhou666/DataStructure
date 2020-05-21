# Data Structure and Algorithms in Java
# Author: Richard Zhou

#### This is the collection of my personal implementations of Data Structures and Algorithms in Java inspired by UC Berkeley CS 61B.

# Table of Contents
* ### *Proj0: NBody*
    * This program simulates the the motion of N objects in a plane, accounting for the gravitational forces mutually affecting each object as demonstrated by Sir Isaac Newton’s Law of Universal Gravitation.
    * Takes user's input on command line then draws an animation of bodies floating around in space tugging on each other with 
    the power of gravity.
* ### *Proj1A: Data Structures* 
    * This project implements two common data structures APIs:
        * Linked List Deque
            * Doubly linked list built on naive linked list
            * Utilizes sentinel node to avoid NullPointerException while 
            supports traversal in two directions
            * Supports adding, removing, getting from index and printing in two directions
        * Array List Deque
            * Built on Java array that supports traversal in two directions
            * Supports adding, removing, getting from index and printing
            * Automatically truncates array size to save memory when usage ratio is low
            
* ### *Proj1B:  Applying and Testing Data Structures*
		* This project implements a palindrome tester using the Deque API developed in proj1a
		* Implements the inheritence property of Java by creating interfaces
		* Constructed JUnit tests to self test results