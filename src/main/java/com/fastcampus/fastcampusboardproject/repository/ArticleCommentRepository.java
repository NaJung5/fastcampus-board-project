package com.fastcampus.fastcampusboardproject.repository;

import com.fastcampus.fastcampusboardproject.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
