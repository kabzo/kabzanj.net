
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

class main_page extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[TabPage,List[TabPage],WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentPage: TabPage, tabPages: List[TabPage], webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.77*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <meta name="google-site-verification" content="XfEIOj2EM0U2u4VG2DNWL46iKcLUzyUyEv_T0_xAPss" />

        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <meta name="description" content=""""),_display_(/*11.44*/currentPage/*11.55*/.getMetaTag()),format.raw/*11.68*/("""">
        <title>"""),_display_(/*12.17*/currentPage/*12.28*/.getShowName()),format.raw/*12.42*/("""</title>

    </head>

    <header>


        <link href=""""),_display_(/*19.22*/routes/*19.28*/.Assets.versioned("css/default_colors.css")),format.raw/*19.71*/("""" rel="stylesheet" />
        <link href=""""),_display_(/*20.22*/routes/*20.28*/.Assets.versioned("css/main_style.css")),format.raw/*20.67*/("""" rel="stylesheet" />
        <link href=""""),_display_(/*21.22*/routes/*21.28*/.Assets.versioned("css/scrollin-nav.css")),format.raw/*21.69*/("""" rel="stylesheet" />

        <link rel='stylesheet' href='"""),_display_(/*23.39*/routes/*23.45*/.WebJarAssets.at(webJarAssets.locate("css/bootstrap.min.css"))),format.raw/*23.107*/("""'>
        <link rel='stylesheet' href='"""),_display_(/*24.39*/routes/*24.45*/.WebJarAssets.at(webJarAssets.locate("dist/jquery.bxslider.css"))),format.raw/*24.110*/("""'>
        <link rel='stylesheet' href='"""),_display_(/*25.39*/routes/*25.45*/.WebJarAssets.at(webJarAssets.locate("font-awesome.min.css"))),format.raw/*25.106*/("""'>

        <div class="navbar navbar-default navbar-fixed-top" id="top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href=""""),_display_(/*35.52*/routes/*35.58*/.Application.menu_id("home")),format.raw/*35.86*/(""""><span>Juraj</span> Kabzan</a>
                </div>
                <div class="navigation">

                <div class="navbar-collapse collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                    """),_display_(/*41.22*/for(p <- tabPages) yield /*41.40*/ {_display_(Seq[Any](format.raw/*41.42*/("""
                        """),_display_(/*42.26*/if(p.getSubPages().size == 0)/*42.55*/ {_display_(Seq[Any](format.raw/*42.57*/("""
                            """),_display_(/*43.30*/if(currentPage.getName()=="home")/*43.63*/{_display_(Seq[Any](format.raw/*43.64*/("""
                        """),format.raw/*44.25*/("""<li><a class="page-scroll"  href="#about_me">About Me</a></li>

                        """)))}),format.raw/*46.26*/("""
                            """),format.raw/*47.29*/("""<li><a href=""""),_display_(/*47.43*/routes/*47.49*/.Application.menu_id(p.getName())),format.raw/*47.82*/("""">"""),_display_(/*47.85*/p/*47.86*/.getShowName()),format.raw/*47.100*/("""</a></li>
                        """)))}/*48.27*/else/*48.32*/{_display_(Seq[Any](format.raw/*48.33*/("""
                            """),format.raw/*49.29*/("""<li class="dropdown ">
                                <a href=""""),_display_(/*50.43*/routes/*50.49*/.Application.menu_id(p.getName())),format.raw/*50.82*/("""" data-hover="dropdown" data-delay="0" data-close-others="false">"""),_display_(/*50.148*/p/*50.149*/.getShowName()),format.raw/*50.163*/(""" """),format.raw/*50.164*/("""<b class="caret"></b></a>
                                <ul class="dropdown-menu">
                                """),_display_(/*52.34*/for(s <- p.getSubPages()) yield /*52.59*/ {_display_(Seq[Any](format.raw/*52.61*/("""
                                    """),format.raw/*53.37*/("""<li><a href=""""),_display_(/*53.51*/routes/*53.57*/.Application.menu_id(s.getName())),format.raw/*53.90*/("""">"""),_display_(/*53.93*/s/*53.94*/.getShowName()),format.raw/*53.108*/("""</a></li>
                                """)))}),format.raw/*54.34*/("""
                                """),format.raw/*55.33*/("""</ul>
                            </li>
                        """)))}),format.raw/*57.26*/("""
                    """)))}),format.raw/*58.22*/("""
                    """),format.raw/*59.21*/("""</ul>
                </div>
                    </div>
            </div>
        </div>

        """),format.raw/*65.125*/("""
        """),format.raw/*66.9*/("""<link rel="icon" type="image/png" href=""""),_display_(/*66.50*/routes/*66.56*/.Assets.versioned("/images_sys/eth.png")),format.raw/*66.96*/("""" />

    </header>

    <body>
        """),_display_(/*71.10*/currentPage/*71.21*/.getContentHtml()),format.raw/*71.38*/("""
        """),format.raw/*72.9*/("""<a href="#" class="back-to-top">Back to Top</a>
    </body>

    <footer>
        <div class="container">
            <div class="row">
                <div class="col-lg-3">
                    <div class="widget">
                        <h4 class="widgetheading" style="color:#fff !important;">Get in touch with me</h4>
                        <address>
                            <b>Juraj Kabzan</b><br>
                            <b><i class="fa fa-home"></i></b> Schweiz, Zurich<br>
                            <b><i class="fa fa-envelope"></i></b><a href="mailto:kabzanj@gmail.com" style="color: #FFFFFF !important"> kabzanj&#064gmail.com</a><br>
                        </address>
                    </div>
                </div>
            </div>
        </div>
    </footer>

        <!-- JavaScript -->
    <script type='text/javascript' src='"""),_display_(/*93.42*/routes/*93.48*/.WebJarAssets.at(webJarAssets.locate("2.2.2/jquery.min.js"))),format.raw/*93.108*/("""'></script>
    <script type='text/javascript' src='"""),_display_(/*94.42*/routes/*94.48*/.WebJarAssets.at(webJarAssets.locate("js/bootstrap.min.js"))),format.raw/*94.108*/("""'></script>
    <script type='text/javascript' src='"""),_display_(/*95.42*/routes/*95.48*/.WebJarAssets.at(webJarAssets.locate("jquery.bxslider.min.js"))),format.raw/*95.111*/("""'></script>
    <script type='text/javascript' src='"""),_display_(/*96.42*/routes/*96.48*/.WebJarAssets.at(webJarAssets.locate("jquery.easing.min.js"))),format.raw/*96.109*/("""'></script>

    <script type="text/javascript" src=""""),_display_(/*98.42*/routes/*98.48*/.Assets.versioned("js/scrolling-nav.js")),format.raw/*98.88*/(""""></script>
    <script type="text/javascript" src=""""),_display_(/*99.42*/routes/*99.48*/.Assets.versioned("js/custom.js")),format.raw/*99.81*/(""""></script>


    <script type="text/javascript">
    </script>

</html>"""))
      }
    }
  }

  def render(currentPage:TabPage,tabPages:List[TabPage],webJarAssets:WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(currentPage,tabPages,webJarAssets)

  def f:((TabPage,List[TabPage],WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (currentPage,tabPages,webJarAssets) => apply(currentPage,tabPages,webJarAssets)

  def ref: this.type = this

}


}

/**/
object main_page extends main_page_Scope0.main_page
              /*
                  -- GENERATED --
                  DATE: Sun Mar 19 23:52:16 CET 2017
                  SOURCE: /home/duri/workspace/web/kabzanj.net/app/views/main_page.scala.html
                  HASH: 04e5fadda0aab7ea00a93d3886accfc6048217b0
                  MATRIX: 781->1|951->76|979->78|1278->350|1298->361|1332->374|1378->393|1398->404|1433->418|1519->477|1534->483|1598->526|1668->569|1683->575|1743->614|1813->657|1828->663|1890->704|1978->765|1993->771|2077->833|2145->874|2160->880|2247->945|2315->986|2330->992|2413->1053|2972->1585|2987->1591|3036->1619|3318->1874|3352->1892|3392->1894|3445->1920|3483->1949|3523->1951|3580->1981|3622->2014|3661->2015|3714->2040|3834->2129|3891->2158|3932->2172|3947->2178|4001->2211|4031->2214|4041->2215|4077->2229|4131->2265|4144->2270|4183->2271|4240->2300|4332->2365|4347->2371|4401->2404|4495->2470|4506->2471|4542->2485|4572->2486|4717->2604|4758->2629|4798->2631|4863->2668|4904->2682|4919->2688|4973->2721|5003->2724|5013->2725|5049->2739|5123->2782|5184->2815|5280->2880|5333->2902|5382->2923|5510->3138|5546->3147|5614->3188|5629->3194|5690->3234|5758->3275|5778->3286|5816->3303|5852->3312|6738->4172|6753->4178|6835->4238|6915->4291|6930->4297|7012->4357|7092->4410|7107->4416|7192->4479|7272->4532|7287->4538|7370->4599|7451->4653|7466->4659|7527->4699|7607->4752|7622->4758|7676->4791
                  LINES: 27->1|32->1|34->3|42->11|42->11|42->11|43->12|43->12|43->12|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|66->35|66->35|66->35|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|75->44|77->46|78->47|78->47|78->47|78->47|78->47|78->47|78->47|79->48|79->48|79->48|80->49|81->50|81->50|81->50|81->50|81->50|81->50|81->50|83->52|83->52|83->52|84->53|84->53|84->53|84->53|84->53|84->53|84->53|85->54|86->55|88->57|89->58|90->59|96->65|97->66|97->66|97->66|97->66|102->71|102->71|102->71|103->72|124->93|124->93|124->93|125->94|125->94|125->94|126->95|126->95|126->95|127->96|127->96|127->96|129->98|129->98|129->98|130->99|130->99|130->99
                  -- GENERATED --
              */
          