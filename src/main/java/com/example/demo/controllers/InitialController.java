package com.example.demo.controllers;

import com.example.demo.models.MailModel;
import com.example.demo.services.MailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class InitialController {
    //Registeret aka en Arrayliste med Personer/modellen

    @GetMapping("/")
    public String index(){
        return "index.html";
    }

    @GetMapping("/index")
    public String indexHtml(){
        return "index.html";
    }

    @GetMapping("/about")
    public String about(){
        return "about.html";
    }

    @GetMapping("/where")
    public String where(){
        return "where.html";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact.html";
    }
    @PostMapping("/formPost")
    public String formPost(WebRequest wr){
        //Får informationen fra webrequesten
        String name = wr.getParameter("name");
        String address = wr.getParameter("addr");
        String phone = wr.getParameter("tlfnr");
        String email = wr.getParameter("email");
        String text = wr.getParameter("text");

        MailModel mm = new MailModel(name,address,phone,email,text);
        MailService mail = new MailService();
        mail.sendMail(mm.getMail());
        return "redirect:/";
    }
}
