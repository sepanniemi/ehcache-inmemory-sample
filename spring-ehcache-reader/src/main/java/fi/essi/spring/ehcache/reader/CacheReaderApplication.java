package fi.essi.spring.ehcache.reader;

import fi.essi.spring.ehcache.store.EnableSampleCache;
import fi.essi.spring.ehcache.store.service.ReadOnlyCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableCaching
@EnableScheduling
@EnableSampleCache
public class CacheReaderApplication {

//	private SampleCac

	public static void main(String[] args) {
		SpringApplication.run(CacheReaderApplication.class, args);
	}

	@Bean
	public TestCacheReader testCacheReader(ReadOnlyCache readOnlyCache){
		return new TestCacheReader(readOnlyCache);
	}
}
