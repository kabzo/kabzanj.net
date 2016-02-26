
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

"""),format.raw/*3.1*/("""<div class="container">
    <div class="row">
        <div class="col-lg-12">

            <div class="col-lg-3 col-md-4">
                <div class="col-xs-12" style="height:70px;"></div>

                <img src=""""),_display_(/*10.28*/routes/*10.34*/.Assets.versioned("images_sys/id_photo.jpg")),format.raw/*10.78*/("""" style="max-height: 450px" class="img-responsive img-rounded" >
            </div>
            <div class="col-lg-9 col-md-8">
                <div class="col-lg-6">
                    <h2>About Me</h2>
                    <p>I always want to see my limits and try to overcome them. This was the reason why I have chosen to study, as a Slovak fresh high school graduate,
                        <b>Electrical Engineering</b> at <b>Technical University of Vienna</b>. Even though I knew that attending higher edu-
                        cation studies in a foreign language was going to be a challenge, I realised, that it would make me grow both
                        personally and professionally</p>
                    <p>To try something new I have decided to take a part in the exchange program. My choice was department of <b>Electrical Engineering</b> at the <b>ETH Zürich</b>.</p>
                    <p><b>My strongest interests</b>
                        <ul>
                            <li><b>Control Systems</b></li>
                            <li><b>Robotics</b></li>
                            <li><b>Circuits Development</b></li>
                            <li><b>Position Estimation</b> and <b>Kalman Filter</b></li>
                            <li>Fitness</li>
                        </ul>
                    </p>


                </div>
                <div class="col-lg-6">
                    <h2>Experiences</h2>
                    <ul>
                        <li><b>Teaching Assistant</b> on subject <b>Object-Oriented Programming</b> (Java)</li>
                        <li><b>Software Developer</b> at the <b>Institute for Microelectronics TU WIEN</b></li>
                        <li><b>Control Systems</b> Developer</li>
                    </ul>

                </div>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-sm-12">
            <div class="col-lg-3 col-sm-4">
                <h2>Contact</h2>
                <ul>
                    <li><b>Phone:</b> +421917111219</li>
                    <li><b>Email:</b><a href="mailto:kabzanj@gmail.com"> kabzanj&#064gmail.com</a></li>
                    <li><b>Address:</b> Currently Zurich</li>
                </ul>
            </div>
            <div class="col-lg-9 col-sm-8">
                <h2>Certifications</h2>
                <ul>
                    <li>edX Honor Code Certificate for <b>Autonomous Navigation for Flying Robots</b></li>
                    <li>Currently Working on: Udacity, <b>Machine Learning</b></li>
                </ul>
            </div>

        </div>
    </div>

    <div class="row">
        <h2>Programming and Frameworks Skills</h2>
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
                    <td><a href="www.cplusplus.com" target="_blank"> <img src=""""),_display_(/*79.81*/routes/*79.87*/.Assets.versioned("images_sys/cplusplus.png")),format.raw/*79.132*/(""""></a>
                        <a href="http://www.maplesoft.com/products/Maple/" target="_blank"><img src=""""),_display_(/*80.103*/routes/*80.109*/.Assets.versioned("images_sys/maple.png")),format.raw/*80.150*/(""""></a>
                        <a href="www.java.com" target="_blank"><img src=""""),_display_(/*81.75*/routes/*81.81*/.Assets.versioned("images_sys/java.png")),format.raw/*81.121*/(""""></a>
                        <a href="www.matlab.com" target="_blank"><img src=""""),_display_(/*82.77*/routes/*82.83*/.Assets.versioned("images_sys/matlab.png")),format.raw/*82.125*/(""""></a>
                        <a href="http://www.mathworks.com/products/simulink/" target="_blank"><img src=""""),_display_(/*83.106*/routes/*83.112*/.Assets.versioned("images_sys/simulink.png")),format.raw/*83.156*/(""""></a>
                    </td>
                    <td> <img src=""""),_display_(/*85.37*/routes/*85.43*/.Assets.versioned("images_sys/python.png")),format.raw/*85.85*/("""">
                    </td>
                </tr>
                <tr>
                    <td class="vertical-center"><h4>Framework</h4></td>
                    <td><a href="www.ros.org" target="_blank"><img src=""""),_display_(/*90.74*/routes/*90.80*/.Assets.versioned("images_sys/ros.png")),format.raw/*90.119*/(""""></a>
                        <a href="http://www.qt.io/ide/" target="_blank"><img src=""""),_display_(/*91.84*/routes/*91.90*/.Assets.versioned("images_sys/qt.png")),format.raw/*91.128*/(""""></a>
                        <a href="http://www.nvidia.com/object/cuda_home_new.html" target="_blank"><img src=""""),_display_(/*92.110*/routes/*92.116*/.Assets.versioned("images_sys/cuda.png")),format.raw/*92.156*/(""""></a>
                        <a href="https://www.khronos.org/opencl/" target="_blank"><img src=""""),_display_(/*93.94*/routes/*93.100*/.Assets.versioned("images_sys/opencl.png")),format.raw/*93.142*/(""""></a>

                    </td>
                    <td>
                        <a href="http://developer.android.com/index.html" target="_blank"><img src=""""),_display_(/*97.102*/routes/*97.108*/.Assets.versioned("images_sys/android.png")),format.raw/*97.151*/(""""></a>
                        <a href="http://www.w3schools.com/css/" target="_blank"><img src=""""),_display_(/*98.92*/routes/*98.98*/.Assets.versioned("images_sys/css.png")),format.raw/*98.137*/(""""></a>
                        <a href="http://www.w3schools.com/html/" target="_blank"><img src=""""),_display_(/*99.93*/routes/*99.99*/.Assets.versioned("images_sys/html.png")),format.raw/*99.139*/(""""></a>
                        <a href="http://www.w3schools.com/js/" target="_blank"><img src=""""),_display_(/*100.91*/routes/*100.97*/.Assets.versioned("images_sys/js.png")),format.raw/*100.135*/(""""></a>
                    </td>

                </tr>
            </tbody>
        </table>
    </div>


    """),_display_(/*109.6*/if(pictures!=null)/*109.24*/ {_display_(Seq[Any](format.raw/*109.26*/("""
        """),format.raw/*110.9*/("""<div class="row">
            <div class="col-lg-2"></div>

            <div class="col-lg-8">
                <div class="row">
                        <ul class="bxslider">
                        """),_display_(/*116.26*/for((name, id) <- pictures) yield /*116.53*/ {_display_(Seq[Any](format.raw/*116.55*/("""
                            """),format.raw/*117.29*/("""<li>
                                <a href=""""),_display_(/*118.43*/routes/*118.49*/.Application.menu_id(id)),format.raw/*118.73*/(""""><img src=""""),_display_(/*118.86*/routes/*118.92*/.Application.imageAt(name)),format.raw/*118.118*/(""""  alt="" /></a>
                            </li>
                        """)))}),format.raw/*120.26*/("""
                        """),format.raw/*121.25*/("""</ul>
                </div>
            </div>
            <div class="col-lg-2"></div>


        </div>
    """)))}),format.raw/*128.6*/("""
