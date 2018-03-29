package blockchain_analytics.controllers;


import blockchain_analytics.model.BlockchainResponse;
import blockchain_analytics.services.BlockchainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/block")
public class BlockchainController {

    @Autowired
    BlockchainService blockchainService;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public BlockchainResponse connect() {
        return blockchainService.connect();
    }

}
