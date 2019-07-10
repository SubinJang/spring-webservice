package com.songjang.webservice.web;

import com.songjang.webservice.posts.dto.PostsSaveRequestDto;
import com.songjang.webservice.posts.repository.PostsRepository;
import com.songjang.webservice.posts.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsRepository postsRepository;
    private PostsService postsService;

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }

    @PostMapping("/posts")
    public Long savePosts(@RequestBody @Valid PostsSaveRequestDto dto) {
        return postsService.save(dto);
    }
}
