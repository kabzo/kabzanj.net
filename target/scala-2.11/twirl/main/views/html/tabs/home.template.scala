
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

    """),format.raw/*6.5*/("""<!-- <section id="intro"> -->
    <ul class="bxslider">
    """),_display_(/*8.6*/for((name, id) <- pictures) yield /*8.33*/ {_display_(Seq[Any](format.raw/*8.35*/("""
        """),format.raw/*9.9*/("""<li>
            <img src=""""),_display_(/*10.24*/routes/*10.30*/.Application.imageAt(name)),format.raw/*10.56*/(""""  title=""""),_display_(/*10.67*/id/*10.69*/.replace('_', ' ').split(' ').map(_.capitalize).mkString(" ")),format.raw/*10.130*/("""" />
        </li>
    """)))}),format.raw/*12.6*/("""
    """),format.raw/*13.5*/("""</ul>
    <!-- </section> -->

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
                           Acquiring MSc Robotics, System and Control at ETH Zürich
                        </p>
                    </div>
           
                        <p><b>My strongest interests</b>
                            <ul>
                                <li><b>Control designes pushed to the limits</b></li>
                                <li><b>Optimization</b></li>
                                <li><b>Machine Learning </b></li>
                                <li>Fitness, basketball and cooking</li>
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
                <ul>
                <li>Knowledge Acquired:
                <ul>
                <li>Control Systems, Distributed Control, Nonlinear Control, MIMO Control, Optimal Control</li>
                <li>Dynamic Programming</li>
                <li>Model Predictive Control, Optimization </li>
                <li>Machine Learning (supervised/unsupervised learning)</li>
                <li> C++ algorithm optimization </li>
                </ul></li>
                </ul>
            	</li>
                <li><b>Swiss Federal Institute of Technology in Zurich (ETH)</b>: B.S. in Electrical Engineering and Information Technology
                    <ul>
                        <li>Exchange Program, where I focused more on sensing biological functions (Neuron action potential)</li>
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
                    <ul>
                        <li> I am working on <b>Path Planning</b> and helping in control system</li>
                    </ul>
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
                <li>currently taking Underactuated Robots at edX</li>
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
                    <td><a href="http://www.cplusplus.com" target="_blank"> <img src=""""),_display_(/*169.88*/routes/*169.94*/.Assets.versioned("images_sys/cplusplus.png")),format.raw/*169.139*/(""""></a>
                    <a href="https://www.python.org/" target="_blank">    <img src=""""),_display_(/*170.86*/routes/*170.92*/.Assets.versioned("images_sys/python.png")),format.raw/*170.134*/(""""></a>
                        <a href="http://www.maplesoft.com/products/Maple/" target="_blank"><img src=""""),_display_(/*171.103*/routes/*171.109*/.Assets.versioned("images_sys/maple.png")),format.raw/*171.150*/(""""></a>
                        <a href="http://www.java.com" target="_blank"><img src=""""),_display_(/*172.82*/routes/*172.88*/.Assets.versioned("images_sys/java.png")),format.raw/*172.128*/(""""></a>
                        <a href="http://www.matlab.com" target="_blank"><img src=""""),_display_(/*173.84*/routes/*173.90*/.Assets.versioned("images_sys/matlab.png")),format.raw/*173.132*/(""""></a>
                        <a href="http://www.mathworks.com/products/simulink/" target="_blank"><img src=""""),_display_(/*174.106*/routes/*174.112*/.Assets.versioned("images_sys/simulink.png")),format.raw/*174.156*/(""""></a>
                    </td>
                    <td>
                        
                    </td>
                </tr>
                <tr>
                    <td class="vertical-center"><h4>Framework</h4></td>
                    <td><a href="http://www.ros.org" target="_blank"><img src=""""),_display_(/*182.81*/routes/*182.87*/.Assets.versioned("images_sys/ros.png")),format.raw/*182.126*/(""""></a>
                        <a href="http://www.qt.io/ide/" target="_blank"><img src=""""),_display_(/*183.84*/routes/*183.90*/.Assets.versioned("images_sys/qt.png")),format.raw/*183.128*/(""""></a>
                        <a href="http://www.nvidia.com/object/cuda_home_new.html" target="_blank"><img src=""""),_display_(/*184.110*/routes/*184.116*/.Assets.versioned("images_sys/cuda.png")),format.raw/*184.156*/(""""></a>
                        <a href="https://www.khronos.org/opencl/" target="_blank"><img src=""""),_display_(/*185.94*/routes/*185.100*/.Assets.versioned("images_sys/opencl.png")),format.raw/*185.142*/(""""></a>

                    </td>
                    <td>
                        <a href="http://developer.android.com/index.html" target="_blank"><img src=""""),_display_(/*189.102*/routes/*189.108*/.Assets.versioned("images_sys/android.png")),format.raw/*189.151*/(""""></a>
                        <a href="http://www.w3schools.com/css/" target="_blank"><img src=""""),_display_(/*190.92*/routes/*190.98*/.Assets.versioned("images_sys/css.png")),format.raw/*190.137*/(""""></a>
                        <a href="http://www.w3schools.com/html/" target="_blank"><img src=""""),_display_(/*191.93*/routes/*191.99*/.Assets.versioned("images_sys/html.png")),format.raw/*191.139*/(""""></a>
                        <a href="http://www.w3schools.com/js/" target="_blank"><img src=""""),_display_(/*192.91*/routes/*192.97*/.Assets.versioned("images_sys/js.png")),format.raw/*192.135*/(""""></a>
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
                  DATE: Mon Mar 20 00:21:54 CET 2017
                  SOURCE: /home/duri/workspace/web/kabzanj.net/app/views/tabs/home.scala.html
                  HASH: e7486d8200e75e169476d4d5b53d7684fd3b3f71
                  MATRIX: 775->1|924->55|953->59|979->77|1018->79|1050->85|1136->146|1178->173|1217->175|1252->184|1307->212|1322->218|1369->244|1407->255|1418->257|1501->318|1555->342|1587->347|1649->379|1678->381|1875->551|1890->557|1955->601|7845->6463|7861->6469|7929->6514|8049->6606|8065->6612|8130->6654|8268->6763|8285->6769|8349->6810|8465->6898|8481->6904|8544->6944|8662->7034|8678->7040|8743->7082|8884->7194|8901->7200|8968->7244|9300->7548|9316->7554|9378->7593|9496->7683|9512->7689|9573->7727|9718->7843|9735->7849|9798->7889|9926->7989|9943->7995|10008->8037|10197->8197|10214->8203|10280->8246|10406->8344|10422->8350|10484->8389|10611->8488|10627->8494|10690->8534|10815->8631|10831->8637|10892->8675
                  LINES: 27->1|32->1|35->4|35->4|35->4|37->6|39->8|39->8|39->8|40->9|41->10|41->10|41->10|41->10|41->10|41->10|43->12|44->13|47->16|49->18|54->23|54->23|54->23|200->169|200->169|200->169|201->170|201->170|201->170|202->171|202->171|202->171|203->172|203->172|203->172|204->173|204->173|204->173|205->174|205->174|205->174|213->182|213->182|213->182|214->183|214->183|214->183|215->184|215->184|215->184|216->185|216->185|216->185|220->189|220->189|220->189|221->190|221->190|221->190|222->191|222->191|222->191|223->192|223->192|223->192
                  -- GENERATED --
              */
          