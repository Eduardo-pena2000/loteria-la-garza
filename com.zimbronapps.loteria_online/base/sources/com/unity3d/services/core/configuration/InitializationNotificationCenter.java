package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class InitializationNotificationCenter implements IInitializationNotificationCenter {
    private static InitializationNotificationCenter instance;
    private HashMap _sdkListeners = new HashMap();

    public class 1 implements Runnable {
        final /* synthetic */ Map.Entry val$entry;

        public 1(Map.Entry entry) {
            this.val$entry = entry;
        }

        public void run() {
            ((IInitializationListener) this.val$entry.getValue()).onSdkInitialized();
        }
    }

    public class 2 implements Runnable {
        final /* synthetic */ int val$code;
        final /* synthetic */ Map.Entry val$entry;
        final /* synthetic */ ErrorState val$errorState;
        final /* synthetic */ String val$exceptionMessage;

        public 2(Map.Entry entry, String str, ErrorState errorState, int i) {
            this.val$entry = entry;
            this.val$exceptionMessage = str;
            this.val$errorState = errorState;
            this.val$code = i;
        }

        public void run() {
            ((IInitializationListener) this.val$entry.getValue()).onSdkInitializationFailed(this.val$exceptionMessage, this.val$errorState, this.val$code);
        }
    }

    public static InitializationNotificationCenter getInstance() {
        if (instance == null) {
            instance = new InitializationNotificationCenter();
        }
        return instance;
    }

    public void addListener(IInitializationListener iInitializationListener) {
        synchronized (this._sdkListeners) {
            if (iInitializationListener != null) {
                try {
                    this._sdkListeners.put(new Integer(iInitializationListener.hashCode()), iInitializationListener);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void removeListener(IInitializationListener iInitializationListener) {
        synchronized (this._sdkListeners) {
            if (iInitializationListener != null) {
                try {
                    removeListener(new Integer(iInitializationListener.hashCode()));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void triggerOnSdkInitializationFailed(String str, ErrorState errorState, int i) {
        synchronized (this._sdkListeners) {
            try {
                String str2 = "SDK Failed to Initialize due to " + str;
                DeviceLog.error(str2);
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : this._sdkListeners.entrySet()) {
                    if (entry.getValue() != null) {
                        Utilities.runOnUiThread(new 2(entry, str2, errorState, i));
                    } else {
                        arrayList.add((Integer) entry.getKey());
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this._sdkListeners.remove((Integer) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void triggerOnSdkInitialized() {
        synchronized (this._sdkListeners) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : this._sdkListeners.entrySet()) {
                    if (entry.getValue() != null) {
                        Utilities.runOnUiThread(new 1(entry));
                    } else {
                        arrayList.add((Integer) entry.getKey());
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this._sdkListeners.remove((Integer) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void removeListener(Integer num) {
        this._sdkListeners.remove(num);
    }
}
