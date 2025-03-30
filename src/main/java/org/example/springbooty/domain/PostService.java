package org.example.springbooty.domain;

import org.example.springbooty.domain.entity.Post;
import org.example.springbooty.infrastructure.persistence.PostRepository;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.logging.Logger;

@Service
@Transactional
public class PostService {
   Logger log = Logger.getLogger(PostService.class.getName());

   PostRepository postRepository;

   public PostService(PostRepository postRepository) {
       this.postRepository = postRepository;
   }

   @Cacheable("allPosts")
    public List<Post> getAllPosts() {
       log.info("getAllPosts");
       return postRepository.findAll();
   }

    @CacheEvict(value = "allPosts", allEntries = true)
    public Post addPost(Post post) {
        return postRepository.save(post);
    }


}
