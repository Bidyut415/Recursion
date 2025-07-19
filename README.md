# Recursion

## Recurison is a process which a method calls itself continuously until a base condition is met.

# Important Notes

## Recursion should always have a base case to avoid infinite calls and stackOverflowError. 

# Tower Of Hanoi Problem

# Rules:

## Only one disk can be moved at a time.

## You cannot place a larger disk on top of a smaller disk.

## You can only move the top disk of any rod.

# Recursion Approach

## To move n disks from A to C using B:

## Move n-1 disks from A to B using C.

## Move the nth (largest) disk from A to C.

## Move n-1 disks from B to C using A