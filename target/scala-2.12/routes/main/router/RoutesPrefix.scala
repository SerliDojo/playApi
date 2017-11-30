
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dojo/mediatek/playApi/conf/routes
// @DATE:Thu Nov 30 19:05:56 CET 2017


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
