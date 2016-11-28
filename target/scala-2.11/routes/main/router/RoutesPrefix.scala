
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/duri/workspace/web/www.kabzanj.net/conf/routes
// @DATE:Mon Nov 28 11:44:26 CET 2016


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
