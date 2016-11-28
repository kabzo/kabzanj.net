
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/duri/workspace/web/www.kabzanj.net/conf/routes
// @DATE:Mon Nov 28 11:44:26 CET 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:17
  class ReverseWebJarAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WebJarAssets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sitemap.xml"})
        }
      """
    )
  
    // @LINE:13
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def menu_id: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.menu_id",
      """
        function(pageKey) {
        
          if (pageKey == """ + implicitly[JavascriptLiteral[String]].to("home") + """) {
            return _wA({method:"GET", url:"""" + _prefix + """"})
          }
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "menu/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("pageKey", encodeURIComponent(pageKey))})
          }
        
        }
      """
    )
  
    // @LINE:9
    def menu_string: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.menu_string",
      """
        function(str) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "file/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("str", encodeURIComponent(str))})
        }
      """
    )
  
    // @LINE:14
    def imageAt: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.imageAt",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "images/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }


}