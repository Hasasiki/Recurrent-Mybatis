package com.hasasiki.re.config;

import org.apache.ibatis.annotations.Mapper;

import javax.sql.DataSource;
import java.util.HashMap;

//配置类Configuration封装mybatis-config.xml文件相关的数据
public class Configuration {
    private String driver;
    private String url;
    private String user;
    private String pwd;

    //2.定义成员变量集合保存Mapper映射类对象
    /*         <mappers>
                    <mapper resource="UserMapper.xml"/>
            </mappers>
     */
    HashMap<String, Mapper> hashMap = new HashMap<>();
    //定义成员变量报错数据库连接池
    private DataSource dataSource;

    @Override
    public String toString() {
        return "Configuration{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", user='" + user + '\'' +
                ", pwd='" + pwd + '\'' +
                ", hashMap=" + hashMap +
                ", dataSource=" + dataSource +
                '}';
    }

    public Configuration() {
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public HashMap<String, Mapper> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<String, Mapper> hashMap) {
        this.hashMap = hashMap;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
