
package views.html.tabs

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object about_me_Scope0 {
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

class about_me extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<div class="wrapper" id="wrapper">

<header>
        <div class="navbar-wrapper">
                <div class="navwrapper">
                    <div class="navbar navbar-default navbar-static-top">
                        <div class="container">
                                <div class=" collapse">
                                    <ul class="nav navbar-nav">
                                        <li class="menuItem"><a href="#top">Top</a></li>
                                        <li class="menuItem"><a href="#aboutus">About Us</a></li>
                                        <li class="menuItem"><a href="#specialties">Skills</a></li>
                                        <li class="menuItem"><a href="#gallery">Portfolio</a></li>
                                        <li class="menuItem"><a href="#feedback">Education</a></li>
                                        <li class="menuItem"><a href="#contact">Contact</a></li>
                                    </ul>
                                </div>
                        </div>
                    </div>
                </div>
        </div>
</header>
    <!--about us-->
    <section class="aboutus" id="aboutus">
        <div class="container">
            <div class="heading text-center">
                <a><span>A</span>bout Me</a>
                <h3>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi quis dolor sit amet lacus ultricies rutrum. Curabitur vitae fringilla elit. Sed at nunc congue, cursus erat ac, pellentesque eros. Etiam ullamcorper sed lectus sit amet mattis. Morbi justo sem, cursus nec convallis a, pellentesque eu mi. Morbi hendrerit ultricies ligula </h3>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <div class="papers text-center">
                        <img src="img/team/1.jpg" alt=""><br/>
                        <a href="#"><b>Download my resume</b></a>
                        <h4 class="">My Teacher John Vandeley</h4>
                        <p>
                            Have you ever felt worried that your party will not raise up to your guest expectations? In design, vertical rhythm is the structure that guides a reader's eye through the content. Good vertical rhythm makes a layout more balanced and beautiful and its content more readable. The time signature in sheet music visually depicts a song's rhythm, while for us, the lines of the baseline grid depict the rhythm of our content and give us guidelines.
                        </p>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="papers text-center">
                        <img src="img/team/2.jpg" alt=""><br/>
                        <a href="#"><b>Download my resume</b></a>
                        <h4 class="">My Teacher Stephanie Hellen</h4>
                        <p>
                            Have you ever felt worried that your party will not raise up to your guest expectations? In design, vertical rhythm is the structure that guides a reader's eye through the content. Good vertical rhythm makes a layout more balanced and beautiful and its content more readable. The time signature in sheet music visually depicts a song's rhythm, while for us, the lines of the baseline grid depict the rhythm of our content and give us guidelines.
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </section>


    <!--skills-->
    <section class="specialties" id="specialties">
        <div class="container">
            <div class="heading text-center">
                <h2>Our Skills</h2>
                <h3>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi quis dolor sit amet lacus ultricies rutrum. Curabitur vitae fringilla elit. Sed at nunc congue, cursus erat ac, pellentesque eros. Etiam ullamcorper sed lectus sit amet mattis. Morbi justo sem, cursus nec convallis a, pellentesque eu mi. Morbi hendrerit ultricies ligula </h3>
            </div>
        </div>


        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <div class="skills">
                        <h3 class="main text-center">WEB DESIGN</h3>
                        <div class="restitem clearfix">
                            <div class="rm-thumb" style="background-image: url(img/2.png)">
                            </div>
                            <h5>HTML</h5>
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi quis dolor sit amet lacus ultricies rutrum.
                                Curabitur vitae fringilla elit. Sed at nunc congue, cursus erat ac, pellentesque eros.
                            </p>
                        </div>
                        <div class="restitem clearfix">
                            <div class="rm-thumb" style="background-image: url(img/2.png)">
                            </div>
                            <h5>CSS</h5>
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi quis dolor sit amet lacus ultricies rutrum.
                                Curabitur vitae fringilla elit. Sed at nunc congue, cursus erat ac, pellentesque eros.
                            </p>
                        </div>
                        <div class="restitem clearfix">
                            <div class="rm-thumb" style="background-image: url(img/2.png)">
                            </div>
                            <h5>JAVASCRIPT</h5>
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi quis dolor sit amet lacus ultricies rutrum.
                                Curabitur vitae fringilla elit. Sed at nunc congue, cursus erat ac, pellentesque eros.
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="skills">
                        <h3 class="main text-center">PHOTOGRAPHY</h3>
                        <div class="restitem clearfix">
                            <div class="rm-thumb" style="background-image: url(img/2.png)">
                            </div>
                            <h5>adipiscing elit</h5>
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi quis dolor sit amet lacus ultricies rutrum.
                                Curabitur vitae fringilla elit. Sed at nunc congue, cursus erat ac, pellentesque eros.
                            </p>
                        </div>
                        <div class="restitem clearfix">
                            <div class="rm-thumb" style="background-image: url(img/2.png)">
                            </div>
                            <h5>adipiscing elit</h5>
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi quis dolor sit amet lacus ultricies rutrum.
                                Curabitur vitae fringilla elit. Sed at nunc congue, cursus erat ac, pellentesque eros.
                            </p>
                        </div>
                        <div class="restitem clearfix">
                            <div class="rm-thumb" style="background-image: url(img/2.png)">
                            </div>
                            <h5>adipiscing elit</h5>
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi quis dolor sit amet lacus ultricies rutrum.
                                Curabitur vitae fringilla elit. Sed at nunc congue, cursus erat ac, pellentesque eros.
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="skills">
                        <h3 class="main text-center">PROGRAMMING</h3>
                        <div class="restitem clearfix">
                            <div class="rm-thumb" style="background-image: url(img/2.png)">
                            </div>
                            <h5>adipiscing elit</h5>
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi quis dolor sit amet lacus ultricies rutrum.
                                Curabitur vitae fringilla elit. Sed at nunc congue, cursus erat ac, pellentesque eros.
                            </p>
                        </div>
                        <div class="restitem clearfix">
                            <div class="rm-thumb" style="background-image: url(img/2.png)">
                            </div>
                            <h5>adipiscing elit</h5>
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi quis dolor sit amet lacus ultricies rutrum.
                                Curabitur vitae fringilla elit. Sed at nunc congue, cursus erat ac, pellentesque eros.
                            </p>
                        </div>
                        <div class="restitem clearfix">
                            <div class="rm-thumb" style="background-image: url(img/2.png)">
                            </div>
                            <h5>adipiscing elit</h5>
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi quis dolor sit amet lacus ultricies rutrum.
                                Curabitur vitae fringilla elit. Sed at nunc congue, cursus erat ac, pellentesque eros.
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>


    <!--portfolio-->
    <section class="gallery" id="gallery">
        <div class="container">
            <div class="heading text-center">
                <h2>Portfolio</h2>
                <h3>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi quis dolor sit amet lacus ultricies rutrum. Curabitur vitae fringilla elit. Sed at nunc congue, cursus erat ac, pellentesque eros. Etiam ullamcorper sed lectus sit amet mattis.</h3>
            </div>

            <div id="grid-gallery" class="grid-gallery">
                <section class="grid-wrap">
                    <ul class="grid">
                        <li class="grid-sizer"></li><!-- for Masonry column width -->
                        <li>
                            <figure>
                                <img src="img/work/1.jpg" alt=""/>
                                <figcaption>
                                    <h3>Vitae fringilla elit</h3>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit</p>
                                </figcaption>
                            </figure>
                        </li>
                        <li>
                            <figure>
                                <img src="img/work/2.jpg" alt=""/>
                                <figcaption>
                                    <h3>Vitae fringilla elit</h3>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit</p>
                                </figcaption>
                            </figure>
                        </li>
                        <li>
                            <figure>
                                <img src="img/work/3.jpg" alt=""/>
                                <figcaption>
                                    <h3>Vitae fringilla elit</h3>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit</p>
                                </figcaption>
                            </figure>
                        </li>
                        <li>
                            <figure>
                                <img src="img/work/4.jpg" alt=""/>
                                <figcaption>
                                    <h3>Vitae fringilla elit</h3>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit</p>
                                </figcaption>
                            </figure>
                        </li>
                        <li>
                            <figure>
                                <img src="img/work/5.jpg" alt=""/>
                                <figcaption>
                                    <h3>Vitae fringilla elit</h3>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit</p>
                                </figcaption>
                            </figure>
                        </li>
                        <li>
                            <figure>
                                <img src="img/work/6.jpg" alt=""/>
                                <figcaption>
                                    <h3>Vitae fringilla elit</h3>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit</p>
                                </figcaption>
                            </figure>
                        </li>

                        <li>
                            <figure>
                                <img src="img/work/7.jpg" alt=""/>
                                <figcaption>
                                    <h3>Vitae fringilla elit</h3>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit</p>
                                </figcaption>
                            </figure>
                        </li>

                        <li>
                            <figure>
                                <img src="img/work/8.jpg" alt=""/>
                                <figcaption>
                                    <h3>Vitae fringilla elit</h3>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit</p>
                                </figcaption>
                            </figure>
                        </li>

                    </ul>
                </section><!-- // end small images -->

                <section class="slideshow">
                    <ul>
                        <li>
                            <figure>
                                <img src="img/work/1.jpg" alt=""/>
                            </figure>
                        </li>
                        <li>
                            <figure>
                                <img src="img/work/2.jpg" alt=""/>
                            </figure>
                        </li>
                        <li>
                            <figure>
                                <img src="img/work/3.jpg" alt=""/>
                            </figure>
                        </li>
                        <li>
                            <figure>
                                <img src="img/work/4.jpg" alt=""/>
                            </figure>
                        </li>
                        <li>
                            <figure>
                                <img src="img/work/5.jpg" alt=""/>
                            </figure>
                        </li>
                        <li>
                            <figure>
                                <img src="img/work/6.jpg" alt=""/>
                            </figure>
                        </li>

                        <li>
                            <figure>
                                <img src="img/work/7.jpg" alt=""/>
                            </figure>
                        </li>

                        <li>
                            <figure>
                                <img src="img/work/8.jpg" alt=""/>
                            </figure>
                        </li>
                    </ul>
                    <nav>
                        <span class="icon nav-prev"></span>
                        <span class="icon nav-next"></span>
                        <span class="icon nav-close"></span>
                    </nav>
                    <div class="info-keys icon">Navigate with arrow keys</div>
                </section><!-- // end slideshow -->
            </div><!-- // grid-gallery -->
        </div>
    </section>

    <!--education-->
    <section class="feedback" id="feedback">
        <div class="container">
            <div class="heading">
                <h2>Education</h2>
                <h3>Phasellus non dolor nibh. Nullam elementum tellus pretium feugiat.<br>
                    Cras dictum tellus dui, vitae sollicitudin ipsum tincidunt in. Sed tincidunt tristique enim sed sollcitudin.</h3>
            </div>
        </div>

        """),format.raw/*316.36*/("""
            """),format.raw/*317.97*/("""
                """),format.raw/*318.46*/("""
                    """),format.raw/*319.66*/("""
                        """),format.raw/*320.64*/("""
                        """),format.raw/*321.57*/("""
                        """),format.raw/*322.57*/("""
                        """),format.raw/*323.86*/("""
                    """),format.raw/*324.31*/("""
                """),format.raw/*325.27*/("""
            """),format.raw/*326.23*/("""

            """),format.raw/*328.97*/("""
                """),format.raw/*329.46*/("""
                    """),format.raw/*330.66*/("""
                        """),format.raw/*331.64*/("""
                        """),format.raw/*332.57*/("""
                        """),format.raw/*333.55*/("""
                        """),format.raw/*334.86*/("""
                    """),format.raw/*335.31*/("""
                """),format.raw/*336.27*/("""
            """),format.raw/*337.23*/("""

            """),format.raw/*339.97*/("""
                """),format.raw/*340.46*/("""
                    """),format.raw/*341.66*/("""
                        """),format.raw/*342.64*/("""
                        """),format.raw/*343.57*/("""
                        """),format.raw/*344.55*/("""
                        """),format.raw/*345.86*/("""
                    """),format.raw/*346.31*/("""
                """),format.raw/*347.27*/("""
            """),format.raw/*348.23*/("""
        """),format.raw/*349.19*/("""

        """),format.raw/*351.9*/("""<div class="container">
            <div class="row">
                <blockquote>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages." <cite>Jogn De, Programming<br/><i class="fa fa-star"></i> <i class="fa fa-star"></i> <i class="fa fa-star"></i> <i class="fa fa-star"></i> <i class="fa fa-star"></i></cite> </blockquote>
                <blockquote>Have you ever felt worried that your party will not raise up to your guest expectations? In design, vertical rhythm is the structure that guides a reader’s eye through the content. Good vertical rhythm makes a layout more balanced and beautiful and its content more readable. The time signature in sheet music visually depicts a song’s rhythm, while for us, the lines of the baseline grid depict the rhythm of our content and give us guidelines. <cite>Marta Kay, Business Development<br/><i class="fa fa-star"></i> <i class="fa fa-star"></i> <i class="fa fa-star"></i> <i class="fa fa-star"></i> <i class="fa fa-star"></i></cite> </blockquote>
            </div>
        </div>
    </section>

    <!--education-->
    <section class="contact" id="contact">
        <div class="container">
            <div class="heading">
                <h2>Contact</h2>
                <h3>Phasellus non dolor nibh. Nullam elementum tellus pretium feugiat.<br>
                    Cras dictum tellus dui, vitae sollicitudin ipsum tincidunt in. Sed tincidunt tristique enim sed sollcitudin.</h3>
            </div>
        </div>

        <div class="container">
            <div class="row">
                <div class="col-md-7">
                    <div class="map">
                        <iframe src="https://maps.google.com/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Kuningan,+Jakarta+Capital+Region,+Indonesia&amp;aq=3&amp;oq=kuningan+&amp;sll=37.0625,-95.677068&amp;sspn=37.410045,86.572266&amp;ie=UTF8&amp;hq=&amp;hnear=Kuningan&amp;t=m&amp;z=14&amp;ll=-6.238824,106.830177&amp;output=embed">
                        </iframe>
                    </div>
                </div>

                <div class="contact-info">
                    <div class="col-md-5">
                        <h4>My Contact Info</h4>
                        <h5>Nullam elementum tellus pretium feugiat</h5>
                        <p>Fusce fermen tum neque a rutrum varius odio pede
                            ullamcorp-er tellus ut dignissim nisi risus non tortor</p>
                        <ul>
                            <li><i class="fa fa-home fa-2x"></i> Home # 38, Suite 54 Elizebth Street</li>
                            <li><i class="fa fa-phone fa-2x"></i> +38 000 129900</li>
                            <li><i class="fa fa-download fa-2x"></i> Download My Resume</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>

        <div class="container">
            <div class="row">
                <div class="done">
                    <div class="alert alert-success">
                        <button type="button" class="close" data-dismiss="alert">×</button>
                        Your message has been sent. Thank you!
                    </div>
                </div>
                <form method="post" action="contact.php" id="contactform">
                    <input name="name" type="text" class="contact col-md-6" placeholder="Name *" >
                    <input name="email" type="email" class="contact noMarr col-md-6" placeholder="E-mail address *" >
                    <textarea name="comment" class="contact col-md-12" placeholder="Message *"></textarea>
                    <input type="submit" id="submit" class="contact submit" value="Send message">
                </form>
            </div>
        </div>
    </section>

    <!--footer-->
    <section class="footer" id="footer">
        <p class="text-center">
            <a href="#wrapper" class="gototop"><i class="fa fa-angle-double-up fa-2x"></i></a>
        </p>
        <div class="container">
            <ul>
                <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                <li><a href="#"><i class="fa fa-pinterest"></i></a></li>
                <li><a href="#"><i class="fa fa-flickr"></i></a></li>
            </ul>
            <p>
                &copy; 2015 <a target="_blank" href="http://bootstraptaste.com/" title="Free Twitter Bootstrap WordPress Themes and HTML templates">bootstraptaste</a>. All Rights Reserved.
            </p>
            <!--
                All links in the footer should remain intact.
                Licenseing information is available at: http://bootstraptaste.com/license/
                You can buy this theme without footer links online at: http://bootstraptaste.com/buy/?theme=MyResume
            -->
        </div>
    </section>

</div>

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
object about_me extends about_me_Scope0.about_me
              /*
                  -- GENERATED --
                  DATE: Mon Nov 28 11:44:27 CET 2016
                  SOURCE: /home/duri/workspace/web/www.kabzanj.net/app/views/tabs/about_me.scala.html
                  HASH: c671a66858bdd312688229e401f1c9635ac4927a
                  MATRIX: 838->0|17672->16832|17714->16929|17760->16975|17810->17041|17864->17105|17918->17162|17972->17219|18026->17305|18076->17336|18122->17363|18164->17386|18207->17484|18253->17530|18303->17596|18357->17660|18411->17717|18465->17772|18519->17858|18569->17889|18615->17916|18657->17939|18700->18037|18746->18083|18796->18149|18850->18213|18904->18270|18958->18325|19012->18411|19062->18442|19108->18469|19150->18492|19188->18511|19226->18521
                  LINES: 32->1|347->316|348->317|349->318|350->319|351->320|352->321|353->322|354->323|355->324|356->325|357->326|359->328|360->329|361->330|362->331|363->332|364->333|365->334|366->335|367->336|368->337|370->339|371->340|372->341|373->342|374->343|375->344|376->345|377->346|378->347|379->348|380->349|382->351
                  -- GENERATED --
              */
          