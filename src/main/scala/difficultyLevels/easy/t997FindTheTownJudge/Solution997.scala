package difficultyLevels.easy.t997FindTheTownJudge

/**
 * In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is secretly the town judge.
 *
 * If the town judge exists, then:
 *
 * The town judge trusts nobody.
 * Everybody (except for the town judge) trusts the town judge.
 * There is exactly one person that satisfies properties 1 and 2.
 * You are given an array trust where trust[i] = [ai, bi] representing that the person labeled ai trusts the person labeled bi.
 *
 * Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise.
 */
object Solution997 {
    def findJudge(n: Int, trust: Array[Array[Int]]): Int = {
        val rawData = trust.map(_.headOption.getOrElse(-1)).toSet
        val rawDataFaith = trust.map(_.tail.headOption.getOrElse(-1))
        val mbJudge = (1 to n).foldLeft(-1) { case (res, i) => if (rawData.contains(i)) res else i }
        if (rawDataFaith.count(_ == mbJudge) == n - 1)
            mbJudge
        else
            -1
    }
}
