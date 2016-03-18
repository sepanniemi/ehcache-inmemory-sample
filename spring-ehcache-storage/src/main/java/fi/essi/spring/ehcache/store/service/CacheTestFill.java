package fi.essi.spring.ehcache.store.service;

import fi.essi.spring.ehcache.store.model.SampleItem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

/**
 * Created by esaseppala on 18/03/16.
 */
@Slf4j
public class CacheTestFill {
    private WritableCache cache;

    public CacheTestFill(WritableCache cache) {
        this.cache = cache;
        this.cache.put( new SampleItem("initial_test"));
        log.info("Initial put done.");
    }

    @Scheduled(fixedDelay = 3000L)
    public void putTimestampToCache(){
        SampleItem item = new SampleItem(LocalDateTime.now().toString());
        cache.put(item);
        log.info("Cache updated with: {}", item);
    }
}
