
package views.html.projects

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object driverless_formula_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class driverless_formula extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<a href="http://driverless.amzracing.ch"  target="_blank"> <h1>AMZ Driverless (2016/2017)</h1></a>
<p>
I am currently part of a project at ETHZ which is building an autonomous formula which will compete against another <b>14 teams</b> in August in multiple disciplines. This is very challanging task since the car needs to be ready to drive fast and especialy, very reliably. The used vehicle is from 2015 <b>flüela</b> which won in many disciplines. 
</p>
<p>
In this project I am in charge of <b>trajectory planning, simulation</b> and I am helping in control as well. This is very challanging since the map in not known beforehand and the computational performance on the car is very limited. This is limiting us in the algorihmn choice. 
</p>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object driverless_formula extends driverless_formula_Scope0.driverless_formula
              /*
                  -- GENERATED --
                  DATE: Mon Mar 20 00:24:02 CET 2017
                  SOURCE: /home/duri/workspace/web/kabzanj.net/app/views/projects/driverless_formula.scala.html
                  HASH: 73fbae1836de6630d1a0187614b684b12f73c301
                  MATRIX: 862->0
                  LINES: 32->1
                  -- GENERATED --
              */
          