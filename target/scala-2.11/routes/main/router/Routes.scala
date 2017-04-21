
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/duri/workspace/web/kabzanj.net/conf/routes
// @DATE:Sun Mar 19 23:52:15 CET 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_2: controllers.Application,
  // @LINE:10
  Assets_1: controllers.Assets,
  // @LINE:17
  WebJarAssets_0: controllers.WebJarAssets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_2: controllers.Application,
    // @LINE:10
    Assets_1: controllers.Assets,
    // @LINE:17
    WebJarAssets_0: controllers.WebJarAssets
  ) = this(errorHandler, Application_2, Assets_1, WebJarAssets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_2, Assets_1, WebJarAssets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.menu_id(pageKey:String = "home")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """menu/$pageKey<[^/]+>""", """controllers.Application.menu_id(pageKey:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """file/$str<[^/]+>""", """controllers.Application.menu_string(str:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sitemap.xml""", """controllers.Assets.at(path:String = "/public", file:String = "sitemap.xml")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images/$file<.+>""", """controllers.Application.imageAt(file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""", """controllers.WebJarAssets.at(file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_menu_id0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_menu_id0_invoker = createInvoker(
    Application_2.menu_id(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "menu_id",
      Seq(classOf[String]),
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_menu_id1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu/"), DynamicPart("pageKey", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_menu_id1_invoker = createInvoker(
    Application_2.menu_id(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "menu_id",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """menu/$pageKey<[^/]+>"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_menu_string2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("file/"), DynamicPart("str", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_menu_string2_invoker = createInvoker(
    Application_2.menu_string(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "menu_string",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """file/$str<[^/]+>"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Assets_at3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sitemap.xml")))
  )
  private[this] lazy val controllers_Assets_at3_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """sitemap.xml"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned4_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Application_imageAt5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Application_imageAt5_invoker = createInvoker(
    Application_2.imageAt(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "imageAt",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """images/$file<.+>"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_WebJarAssets_at6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("webjars/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WebJarAssets_at6_invoker = createInvoker(
    WebJarAssets_0.at(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebJarAssets",
      "at",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """webjars/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_menu_id0_route(params) =>
      call(Param[String]("pageKey", Right("home"))) { (pageKey) =>
        controllers_Application_menu_id0_invoker.call(Application_2.menu_id(pageKey))
      }
  
    // @LINE:7
    case controllers_Application_menu_id1_route(params) =>
      call(params.fromPath[String]("pageKey", None)) { (pageKey) =>
        controllers_Application_menu_id1_invoker.call(Application_2.menu_id(pageKey))
      }
  
    // @LINE:9
    case controllers_Application_menu_string2_route(params) =>
      call(params.fromPath[String]("str", None)) { (str) =>
        controllers_Application_menu_string2_invoker.call(Application_2.menu_string(str))
      }
  
    // @LINE:10
    case controllers_Assets_at3_route(params) =>
      call(Param[String]("path", Right("/public")), Param[String]("file", Right("sitemap.xml"))) { (path, file) =>
        controllers_Assets_at3_invoker.call(Assets_1.at(path, file))
      }
  
    // @LINE:13
    case controllers_Assets_versioned4_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned4_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:14
    case controllers_Application_imageAt5_route(params) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_Application_imageAt5_invoker.call(Application_2.imageAt(file))
      }
  
    // @LINE:17
    case controllers_WebJarAssets_at6_route(params) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at6_invoker.call(WebJarAssets_0.at(file))
      }
  }
}