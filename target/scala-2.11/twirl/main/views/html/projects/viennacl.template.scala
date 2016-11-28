
package views.html.projects

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object viennacl_Scope0 {
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

class viennacl extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<a href="http://viennacl.sourceforge.net/"  target="_blank"> <h1>ViennaCL</h1></a>


<p>
I have applied for the competitive <b>Summer of Code</b> program run by the Institute for Microelectronics in Summer 2014 and was selected as
one of only six students (sponzored by Google Summer of Code 2014). I worked on open-source ViennaCL linear algebra computer library coded in <b>C++</b>.
    ViennaCL is a free open-source linear algebra library for computations on many-core architectures (GPUs, MIC) and multi-core CPUs.
The library is written in C++ and supports CUDA, OpenCL, and OpenMP (including switches at runtime).
</p>
<p>
I worked on implementing the Fast Fourier Transform,
porting an existing OpenCL-based implementation to CUDA and OpenMP. The outcome of my work is
available to the general public through the free open-source linear algebra library. I have to thank to my mentor
   <b><a href="https://www.karlrupp.net/2014/02/mentored-project-ideas-for-gsoc-2014/"  target="_blank"> Karl Rupp </a></b> for his support.
</p>
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
object viennacl extends viennacl_Scope0.viennacl
              /*
                  -- GENERATED --
                  DATE: Mon Nov 28 11:44:27 CET 2016
                  SOURCE: /home/duri/workspace/web/www.kabzanj.net/app/views/projects/viennacl.scala.html
                  HASH: e89b7b1b48a739f8e0b244ac7907a076d4dcc34c
                  MATRIX: 842->0
                  LINES: 32->1
                  -- GENERATED --
              */
          