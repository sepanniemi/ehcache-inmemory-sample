package fi.essi.spring.ehcache.store;

import fi.essi.spring.ehcache.store.service.CacheTestFill;
import fi.essi.spring.ehcache.store.service.WritableCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableCaching
@EnableScheduling
@SpringBootApplication
public class SampleCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleCacheApplication.class, args);
	}

	@Bean
	public CacheTestFill cacheTestFill(WritableCache cache){
		return new CacheTestFill(cache);
	}
}
