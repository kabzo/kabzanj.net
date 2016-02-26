
package views.html.projects

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object project_page_Scope0 {
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

class project_page extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[ProjectPage,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentPage: ProjectPage):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""
"""),format.raw/*2.1*/("""<div class="container">
    <div class="row">
        <div class="col-lg-6">
            """),_display_(/*5.14*/currentPage/*5.25*/.getContentHtml()),format.raw/*5.42*/("""
            """),format.raw/*6.13*/("""<div class="row">
                """),_display_(/*7.18*/if(currentPage.getGithub_link() != null)/*7.58*/ {_display_(Seq[Any](format.raw/*7.60*/("""
                    """),format.raw/*8.21*/("""<div class="col-sm-2 text-center">
                        GitHub
                        <a href=""""),_display_(/*10.35*/currentPage/*10.46*/.getGithub_link()),format.raw/*10.63*/("""" target="_blank">
                            <i class="fa fa-github fa-5x"></i>
                        </a>
                    </div>
                """)))}),format.raw/*14.18*/("""
                """),_display_(/*15.18*/if(currentPage.getUrl() != null)/*15.50*/ {_display_(Seq[Any](format.raw/*15.52*/("""
                        """),format.raw/*16.25*/("""<div class="col-sm-2 text-center">
                        Document
                        <a href=""""),_display_(/*18.35*/routes/*18.41*/.Application.menu_string(currentPage.getName())),format.raw/*18.88*/("""" target="_blank">
                            <i class="fa fa-file-pdf-o fa-5x"></i>
                        </a>
                    </div>
                """)))}),format.raw/*22.18*/("""
            """),format.raw/*23.13*/("""</div>
        </div>
        <div class="col-lg-5 col-lg-offset-1">
            <div class="row spacer">
            """),_display_(/*27.14*/if(currentPage.getPictures().size != 0 && currentPage.getPictures().size > 1)/*27.91*/ {_display_(Seq[Any](format.raw/*27.93*/("""
                    """),format.raw/*28.21*/("""<!-- Slider -->
                <ul class="bxslider">
                """),_display_(/*30.18*/for(p <- currentPage.getPictures()) yield /*30.53*/ {_display_(Seq[Any](format.raw/*30.55*/("""
                    """),format.raw/*31.21*/("""<li>
                        <img src=""""),_display_(/*32.36*/routes/*32.42*/.Application.imageAt("images_tab/" + currentPage.getName() + "/" + p)),format.raw/*32.111*/("""" alt="" />
                    </li>
                """)))}),format.raw/*34.18*/("""
                """),format.raw/*35.17*/("""</ul>

                    <!-- end slider -->
            """)))}/*38.15*/else/*38.20*/{_display_(Seq[Any](format.raw/*38.21*/("""
                """),_display_(/*39.18*/if(currentPage.getPictures().size != 0)/*39.57*/ {_display_(Seq[Any](format.raw/*39.59*/("""
                    """),format.raw/*40.21*/("""<img src=""""),_display_(/*40.32*/routes/*40.38*/.Application.imageAt("images_tab/" + currentPage.getName() + "/" + currentPage.getPictures()(0))),format.raw/*40.134*/("""" alt="" />
                """)))}),format.raw/*41.18*/("""
            """)))}),format.raw/*42.14*/("""
            """),format.raw/*43.13*/("""</div>
            <div class="row">
            """),_display_(/*45.14*/if(currentPage.getVideo_url() != null)/*45.52*/ {_display_(Seq[Any](format.raw/*45.54*/("""
                """),format.raw/*46.17*/("""<div class="embed-container">
                    <iframe class="embed-responsive-item" src="""),_display_(/*47.64*/currentPage/*47.75*/.getVideo_url()),format.raw/*47.90*/(""" """),format.raw/*47.91*/("""frameborder="0" allowfullscreen></iframe>
                </div>
            """)))}),format.raw/*49.14*/("""
            """),format.raw/*50.13*/("""</div>

        </div>
    </div>
</div>

"""))
      }
    }
  }

  def render(currentPage:ProjectPage): play.twirl.api.HtmlFormat.Appendable = apply(currentPage)

  def f:((ProjectPage) => play.twirl.api.HtmlFormat.Appendable) = (currentPage) => apply(currentPage)

  def ref: this.type = this

}


}

/**/
object project_page extends project_page_Scope0.project_page
              /*
                  -- GENERATED --
                  DATE: Fri Feb 26 11:25:03 CET 2016
                  SOURCE: /home/duri/workspace/web/jurajkabzan_personalwebpage/app/views/projects/project_page.scala.html
                  HASH: 129c6aa2ae59770433b255d12188f697a9e2d070
                  MATRIX: 773->1|894->27|921->28|1037->118|1056->129|1093->146|1133->159|1194->194|1242->234|1281->236|1329->257|1456->357|1476->368|1514->385|1700->540|1745->558|1786->590|1826->592|1879->617|2008->719|2023->725|2091->772|2281->931|2322->944|2468->1063|2554->1140|2594->1142|2643->1163|2741->1234|2792->1269|2832->1271|2881->1292|2948->1332|2963->1338|3054->1407|3140->1462|3185->1479|3264->1540|3277->1545|3316->1546|3361->1564|3409->1603|3449->1605|3498->1626|3536->1637|3551->1643|3669->1739|3729->1768|3774->1782|3815->1795|3892->1845|3939->1883|3979->1885|4024->1902|4144->1995|4164->2006|4200->2021|4229->2022|4338->2100|4379->2113
                  LINES: 27->1|32->1|33->2|36->5|36->5|36->5|37->6|38->7|38->7|38->7|39->8|41->10|41->10|41->10|45->14|46->15|46->15|46->15|47->16|49->18|49->18|49->18|53->22|54->23|58->27|58->27|58->27|59->28|61->30|61->30|61->30|62->31|63->32|63->32|63->32|65->34|66->35|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|71->40|72->41|73->42|74->43|76->45|76->45|76->45|77->46|78->47|78->47|78->47|78->47|80->49|81->50
                  -- GENERATED --
              */
          