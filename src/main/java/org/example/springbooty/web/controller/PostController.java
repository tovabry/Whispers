package org.example.springbooty.web.controller;

import org.example.springbooty.domain.PostService;
import org.example.springbooty.domain.entity.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/posts")
public class PostController {
    private final PostService postService;
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/view")
    public String viewPosts(Model model) {
        model.addAttribute("posts", postService.getAllPosts());
        model.addAttribute("post", new Post());
        return "view-posts";
    }

    @GetMapping("/add")
    public String showAddPostForm(Model model) {
        // Add an empty playground object to the model for the form to bind to
        if (!model.containsAttribute("post")) {
            model.addAttribute("post", new Post());
        }
        return "add-posts";
    }

    @PostMapping("/add")
    public String addPost(@ModelAttribute Post post,
                                RedirectAttributes redirectAttributes) {
        postService.addPost(post);

        // Add success message and the playground object (in case we need to display it)
        redirectAttributes.addFlashAttribute("success", true);
        redirectAttributes.addFlashAttribute("post", new Post());

        return "redirect:/posts/view";
    }
}
