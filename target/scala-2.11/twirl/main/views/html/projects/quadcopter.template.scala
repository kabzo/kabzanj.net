
package views.html.projects

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object quadcopter_Scope0 {
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

class quadcopter extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<h1>Quadcopter Control-Board</h1>
To apply my theoretical skills acquired in the lecture control systems I have decided to create quadcopter control-board.
The algorithm consits of closed loop algorithms to achieve the stable flight. To control this drone 6 independent PID controllers are used.
<h3> Components </h3>
<ul>
    <li>Teensy 3.1: more advanced and powerfull than arduino</li>
    <li>MPU 9150: 9-axis MotionTracking device</li>
    <li>Bluetooth: wireless communication between board and computer (or possibly android device)</li>
    <li>Diods: Visual feedback of the boards state</li>
    <li>RC receiver: User control of quadcopter</li>
    <li>Quadcopter:
        <ul>
            <li>Motors: SunnySky x2212</li>
            <li>ESC: HobbyKing 20A</li>
            <li>Prop: 8045</li>
        </ul>
</ul>

<h3> Communication </h3>
For communication between drone and <a href="http://qgroundcontrol.org/" target="_blank">GCS</a> was used <a href="http://qgroundcontrol.org/mavlink/start" target="_blank">MAVLINK</a>
protocol (also used in the
<a href="https://pixhawk.org/choice" target="_blank"> PIXHAWK</a> and <a href="http://ardupilot.com/" target="_blank"> APM</a>).
This is very effective and lightweight protocol which covers transfer of the most important flight information."
<h3>Specifications</h3>
<ul>
    <li>Flight Time: around 15-20min min on 4000mAh LiPo</li>
    <li>Stability: Video on youtube is old and the newest software update and tuned PID constants results to very stable
        flight
    </li>
    <li>Controlling: Either through classic RC controller or PC joystick</li>
</ul>
<p>
    In the video you can see the first trials of flight. After some more tuning, I finally got much better results.
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
object quadcopter extends quadcopter_Scope0.quadcopter
              /*
                  -- GENERATED --
                  DATE: Mon Nov 28 11:44:27 CET 2016
                  SOURCE: /home/duri/workspace/web/www.kabzanj.net/app/views/projects/quadcopter.scala.html
                  HASH: d3a731ec8347e5429867cf879caddfb653143e08
                  MATRIX: 846->0
                  LINES: 32->1
                  -- GENERATED --
              */
          