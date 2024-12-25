# Scala Private Variable Access Without Getter/Setter

This example demonstrates a potential issue in Scala where private variables can be accessed directly within a class without the use of getter/setter methods.  While this compiles and works, it weakens encapsulation and can make refactoring more difficult and error-prone.

**Problem:**
Scala, unlike some other languages, implicitly allows you to access private variables from within the same class without explicitly defining getter/setter methods. While convenient, this can lead to issues.

**Solution:**
To improve encapsulation and make your code more maintainable, explicitly define getter methods (or even getter/setter if modification is needed) for your private variables. This clarifies the intention and prevents unexpected behavior during refactoring.