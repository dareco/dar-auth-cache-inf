package kz.dar.auth.cache.exception;

/**
 * @author sabyrzhan.tynybayev@greenapple.kz
 */
public class CacheObjectNotFoundException extends Exception {
    public CacheObjectNotFoundException(String key) {
        super("Cache object with key=" + key + " not found");
    }
}