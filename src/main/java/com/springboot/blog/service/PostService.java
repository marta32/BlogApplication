package com.springboot.blog.service;


import com.springboot.blog.payload.PostDto;
import com.springboot.blog.service.impl.PostServiceImpl;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPosts();

    PostDto getPostById(long id);

}