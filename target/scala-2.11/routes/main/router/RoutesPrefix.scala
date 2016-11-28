
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/duri/workspace/git/kabzanj.net/conf/routes
// @DATE:Mon Nov 28 12:29:15 CET 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
