package com.squirrel.boot.GenCode;

import org.apache.commons.lang3.StringUtils;
import org.beetl.sql.core.ClasspathLoader;
import org.beetl.sql.core.ConnectionSource;
import org.beetl.sql.core.ConnectionSourceHelper;
import org.beetl.sql.core.Interceptor;
import org.beetl.sql.core.NameConversion;
import org.beetl.sql.core.SQLLoader;
import org.beetl.sql.core.SQLManager;
import org.beetl.sql.core.UnderlinedNameConversion;
import org.beetl.sql.core.db.DBStyle;
import org.beetl.sql.core.db.MySqlStyle;
import org.beetl.sql.ext.DebugInterceptor;

public class SQLManagerTemplate {
    public SQLManagerTemplate() {
    }

    public ConnectionSource connectionSource() {
        return ConnectionSourceHelper.getSimple(this.driver(), this.url(), this.userName(), this.password());
    }

    public String driver() {
        return "";
    }

    public String url() {
        return "";
    }

    public String userName() {
        return "";
    }

    public String password() {
        return "";
    }

    public DBStyle dbStyle() {
        return new MySqlStyle();
    }

    public SQLLoader loader() {
        return new ClasspathLoader("/sql");
    }

    public NameConversion nameConversion() {
        return new UnderlinedNameConversion();
    }

    protected ConnectionSource connectionSource(String driver, String url, String userName, String password) {
        if (StringUtils.isBlank(driver)) {
            driver = "com.mysql.cj.jdbc.Driver";
        }

        return ConnectionSourceHelper.getSimple(driver, url, userName, password);
    }

    public SQLManager sqlManager(String url, String userName, String password, String driver) {
        return new SQLManager(this.dbStyle(), this.loader(), this.connectionSource(driver, url, userName, password), this.nameConversion(), new Interceptor[]{new DebugInterceptor()});
    }

    public SQLManager sqlManager(String url, String userName, String password) {
        return this.sqlManager(url, userName, password, (String)null);
    }
}