"""),format.raw/*129.1*/("""</div>

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
                  DATE: Fri Feb 26 11:25:03 CET 2016
                  SOURCE: /home/duri/workspace/web/jurajkabzan_personalwebpage/app/views/tabs/home.scala.html
                  HASH: b1ae0029f2fc5e78ad6d87f641a29aade1c4b6bc
                  MATRIX: 775->1|924->55|952->57|1197->275|1212->281|1277->325|4527->3549|4542->3555|4609->3600|4746->3709|4762->3715|4825->3756|4933->3837|4948->3843|5010->3883|5120->3966|5135->3972|5199->4014|5339->4126|5355->4132|5421->4176|5517->4245|5532->4251|5595->4293|5839->4510|5854->4516|5915->4555|6032->4645|6047->4651|6107->4689|6251->4805|6267->4811|6329->4851|6456->4951|6472->4957|6536->4999|6724->5159|6740->5165|6805->5208|6930->5306|6945->5312|7006->5351|7132->5450|7147->5456|7209->5496|7334->5593|7350->5599|7411->5637|7550->5749|7578->5767|7619->5769|7656->5778|7884->5978|7928->6005|7969->6007|8027->6036|8102->6083|8118->6089|8164->6113|8205->6126|8221->6132|8270->6158|8378->6234|8432->6259|8574->6370|8603->6371
                  LINES: 27->1|32->1|34->3|41->10|41->10|41->10|110->79|110->79|110->79|111->80|111->80|111->80|112->81|112->81|112->81|113->82|113->82|113->82|114->83|114->83|114->83|116->85|116->85|116->85|121->90|121->90|121->90|122->91|122->91|122->91|123->92|123->92|123->92|124->93|124->93|124->93|128->97|128->97|128->97|129->98|129->98|129->98|130->99|130->99|130->99|131->100|131->100|131->100|140->109|140->109|140->109|141->110|147->116|147->116|147->116|148->117|149->118|149->118|149->118|149->118|149->118|149->118|151->120|152->121|159->128|160->129
                  -- GENERATED --
              */
          