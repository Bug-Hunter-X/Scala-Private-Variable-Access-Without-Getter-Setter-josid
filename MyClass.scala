```scala
class MyClass {
  private val myVar: Int = 0 // Private variable

  def myMethod: Int = {
    myVar + 1 // Use private variable within class
  }

  def myOtherMethod: Int = {
    myVar + 2 // Use private variable within class, compiles without warning
  }
}
```