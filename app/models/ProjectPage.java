package models;

import play.twirl.api.Content;
import views.html.projects.project_page;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Created by duri on 16.11.15.
 */

public class ProjectPage extends SubPage {

    private List<String> pictures;
    private String video_url;
    private String github_link;
    private String prezi;
    private URL url;

//    public ProjectPage(String name){
//        super();
//        super.setName(name);
//        searchPictures();
//        this.github_link = null;
//    }
//
//    public ProjectPage(String name,Content content){
//        super();
//        super.setName(name);
//        searchPictures();
//        this.setContentHtml(content);
//        this.setContentHtml(project_page.render(this));
//        this.github_link = null;
//
//    }
//
//    public ProjectPage(String name,Content content,String video_url,String metaTag){
//        super();
//        super.setName(name);
//        searchPictures();
//        this.video_url = video_url;
//        this.setContentHtml(content);
//        this.setContentHtml(project_page.render(this));
//        this.github_link = null;
//        super.setMetaTag( metaTag);
//    }
//
//    public ProjectPage(String name,Content content,String video_url, String github_link,String metaTag){
//        super();
//        super.setName(name);
//        searchPictures();
//        this.video_url = video_url;
//        this.github_link = github_link;
//        this.setContentHtml(content);
//        this.setContentHtml(project_page.render(this));
//        super.setMetaTag( metaTag);
//
//    }

    public ProjectPage(String name,Content content,String video_url, String github_link, String url,String prezi, String metaTag){
        super();
        super.setName(name);
        searchPictures();
        this.video_url = video_url;
        this.github_link = github_link;
        this.prezi = prezi;
        try {
            this.url = new URL(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        this.setContentHtml(content);
        this.setContentHtml(project_page.render(this));
        super.setMetaTag(metaTag);


    }

    private void searchPictures(){
        pictures = new ArrayList<String>();
        try {
            List<File> filesInFolder= Files.walk(Paths.get("images_tab/" + this.getName() ))
                    .filter(Files::isRegularFile)
                    .map(Path::toFile)
                    .collect(Collectors.toList());
            for(File f:filesInFolder){
                pictures.add(f.getName());
            }
        } catch (IOException e) {
//            e.printStackTrace();
        }
    }

    public void render_project_page(Content html){
        this.setContentHtml(html);
        this.setContentHtml(project_page.render(this));
    }

    public void addPiture(String str){
        pictures.add(str);
    }

    public List<String> getPictures() {
        return pictures;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public String getGithub_link() {
        return github_link;
    }

    public void setGithub_link(String github_link) {
        this.github_link = github_link;
        this.setContentHtml(project_page.render(this));
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getPrezi() {
        return prezi;
    }

    public void setPrezi(String prezi) {
        this.prezi = prezi;
    }
}
