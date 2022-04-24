package shop.young.auth.adapter;

import com.anji.captcha.service.CaptchaCacheService;

/**
 * @author error-codes【BayMax】
 * @see <a href="www.error-codes.xyz">BayMax Blog</a>
 * @since 2022/4/24 14:04
 * 适配验证码在 Redis 中的存储
 */
public class CaptchaCacheServiceRedisImpl implements CaptchaCacheService {


    @Override
    public void set(String s, String s1, long l) {

    }

    @Override
    public boolean exists(String s) {
        return false;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public String get(String s) {
        return null;
    }

    @Override
    public String type() {
        return null;
    }
}
