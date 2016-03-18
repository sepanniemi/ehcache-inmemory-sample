package fi.essi.spring.ehcache.store.api;

import fi.essi.spring.ehcache.store.model.SampleItem;
import fi.essi.spring.ehcache.store.service.WritableCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by esaseppala on 18/03/16.
 */
@RestController
@RequestMapping("/token")
public class CacheCrudResource {
    private WritableCache sampleCache;

    @Autowired
    public CacheCrudResource(WritableCache sampleCache) {
        this.sampleCache = sampleCache;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping("")
    public void post(SampleItem sampleItem){
        sampleCache.put(sampleItem);
    }

}
