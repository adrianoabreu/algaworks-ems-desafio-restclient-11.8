package algaworks.ems.desafio.restclient.algaworks.domain.repository;

import algaworks.ems.desafio.restclient.algaworks.domain.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CommentRepository extends JpaRepository<Comment, UUID> {
}