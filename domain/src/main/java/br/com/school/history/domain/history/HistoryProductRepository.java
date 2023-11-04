package br.com.school.history.domain.history;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryProductRepository extends JpaRepository<HistoryProductEntity, String> {

}
