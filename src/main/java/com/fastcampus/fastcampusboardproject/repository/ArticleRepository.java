package com.fastcampus.fastcampusboardproject.repository;

import com.fastcampus.fastcampusboardproject.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}