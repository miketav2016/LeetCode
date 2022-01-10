package difficultyLevels.easy.t67AddBinary

/**
 * Given two binary strings a and b, return their sum as a binary string.
 */
object Solution67 {
    def addBinary(a: String, b: String): String = {
        val (big, small) = if (a.length > b.length) (a, "0" * (a.length - b.length) + b) else (b, "0" * (b.length - a.length) + a)
        val (bigR, smallR) = (big.reverse, small.reverse)
        val (res, _, add) = bigR.foldLeft("", 0, 0) { case ((res, num, add), next) =>
            (next, smallR(num)) match {
                case ('0', '0') if add == 1 => (res + "1", num + 1, 0)
                case ('0', '0') if add == 0 => (res + "0", num + 1, 0)
                case ('0', '1') if add == 1 => (res + "0", num + 1, 1)
                case ('0', '1') if add == 0 => (res + "1", num + 1, 0)
                case ('1', '0') if add == 1 => (res + "0", num + 1, 1)
                case ('1', '0') if add == 0 => (res + "1", num + 1, 0)
                case ('1', '1') if add == 1 => (res + "1", num + 1, 1)
                case ('1', '1') if add == 0 => (res + "0", num + 1, 1)
            }
        }
        (if (add == 1) res + add else res).reverse
    }
}
