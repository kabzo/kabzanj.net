package models;

/**
 * Created by duri on 16.11.15.
 */

import play.api.Application;
import play.api.Play;
import play.Logger;
import views.html.projects.nxtuino;
import views.html.projects.object_following;
import views.html.projects.quadcopter;
import views.html.projects.viennacl;
import views.html.projects.catapult;

import views.html.tabs.home;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class PagesPool {
    public static int currentId = 0;

    public List<TabPage> bar;

    public PagesPool(){
        bar = generateBar();
    }

     public List<TabPage> generateBar(){
        currentId = 0;
        List<TabPage> tabPages = new ArrayList<TabPage>();

        tabPages.add(new TabPage("home",home.render(null,null)));
        tabPages.add(new TabPage("projects",new ArrayList<SubPage>(){{

            add(new ProjectPage("nxtuino",
                    nxtuino.render(),
                    "https://www.youtube.com/embed/G22mwWAuG64\n",
                    "https://github.com/kabzo/NXTuino"));

            add(new ProjectPage("quadcopter",
                    quadcopter.render(),
                    "https://www.youtube.com/embed/tBAi76bqvyE",
                    "https://github.com/kabzo/Quadcopter"));

            add(new ProjectPage("object_follow",
                    object_following.render(),
                    "https://www.youtube.com/embed/4itE-V_eS4A",
                    "https://github.com/kabzo/Object-Track-and-Follow",
                    "https://owncloud.kabzanj.net/index.php/s/72EGZGtNixAd17P/download"));

            add(new ProjectPage("weight_catapult",
                    catapult.render(),
                    null,
                    "https://github.com/kabzo/Weight-and-Catapult"));

            add(new ProjectPage("viennacl",
                    viennacl.render(),
                    null,
                    "https://github.com/viennacl/viennacl-dev"));
        }}));
         tabPages.get(0).setContentHtml(home.render(getAllPictures(tabPages),tabPages));
        return tabPages;
    }

    static private Map<String,String> getAllPictures(List<TabPage> tabPages){
        Map<String,String> pictures_map = new HashMap<String, String>();
        try {
            List<File> filesInFolder= Files.walk(Paths.get(Play.current().path().toString()+"/images_tab/"))
                    .filter(Files::isRegularFile)
                    .map(Path::toFile)
                    .collect(Collectors.toList());
            for(File f:filesInFolder){
                pictures_map.put(f.getPath(), f.getParentFile().getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pictures_map;
    }

    static private TabPage getTabPage(String name, List<TabPage> list){
        for(TabPage t:list){
            for(SubPage s: t.getSubPages()){
                if(s.getName().equals(name)){
                    return s;
                }
            }
            if(t.getName().equals(name)){
                return t;
            }
        }
        return null;
    }

    static public Integer getPageId(String name, List<TabPage> list){
        for(TabPage t:list){
            if(t.getName().equals(name)){
                return new Integer(t.getId());
            }
            for(SubPage s:t.getSubPages())
                if(s.getName().equals(name)){
                    return new Integer(s.getId());
                }
        }
        return new Integer(-1);
    }

    public TabPage searchTabpage(int id){
        for(TabPage t: bar){
            for(SubPage s:t.getSubPages()){
                if(s.getId() == id){
                    return s;
                }
            }
            if(t.getId()==id){
                return t;
            }
        }
        return null;
    }

    public InputStream getInputStream(String name, List<TabPage> list){
        TabPage p = getTabPage(name,list);
        if(p instanceof ProjectPage){
            try {
                ProjectPage project = (ProjectPage) p;
                return project.getUrl().openStream();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
