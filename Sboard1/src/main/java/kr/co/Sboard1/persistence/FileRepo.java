package kr.co.Sboard1.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.Sboard1.entity.FileEntity;

@Repository
public interface FileRepo extends JpaRepository<FileEntity, Integer>{
	
}
