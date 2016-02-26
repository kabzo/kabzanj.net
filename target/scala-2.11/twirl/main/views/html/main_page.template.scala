
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_page_Scope0 {
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

class main_page extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[TabPage,List[TabPage],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentPage: TabPage, tabPages: List[TabPage]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.49*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <meta name="google-site-verification" content="XfEIOj2EM0U2u4VG2DNWL46iKcLUzyUyEv_T0_xAPss" />
    </head>

    <header>

        <title>"""),_display_(/*12.17*/currentPage/*12.28*/.getShowName()),format.raw/*12.42*/("""</title>

        <link href=""""),_display_(/*14.22*/routes/*14.28*/.Assets.versioned("css/default_colors.css")),format.raw/*14.71*/("""" rel="stylesheet" />
        <link href=""""),_display_(/*15.22*/routes/*15.28*/.Assets.versioned("css/main_style.css")),format.raw/*15.67*/("""" rel="stylesheet" />
        <link rel='stylesheet' href='"""),_display_(/*16.39*/routes/*16.45*/.WebJarAssets.at(WebJarAssets.locate("css/bootstrap.min.css"))),format.raw/*16.107*/("""'>
        <link rel='stylesheet' href='"""),_display_(/*17.39*/routes/*17.45*/.WebJarAssets.at(WebJarAssets.locate("dist/jquery.bxslider.css"))),format.raw/*17.110*/("""'>
        <link rel='stylesheet' href='"""),_display_(/*18.39*/routes/*18.45*/.WebJarAssets.at(WebJarAssets.locate("font-awesome.min.css"))),format.raw/*18.106*/("""'>

        <div class="navbar navbar-default navbar-static-top" id="top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href=""""),_display_(/*28.52*/routes/*28.58*/.Application.menu_id("home")),format.raw/*28.86*/(""""><span>Juraj</span> Kabzan</a>
                </div>

                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                    """),_display_(/*33.22*/for(p <- tabPages) yield /*33.40*/ {_display_(Seq[Any](format.raw/*33.42*/("""
                        """),_display_(/*34.26*/if(p.getSubPages().size == 0)/*34.55*/ {_display_(Seq[Any](format.raw/*34.57*/("""
                            """),format.raw/*35.29*/("""<li><a href=""""),_display_(/*35.43*/routes/*35.49*/.Application.menu_id(p.getName())),format.raw/*35.82*/("""">"""),_display_(/*35.85*/p/*35.86*/.getShowName()),format.raw/*35.100*/("""</a></li>
                        """)))}/*36.27*/else/*36.32*/{_display_(Seq[Any](format.raw/*36.33*/("""
                            """),format.raw/*37.29*/("""<li class="dropdown ">
                                <a data-toggle="dropdown" data-hover="dropdown" data-delay="0" data-close-others="false">"""),_display_(/*38.123*/p/*38.124*/.getShowName()),format.raw/*38.138*/(""" """),format.raw/*38.139*/("""<b class=" icon-angle-down"></b></a>
                                <ul class="dropdown-menu">
                                """),_display_(/*40.34*/for(s <- p.getSubPages()) yield /*40.59*/ {_display_(Seq[Any](format.raw/*40.61*/("""
                                    """),format.raw/*41.37*/("""<li><a href=""""),_display_(/*41.51*/routes/*41.57*/.Application.menu_id(s.getName())),format.raw/*41.90*/("""">"""),_display_(/*41.93*/s/*41.94*/.getShowName()),format.raw/*41.108*/("""</a></li>
                                """)))}),format.raw/*42.34*/("""
                                """),format.raw/*43.33*/("""</ul>
                            </li>
                        """)))}),format.raw/*45.26*/("""
                    """)))}),format.raw/*46.22*/("""
                    """),format.raw/*47.21*/("""</ul>
                </div>
            </div>
        </div>

        """),format.raw/*52.125*/("""
        """),format.raw/*53.9*/("""<link rel="icon" type="image/png" href=""""),_display_(/*53.50*/routes/*53.56*/.Assets.versioned("/images_sys/tu.png")),format.raw/*53.95*/("""" />

    </header>

    <body>
        """),_display_(/*58.10*/currentPage/*58.21*/.getContentHtml()),format.raw/*58.38*/("""
        """),format.raw/*59.9*/("""<a href="#" class="back-to-top">Back to Top</a>
    </body>

    <footer>
        <div class="container">
            <div class="row">
                <div class="col-lg-3">
                    <div class="widget">
                        <h4 class="widgetheading">Get in touch with me</h4>
                        <address>
                            <b>Juraj Kabzan</b><br>
                            <b><i class="fa fa-home"></i></b> Schweiz, Zurich<br>
                            <b><i class="fa fa-envelope"></i></b><a href="mailto:kabzanj@gmail.com"> kabzanj&#064gmail.com</a><br>
                            <b><i class="fa fa-phone"></i></b> 00421 917 111 219<br>
                        </address>
                    </div>
                </div>
            </div>
        </div>
    </footer>

        <!-- JavaScript -->
    <script type='text/javascript' src='"""),_display_(/*81.42*/routes/*81.48*/.WebJarAssets.at(WebJarAssets.locate("2.2.0/jquery.min.js"))),format.raw/*81.108*/("""'></script>
    <script type='text/javascript' src='"""),_display_(/*82.42*/routes/*82.48*/.WebJarAssets.at(WebJarAssets.locate("dist/js/bootstrap.min.js"))),format.raw/*82.113*/("""'></script>
    <script type='text/javascript' src='"""),_display_(/*83.42*/routes/*83.48*/.WebJarAssets.at(WebJarAssets.locate("jquery.bxslider.min.js"))),format.raw/*83.111*/("""'></script>

    <script type="text/javascript" src=""""),_display_(/*85.42*/routes/*85.48*/.Assets.versioned("js/custom.js")),format.raw/*85.81*/(""""></script>


    <script type="text/javascript">



    </script>

</html>
"""))
      }
    }
  }

  def render(currentPage:TabPage,tabPages:List[TabPage]): play.twirl.api.HtmlFormat.Appendable = apply(currentPage,tabPages)

  def f:((TabPage,List[TabPage]) => play.twirl.api.HtmlFormat.Appendable) = (currentPage,tabPages) => apply(currentPage,tabPages)

  def ref: this.type = this

}


}

