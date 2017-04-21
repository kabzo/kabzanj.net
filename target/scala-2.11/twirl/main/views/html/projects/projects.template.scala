
package views.html.projects

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object projects_Scope0 {
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

class projects extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[TabPage,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentPage: TabPage):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.24*/("""

"""),format.raw/*3.1*/("""<!-- <header>
    <div  class="navbar navbar-default navbar-fixed-top" id="top">
      <div class="container">
          <div class="navbar-header">
              <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-2">
                  <span class="icon-bar"></span>
                  <span class="icon-bar"></span>
                  <span class="icon-bar"></span>
              </button>
              <a class="navbar-brand" href=""""),_display_(/*12.46*/routes/*12.52*/.Application.menu_id("home")),format.raw/*12.80*/(""""><span>Juraj</span> Kabzan</a>
          </div>

          <div class="navigation">
            <div class="navbar-collapse collapse " id="bs-example-navbar-collapse-2">
              <ul class="nav navbar-nav" >
              """),_display_(/*18.16*/if(currentPage.getSubPages().size != 0)/*18.55*/ {_display_(Seq[Any](format.raw/*18.57*/("""
                """),_display_(/*19.18*/for(p <- currentPage.getSubPages()) yield /*19.53*/ {_display_(Seq[Any](format.raw/*19.55*/("""
                  """),format.raw/*20.19*/("""<li><a class="page-scroll" href="#"""),_display_(/*20.54*/p/*20.55*/.getName()),format.raw/*20.65*/("""">"""),_display_(/*20.68*/p/*20.69*/.getShowName()),format.raw/*20.83*/("""</a></li>
                """)))}),format.raw/*21.18*/("""
              """)))}),format.raw/*22.16*/("""
              """),format.raw/*23.15*/("""</ul>
            </div>
          </div>
      </div>
    </div>
</header> -->



"""),_display_(/*32.2*/for(p <- currentPage.getSubPages()) yield /*32.37*/ {_display_(Seq[Any](format.raw/*32.39*/("""
    """),_display_(/*33.6*/if((currentPage.getSubPages().indexWhere(_==p) % 2)== 0)/*33.62*/{_display_(Seq[Any](format.raw/*33.63*/("""
        """),format.raw/*34.9*/("""<section id=""""),_display_(/*34.23*/p/*34.24*/.getName()),format.raw/*34.34*/("""">
    """)))}/*35.6*/else/*35.10*/{_display_(Seq[Any](format.raw/*35.11*/("""
        """),format.raw/*36.9*/("""<section id=""""),_display_(/*36.23*/p/*36.24*/.getName()),format.raw/*36.34*/("""" class="gray">
    """)))}),format.raw/*37.6*/("""
    """),_display_(/*38.6*/p/*38.7*/.getContentHtml()),format.raw/*38.24*/("""
  """),format.raw/*39.3*/("""</section>
""")))}))
      }
    }
  }

  def render(currentPage:TabPage): play.twirl.api.HtmlFormat.Appendable = apply(currentPage)

  def f:((TabPage) => play.twirl.api.HtmlFormat.Appendable) = (currentPage) => apply(currentPage)

  def ref: this.type = this

}


}

/**/
object projects extends projects_Scope0.projects
              /*
                  -- GENERATED --
                  DATE: Sun Mar 19 23:52:16 CET 2017
                  SOURCE: /home/duri/workspace/web/kabzanj.net/app/views/projects/projects.scala.html
                  HASH: 0b09f5fc766aa7414a5c9df4ac389559b976d302
                  MATRIX: 761->1|878->23|906->25|1424->516|1439->522|1488->550|1744->779|1792->818|1832->820|1877->838|1928->873|1968->875|2015->894|2077->929|2087->930|2118->940|2148->943|2158->944|2193->958|2251->985|2298->1001|2341->1016|2451->1100|2502->1135|2542->1137|2574->1143|2639->1199|2678->1200|2714->1209|2755->1223|2765->1224|2796->1234|2822->1242|2835->1246|2874->1247|2910->1256|2951->1270|2961->1271|2992->1281|3043->1302|3075->1308|3084->1309|3122->1326|3152->1329
                  LINES: 27->1|32->1|34->3|43->12|43->12|43->12|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|51->20|51->20|51->20|51->20|52->21|53->22|54->23|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|67->36|68->37|69->38|69->38|69->38|70->39
                  -- GENERATED --
              */
          