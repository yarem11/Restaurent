package com.restaurent.mangment.repo;

import com.restaurent.mangment.model.restaurent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface restaurentRepo extends JpaRepository<restaurent,Long> {
}
 