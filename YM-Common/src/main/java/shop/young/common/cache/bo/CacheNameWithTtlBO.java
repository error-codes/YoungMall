package shop.young.common.cache.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author error-codes【BayMax】
 * @see <a href="www.error-codes.xyz">BayMax Blog</a>
 * @since 2022/4/20 15:37
 * <p>
 * 通过 cacheName 配置 和 时间 告诉缓存多久清除
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CacheNameWithTtlBO {

    private String cacheName;

    private Long ttl;
}
