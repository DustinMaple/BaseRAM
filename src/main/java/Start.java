import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    private static final Logger logger = LogManager.getLogger();
    private static ClassPathXmlApplicationContext context;

    public static void main(String[] args) {
        try {
            // 注册关服逻辑
            Runtime.getRuntime().addShutdownHook(new Thread(Start::shutdown));

            // 启动spring
            context = new ClassPathXmlApplicationContext("springConfig.xml");
            context.start();

            // 启动服务器
            GameServer server = context.getBean(GameServer.class);
            server.test();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    private static void shutdown() {
        logger.info("服务器停止");
    }
}
