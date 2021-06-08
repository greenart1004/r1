package com.FRONT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FRONT.model.Board;



public interface BoardRepository extends JpaRepository<Board, Long> {
}