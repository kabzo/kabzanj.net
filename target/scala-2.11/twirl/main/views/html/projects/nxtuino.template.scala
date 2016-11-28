
package views.html.projects

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object nxtuino_Scope0 {
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

class nxtuino extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<p>
<h1>Balancing two Wheel Vehicle</h1>
The first project I have created is the vehicle consisting of two motors and wheels which was able to balance
on them as the commercially known Segway does.
</p>
<p>
<h3> Components </h3>
<ul>
    <li>Arduino Uno</li>
    <li>MPU 6050: Accelerometer and Gyroscope 6DOF</li>
    <li>Bluetooth: wireless communication between vehicle and computer</li>
    <li>RL293D: Doble H-Bridge</li>
    <li>Motors were used from NXT-lego which has already build in encoders used to measure their velocity</li>
</ul>
</p>
<p>
<h3> Control Loop </h3>
In this setup there are two control loops running on each other. First <b>PID</b> controls the speed of the motors. It tries to reduce the error between the desired speed and actual.
Each command consists of vector which represents the speed from 0 to 255 of each motor.
This is send further to the PID control loop which is getting response from motors encoders about their actual speed.
Because the motors are the same, the control equation can be written in vector form and
    the control parameters can be the same for both motors. This controller runs <b>10 times</b> faster than the top loop what means it does not have to be take into account in the top controller.
    The top <b>PD</b> controller takes as a input its current angle in body frame. Because the vehicle can tilt either forward or backward just the pitch angle is used.
At the current implementation is no yaw compensation taking place.
    Further with current tilt-angle and desired angle = 0 the error and the output to the motors can be easily calculated.


<h3> Conclusion</h3>
As you might see in the video, the results are satisfiable but there are still many things to improve.
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
object nxtuino extends nxtuino_Scope0.nxtuino
              /*
                  -- GENERATED --
                  DATE: Mon Nov 28 11:44:27 CET 2016
                  SOURCE: /home/duri/workspace/web/www.kabzanj.net/app/views/projects/nxtuino.scala.html
                  HASH: 21677e604562be03f724c970aac4c241856e2117
                  MATRIX: 840->0
                  LINES: 32->1
                  -- GENERATED --
              */
          