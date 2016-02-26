
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object tab_page_Scope0 {
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

class tab_page extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[TabPage,List[TabPage],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentPage: TabPage ,tabPages:List[TabPage]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.48*/("""

"""),_display_(/*3.2*/main_page(currentPage,tabPages)),format.raw/*3.33*/("""
    """),format.raw/*4.10*/("""
        """),format.raw/*5.42*/("""
            """),format.raw/*6.40*/("""
                """),format.raw/*7.38*/("""
                    """),format.raw/*8.48*/("""
                        """),format.raw/*9.52*/("""
                            """),format.raw/*10.142*/("""
                            """),format.raw/*11.235*/("""
                            """),format.raw/*12.34*/("""
                        """),format.raw/*13.34*/("""
                    """),format.raw/*14.31*/("""
                """),format.raw/*15.27*/("""
            """),format.raw/*16.23*/("""
        """),format.raw/*17.23*/("""
    """),format.raw/*18.10*/("""
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
object tab_page extends tab_page_Scope0.tab_page
              /*
                  -- GENERATED --
                  DATE: Fri Feb 26 11:25:03 CET 2016
                  SOURCE: /home/duri/workspace/web/jurajkabzan_personalwebpage/app/views/tab_page.scala.html
                  HASH: fcca792d8035aec30a790c5641d4a05a98e3fbe6
                  MATRIX: 766->1|907->47|935->50|986->81|1018->91|1054->133|1094->173|1138->211|1186->259|1238->311|1296->453|1354->688|1411->722|1464->756|1513->787|1558->814|1599->837|1636->860|1669->870
                  LINES: 27->1|32->1|34->3|34->3|35->4|36->5|37->6|38->7|39->8|40->9|41->10|42->11|43->12|44->13|45->14|46->15|47->16|48->17|49->18
                  -- GENERATED --
              */
          