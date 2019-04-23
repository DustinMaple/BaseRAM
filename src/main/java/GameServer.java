import com.maple.persistence.core.Persister;
import com.maple.persistence.example.entity.AccountEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public class GameServer {
    private static final Logger logger = LogManager.getLogger();

    @Autowired
    private Persister persister;

    public void test() {

        AccountEntity entity = new AccountEntity();
        entity.setAccountId("111");
        entity.setNickName("无敌");

//        persister.save(entity);
    }
}
