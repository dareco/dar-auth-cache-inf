package kz.dar.auth.cache;


import kz.dar.auth.cache.exception.CacheObjectNotFoundException;

/**
 * @author sabyrzhan.tynybayev@greenapple.kz
 */
public interface CacheService {
    void add(String key, Object value);
    Object get(String key) throws CacheObjectNotFoundException;
    void delete(String key);
}