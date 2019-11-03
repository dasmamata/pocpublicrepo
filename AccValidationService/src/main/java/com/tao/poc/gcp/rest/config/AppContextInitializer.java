package com.tao.poc.gcp.rest.config;

import java.util.Properties;
import java.util.Set;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.YamlProcessor.MatchStatus;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.io.ClassPathResource;

import com.tao.poc.gcp.rest.utils.AppSpringProfile;

@Configuration
public class AppContextInitializer 
{
	@Bean
	@ConditionalOnExpression("'${ACTIVE_PROFILE}'.equals('local')")
	@ConfigurationProperties(prefix = "spring.localdatasource")
	DataSource localDatasource() {
		System.out.println("building localDatasource");
		return DataSourceBuilder.create().build();
	}
	
	@Bean
	@ConditionalOnProperty(name = {"ACTIVE_PROFILE"}, havingValue = AppSpringProfile.POC)
	@ConfigurationProperties(prefix = "spring.gcpdatasource")
	DataSource gcpDatasource() {
		System.out.println("building gcpDatasource");
		return DataSourceBuilder.create().build();
	}

	@Autowired	
	private void initialize(ConfigurableApplicationContext applicationContext) {	
		System.out.println("inside initialize ");

		String activeProfile = applicationContext
				.getEnvironment().getProperty("ACTIVE_PROFILE");
		String actProfile = org.springframework.util.StringUtils.isEmpty(activeProfile) ? "local" : activeProfile;
		System.out.println("actProfile " + actProfile);
		applicationContext.getEnvironment().setActiveProfiles(actProfile);

		YamlPropertiesFactoryBean yaml = new YamlPropertiesFactoryBean();
		yaml.setDocumentMatchers((Properties properties) -> {
			System.out.println("properties " + properties);
			if(!properties.containsKey("spring.profiles")) {
				return MatchStatus.ABSTAIN;
			}
			Set<Object> propSet = properties.keySet(); 
			for(Object prop : propSet) {
				if(((String)prop).equals("spring.profiles")
						&& properties.get(prop)
						.equals(actProfile)) {
					return MatchStatus.FOUND;
				}
			}
			return MatchStatus.NOT_FOUND;
		});
		yaml.setResources(new ClassPathResource("springrestpoc1.yml"));
		Properties appProp = yaml.getObject();
		applicationContext.getEnvironment().getPropertySources().
		addFirst(new PropertiesPropertySource("springrestpoc1",appProp));
		System.out.println("yaml.getObject() " + applicationContext.getEnvironment() + " " + appProp);
	}
}
