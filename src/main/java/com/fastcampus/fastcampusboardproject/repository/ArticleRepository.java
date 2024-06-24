package com.fastcampus.fastcampusboardproject.repository;

import com.fastcampus.fastcampusboardproject.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface ArticleRepository extends JpaRepository<Article, Long> {
}