
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
Quadcopters are flying drones with a highly constrained payload capacity, limited com-
putation power as well as communication capabilities. Such quadcopter can be equipped
with a low weight camera and additional computer. There are many applications where
the autonomous tracking and following of a moving object is desired. For example filming
of fast moving athletes during sport events, studying wild life in difficult to access regions
or surveillance and pursuing of criminals.
This reasons made us create a new vision-based dynamic object track and follow solution
for quadcopters. The solution can be deployed on typical consumer grade drones, as
it respects their payload, computation and communication constrains. Outcome of our
solution is a drone able to track and follow an object that is chosen by an user in a video
frame during initialisation.
In our project we first evaluate few promising computer vision algorithms for object
tracking based on their suitability for a quadcopter. Than we choose the most suitable
trackers which performance is tested on a use case video and evaluated based on various
criteria. The most suitable tracker is implemented in
Robot Operating System (ROS)
framework which is used for communication between the drone and the
Ground Control
Station
. The setup is tested on a two drone platforms as well as in a simulation.
We found the right combination of on-board computer and tracker which are suitable for
our project. We created test-video which evaluates the trackers and another video which
shows the final result during the flight.
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
                  DATE: Fri Feb 26 11:25:03 CET 2016
                  SOURCE: /home/duri/workspace/web/jurajkabzan_personalwebpage/app/views/projects/object_following.scala.html
                  HASH: 3ee33e4b82b1b6340ebd02f02144fdef2a321040
                  MATRIX: 858->0
                  LINES: 32->1
                  -- GENERATED --
              */
          