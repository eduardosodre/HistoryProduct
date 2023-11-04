package br.com.school.history.domain.kafka.product;

import br.com.school.history.domain.history.EventType;
import java.math.BigDecimal;

public record ProductEvent(String id,
                           String sku,
                           String name,
                           BigDecimal stock,
                           EventType eventType) {
    
}
