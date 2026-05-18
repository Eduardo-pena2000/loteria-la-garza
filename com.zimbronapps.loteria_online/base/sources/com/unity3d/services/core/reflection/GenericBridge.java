package com.unity3d.services.core.reflection;

import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class GenericBridge {
    private final String _className;
    private final Map _functionAndParameters;
    private final Map _methodMap;
    private boolean _methodMapBuilt;
    private final boolean enableLogging;

    public GenericBridge(Map map) {
        this(map, true);
    }

    private void buildMethodMap() {
        boolean z = true;
        for (Map.Entry entry : getFunctionMap().entrySet()) {
            Class[] clsArr = (Class[]) entry.getValue();
            try {
                Method reflectiveMethod = getReflectiveMethod(classForName(), (String) entry.getKey(), clsArr);
                if (reflectiveMethod != null) {
                    this._methodMap.put((String) entry.getKey(), reflectiveMethod);
                }
            } catch (Exception unused) {
                if (this.enableLogging) {
                    DeviceLog.debug("ERROR: Could not find %s class with method %s and parameters : %s", this._className, entry.getKey(), clsArr);
                }
                z = false;
            }
        }
        this._methodMapBuilt = z;
    }

    private Method getMethod(String str) {
        return (Method) this._methodMap.get(str);
    }

    private Method getReflectiveMethod(Class cls, String str, Class... clsArr) {
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (Exception e) {
            if (this.enableLogging) {
                DeviceLog.debug("ERROR: Could not find method %s in %s", str, cls.getName() + " " + e.getLocalizedMessage());
            }
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.GMA, c.F, new Object[0]);
            return null;
        }
    }

    public Object callNonVoidMethod(String str, Object obj, Object... objArr) {
        Method method = getMethod(str);
        if (method == null) {
            if (this.enableLogging) {
                DeviceLog.debug("ERROR: Could not find method %s", str);
            }
            return null;
        }
        try {
            return method.invoke(obj, objArr);
        } catch (Exception e) {
            if (this.enableLogging) {
                DeviceLog.debug("ERROR: Could not invoke method %s : %s", str, e.getLocalizedMessage());
            }
            return null;
        }
    }

    public void callVoidMethod(String str, Object obj, Object... objArr) {
        Method method = getMethod(str);
        if (method == null) {
            DeviceLog.debug("ERROR: Could not find method %s", str);
            return;
        }
        try {
            method.invoke(obj, objArr);
        } catch (Exception e) {
            DeviceLog.debug("ERROR: Could not invoke method %s : %s", str, e.getLocalizedMessage());
        }
    }

    public Class classForName() {
        try {
            return Class.forName(this._className);
        } catch (ClassNotFoundException e) {
            if (!this.enableLogging) {
                return null;
            }
            DeviceLog.debug("ERROR: Could not find Class %s %s", this._className, e.getLocalizedMessage());
            return null;
        }
    }

    public boolean exists() {
        if (classForName() == null) {
            if (this.enableLogging) {
                DeviceLog.debug("ERROR: Could not find class %s", this._className);
            }
            return false;
        }
        if (!this._methodMapBuilt) {
            buildMethodMap();
        }
        return this._methodMap.size() == getFunctionMap().size();
    }

    public abstract String getClassName();

    public Map getFunctionMap() {
        return this._functionAndParameters;
    }

    public GenericBridge(Map map, boolean z) {
        this._methodMapBuilt = false;
        this.enableLogging = z;
        this._className = getClassName();
        this._functionAndParameters = map;
        this._methodMap = new HashMap();
        buildMethodMap();
    }
}
