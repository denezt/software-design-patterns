# Coupling
## Coupling is defined as the level of inter dependency between various software components

* Loose Coupling helps attain better adherence to the Single Responsibility Principle

``` bash
# Initial Compilation
javac Main.java

# Make changes to 'StudentRepository' in the refactoring directory
vim StudentRepository.java
# Save the changes
:wq
# Now, you only need to recompile the changed components
javac StudentRepository.java
# Rerun the 'Main' class as before
java Main
```
