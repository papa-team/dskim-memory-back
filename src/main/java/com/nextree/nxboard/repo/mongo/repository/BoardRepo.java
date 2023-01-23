package com.nextree.nxboard.repo.mongo.repository;

import com.nextree.nxboard.repo.mongo.doc.BoardDoc;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface BoardRepo extends MongoRepository<BoardDoc, String> {
  //
  List<BoardDoc> findAll();
  Optional<BoardDoc> findById(String id);

}
