##Introduction

The singleton pattern ensure that a class has only one instance, and provides a global access to it(the instance).


##Critique

#first point
a good program should be avoiding global."global" means every peace of program can might be able to touch that thing so make it changeable.

# second point
a particular class only have one instance seems like absurd.
when we design singleton pattern we didn't think about that maybe we want multiple instances in the future.
Can we 100 percent make sure that we will not use more instances in the future?
probably not.
It's totally reasonable to create one instance but it's not a good idea  to force to make it impossible to create a second instance.

## content
the constuctor of singleton pattern is private.

Q:how do we create the first and the only-one instance?
A: we have a static method called "getInstance" with which we access the instance.