/**/
object main_page extends main_page_Scope0.main_page
              /*
                  -- GENERATED --
                  DATE: Fri Feb 26 11:25:03 CET 2016
                  SOURCE: /home/duri/workspace/web/jurajkabzan_personalwebpage/app/views/main_page.scala.html
                  HASH: 06546b6ad5a3bdbf6944b7024a50a5e7d08f521c
                  MATRIX: 768->1|910->48|938->50|1156->241|1176->252|1211->266|1269->297|1284->303|1348->346|1418->389|1433->395|1493->434|1580->494|1595->500|1679->562|1747->603|1762->609|1849->674|1917->715|1932->721|2015->782|2562->1302|2577->1308|2626->1336|2833->1516|2867->1534|2907->1536|2960->1562|2998->1591|3038->1593|3095->1622|3136->1636|3151->1642|3205->1675|3235->1678|3245->1679|3281->1693|3335->1729|3348->1734|3387->1735|3444->1764|3617->1909|3628->1910|3664->1924|3694->1925|3850->2054|3891->2079|3931->2081|3996->2118|4037->2132|4052->2138|4106->2171|4136->2174|4146->2175|4182->2189|4256->2232|4317->2265|4413->2330|4466->2352|4515->2373|4616->2561|4652->2570|4720->2611|4735->2617|4795->2656|4863->2697|4883->2708|4921->2725|4957->2734|5863->3614|5878->3620|5960->3680|6040->3733|6055->3739|6142->3804|6222->3857|6237->3863|6322->3926|6403->3980|6418->3986|6472->4019
                  LINES: 27->1|32->1|34->3|43->12|43->12|43->12|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|59->28|59->28|59->28|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|66->35|66->35|66->35|66->35|67->36|67->36|67->36|68->37|69->38|69->38|69->38|69->38|71->40|71->40|71->40|72->41|72->41|72->41|72->41|72->41|72->41|72->41|73->42|74->43|76->45|77->46|78->47|83->52|84->53|84->53|84->53|84->53|89->58|89->58|89->58|90->59|112->81|112->81|112->81|113->82|113->82|113->82|114->83|114->83|114->83|116->85|116->85|116->85
                  -- GENERATED --
              */
          