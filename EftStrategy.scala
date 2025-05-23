package design_pattern_practices

class EftStrategy extends Strategy {
  override def pay(): Unit = println("EFT payment has executed.")
}
