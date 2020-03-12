package cn.xpbootcamp.legacy_code.service;

import cn.xpbootcamp.legacy_code.repository.UserRepository;
import cn.xpbootcamp.legacy_code.repository.UserRepositoryImplMock;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WalletServiceImplTest {

    private UserRepository userRepository = new UserRepositoryImplMock();
    private WalletService walletService = new WalletServiceImpl(userRepository);

    @Test
    void should_return_transaction_id_when_buyer_balance_more_than_amount() {
        String result = walletService.moveMoney("transaction1", 12L, 13L, 99);
        assertThat(result).endsWith("transaction1");
    }

    @Test
    void should_return_null_when_buyer_balance_less_than_amount() {
        String result = walletService.moveMoney("transaction1", 12L, 13L, 101);
        assertThat(result).isNull();
    }
}