package models;

abstract public class SubPage extends TabPage {
    private TabPage parentTabPage;

    public TabPage getParentTabPage() {
        return parentTabPage;
    }

    public void setParentTabPage(TabPage parentTabPage) {
        this.parentTabPage = parentTabPage;
    }

}
