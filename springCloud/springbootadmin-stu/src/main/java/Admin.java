import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 * @author:TianZhenYu
 * @date:2019/7/21
 * @description:PACKAGE_NAME springbootadminstu
 */
@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class Admin {
    public static void main(String[] args) {
        SpringApplication.run(Admin.class, args);
    }
}
