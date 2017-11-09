
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mehdi/Developer/codingdojo/playframeworksession/playfromscratch/play-java-seed/conf/routes
// @DATE:Thu Nov 09 23:24:14 CET 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:11
  class ReverseBookController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def all(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/books")
    }
  
    // @LINE:11
    def allByCategory(category:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/book" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("category", category)))))
    }
  
    // @LINE:13
    def saveBook(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/books")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:9
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
