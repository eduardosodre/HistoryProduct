package br.com.school.history.domain.history;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HistoryProductService {

    private final HistoryProductRepository repository;

    public void save(HistoryProductEntity entity) {
        repository.save(entity);
    }
}
