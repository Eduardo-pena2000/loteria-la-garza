package org.apache.tika.utils;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.tika.config.Field;
import org.apache.tika.config.Param;
import org.apache.tika.config.ParamField;
import org.apache.tika.config.TikaConfig;
import org.apache.tika.exception.TikaConfigException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class AnnotationUtils {
    private static final Wb.c LOG = Wb.e.l(AnnotationUtils.class);
    private static final Map PARAM_INFO = new HashMap();

    public static void assignFieldParams(Object obj, Map map) throws TikaConfigException {
        Class cls = obj.getClass();
        Map map2 = PARAM_INFO;
        if (!map2.containsKey(cls)) {
            synchronized (TikaConfig.class) {
                try {
                    if (!map2.containsKey(cls)) {
                        List collectInfo = collectInfo(cls, Field.class);
                        ArrayList arrayList = new ArrayList(collectInfo.size());
                        Iterator it = collectInfo.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new ParamField((AccessibleObject) it.next()));
                        }
                        PARAM_INFO.put(cls, arrayList);
                    }
                } finally {
                }
            }
        }
        for (ParamField paramField : (List) PARAM_INFO.get(cls)) {
            Param param = (Param) map.get(paramField.getName());
            if (param != null) {
                if (!paramField.getType().isAssignableFrom(param.getType())) {
                    throw new TikaConfigException(String.format(Locale.ROOT, "Value '%s' of type '%s' can't be assigned to field '%s' of defined type '%s'", new Object[]{param.getValue(), param.getValue().getClass(), paramField.getName(), paramField.getType()}));
                }
                try {
                    paramField.assignValue(obj, param.getValue());
                } catch (InvocationTargetException e) {
                    e = e;
                    LOG.s("Error assigning value '{}' to '{}'", param.getValue(), param.getName());
                    if (e.getCause() != null) {
                        e = e.getCause();
                    }
                    throw new TikaConfigException(e.getMessage(), e);
                } catch (IllegalAccessException e2) {
                    LOG.s("Error assigning value '{}' to '{}'", param.getValue(), param.getName());
                    throw new TikaConfigException(e2.getMessage(), e2);
                }
            } else {
                if (paramField.isRequired()) {
                    throw new TikaConfigException(String.format(Locale.ROOT, "Param %s is required for %s, but it is not given in config.", new Object[]{paramField.getName(), obj.getClass().getName()}));
                }
                LOG.debug("Param not supplied, field is not mandatory");
            }
        }
    }

    private static List collectInfo(Class cls, Class cls2) {
        ArrayList<AccessibleObject> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (cls != null && cls != Object.class) {
            arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
            arrayList.addAll(Arrays.asList(cls.getDeclaredMethods()));
            cls = cls.getSuperclass();
        }
        for (AccessibleObject accessibleObject : arrayList) {
            if (accessibleObject.isAnnotationPresent(cls2)) {
                accessibleObject.setAccessible(true);
                arrayList2.add(accessibleObject);
            }
        }
        return arrayList2;
    }
}
