
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/lab4/conf/routes
// @DATE:Tue Mar 06 15:08:45 GMT 2018


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
