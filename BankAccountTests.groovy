import groovy.util.GroovyTestCase
import groovy.mock.interceptor.*

class BankAccountTests extends GroovyTestCase {

  private account
  def void setUp(){
    account = new BankAccount(10)
  }
  def void tearDown(){
    account = null
  }
  def void testCanDepositMoney() {
    account.deposit(5)
    assert 15 == account.balance
  }
  def void testCanWithdrawMoney() {
    account.withdrawl(5)
    assert 5 == account.balance
  }
  def void testCanNotWithdrawMoreMoneyThanBalance() {
    shouldFail(InsufficientFundsException){
      account.withdrawl(15)
    }
  }
  def void testCanAccrueInterest() {
    def service = new MockFor(InterestRateService)
    service.demand.getInterestRate{
      return 0.10
    }
    service.use {
      account.accrueInterest()
      assert 11 == account.balance
      }
    }
}
