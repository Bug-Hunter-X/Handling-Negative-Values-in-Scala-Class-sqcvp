```scala
class MyClass(val name: String) {
  private var _value: Int = 0

  def value: Int = _value
  def value_=(newValue: Int): Unit = {
    if (newValue < 0) {
      throw new IllegalArgumentException("Value cannot be negative")
    }
    _value = newValue
  }
}

object Main extends App {
  val obj = new MyClass("MyObject")
  obj.value = 10
  println(obj.value) // Output: 10
  obj.value = -5 // Throws IllegalArgumentException
}
```