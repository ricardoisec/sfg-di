package guru.springframework.sfgdi.datasource;

/**
 * Este ficheiro finge ser um POJO com as definições de uma datasource para demonstrar a forma de aceder a propriedades
 * externas
 */
public class FakeDataSource {

    private String username;
    private String password;
    private String jdbcUrl;

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
