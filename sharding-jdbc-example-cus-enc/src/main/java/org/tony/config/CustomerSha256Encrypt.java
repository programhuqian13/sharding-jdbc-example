package org.tony.config;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.shardingsphere.encrypt.spi.EncryptAlgorithm;
import org.apache.shardingsphere.encrypt.spi.context.EncryptContext;

import java.util.Objects;
import java.util.Properties;

/**
 * RAS 进行加密或解密
 * @author Tony
 */
public final class CustomerSha256Encrypt implements EncryptAlgorithm<Object, String> {
    private Properties props;
    @Override
    public String encrypt(Object o, EncryptContext encryptContext) {
        if(Objects.isNull(o)){
            return null;
        }
        return DigestUtils.sha256Hex(String.valueOf(o));
    }

    @Override
    public Object decrypt(String o, EncryptContext encryptContext) {
        //因为sha256不可逆，因此直接返回密文
        return o;
    }

    @Override
    public Properties getProps() {
        return this.props;
    }

    @Override
    public void init(Properties properties) {
        this.props = properties;
    }

    @Override
    public String getType() {
        return "SHA256";
    }
}
