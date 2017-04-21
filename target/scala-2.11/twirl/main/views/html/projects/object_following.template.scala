
package views.html.projects

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object object_following_Scope0 {
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

class object_following extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<p>
    <h1>An On-Drone Dynamic Object Track and Follow Solution for Quadcopters</h1>
    My latest project I have been working on is a drone able to track and follow any given object in its video frame.
</p>
<p>
    <h2>Abstract</h2>
Quadcopters are flying drones with a highly constrained payload capacity, limited
computation power as well as communication capabilities. Such quadcopters can be
equipped with a low weight camera and an additional computer.  There are many
applications where the autonomous tracking and following of a moving object is desired.
For example filming of fast moving athletes during sport events, studying wild life in
regions difficult to access or surveillance and pursuing of criminals.
These reasons made us create a new vision-based dynamic object track and follow
solution for quadcopters. The solution can be deployed on a consumer grade drone with
an additional on-board computer. The outcome of our solution is a quadcopter able to
track and follow an object chosen by the user in a video frame during initialization.
In our project, we first evaluate a few promising computer vision algorithms for object
tracking based on their suitability for a quadcopter. Afterwards we choose three the most
suitable trackers whose performance is tested on a use case video and evaluated based on
various criteria. The most suitable tracker is implemented in the
Robot Operating System
framework which is used for communication between the drone and the
Ground Control
Station
. The setup is tested on two drone platforms as well as in a simulation.
We found the right combination of an on-board computer and tracker which are suitable
for our project. The result of a drone able to track and follow an object is shown in a
video.
</p>
<p>
    <h3> Components </h3>
    <ul>
        <li>Nvidi Jetson TK1</li>
        <li>APM 2.8 but further exchanged with PX4 + IO</li>
        <li>Full Hd webcamera</li>
        <li>Bluetooth for debugging the Control Board</li>
        <li>WiFi </li>
        <li>Sonar </li>

    </ul>
</p>

<p>
    <h3> Conclusion</h3>
    I would like to thank <a href="https://ti.tuwien.ac.at/cps/people/bernhard-fromel" target="_blank">Mr. Bernhard Frömel</a> and
<a href="https://ti.tuwien.ac.at/cps/people/grosu" target="_blank"> Prof. Radu Grosu</a> for all the help during this project.
    For more information follow the documentation or the code in GitHub.
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
object object_following extends object_following_Scope0.object_following
              /*
                  -- GENERATED --
                  DATE: Sun Mar 19 23:52:16 CET 2017
                  SOURCE: /home/duri/workspace/web/kabzanj.net/app/views/projects/object_following.scala.html
                  HASH: 83764cd5a31936f918ae3a9463b4ce4b1c958006
                  MATRIX: 858->0
                  LINES: 32->1
                  -- GENERATED --
              */
          