
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jeva/Dropbox/UNE/AWP/play_starter/conf/routes
// @DATE:Sun Jun 25 18:01:26 EAT 2017


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
