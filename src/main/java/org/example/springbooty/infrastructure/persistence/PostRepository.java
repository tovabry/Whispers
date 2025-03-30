package org.example.springbooty.infrastructure.persistence;

import org.example.springbooty.domain.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    // Fetch all posts sorted by date in descending order
    List<Post> findAllByOrderByDateDesc();
}
