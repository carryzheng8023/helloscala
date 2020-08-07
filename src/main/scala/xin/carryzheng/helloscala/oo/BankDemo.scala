package xin.carryzheng.helloscala.oo

/**
  *
  * @author zhengxin
  *         2020-08-07 10:26:29
  */
object BankDemo {

  def main(args: Array[String]): Unit = {

    val account = new Account("621226", 890, "111111")
    account.query("111111")
    account.withdraw("111111", 100)
    account.query("111111")

  }

}

class Account(inAccount: String, inBalance: Double, inPwd: String) {

  private val accountNo = inAccount
  private var balance = inBalance
  private var pwd = inPwd

  def query(pwd: String): Unit = {
    if (!this.pwd.equals(pwd)) {
      println("密码错误")
      return
    }

    printf("账号为%s 当前月为%.2f", this.accountNo, this.balance)

  }

  def withdraw(pwd: String, money: Double): Any = {
    if (!this.pwd.equals(pwd)) {
      println("密码错误")
      return
    }

    if(money > this.balance){
      println("余额不足")
      return
    }

    this.balance -= money
    money
  }

}
