
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/duri/workspace/web/jurajkabzan_personalwebpage/conf/routes
// @DATE:Fri Feb 26 11:25:03 CET 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:15
  class ReverseWebJarAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WebJarAssets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sitemap.xml"})
        }
      """
    )
  
    // @LINE:11
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
          return _wA({method:"GET", url:"""" + _prefix + """" + _qS([(pageKey == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("pageKey", pageKey))])})
        }
      """
    )
  
    // @LINE:7
    def menu_string: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.menu_string",
      """
        function(str) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "menu/file" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("str", str)])})
        }
      """
    )
  
    // @LINE:12
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