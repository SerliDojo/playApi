
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mehdi/Developer/codingdojo/playframeworksession/playfromscratch/play-java-seed/conf/routes
// @DATE:Thu Nov 09 23:24:14 CET 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:9
  Assets_2: controllers.Assets,
  // @LINE:11
  BookController_0: controllers.BookController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:9
    Assets_2: controllers.Assets,
    // @LINE:11
    BookController_0: controllers.BookController
  ) = this(errorHandler, HomeController_1, Assets_2, BookController_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_2, BookController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/book""", """controllers.BookController.allByCategory(category:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/books""", """controllers.BookController.all"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/books""", """controllers.BookController.saveBook"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_BookController_allByCategory2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/book")))
  )
  private[this] lazy val controllers_BookController_allByCategory2_invoker = createInvoker(
    BookController_0.allByCategory(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "allByCategory",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api/book""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_BookController_all3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/books")))
  )
  private[this] lazy val controllers_BookController_all3_invoker = createInvoker(
    BookController_0.all,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "all",
      Nil,
      "GET",
      this.prefix + """api/books""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_BookController_saveBook4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/books")))
  )
  private[this] lazy val controllers_BookController_saveBook4_invoker = createInvoker(
    BookController_0.saveBook,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "saveBook",
      Nil,
      "POST",
      this.prefix + """api/books""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_2.versioned(path, file))
      }
  
    // @LINE:11
    case controllers_BookController_allByCategory2_route(params@_) =>
      call(params.fromQuery[String]("category", None)) { (category) =>
        controllers_BookController_allByCategory2_invoker.call(BookController_0.allByCategory(category))
      }
  
    // @LINE:12
    case controllers_BookController_all3_route(params@_) =>
      call { 
        controllers_BookController_all3_invoker.call(BookController_0.all)
      }
  
    // @LINE:13
    case controllers_BookController_saveBook4_route(params@_) =>
      call { 
        controllers_BookController_saveBook4_invoker.call(BookController_0.saveBook)
      }
  }
}
