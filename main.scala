package design_pattern_practices

@main
def main(): Unit = {
    val context = Context()

    context.setStrategy(new EftStrategy());
    context.executeStrategy();

    context.setStrategy(new PaypalStrategy());
    context.executeStrategy();
}

