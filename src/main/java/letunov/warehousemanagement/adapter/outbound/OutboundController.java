package letunov.warehousemanagement.adapter.outbound;

import letunov.contracts.dto.ItemDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/out")
@RequiredArgsConstructor
public class OutboundController {
    private final UpdateInventoryState updateInventoryState;

    @GetMapping("/analytics")
    public ResponseEntity<Void> micro10() {
        return updateInventoryState.updateInventoryState(new ItemDto("games", true));
    }
}
