
package views.html.tabs

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object home_Scope0 {
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

class home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Map[String, String],List[TabPage],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pictures: Map[String,String],tabpages: List[TabPage]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.56*/("""


"""),_display_(/*4.2*/if(pictures!=null)/*4.20*/ {_display_(Seq[Any](format.raw/*4.22*/("""

    """),format.raw/*6.5*/("""<section id="intro">
    <ul class="bxslider">
    """),_display_(/*8.6*/for((name, id) <- pictures) yield /*8.33*/ {_display_(Seq[Any](format.raw/*8.35*/("""
        """),format.raw/*9.9*/("""<li>
            <a href=""""),_display_(/*10.23*/routes/*10.29*/.Application.menu_id(id)),format.raw/*10.53*/(""""><img src=""""),_display_(/*10.66*/routes/*10.72*/.Application.imageAt(name)),format.raw/*10.98*/(""""  title=""""),_display_(/*10.109*/id/*10.111*/.replace('_', ' ').split(' ').map(_.capitalize).mkString(" ")),format.raw/*10.172*/("""" /></a>
        </li>
    """)))}),format.raw/*12.6*/("""
    """),format.raw/*13.5*/("""</ul>
    </section>

""")))}),format.raw/*16.2*/("""

"""),format.raw/*18.1*/("""<section id="about_me" class="section">
    <div class="container">

    <div class="row">
                <div class="row">
                    <div class="col-md-8 col-md-offset-2">
                        <div class="heading">
                            <h3><span>About Me</span></h3>
                        </div>
                        <div class="sub-heading">
                            <p>
                                Student at the ETH Zurich on MSc Robitcs, Systems nd Control
                            </p>
                        </div>
                    </div>
                </div>

                <div class="col-lg-3 col-md-4">
                    <img src=""""),_display_(/*36.32*/routes/*36.38*/.Assets.versioned("images_sys/id_photo.jpg")),format.raw/*36.82*/("""" style="max-height: 450px" class="img-responsive img-rounded" >
                </div>
                <div class="col-lg-9 col-md-8">
                    <div class="row">
                        <p><b>My strongest interests</b>
                            <ul>
                                <li><b>Robotic Systems</b></li>
                                <li><b>Controls</b></li>
                                <li><b>Coding</b></li>
                                <li>Fitness</li>
                            </ul>
                        </p>


                    </div>

                </div>
        </div>
    </div>

</section>

<section class="section gray">
    <div class="container">
        <div class="row">
            <div class="row">
                <div class="col-md-8 col-md-offset-2">
                    <div class="heading">
                        <h3><span>Education</span></h3>
                    </div>
                </div>
            </div>
            <ul>
            	<li><b>Swiss Federal Institute of Technology in Zurich (ETH)</b>: MSc Robotics, System and Control
            	</li>
                <li><b>Swiss Federal Institute of Technology in Zurich (ETH)</b>: B.S. in Electrical Engineering and Information Technology
                    <ul>
                        <li>Exchange Program</li>
                    </ul>
                </li>
                <li><b>Vienna University of Technology</b>: B.S. in Electrical Engineering and Information Technology
                    <ul>
                        <li><b>Finnished with a distinction, GPA:</b> 1.8 (1 to 5, 1 being the best and 4 pass)</li>
                        <li><b>Thesis Title:</b> An On-Drone Dynamic Object Track and Follow Solution for Quadcopters</li>
                    </ul>
                </li>
            </ul>
        </div>


        <div class="row">
            <div class="row">
                <div class="col-md-8 col-md-offset-2">
                    <div class="heading">
                        <h3><span>Experiences</span></h3>
                    </div>
                </div>
            </div>
            <ul>
                <li><b>Teaching Assistant</b> on subject <b>Object-Oriented Programming</b> (Java)
                    <ul>
                        <li>Evaluation and rating of the Programming Exercises</li>
                        <li>Help with the final Exam</li>
                        <li>Teaching the selected topics</li>
                    </ul>
                </li>
                <li><b>Software Developer</b> at the <b>Institute for Microelectronics TU WIEN</b>
                    <ul>
                        <li>Parallel Programming, CUDA, OpenCL, OpenMP</li>
                        <li>Implementing the Fast Fourier Transform</li>
                    </ul>
                </li>
                <li><b>Robotics System Developer</b> on Automation and Control Institute, Institute of Computer Engineering at Vienna University of Technology
                    <ul>
                        <li>Developing controllers for flying vehicles and control algorithms (Quadcopter)</li>
                        <li>Creating control boards</li>
                        <li>Evaluating and testing control loops</li>
                        <li>Creating 2D maps and localization SLAM, Kalman Filter, Particle Filter</li>
                    </ul>
                </li>

            </ul>
        </div>


        <div class="row">
            <div class="row">
                <div class="col-md-8 col-md-offset-2">
                    <div class="heading">
                        <h3><span>Certificates</span></h3>
                    </div>
                </div>
            </div>
            <ul>
                <li>edX Honor Code Certificate for <b>Autonomous Navigation for Flying Robots</b></li>
            </ul>

        </div>
    </div>
</section>


<section class="section">
<div class="container">
    <div class="row">
        <div class="col-sm-12">

            <div class="row">
                <div class="col-md-8 col-md-offset-2">
                    <div class="heading">
                        <h3><span>Programming & Softwares</span></h3>
                    </div>
                </div>
            </div>
        <table class="table table-striped text-center vertical-center">
            <thead>
                <tr>
                    <th></th>
                    <th class="text-center"><h4>Advanced</h4></th>
                    <th class="text-center"><h4>Basic</h4></th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td class="vertical-center"><h4>Languages</h4></td>
                    <td><a href="http://www.cplusplus.com" target="_blank"> <img src=""""),_display_(/*161.88*/routes/*161.94*/.Assets.versioned("images_sys/cplusplus.png")),format.raw/*161.139*/(""""></a>
                        <a href="http://www.maplesoft.com/products/Maple/" target="_blank"><img src=""""),_display_(/*162.103*/routes/*162.109*/.Assets.versioned("images_sys/maple.png")),format.raw/*162.150*/(""""></a>
                        <a href="http://www.java.com" target="_blank"><img src=""""),_display_(/*163.82*/routes/*163.88*/.Assets.versioned("images_sys/java.png")),format.raw/*163.128*/(""""></a>
                        <a href="http://www.matlab.com" target="_blank"><img src=""""),_display_(/*164.84*/routes/*164.90*/.Assets.versioned("images_sys/matlab.png")),format.raw/*164.132*/(""""></a>
                        <a href="http://www.mathworks.com/products/simulink/" target="_blank"><img src=""""),_display_(/*165.106*/routes/*165.112*/.Assets.versioned("images_sys/simulink.png")),format.raw/*165.156*/(""""></a>
                    </td>
                    <td>
                        <a href="https://www.python.org/" target="_blank">    <img src=""""),_display_(/*168.90*/routes/*168.96*/.Assets.versioned("images_sys/python.png")),format.raw/*168.138*/(""""></a>
                    </td>
                </tr>
                <tr>
                    <td class="vertical-center"><h4>Framework</h4></td>
                    <td><a href="http://www.ros.org" target="_blank"><img src=""""),_display_(/*173.81*/routes/*173.87*/.Assets.versioned("images_sys/ros.png")),format.raw/*173.126*/(""""></a>
                        <a href="http://www.qt.io/ide/" target="_blank"><img src=""""),_display_(/*174.84*/routes/*174.90*/.Assets.versioned("images_sys/qt.png")),format.raw/*174.128*/(""""></a>
                        <a href="http://www.nvidia.com/object/cuda_home_new.html" target="_blank"><img src=""""),_display_(/*175.110*/routes/*175.116*/.Assets.versioned("images_sys/cuda.png")),format.raw/*175.156*/(""""></a>
                        <a href="https://www.khronos.org/opencl/" target="_blank"><img src=""""),_display_(/*176.94*/routes/*176.100*/.Assets.versioned("images_sys/opencl.png")),format.raw/*176.142*/(""""></a>

                    </td>
                    <td>
                        <a href="http://developer.android.com/index.html" target="_blank"><img src=""""),_display_(/*180.102*/routes/*180.108*/.Assets.versioned("images_sys/android.png")),format.raw/*180.151*/(""""></a>
                        <a href="http://www.w3schools.com/css/" target="_blank"><img src=""""),_display_(/*181.92*/routes/*181.98*/.Assets.versioned("images_sys/css.png")),format.raw/*181.137*/(""""></a>
                        <a href="http://www.w3schools.com/html/" target="_blank"><img src=""""),_display_(/*182.93*/routes/*182.99*/.Assets.versioned("images_sys/html.png")),format.raw/*182.139*/(""""></a>
                        <a href="http://www.w3schools.com/js/" target="_blank"><img src=""""),_display_(/*183.91*/routes/*183.97*/.Assets.versioned("images_sys/js.png")),format.raw/*183.135*/(""""></a>
                    </td>

                </tr>
            </tbody>
        </table>
        </div>
    </div>
</div>
    </div>
    </section>




</div>

"""))
      }
    }
  }

  def render(pictures:Map[String, String],tabpages:List[TabPage]): play.twirl.api.HtmlFormat.Appendable = apply(pictures,tabpages)

  def f:((Map[String, String],List[TabPage]) => play.twirl.api.HtmlFormat.Appendable) = (pictures,tabpages) => apply(pictures,tabpages)

  def ref: this.type = this

}


}

