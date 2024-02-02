# Define a makefile variable for the Java compiler
JCC = javac

# Define a makefile variable for Java runtime
JVM= java

# This target entry builds the SinglyLinkedList class and any dependencies
# Assuming SinglyLinkedList has a main method for running
build: SinglyLinkedList.java DogZoo.java
	$(JCC) SinglyLinkedList.java DogZoo.java

# This target entry runs the SinglyLinkedList class
run: build
	$(JVM) SinglyLinkedList

run-dogzoo: build
	$(JVM) DogZoo

# This target entry removes all .class files
clean:
	$(RM) *.class

# Default target
default: build