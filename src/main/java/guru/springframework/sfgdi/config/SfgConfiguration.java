package guru.springframework.sfgdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

// A anotação @Configuration marca a classe como sendo um Bean de configuração e acrescenta-o ao Context
@Configuration
// A anotação @ConfigurationProperties faz automaticamente o binding das propriedades que tenham o prefixo 'guru.'
// O nome das propriedades tem que ser exactamente igual ao nome dos membros da classe
@ConfigurationProperties("guru")
public class SfgConfiguration {

    private String username;
    private String password;
    private String jdbcUrl;

    // O problema desta classe é ser um POJO tradicional com gets e sets o que torna o Bean mutável
    // Os objectos de configuração devem ser imutáveis para evitar utilização maliciosa ou erros honestos do programador

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }
}
