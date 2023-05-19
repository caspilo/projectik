package repositories;

import entity.Link;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface JdbcLinkRepository extends Repository<Link, Long> {
    List<Link> findAll();
}
