package fi.essi.spring.ehcache.reader;

import fi.essi.spring.ehcache.store.service.ReadOnlyCache;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by esaseppala on 18/03/16.
 */
@Slf4j
public class TestCacheReader {

    private ReadOnlyCache readOnlyCache;

    @Autowired
    public TestCacheReader(ReadOnlyCache readOnlyCache) {
        this.readOnlyCache = readOnlyCache;
    }

    @Scheduled(fixedDelay = 3000L)
    public void pollCache(){
        log.info("Cache keys: {}", readOnlyCache.keys());
    }
}
