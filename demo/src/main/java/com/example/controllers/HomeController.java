package com.example.controllers;

import com.example.form.Post;
import org.apache.catalina.servlets.WebdavServlet;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.*;


@Controller
@RequestMapping("/")
public class HomeController {

    //
    public static void connection(String serviceName) throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.
                getConnection("jdbc:h2:~/test", "sa", "");

        Statement statement = conn.createStatement();
        String query = "SELECT * FROM MESSAGE WHERE SERVICENAME = '" + serviceName +"'";
        ResultSet result = statement.executeQuery(query);

        while (result.next()) {
            System.out.println(result.getString("MESSAGE"));
        }
        conn.close();
    }


    @RequestMapping(method=RequestMethod.GET)
    public String index(Post post) {
        return "index";
    }

    @RequestMapping(method = RequestMethod.POST, params={"empty"} )
    public String empty(Post post) {
        post.setMessageID("");
        post.setInquiryID("");
        post.setServiceName("");
        post.setStatus("");
        post.setObjectID("");
        post.setSeizureResponseCode("");
        post.setBankResponseCode("");
        post.setErrorCode("");
        post.setSendingTime("");
        post.setEntryTime("");
        post.setClientsCode("");
        post.setCompiler("");
        post.setOriginalDocument("");
        return "index";
    }

    @RequestMapping(method = RequestMethod.POST, params={"back"} )
    public String back(Post post) {
        post.setMessageID("");
        post.setInquiryID("");
        post.setServiceName("");
        post.setStatus("");
        post.setObjectID("");
        post.setSeizureResponseCode("");
        post.setBankResponseCode("");
        post.setErrorCode("");
        post.setSendingTime("");
        post.setEntryTime("");
        post.setClientsCode("");
        post.setCompiler("");
        post.setOriginalDocument("");
        return "result";
    }

    @RequestMapping(method = RequestMethod.POST, params={"search"})
    public String addNewPost(@Valid Post post, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "index";
        }
        try {
            System.out.println("SELECT * FROM MESSAGE WHERE SERVICENAME = " + post.getServiceName());
            connection(post.getServiceName());}
        catch(Exception e) {}

        model.addAttribute("messageID", post.getMessageID());
        model.addAttribute("inquiryID", post.getInquiryID());
        model.addAttribute("objectID", post.getObjectID());
        model.addAttribute("serviceName", post.getServiceName());
        model.addAttribute("status", post.getStatus());
        model.addAttribute("seizureResponseCode", post.getSeizureResponseCode());
        model.addAttribute("bankResponseTime", post.getBankResponseCode());
        model.addAttribute("errorCode", post.getErrorCode());
        model.addAttribute("sendingTime", post.getSendingTime());
        model.addAttribute("entryTime", post.getEntryTime());
        model.addAttribute("clientsCode", post.getClientsCode());
        model.addAttribute("compiler", post.getCompiler());
        model.addAttribute("originalDocument", post.getOriginalDocument());
        model.addAttribute("bankResponseXml", post.getBankResponseXml());
        model.addAttribute("responseID", post.getResponseID());
        model.addAttribute("messageXml", post.getMessageXml());
        model.addAttribute("responseXml",post.getResponseXml());
        model.addAttribute("seizureText",post.getSeizureText());
        model.addAttribute("errorText", post.getErrorText());
        model.addAttribute("errorStack", post.getErrorStack());
        model.addAttribute("bankResponseText", post.getBankResponseText());
        model.addAttribute("editTime", post.getEditTime());
        model.addAttribute("person", post.getPerson());
        model.addAttribute("seizureResponseTime", post.getSeizureResponseTime());
        model.addAttribute("bankResponseID", post.getBankResponseID());
        model.addAttribute("bankResponseTime", post.getBankResponseTime());
        return "messages";
    }


    @RequestMapping(method= RequestMethod.POST, params = {"resultBack"})
    public String resultBack(@Valid Post post, BindingResult bindingResult, Model model) {
        return "messages";
    }

}




//disain, osadele vaja 2 lahtrit
//andmebaasi ühendus
//sessiooni kontroll
//Sõnumite valiku leht ja ümber teha natukene redirecti
//saaks teha loopiga osad asjad thymeleafis
