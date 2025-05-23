package design_pattern_practices

class PaypalStrategy extends Strategy {
  override def pay(): Unit = println("Paypal payment has executed.")
}
