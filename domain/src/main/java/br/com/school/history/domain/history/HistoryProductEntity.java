package br.com.school.history.domain.history;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "history_product")
@Getter
@NoArgsConstructor
public class HistoryProductEntity {

    @Id
    private String id;
    @Column(name = "product_id")
    private String productId;
    private BigDecimal stock;
    @Enumerated(EnumType.STRING)
    @Column(name = "event_type")
    private EventType eventType;
    @Column(name = "registration_date")
    private OffsetDateTime registrationDate;

    private HistoryProductEntity(final String id,
                                 final String productId,
                                 final BigDecimal stock,
                                 final EventType eventType) {
        this.id = id;
        this.productId = productId;
        this.stock = stock;
        this.eventType = eventType;
        this.registrationDate = OffsetDateTime.now();
    }

    public static HistoryProductEntity create(final String productId,
                                              final BigDecimal stock,
                                              final EventType eventType) {
        String id = UUID.randomUUID().toString();
        return new HistoryProductEntity(id, productId, stock, eventType);
    }
}
