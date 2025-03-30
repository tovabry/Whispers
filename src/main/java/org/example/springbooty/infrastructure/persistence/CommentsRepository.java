package org.example.springbooty.infrastructure.persistence;

import org.example.springbooty.domain.entity.Comments;
import org.springframework.data.repository.ListCrudRepository;

public interface CommentsRepository extends ListCrudRepository<Comments, Integer> {
}
