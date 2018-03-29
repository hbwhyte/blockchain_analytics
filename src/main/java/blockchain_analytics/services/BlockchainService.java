package blockchain_analytics.services;

import blockchain_analytics.model.BlockchainResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BlockchainService {

    @Autowired
    RestTemplate restTemplate;

    public BlockchainResponse connect() {
        String fQuery = "https://api.blockcypher.com/v1/btc/main";

        ResponseEntity<BlockchainResponse> responseEntity =
                restTemplate.getForEntity(fQuery, BlockchainResponse.class);

        BlockchainResponse response = responseEntity.getBody();

        return response;
    }
}
