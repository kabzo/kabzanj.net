package models;

/**
 * Created by duri on 16.11.15.
 */

import controllers.WebJarAssets;
import play.api.Application;
import play.api.Play;
import play.Logger;
import views.html.projects.*;

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

        tabPages.add(new TabPage("home",home.render(null,null),"Juraj Kabzan, student of Electrical Engineering at ETH Zurich. On this page you can get to know more about me and my experiences."));
         tabPages.add(new TabPage("projects",new ArrayList<SubPage>(){{

                     add(new ProjectPage("object_follow",
                             object_following.render(),
                             "https://www.youtube.com/embed/4itE-V_eS4A",
                             "https://github.com/kabzo/Object-Track-and-Follow",
                             "https://owncloud.kabzanj.net/index.php/s/72EGZGtNixAd17P/download",
                             "https://prezi.com/embed/bsltpbiif1sv/?bgcolor=ffffff",
                             "Drone tracking object autonomously, video tracking with TLD, just initialization necessary," +
                                     "An On-Drone Dynamic Object Track and Follow Solution for Quadcopters"));

                     add(new ProjectPage("quadcopter",
                             quadcopter.render(),
                             "https://www.youtube.com/embed/tBAi76bqvyE",
                             "https://github.com/kabzo/Quadcopter",
                             null,
                             null,
                             "I have developed quadcopter control board based on Teensy 3.1 and MPU9050"));

                     add(new ProjectPage("viennacl",
                             viennacl.render(),
                             null,
                             "https://github.com/viennacl/viennacl-dev",
                             null,
                             null,
                             "During summer I have taken a part in Summer of CODE C++, Implementation of FFT with CUDA and OpenCL"));

                     add(new ProjectPage("mapping",
                             mapping.render(),
                             "https://www.youtube.com/embed/metQnEulrWA",
                             null,
                             "https://owncloud.kabzanj.net/index.php/s/Lmn5LeJq12A9qUY/download",
                             null,
                             "Mapping 2D room with ros gmapping and further with generated map, calculate path from place to place with goto"));

                     add(new ProjectPage("nxtuino",
                             nxtuino.render(),
                             "https://www.youtube.com/embed/G22mwWAuG64\n",
                             "https://github.com/kabzo/NXTuino",
                             null,
                             null,
                             "balancing vehicle with arduino and MOU6010"));

                     add(new ProjectPage("weight_catapult",
                             catapult.render(),
                             null,
                             "https://github.com/kabzo/Weight-and-Catapult",
                             null,
                             null,
                             "Meassuring weigh with precision of 0.1g and further shot it at least to 20cm distance"));

                 }},"All my projects, Control Board, Quadcopter, Drone, Tracking in video Frame with OpenTLD, Processing on board, Nvidia Jetson," +
                 "An On-Drone Dynamic Object Track and Follow Solution for Quadcopters"));

         tabPages.get(1).setContentHtml(projects.render(tabPages.get(1)));
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
