package shop.young.common.cache.adapter;

import shop.young.common.cache.bo.CacheNameWithTtlBO;

import java.util.List;

/**
 * @author error-codes【BayMax】
 * @see <a href="www.error-codes.xyz">BayMax Blog</a>
 * @since 2022/4/20 15:42
 * <p>
 * 实现该接口之后，根据缓存的 cacheName 和 ttl 将缓存进行过期处理
 */
public interface CacheTtlAdapter {

    /**
     * 根据缓存的 cacheName 和 Ttl 将缓存进行过期
     *
     * @return 需要独立设置
     */
    List<CacheNameWithTtlBO> listCacheNameWithTtl();
}
