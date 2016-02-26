
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/duri/workspace/web/jurajkabzan_personalwebpage/conf/routes
// @DATE:Fri Feb 26 11:25:03 CET 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:15
  class ReverseWebJarAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def at(file:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "webjars/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:8
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def at(): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public"), ("file", "sitemap.xml")))
      Call("GET", _prefix + { _defaultPrefix } + "sitemap.xml")
    }
  
    // @LINE:11
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def menu_id(pageKey:String = "home"): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + queryString(List(if(pageKey == "home") None else Some(implicitly[QueryStringBindable[String]].unbind("pageKey", pageKey)))))
    }
  
    // @LINE:7
    def menu_string(str:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "menu/file" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("str", str)))))
    }
  
    // @LINE:12
    def imageAt(file:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "images/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }


}