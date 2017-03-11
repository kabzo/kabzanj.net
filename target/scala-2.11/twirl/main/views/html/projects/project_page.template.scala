
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



"""),format.raw/*5.1*/("""<div class="container">
    <div class="row spacer">
        <div class="col-lg-6">
            """),_display_(/*8.14*/currentPage/*8.25*/.getContentHtml()),format.raw/*8.42*/("""
            """),format.raw/*9.13*/("""<div class="row">
                """),_display_(/*10.18*/if(currentPage.getGithub_link() != null)/*10.58*/ {_display_(Seq[Any](format.raw/*10.60*/("""
                    """),format.raw/*11.21*/("""<div class="col-sm-2 text-center">
                        GitHub
                        <a href=""""),_display_(/*13.35*/currentPage/*13.46*/.getGithub_link()),format.raw/*13.63*/("""" target="_blank">
                            <i class="fa fa-github fa-5x"></i>
                        </a>
                    </div>
                """)))}),format.raw/*17.18*/("""
                """),_display_(/*18.18*/if(currentPage.getUrl() != null)/*18.50*/ {_display_(Seq[Any](format.raw/*18.52*/("""
                        """),format.raw/*19.25*/("""<div class="col-sm-2 text-center">
                        Document
                        <a href=""""),_display_(/*21.35*/routes/*21.41*/.Application.menu_string(currentPage.getName())),format.raw/*21.88*/("""" target="_blank">
                            <i class="fa fa-file-pdf-o fa-5x"></i>
                        </a>
                    </div>
                """)))}),format.raw/*25.18*/("""
            """),format.raw/*26.13*/("""</div>
        </div>
        <div class="col-lg-5 col-lg-offset-1">
            <div id=" project_page">
            <div class="row spacer">
            """),_display_(/*31.14*/if(currentPage.getPictures().size != 0 && currentPage.getPictures().size > 1)/*31.91*/ {_display_(Seq[Any](format.raw/*31.93*/("""
                    """),format.raw/*32.21*/("""<!-- Slider -->
                <ul class="bxslider">
                """),_display_(/*34.18*/for(p <- currentPage.getPictures()) yield /*34.53*/ {_display_(Seq[Any](format.raw/*34.55*/("""
                    """),format.raw/*35.21*/("""<li>
                        <img src=""""),_display_(/*36.36*/routes/*36.42*/.Application.imageAt("images_tab/" + currentPage.getName() + "/" + p)),format.raw/*36.111*/("""" alt="" />
                    </li>
                """)))}),format.raw/*38.18*/("""
                """),format.raw/*39.17*/("""</ul>

                    <!-- end slider -->
            """)))}/*42.15*/else/*42.20*/{_display_(Seq[Any](format.raw/*42.21*/("""
                """),_display_(/*43.18*/if(currentPage.getPictures().size != 0)/*43.57*/ {_display_(Seq[Any](format.raw/*43.59*/("""
                    """),format.raw/*44.21*/("""<div class="text-center">
                        <img class="fit-image" src=""""),_display_(/*45.54*/routes/*45.60*/.Application.imageAt("images_tab/" + currentPage.getName() + "/" + currentPage.getPictures()(0))),format.raw/*45.156*/("""" alt="" />
                    </div>
                """)))}),format.raw/*47.18*/("""
            """)))}),format.raw/*48.14*/("""
            """),format.raw/*49.13*/("""</div>
            </div>
            """),_display_(/*51.14*/if(currentPage.getVideo_url() != null)/*51.52*/ {_display_(Seq[Any](format.raw/*51.54*/("""
                """),format.raw/*52.17*/("""<div class="row">
                    <div class="embed-container">
                        <iframe class="embed-responsive-item" src="""),_display_(/*54.68*/currentPage/*54.79*/.getVideo_url()),format.raw/*54.94*/(""" """),format.raw/*54.95*/("""frameborder="0" allowfullscreen></iframe>
                    </div>
                </div>

            """)))}),format.raw/*58.14*/("""

                """),_display_(/*60.18*/if(currentPage.getPrezi() != null)/*60.52*/ {_display_(Seq[Any](format.raw/*60.54*/("""
                    """),format.raw/*61.21*/("""<div class="row">
                    <iframe src=""""),_display_(/*62.35*/currentPage/*62.46*/.getPrezi()),format.raw/*62.57*/("""&amp;lock_to_path=0&amp;autoplay=0&amp;autohide_ctrls=0&amp;landing_data=bHVZZmNaNDBIWnNjdEVENDRhZDFNZGNIUE43MHdLNWpsdFJLb2ZHanI0dDR3Ri8xN21kdmJNUjRQTW9BVThTV1lBPT0&amp;landing_sign=FvlXTmDLk6v5PK8ZRfC03iDOBlB-6iam_r1oc_zuP7Q" allowfullscreen="" mozallowfullscreen="" webkitallowfullscreen="" id="iframe_container" width="550" frameborder="0" height="400"></iframe>
                    </div>
                """)))}),format.raw/*64.18*/("""

        """),format.raw/*66.9*/("""</div>
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
                  DATE: Tue Feb 28 21:52:04 CET 2017
                  SOURCE: /home/duri/workspace/web/kabzanj.net/app/views/projects/project_page.scala.html
                  HASH: 7dbe4b4b8b060e355a1da8b4458ee9520581c24e
                  MATRIX: 773->1|894->27|924->31|1047->128|1066->139|1103->156|1143->169|1205->204|1254->244|1294->246|1343->267|1470->367|1490->378|1528->395|1714->550|1759->568|1800->600|1840->602|1893->627|2022->729|2037->735|2105->782|2295->941|2336->954|2519->1110|2605->1187|2645->1189|2694->1210|2792->1281|2843->1316|2883->1318|2932->1339|2999->1379|3014->1385|3105->1454|3191->1509|3236->1526|3315->1587|3328->1592|3367->1593|3412->1611|3460->1650|3500->1652|3549->1673|3655->1752|3670->1758|3788->1854|3875->1910|3920->1924|3961->1937|4027->1976|4074->2014|4114->2016|4159->2033|4321->2168|4341->2179|4377->2194|4406->2195|4543->2301|4589->2320|4632->2354|4672->2356|4721->2377|4800->2429|4820->2440|4852->2451|5293->2861|5330->2871
                  LINES: 27->1|32->1|36->5|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|44->13|44->13|44->13|48->17|49->18|49->18|49->18|50->19|52->21|52->21|52->21|56->25|57->26|62->31|62->31|62->31|63->32|65->34|65->34|65->34|66->35|67->36|67->36|67->36|69->38|70->39|73->42|73->42|73->42|74->43|74->43|74->43|75->44|76->45|76->45|76->45|78->47|79->48|80->49|82->51|82->51|82->51|83->52|85->54|85->54|85->54|85->54|89->58|91->60|91->60|91->60|92->61|93->62|93->62|93->62|95->64|97->66
                  -- GENERATED --
              */
          