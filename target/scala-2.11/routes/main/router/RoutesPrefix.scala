
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/duri/workspace/web/kabzanj.net/conf/routes
// @DATE:Sun Mar 19 23:52:15 CET 2017


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
