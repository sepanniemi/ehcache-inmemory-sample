package fi.essi.spring.ehcache.store.service;

import fi.essi.spring.ehcache.store.model.SampleItem;
import lombok.extern.slf4j.Slf4j;
import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;

import java.util.List;

@Slf4j
public class SampleCache implements WritableCache {

    private Ehcache cache;

    public SampleCache(Ehcache cache) {
        this.cache = cache;
        log.info("Cache {} created.", cache.getName() );
    }

    public void put(SampleItem sampleItem){
        cache.put( new Element(sampleItem.getJti(), sampleItem));
    }

    public SampleItem get(String jti){
        return (SampleItem) cache.get( jti ).getObjectValue();
    }

    public List<Object> keys(){
        return cache.getKeys();
    }
}
