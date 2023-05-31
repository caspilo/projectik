package configuration;

import dbController.DataBaseJDBCChatController;
import dbController.DataBaseJDBCLinkController;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

@Configuration
@ConditionalOnProperty(prefix = "app", name = "database-access-type", havingValue = "jdbc")
public class JdbcAccessConfiguration {
    @Bean
    DataBaseJDBCLinkController linksService(DataBaseJDBCLinkController linkController){
        return linkController;
    }
    @Bean
    DataBaseJDBCChatController chatsService(DataBaseJDBCChatController chatController){
        return chatController;
    }
    @Bean
        public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:postgresql://localhost:5432/scrapper");
        dataSourceBuilder.username("username");
        dataSourceBuilder.password("123");
        dataSourceBuilder.driverClassName("org.postgresql.Driver");
        return dataSourceBuilder.build();
    }
}
