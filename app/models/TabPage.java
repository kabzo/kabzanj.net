package models;

import org.apache.commons.lang3.text.WordUtils;
import play.twirl.api.Content;
import views.html.main_page;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * Created by duri on 17.11.15.
 */



public class TabPage {

    private String name;
    private List<SubPage> subPages;
    private Content contentHtml;
    private int id;

    private HashMap<String,String> scripts;
    private HashMap<String,String> styles;

    private boolean pace;

    public TabPage()
    {
        subPages = new ArrayList<SubPage>();
        this.pace = false;
        this.id = PagesPool.currentId++;
    }

    public TabPage(String name){
        subPages = new ArrayList<SubPage>();
        this.name = name;
        this.pace = false;
        this.id = PagesPool.currentId++;


    }

    public TabPage(String name, Content contentHtml){
        subPages = new ArrayList<SubPage>();
        this.name = name;
        this.contentHtml = contentHtml;
        this.pace = false;
        this.id = PagesPool.currentId++;
    }

    public TabPage(String name, Content contentHtml, boolean pace){
        subPages = new ArrayList<SubPage>();
        this.name = name;
        this.contentHtml = contentHtml;
        this.pace = pace;
        this.id = PagesPool.currentId++;
    }

    public TabPage(String name, List<SubPage> subPages){
        this.id = PagesPool.currentId++;
        this.name = name;
        List<String> subPagesNames = new ArrayList<String>();
        for(SubPage s:subPages) {
            s.setParentTabPage(this);
        }
        this.subPages = subPages;
        this.pace = false;

    }


    public List<SubPage> getSubPages() {
        return subPages;
    }

    public void setSubPages(List<SubPage> subPages) {
        this.subPages = subPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Content getContentHtml() {
        return contentHtml;
    }

    public Content getFinalPage(List<TabPage> tabPages){
        return main_page.render(this,tabPages);
    }

    public void setContentHtml(Content contentHtml) {
        this.contentHtml = contentHtml;
    }

    public String getShowName() {
        return WordUtils.capitalize(name.replaceAll("_", " "));
    }

    public HashMap<String,String> getStyles() {
        return styles;
    }

    public HashMap<String,String> getScripts() {
        return scripts;
    }

    public void setScripts(HashMap<String, String> scripts) {
        this.scripts = scripts;
    }

    public void setStyles(HashMap<String, String> styles) {
        this.styles = styles;
    }

    public boolean isPace() {
        return pace;
    }

    public void setPace(boolean pace) {
        this.pace = pace;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
