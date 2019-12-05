package redis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Baldwin
 * \* E_Mail: baldwin@chancellorhk.com || DikeyWang@163.com
 * \* Date: 2019/12/5
 * \* Time: 18:26
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class JedisDemo1 {

    @Test
    public void demo1(){
        Jedis jedis = new Jedis("120.78.227.84",6379);
        jedis.set("time","2019-12-05");
        String time = jedis.get("time");
        System.out.println(time);
        jedis.close();;
    }
}