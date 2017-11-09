
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mehdi/Developer/codingdojo/playframeworksession/playfromscratch/play-java-seed/conf/routes
// @DATE:Thu Nov 09 23:24:14 CET 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:11
  class ReverseBookController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def all: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookController.all",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/books"})
        }
      """
    )
  
    // @LINE:11
    def allByCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookController.allByCategory",
      """
        function(category0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/book" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("category", category0)])})
        }
      """
    )
  
    // @LINE:13
    def saveBook: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookController.saveBook",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/books"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
