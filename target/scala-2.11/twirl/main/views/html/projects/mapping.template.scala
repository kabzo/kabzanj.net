
package views.html.projects

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object mapping_Scope0 {
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

class mapping extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<p>
<h1>Mapping and GoTo with ROS</h1>
</p>

<p>
  <h2>Gmapping</h2>
  We used the version of gmapping provided as node slam_gmapping in the ROS package gmapping.
  It requires laser scan and odometry data and provides the generated map at the topic map. For the
  simulation we only had to remap the topic of the laser scanner output (from scan to base_scan) and
  adjust the parameters that specify the size of the generated map (xmin, ymin, xmax and ymax).
  <h2>GoTo</h2>
  For path planning we used the ROS navigation stack. The main component of this stack is
move_base which uses a local and a global planner to reach the specified goal by sending
movement commands to the cmd_vel topic.
We used two different setups – in the first one we use a map that has been previously created using
gmapping (and is provided by a map_server node) and localize using amcl. In the second setup we
use gmapping together with path planning and thus create the map on the go – in this setup
gmapping provides the map and the localization.

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
object mapping extends mapping_Scope0.mapping
              /*
                  -- GENERATED --
                  DATE: Mon Nov 28 11:44:27 CET 2016
                  SOURCE: /home/duri/workspace/web/www.kabzanj.net/app/views/projects/mapping.scala.html
                  HASH: 85af745b000fe0705bd5d4a398eeca3114f82270
                  MATRIX: 840->0
                  LINES: 32->1
                  -- GENERATED --
              */
          