/**/
object home extends home_Scope0.home
              /*
                  -- GENERATED --
                  DATE: Tue Dec 06 18:39:15 CET 2016
                  SOURCE: /home/duri/workspace/web/kabzanj.net/app/views/tabs/home.scala.html
                  HASH: 79aaaa0c42ac9efd0a9f19e3a67a5d1955143923
                  MATRIX: 775->1|924->55|953->59|979->77|1018->79|1050->85|1127->137|1169->164|1208->166|1243->175|1297->202|1312->208|1357->232|1397->245|1412->251|1459->277|1498->288|1510->290|1593->351|1651->379|1683->384|1736->407|1765->409|2481->1098|2496->1104|2561->1148|7399->5958|7415->5964|7483->6009|7621->6118|7638->6124|7702->6165|7818->6253|7834->6259|7897->6299|8015->6389|8031->6395|8096->6437|8237->6549|8254->6555|8321->6599|8496->6746|8512->6752|8577->6794|8833->7022|8849->7028|8911->7067|9029->7157|9045->7163|9106->7201|9251->7317|9268->7323|9331->7363|9459->7463|9476->7469|9541->7511|9730->7671|9747->7677|9813->7720|9939->7818|9955->7824|10017->7863|10144->7962|10160->7968|10223->8008|10348->8105|10364->8111|10425->8149
                  LINES: 27->1|32->1|35->4|35->4|35->4|37->6|39->8|39->8|39->8|40->9|41->10|41->10|41->10|41->10|41->10|41->10|41->10|41->10|41->10|43->12|44->13|47->16|49->18|67->36|67->36|67->36|192->161|192->161|192->161|193->162|193->162|193->162|194->163|194->163|194->163|195->164|195->164|195->164|196->165|196->165|196->165|199->168|199->168|199->168|204->173|204->173|204->173|205->174|205->174|205->174|206->175|206->175|206->175|207->176|207->176|207->176|211->180|211->180|211->180|212->181|212->181|212->181|213->182|213->182|213->182|214->183|214->183|214->183
                  -- GENERATED --
              */
          