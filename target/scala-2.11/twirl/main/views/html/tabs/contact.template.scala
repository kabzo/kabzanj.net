
package views.html.tabs

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object contact_Scope0 {
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

class contact extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.5*/("""<section id="content">
    <div class="map">
        <iframe src="https://maps.google.de/maps?hl=de&q=Vienna,Schäffergasse 2+(Schäffergasse 2)&ie=UTF8&t=&z=16&iwloc=B&output=embed">
        </iframe>
        <!-- Google Maps Code Kopieren -->
    </div>
    </section>

    <script src=""""),_display_(/*9.19*/routes/*9.25*/.Assets.versioned("js/js/google-code-prettify/prettify.js")),format.raw/*9.84*/(""""></script>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object contact extends contact_Scope0.contact
              /*
                  -- GENERATED --
                  DATE: Tue Feb 28 21:52:04 CET 2017
                  SOURCE: /home/duri/workspace/web/kabzanj.net/app/views/tabs/contact.scala.html
                  HASH: 60613b5c631ea6720b4f2b9a891d7d6c516ffb93
                  MATRIX: 836->4|1150->292|1164->298|1243->357
                  LINES: 32->1|40->9|40->9|40->9
                  -- GENERATED --
              */
          