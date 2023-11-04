package br.com.school.history.domain.kafka.product;

import br.com.school.history.domain.history.HistoryProductEntity;
import br.com.school.history.domain.history.HistoryProductService;
import br.com.school.history.domain.kafka.KafkaTopicNames;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductConsumer {

    private final HistoryProductService service;

    @KafkaListener(id = "productConsumer", topics = KafkaTopicNames.PRODUCT_TOPIC, containerFactory = "productEventKafkaListenerContainerFactory")
    public void listen(ProductEvent event) {
        log.info("consume product {}", event.id());
        final var historyEntity = HistoryProductEntity.create(event.id(), event.stock(),
            event.eventType());
        service.save(historyEntity);
    }

}
