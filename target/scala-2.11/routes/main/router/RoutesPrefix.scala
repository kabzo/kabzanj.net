
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/duri/workspace/web/jurajkabzan_personalwebpage/conf/routes
// @DATE:Fri Feb 26 11:25:03 CET 2016


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
