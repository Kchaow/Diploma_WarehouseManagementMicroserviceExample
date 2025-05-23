package letunov.warehousemanagement.adapter.rest;

import letunov.contract.ContractProvider;
import letunov.contracts.ReserveItemsContract;
import letunov.contracts.dto.ReserveItemsDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ContractProvider
public class WarehouseManagementController implements ReserveItemsContract {
    @PutMapping("/inventory/reserve")
    public ResponseEntity<Void> reserveItems(@RequestBody ReserveItemsDto reserveItemsDto) {
        return ResponseEntity.ok().build();
    }
}
