package tennis.practice.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import tennis.practice.domain.Board;

@Repository
@RequiredArgsConstructor
public class BoardRepositoryImpl implements BoardRepositoryInterface{

  @PersistenceContext
  private final EntityManager em;

  public Board findOne(Long boardId) {
    return em.find(Board.class, boardId);
  }
}
