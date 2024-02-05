package com.example.original.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.original.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
