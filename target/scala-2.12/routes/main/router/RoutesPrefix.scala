
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mehdi/Developer/codingdojo/playframeworksession/playfromscratch/play-java-seed/conf/routes
// @DATE:Thu Nov 09 23:24:14 CET 2017


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
