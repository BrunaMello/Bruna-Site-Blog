package com.brunamello.siteblog.controller;

import com.brunamello.siteblog.model.Post;
import com.brunamello.siteblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.time.LocalDate;

@Controller
@RequestMapping("/newpost")
public class NewPostController {

    @Autowired
    BlogService blogService;


    @GetMapping
    public String getPostForm() {
        return "postForm";
    }

    @PostMapping
    public String savePost(@Valid Post post, BindingResult result, RedirectAttributes attributes) {
        if (result.hasErrors()) {
            attributes.addFlashAttribute("mensagem", "Verifique se os campos obrigatórios foram preenchidos!");
            return "redirect:/newpost";
        }
        post.setData(LocalDate.now());
        blogService.save(post);
        return "redirect:/posts";
    }
}
