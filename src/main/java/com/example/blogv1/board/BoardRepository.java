package com.example.blogv1.board;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class BoardRepository {

    //JPA는 EntityManager로 DB에 접근한다.
    private final EntityManager em; // native 쿼리....

    public List<Board> findAll() {
        Query q = em.createNativeQuery("select * from board_tb order by id desc",Board.class);
     //   List<Board> list = q.getResultList();
     //   return list;
        return q.getResultList();
    }

}
