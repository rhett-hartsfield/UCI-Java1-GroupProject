/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seo.application;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.*;
import javax.lang.model.util.Elements;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author RAH-Lenovo
 */
public class SEOApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        java.util.Scanner userInput;
        HtmlParser htmlParser;
        
        while(true){
            userInput = new java.util.Scanner(System.in);
            System.out.println("Enter domainURL and Press Enter or e to exit:");
            String url = userInput.next();
            
            if(url.equalsIgnoreCase("e")) {
                System.out.println("Oops, GoodBye!");
                break;
            }
            
            htmlParser = new HtmlParser();
            
            if( ! htmlParser.connect(url)){
                System.out.println("please enter a valid url and try again!");
                continue;
            }
            
            processFile(htmlParser);
        }                                              

    }
    
    public static void processFile(HtmlParser htmlParser) {
        
        java.util.Scanner userInput;
        String result;
        
        while (true) {            
            userInput = new java.util.Scanner(System.in);
            System.out.println("Enter the option number and Press Enter");
            System.out.println("0. << Go Back");
            System.out.println("1. get title");
            System.out.println("2. get page links");
            String cmd = userInput.next();
            
            if(cmd.equalsIgnoreCase("0")) {
                System.out.println("Main Menu!");
                break;
            }
            
            result = "";
            try {
                switch(cmd){
                    case "1":
                        result = htmlParser.getTitle();
                        break;   
                    case "2":
                        result = htmlParser.getLinks();
                        break;  
                    default:
                      System.out.println("Oops, the option not valid!");  
                      continue;
                }
                htmlParser.print(result);
            }catch(Exception e){
                System.out.println("Oops, something went wrong!");
            }
            
            
            
        }
    }

}



//  // Page HTML Variables
//    GoogleAnalytics = "UA-xxxxx";
//    H1Title = "<h1>"|"</h1>";
//    PageTitle = "<title>"|"</title>";
//    PageDescription = "<description>"|"</description>";
//    PageSchemaItemScope = "<div itemscope>"|"</div>";
//    PageSchemaType = "<div itemsitemtype="|">";
//    JsonLDSchema = "<script type="*">"|"</script>";
//    FacebookOGSchema = "<h1>"|"</h1>";
//    MicroDataSchema = "<h1>"|"</h1>";
//    AhrefLinkText = "<a href="*">"|"</h1>";
//    MetaName = "<meta name="|"/>"
//    MetaProperty = "<meta property="|"/>"
//    H2Title = "<h2>"|"</h2>";
//    Strong = "<strong>"|"</strong>";
//    
//      // Spam Keyword Bank
//      SpamKeywords = 
//   
//    //Organizing Variables
//    TotalKeywordCount = TotalKeywords; // Counts total # of keywords minus generic keywords
//    MostFreq-Keyword1 = Keyword1
//    MostFreq-Keyword2 = Keyword2
//    MostFreq-Keyword3 = Keyword3
//    
        //       SpamKeywords = (SpamList);
//  java.util.Scanner userInput = new java.util.Scanner(System.in);
//        // userInput.
//        System.out.println("Enter # to Scrap: 1=metaData, 2=aHrefs, 3=seoAudit, 4=jsonLD ");
//
//        String url = userInput.nextLine();
//        Scanner s = new Scanner(all).userInput();
//        int searchType = s.nextInt();
// 
//        processQuerie{
//        if (url.equalsIgnoreCase("")) {
//           processInt(rawHTML);
//   } else if (transformations.equalsIgnoreCase("2")) {
//            processInt(aHrefs);     
//    } else if (transformations.equalsIgnoreCase("2")) {
//            processInt(aHrefs);
//        } else if (transformations.equalsIgnoreCase("3")) {
//            processInt(seoAudit);
//        } else if (transformations.equalsIgnoreCase("4")) {
//            processAccumulate(jsonLD);
//        }





//
//String url = userInput.nextLine();1\
//\
//        
//        Scanner s = new Scanner(all).useDelimiter(",");
//        int searchQuery = s.nextInt();
//
//        String transformations = s.next();
//        
//        public static void processRawHTML(int searchQuery) {
//
//        for (int i = 0; i < searchQuery; i++) {
//            System.out.println(i);
//        }
//
//    }
//        public static void processAHrefs(int searchQuery) {
//
//        for (int i = 0; i < searchQuery; i++) {
//            System.out.println(i);
//        }
//
//    }
//        public static void processSeoAudit(int searchQuery) {
//
//        for (int i = 0; i < searchQuery; i++) {
//            System.out.println(i);
//        }
//
//    }
//        public static void processJsonLD(int searchQuery) {
//
//        for (int i = 0; i < searchQuery; i++) {
//            System.out.println(i);
//        }
//
//    }
////        
//        System.out.println ();
//        

//         String all = ("domainURL","searchType");
//        String domainURL = userInput.nextLine();
//        String searchType = userInput.nextLine();
////    }}
//        website 
//        searchType 
//        Document doc;
//        try {
//            doc = Jsoup.connect("http://" + url).get();
//            org.jsoup.select.Elements rahHTML = doc.select("html");
//            System.out.println(rahHTML);
//        } catch (IOException ex) {
//            Logger.getLogger(SEOApplication.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        FetchURLData fetchURLData = new FetchURLData();
//
//        try {
//            fetchURLData.sendGet(url);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//        System.out.println(url);