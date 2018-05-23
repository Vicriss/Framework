package org.smart4j.framework.helper;

import org.smart4j.framework.util.ReflectionUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by wybe on 2018/4/9.
 */
public class BeanHelper {

    private static final Map<Class<?>, Object> BEAN_MAP = new HashMap<Class<?>, Object>();

    static {
        Set<Class<?>> beanClassSet = ClassHelper.getBeanClassSet();
        for (Class<?> beanClass : beanClassSet)
            BEAN_MAP.put(beanClass, ReflectionUtil.newInstance(beanClass));
    }

    public static Map<Class<?>, Object> getBeanMap() {
        return BEAN_MAP;
    }

    @SuppressWarnings("unchecked")
    public static <T> T getBean(Class<T> cls) {
        if (!BEAN_MAP.containsKey(cls))
            throw new RuntimeException("can not get bean by class: " + cls);

        return (T) BEAN_MAP.get(cls);
    }

    public static void setBean(Class<?> cls, Object object) {
        BEAN_MAP.put(cls, object);
    }
}
