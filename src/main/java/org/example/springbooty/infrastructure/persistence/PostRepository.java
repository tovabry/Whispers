package org.example.springbooty.infrastructure.persistence;

import org.example.springbooty.domain.entity.Post;
import org.springframework.data.repository.ListCrudRepository;

public interface PostRepository extends ListCrudRepository<Post, Integer> {

}
