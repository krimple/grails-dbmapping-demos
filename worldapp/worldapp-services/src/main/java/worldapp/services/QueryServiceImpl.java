package worldapp.services;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;


public class QueryServiceImpl implements QueryService {

	private JdbcTemplate template;
	
	public QueryServiceImpl(DataSource datasource) {
		this.template = new JdbcTemplate(datasource);
	}
	
	@Transactional(readOnly = true)
	public int countCountries() {
		return template.queryForInt("select count(*) from country");
	}
}
