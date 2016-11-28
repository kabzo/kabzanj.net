
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/duri/workspace/git/kabzanj.net/conf/routes
// @DATE:Mon Nov 28 12:29:15 CET 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:17
  class ReverseWebJarAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def at(file:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "webjars/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:10
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def at(): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public"), ("file", "sitemap.xml")))
      Call("GET", _prefix + { _defaultPrefix } + "sitemap.xml")
    }
  
    // @LINE:13
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
    def menu_id(pageKey:String): Call = {
    
      (pageKey: @unchecked) match {
      
        // @LINE:6
        case (pageKey) if pageKey == "home" =>
          implicit val _rrc = new ReverseRouteContext(Map(("pageKey", "home")))
          Call("GET", _prefix)
      
        // @LINE:7
        case (pageKey)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "menu/" + implicitly[PathBindable[String]].unbind("pageKey", dynamicString(pageKey)))
      
      }
    
    }
  
    // @LINE:9
    def menu_string(str:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "file/" + implicitly[PathBindable[String]].unbind("str", dynamicString(str)))
    }
  
    // @LINE:14
    def imageAt(file:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "images/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }


}