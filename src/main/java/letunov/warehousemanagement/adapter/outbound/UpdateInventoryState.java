package letunov.warehousemanagement.adapter.outbound;

import letunov.contract.ContractConsumer;
import letunov.contracts.UpdateInventoryStateContract;
import letunov.contracts.dto.ItemDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@ContractConsumer(serviceName = "analytics")
public class UpdateInventoryState implements UpdateInventoryStateContract {
    @Value("${integration.analytics-url}")
    private String analyticsUrl;

    @Override
    public ResponseEntity<Void> updateInventoryState(ItemDto dto) {
        return WebClient.create(analyticsUrl)
                .post()
                .bodyValue(dto)
                .retrieve()
                .toBodilessEntity()
                .block();
    }
}
