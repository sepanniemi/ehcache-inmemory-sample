package fi.essi.spring.ehcache.store.service;

import fi.essi.spring.ehcache.store.model.SampleItem;

import java.util.List;

/**
 * Created by esaseppala on 18/03/16.
 */
public interface ReadOnlyCache {

    SampleItem get(String jti);

    List<Object> keys();
}
