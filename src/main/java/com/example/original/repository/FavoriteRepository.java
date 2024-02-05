package com.example.original.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.original.entity.Favorite;

public interface FavoriteRepository extends JpaRepository<Favorite, Long> {

    public Optional<Favorite> findById(Long id);

    public List<Favorite> findByUserIdOrderByUpdatedAtDesc(Long userId);

    public List<Favorite> findByUserIdAndTopicId(Long userId, Long topicId);

    public void deleteByUserIdAndTopicId(Long userId, Long topicId);
}