package controllers;

import models.PagesPool;
import models.SubPage;
import models.TabPage;
import play.cache.CacheApi;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Application extends Controller {


    @Inject WebJarAssets webJarAssets;


    @Inject CacheApi cache;
    private PagesPool getPool(){
        PagesPool pool = new PagesPool();
        return pool;

    }

    public Result index(){
        return menu_id("home");
    }

    public Result menu_id(String pageKey){
        PagesPool pool= cache.getOrElse("pagesPool", () -> getPool());

        for(TabPage t: pool.bar){
            for(SubPage s:t.getSubPages()){
                if(s.getName().equals(pageKey)){
                    return ok(s.getFinalPage(pool.bar,webJarAssets));
                }
            }
            if(t.getName().equals(pageKey)){
                return ok(t.getFinalPage(pool.bar,webJarAssets));
            }
        }

        return ok(pool.bar.get(1).getContentHtml());
    }

    public Result menu_string(String id){

        PagesPool pool= cache.getOrElse("pagesPool", () -> getPool());


        TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {
                    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                        return null;
                    }
                    public void checkClientTrusted(
                            java.security.cert.X509Certificate[] certs, String authType) {
                    }
                    public void checkServerTrusted(
                            java.security.cert.X509Certificate[] certs, String authType) {
                    }
                }
        };

        // Activate the new trust manager
        try {
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ok(pool.getInputStream(id,pool.bar)).as("application/pdf");
    }

    public Result imageAt(String imageName) throws FileNotFoundException {
        File imageFile = new File(imageName);
        if (imageFile.exists()) {
            String resourceType = "image+"+imageName.substring(imageName.length()-3);
            return ok(new FileInputStream(imageFile)).as(resourceType);
        } else {
            return notFound(imageFile.getAbsoluteFile());
        }
    }


}
