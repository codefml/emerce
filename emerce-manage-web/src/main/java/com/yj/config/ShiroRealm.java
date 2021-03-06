package com.yj.config;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ShiroRealm.java：shiro权限认证的具体实现代码，因为shiro本身只提供拦截路由，而具体如何数据源则由用户自己提供，不同的项目不同的要求，要不要加缓存登陆验证次数，要不要密码加密设置其他具体方式，这些都由用户自己决定，而shiro只提供给用户权限验证的格式接口，通过用户提供的数据源shrio判断要不要给具体用户授权请求路径的判断。
 ShiroRealm 涉及到以下点：
 principal:主体，就是登陆的当前用户类型的数据实体
 credentials：凭证，用户的密码，具体加密方式用户自己实现，什么都不做就是原文
 Roles：用户拥有的角色标识（角色名称，admin,account,customer_service），字符串格式列表:用户拥有多个角色的可能
 Permissions：用户拥有的权限标识（每个权限唯一标识，比如主键或者权限唯一标识编码），字符串格式列表：用户拥有多个权限的可能
 原文：https://blog.csdn.net/zjcjava/article/details/71606144?utm_source=copy
 *https://blog.csdn.net/zjcjava/article/details/71606144
 * */
public class ShiroRealm extends AuthorizingRealm{
    public static Logger logger=LoggerFactory.getLogger(ShiroRealm.class);
    //授权-登录后访问授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }
    //认证-登录认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        return null;
    }
}
