package com.unity3d.services.ads.gmascar.bridges;

import com.google.android.gms.ads.initialization.InitializationStatus;
import com.unity3d.services.ads.gmascar.listeners.IInitializationStatusListener;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.reflection.GenericBridge;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class InitializeListenerBridge extends GenericBridge {
    private static final String initializationCompleteMethodName = "onInitializationComplete";
    private IInitializationStatusListener _initializationStatusListener;

    public class 1 extends HashMap {
        public 1() throws RuntimeException, Error {
            try {
                put("onInitializationComplete", new Class[]{InitializationStatus.class});
            } catch (ClassNotFoundException e) {
                DeviceLog.debug("Could not find class \"com.google.android.gms.ads.initialization.InitializationStatus\" %s", e.getLocalizedMessage());
            }
        }
    }

    public class 2 implements InvocationHandler {
        public 2() {
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (!method.getName().equals("onInitializationComplete") || InitializeListenerBridge.access$000(InitializeListenerBridge.this) == null) {
                return null;
            }
            InitializeListenerBridge.access$000(InitializeListenerBridge.this).onInitializationComplete(objArr[0]);
            return null;
        }
    }

    public InitializeListenerBridge() {
        super(new 1());
    }

    public static /* synthetic */ IInitializationStatusListener access$000(InitializeListenerBridge initializeListenerBridge) {
        return initializeListenerBridge._initializationStatusListener;
    }

    public Object createInitializeListenerProxy() {
        try {
            return Proxy.newProxyInstance(classForName().getClassLoader(), new Class[]{classForName()}, new 2());
        } catch (Exception unused) {
            DeviceLog.debug("ERROR: Could not create InitializeCompletionListener");
            return null;
        }
    }

    public String getClassName() {
        return "com.google.android.gms.ads.initialization.OnInitializationCompleteListener";
    }

    public void setStatusListener(IInitializationStatusListener iInitializationStatusListener) {
        this._initializationStatusListener = iInitializationStatusListener;
    }
}
