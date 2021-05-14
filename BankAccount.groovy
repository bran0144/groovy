class BankAccount {
  private balance

  BankAccount(openingBalance) {
    balance = openingBalance
  }
  def void deposit(amount) {
    balance += amount
  }
  def void withdrawl(amount) {
    if (amount > balance)
      throw new Exception()
    balance -= amount
  }

}
