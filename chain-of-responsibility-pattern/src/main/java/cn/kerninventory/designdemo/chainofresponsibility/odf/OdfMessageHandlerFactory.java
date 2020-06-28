package cn.kerninventory.designdemo.chainofresponsibility.odf;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class OdfMessageHandlerFactory {

    private Package scanPacage;

    public OdfMessageHandlerFactory(Package scanPacage) {
        this.scanPacage = scanPacage;
    }

    public List<OdfMessageHandler> scan() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String packageName = scanPacage.getName();
        List<String> classNames = ScanUtil.getClazzName(packageName, true);
        if (classNames == null || classNames.size() == 0) {
            throw new NullPointerException("Not found class for this package :" + packageName);
        }
        List<OdfMessageHandler> handlers = new ArrayList<>(classNames.size());
        for (String className : classNames) {
            Class<?> clazz = Class.forName(className);
            if (OdfMessageHandler.class.isAssignableFrom(clazz)) {
                Sort sort = clazz.getDeclaredAnnotation(Sort.class);
                int index = 0;
                if (sort != null){
                    index = sort.value();
                }
                Constructor<OdfMessageHandler> constructor = (Constructor<OdfMessageHandler>) clazz.getDeclaredConstructor(Integer.class);
                OdfMessageHandler handler = constructor.newInstance(index);
                handlers.add(handler);
            }
        }
        return handlers;
    }

    public OdfMessageHandler get() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        List<OdfMessageHandler> handlers = scan();
        if (handlers == null || handlers.size() == 0) {
            throw new NullPointerException("Handlers cannot be empty!");
        }
        List<OdfMessageHandler> handlerList = handlers.stream().sorted().collect(Collectors.toList());
        OdfMessageHandler handler = null;
        for (int i = handlerList.size() -1 ; i > 0 ; i --) {
           OdfMessageHandler o1 = handlerList.get(i);
           OdfMessageHandler o2 = handlerList.get(i - 1);
           o2.setNextHandler(o1);
           handler = o2;
        }
        return handler;
    }
}
