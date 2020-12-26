package difficultyLevels.easy.t1672RichestCustomerWealth

/**
 * You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i^th customer has in the j^th bank. Return the wealth that the richest customer has.
 * A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
 */
object Solution {
  def maximumWealth(accounts: Array[Array[Int]]): Int = {
    accounts.foldLeft(0)((rich, customer) =>
      if (rich < customer.sum) {
        customer.sum
      } else {
        rich
      })
  }
}
