
package views.html.projects

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object catapult_Scope0 {
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

class catapult extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<p>
<h1>Weight Measuring and Catapult Device</h1>
This was a school project where the task was to create with <b>reverse engineering</b> from an old HDD, printer and scener a precise weight measuring device which
is able to shoot an object to the distance 20cm.
</p>

<p>
    We used an old <b>HDD Lorentz Actuator</b> which works on principe of Lorentz force. Coil through which flows current is positioned
    in a magnetic field. Based on amplytude and direction of the voltage from the double <b>H-Bridge</b> the HDDs arm moves up and down. The H-Bridge is controlled from
    <b>NXP LPC Expresso</b>. Because through the coil flows current and the wire has some resistance, the coil gets warmer. We measured the temperature at the closest
    place to the coil. Based on this measurements and <b>Kalman Filtering</b> we compensate the errors caused by increase of temperature.
        The weight is measured based on time it takes from first to the second light barrier.
    At the beginning of project we have specified that our device will be able to measure with 1g precision and shoot with precision of 1cm to the distance of 20cm.
    At the end of semester we have reached following specifications:
    <ul>
        <li><b>Weight measuring precision</b>: 0.1g</li>
        <li><b>Weight range</b>: [0,20g] </li>
        <li><b>Shooting</b>: 0.5cm</li>
    </ul>
</p>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object catapult extends catapult_Scope0.catapult
              /*
                  -- GENERATED --
                  DATE: Tue Feb 28 21:52:04 CET 2017
                  SOURCE: /home/duri/workspace/web/kabzanj.net/app/views/projects/catapult.scala.html
                  HASH: 105205f088f23eb395dae36530d02cea32f81cf8
                  MATRIX: 842->0
                  LINES: 32->1
                  -- GENERATED --
              */
          