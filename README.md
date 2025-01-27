# Groovy eachWithIndex returns null

This example demonstrates an unexpected behavior of Groovy's `eachWithIndex` method.  The method iterates over a list and prints each item with its index, but it also returns `null`, which can cause problems if you expect the original list to remain unchanged.

## Bug
The `eachWithIndex` method modifies the list in place.  After the loop, the list is printed as null rather than the original list.

## Solution
The solution demonstrates how to avoid this issue by using a copy of the list or by using a different method that returns the original list.
