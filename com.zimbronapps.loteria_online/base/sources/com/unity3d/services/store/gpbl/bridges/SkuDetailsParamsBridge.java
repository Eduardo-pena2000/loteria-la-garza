package com.unity3d.services.store.gpbl.bridges;

import com.android.billingclient.api.SkuDetailsParams;
import com.unity3d.services.core.reflection.GenericBridge;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class SkuDetailsParamsBridge extends GenericBridge {
    private static final String newBuilderMethodName = "newBuilder";
    private static final Map staticMethods = new 1();
    private final Object _skuDetailsParamsInternalInstance;

    public class 1 extends HashMap {
        public 1() {
            put("newBuilder", new Class[0]);
        }
    }

    public class 2 extends HashMap {
        public 2() {
            put("newBuilder", new Class[0]);
        }
    }

    public static class BuilderBridge extends GenericBridge {
        private static final String buildMethodName = "build";
        private static final String setSkusListMethodName = "setSkusList";
        private static final String setTypeMethodName = "setType";
        private Object _skuDetailsParamsBuilderInternalInstance;

        public class 1 extends HashMap {
            public 1() {
                put("build", new Class[0]);
                put("setSkusList", new Class[]{List.class});
                put("setType", new Class[]{String.class});
            }
        }

        public BuilderBridge(Object obj) {
            super(new 1());
            this._skuDetailsParamsBuilderInternalInstance = obj;
        }

        public SkuDetailsParamsBridge build() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
            return new SkuDetailsParamsBridge(callNonVoidMethod("build", this._skuDetailsParamsBuilderInternalInstance, new Object[0]));
        }

        public String getClassName() {
            return "com.android.billingclient.api.SkuDetailsParams$Builder";
        }

        public BuilderBridge setSkuList(List list) {
            this._skuDetailsParamsBuilderInternalInstance = callNonVoidMethod("setSkusList", this._skuDetailsParamsBuilderInternalInstance, list);
            return this;
        }

        public BuilderBridge setType(String str) {
            this._skuDetailsParamsBuilderInternalInstance = callNonVoidMethod("setType", this._skuDetailsParamsBuilderInternalInstance, str);
            return this;
        }
    }

    public SkuDetailsParamsBridge(Object obj) {
        super(new 2());
        this._skuDetailsParamsInternalInstance = obj;
    }

    public static Object callNonVoidStaticMethod(String str, Object... objArr) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        return getClassForBridge().getMethod(str, (Class[]) staticMethods.get(str)).invoke((Object) null, objArr);
    }

    public static Class getClassForBridge() throws ClassNotFoundException {
        return SkuDetailsParams.class;
    }

    public static BuilderBridge newBuilder() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        return new BuilderBridge(callNonVoidStaticMethod("newBuilder", new Object[0]));
    }

    public String getClassName() {
        return "com.android.billingclient.api.SkuDetailsParams";
    }

    public Object getInternalInstance() {
        return this._skuDetailsParamsInternalInstance;
    }
}
