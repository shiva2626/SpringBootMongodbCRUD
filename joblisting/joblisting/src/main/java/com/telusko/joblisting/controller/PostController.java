package com.telusko.joblisting.controller;

import com.telusko.joblisting.repository.PostRepository;
import com.telusko.joblisting.model.Post;
import io.swagger.v3.oas.annotations.Hidden;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class PostController {
    @Autowired
    PostRepository repo;

    @Hidden
    @RequestMapping("/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui/index.html");
    }
    @GetMapping("/posts")
    public List<Post> getallposts()
    {
        List<Post> p = repo.findAll();
        return p;
    }
    @PostMapping("/post")
    public Post addPost(@RequestBody Post post)
    {
        return repo.save(post);
    }
}

