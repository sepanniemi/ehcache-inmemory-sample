package fi.essi.spring.ehcache.store.service;

import fi.essi.spring.ehcache.store.model.SampleItem;

/**
 * Created by esaseppala on 18/03/16.
 */
public interface WritableCache extends ReadOnlyCache {

    public void put(SampleItem sampleItem);
}
