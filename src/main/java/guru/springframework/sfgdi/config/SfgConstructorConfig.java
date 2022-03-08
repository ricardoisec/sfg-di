package guru.springframework.sfgdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

// @ConstructorBinding indica que as propriedades devem ser definidas com recurso a argumentos do construtor ao invés de sets
// Exige que na classe de configuração esteja presente a anotação @EnableConfigurationProperties
@ConstructorBinding
@ConfigurationProperties("guru")
public class SfgConstructorConfig {
    private final String username;
    private final String password;
    private final String jdbcUrl;

    public SfgConstructorConfig(String username, String password, String jdbcUrl) {
        this.username = username;
        this.password = password;
        this.jdbcUrl = jdbcUrl;
    }

    // Para tornar o Bean imutável não estão disponíveis sets, apenas gets

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }
}
