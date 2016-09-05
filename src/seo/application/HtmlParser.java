/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seo.application;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 *
 * @author RAH-Lenovo
 */
public class HtmlParser {
    
    private String url = null; 
    
    private Document doc = null;
    
    public boolean connect(String url) 
    {
        this.url = url;
        try {
            doc = Jsoup.connect("http://" + url).get();
            return true;
        } catch (IOException ex) {
           return false;
        }
        
    }
    
    public String getTitle() 
    {       
        return this.doc.title();
    }
    
    public String getLinks() 
    {
        String linksList = "";
        org.jsoup.select.Elements rahHTML = this.doc.select("a");
        
        
        for (Element link : rahHTML) {  
            linksList = linksList + "\n -" +  link.text(); 
            linksList = linksList + "\n" +  link.attr("href"); 
            linksList = linksList + "\n\n";
        }
        return linksList;
    }
    
    public void print(String res)
    {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-----------------------------------");  
        System.out.println(res.equals("") ? "No Result Found!" : res);  
        System.out.println("-----------------------------------"); 
    }
}
