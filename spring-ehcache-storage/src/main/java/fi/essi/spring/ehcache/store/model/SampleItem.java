package fi.essi.spring.ehcache.store.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by esaseppala on 18/03/16.
 */
@Data
@AllArgsConstructor
public class SampleItem implements Serializable{
    private String jti;
}
