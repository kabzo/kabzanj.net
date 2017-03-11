
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
                <div class="col-lg-3 col-md-4">
                    <img src=""""),_display_(/*23.32*/routes/*23.38*/.Assets.versioned("images_sys/id_photo.jpg")),format.raw/*23.82*/("""" style="max-height: 300px" class="img-responsive img-rounded" >
                </div>
                <div class="col-lg-1"> </div>
                <div class="col-lg-8 col-md-8">
                    <div class="row">

                    <div class="heading">
                        <h3><span>About Me</span></h3>
                    </div>
                    <div class="sub-heading">
                        <p>
                           Currently at ETH Zurich studying MSc Robitcs, Systems nd Control
                        </p>
                    </div>
           
                        <p><b>My strongest interests</b>
                            <ul>
                                <li><b>Control Systems</b></li>
                                <li><b>Optimization</b></li>
                                <li>Fitness and Basketball</li>
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
                <li>Part of <a href="http://driverless.amzracing.ch/"> <b>AMZ Driverless</b> (2016/2017)</a> 
                    <ul> I am working on Path Planning and helping in Controls</ul>
                </li>

                <li><b>Software Developer</b> at the <b>Institute for Microelectronics TU WIEN</b>(2014)
                    <ul>
                        <li>Parallel Programming, CUDA, OpenCL, OpenMP</li>
                        <li>Implementing the Fast Fourier Transform</li>
                    </ul>
                </li>
                <li><b>Robotics System Developer</b> on Automation and Control Institute, Institute of Computer Engineering at Vienna University of Technology (2015)
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
                <li> IELTS Band 7 </li>
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
                    <td><a href="http://www.cplusplus.com" target="_blank"> <img src=""""),_display_(/*155.88*/routes/*155.94*/.Assets.versioned("images_sys/cplusplus.png")),format.raw/*155.139*/(""""></a>
                        <a href="http://www.maplesoft.com/products/Maple/" target="_blank"><img src=""""),_display_(/*156.103*/routes/*156.109*/.Assets.versioned("images_sys/maple.png")),format.raw/*156.150*/(""""></a>
                        <a href="http://www.java.com" target="_blank"><img src=""""),_display_(/*157.82*/routes/*157.88*/.Assets.versioned("images_sys/java.png")),format.raw/*157.128*/(""""></a>
                        <a href="http://www.matlab.com" target="_blank"><img src=""""),_display_(/*158.84*/routes/*158.90*/.Assets.versioned("images_sys/matlab.png")),format.raw/*158.132*/(""""></a>
                        <a href="http://www.mathworks.com/products/simulink/" target="_blank"><img src=""""),_display_(/*159.106*/routes/*159.112*/.Assets.versioned("images_sys/simulink.png")),format.raw/*159.156*/(""""></a>
                    </td>
                    <td>
                        <a href="https://www.python.org/" target="_blank">    <img src=""""),_display_(/*162.90*/routes/*162.96*/.Assets.versioned("images_sys/python.png")),format.raw/*162.138*/(""""></a>
                    </td>
                </tr>
                <tr>
                    <td class="vertical-center"><h4>Framework</h4></td>
                    <td><a href="http://www.ros.org" target="_blank"><img src=""""),_display_(/*167.81*/routes/*167.87*/.Assets.versioned("images_sys/ros.png")),format.raw/*167.126*/(""""></a>
                        <a href="http://www.qt.io/ide/" target="_blank"><img src=""""),_display_(/*168.84*/routes/*168.90*/.Assets.versioned("images_sys/qt.png")),format.raw/*168.128*/(""""></a>
                        <a href="http://www.nvidia.com/object/cuda_home_new.html" target="_blank"><img src=""""),_display_(/*169.110*/routes/*169.116*/.Assets.versioned("images_sys/cuda.png")),format.raw/*169.156*/(""""></a>
                        <a href="https://www.khronos.org/opencl/" target="_blank"><img src=""""),_display_(/*170.94*/routes/*170.100*/.Assets.versioned("images_sys/opencl.png")),format.raw/*170.142*/(""""></a>

                    </td>
                    <td>
                        <a href="http://developer.android.com/index.html" target="_blank"><img src=""""),_display_(/*174.102*/routes/*174.108*/.Assets.versioned("images_sys/android.png")),format.raw/*174.151*/(""""></a>
                        <a href="http://www.w3schools.com/css/" target="_blank"><img src=""""),_display_(/*175.92*/routes/*175.98*/.Assets.versioned("images_sys/css.png")),format.raw/*175.137*/(""""></a>
                        <a href="http://www.w3schools.com/html/" target="_blank"><img src=""""),_display_(/*176.93*/routes/*176.99*/.Assets.versioned("images_sys/html.png")),format.raw/*176.139*/(""""></a>
                        <a href="http://www.w3schools.com/js/" target="_blank"><img src=""""),_display_(/*177.91*/routes/*177.97*/.Assets.versioned("images_sys/js.png")),format.raw/*177.135*/(""""></a>
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
                  DATE: Tue Feb 28 22:11:16 CET 2017
                  SOURCE: /home/duri/workspace/web/kabzanj.net/app/views/tabs/home.scala.html
                  HASH: bfd2ae981d02c1a1cb385ae77dfb4865b380d58c
                  MATRIX: 775->1|924->55|953->59|979->77|1018->79|1050->85|1127->137|1169->164|1208->166|1243->175|1297->202|1312->208|1357->232|1397->245|1412->251|1459->277|1498->288|1510->290|1593->351|1651->379|1683->384|1736->407|1765->409|1962->579|1977->585|2042->629|7142->5701|7158->5707|7226->5752|7364->5861|7381->5867|7445->5908|7561->5996|7577->6002|7640->6042|7758->6132|7774->6138|7839->6180|7980->6292|7997->6298|8064->6342|8239->6489|8255->6495|8320->6537|8576->6765|8592->6771|8654->6810|8772->6900|8788->6906|8849->6944|8994->7060|9011->7066|9074->7106|9202->7206|9219->7212|9284->7254|9473->7414|9490->7420|9556->7463|9682->7561|9698->7567|9760->7606|9887->7705|9903->7711|9966->7751|10091->7848|10107->7854|10168->7892
                  LINES: 27->1|32->1|35->4|35->4|35->4|37->6|39->8|39->8|39->8|40->9|41->10|41->10|41->10|41->10|41->10|41->10|41->10|41->10|41->10|43->12|44->13|47->16|49->18|54->23|54->23|54->23|186->155|186->155|186->155|187->156|187->156|187->156|188->157|188->157|188->157|189->158|189->158|189->158|190->159|190->159|190->159|193->162|193->162|193->162|198->167|198->167|198->167|199->168|199->168|199->168|200->169|200->169|200->169|201->170|201->170|201->170|205->174|205->174|205->174|206->175|206->175|206->175|207->176|207->176|207->176|208->177|208->177|208->177
                  -- GENERATED --
              */
          