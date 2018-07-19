/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thuctaptask2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


/**
 *
 * @author tiendungmai
 */
public class Task {
    public static void main(String[] args) {
        try {
            FileWriter fw;
            Date d = new Date();
            //SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
            Document doc = Jsoup.connect("http://dantri.com.vn").get();
            System.out.println(doc.head());
            System.out.println(doc.body());
            fw = new FileWriter(new File(d.toString()));
            fw.write(doc.head().toString());
            fw.write(doc.body().toString());
        } catch (IOException ex) {
            Logger.getLogger(Task.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
