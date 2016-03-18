package fi.essi.spring.ehcache.store;

import fi.essi.spring.ehcache.store.service.SampleCache;
import fi.essi.spring.ehcache.store.service.WritableCache;
import net.sf.ehcache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CacheConfiguration{

    @Bean
    public WritableCache writableCache(CacheManager cacheManager){
        return new SampleCache(cacheManager.getCache("sample"));
    }
}