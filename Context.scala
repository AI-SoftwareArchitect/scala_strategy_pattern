package design_pattern_practices

class Context  {
  private var strategy: Strategy = _
  def setStrategy(strategy: Strategy): Unit = this.strategy = strategy
  def executeStrategy(): Unit = {
    if (strategy == null)
        throw new Exception("Strategy is not set.")
    else
    strategy.pay()
  }
}
