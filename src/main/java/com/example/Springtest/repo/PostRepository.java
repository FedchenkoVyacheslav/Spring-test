package com.example.Springtest.repo;

import com.example.Springtest.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
