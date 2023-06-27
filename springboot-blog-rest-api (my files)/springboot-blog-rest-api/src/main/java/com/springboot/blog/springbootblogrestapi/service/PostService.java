package com.springboot.blog.springbootblogrestapi.service;

import com.springboot.blog.springbootblogrestapi.payload.PostDto;

public interface PostService {
    PostDto createdPost(PostDto postDto);
}
