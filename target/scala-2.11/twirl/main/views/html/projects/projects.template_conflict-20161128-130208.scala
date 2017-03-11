
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

"""),format.raw/*3.1*/("""<header>
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
</header>



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
                  DATE: Tue Dec 06 18:39:15 CET 2016
                  SOURCE: /home/duri/workspace/web/kabzanj.net/app/views/projects/projects.scala.html
                  HASH: 3a5d6b00e79b33ff4eabde9078ee53d120c0fb32
                  MATRIX: 761->1|878->23|906->25|1419->511|1434->517|1483->545|1739->774|1787->813|1827->815|1872->833|1923->868|1963->870|2010->889|2072->924|2082->925|2113->935|2143->938|2153->939|2188->953|2246->980|2293->996|2336->1011|2442->1091|2493->1126|2533->1128|2565->1134|2630->1190|2669->1191|2705->1200|2746->1214|2756->1215|2787->1225|2813->1233|2826->1237|2865->1238|2901->1247|2942->1261|2952->1262|2983->1272|3034->1293|3066->1299|3075->1300|3113->1317|3143->1320
                  LINES: 27->1|32->1|34->3|43->12|43->12|43->12|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|51->20|51->20|51->20|51->20|52->21|53->22|54->23|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|67->36|68->37|69->38|69->38|69->38|70->39
                  -- GENERATED --
              */
          