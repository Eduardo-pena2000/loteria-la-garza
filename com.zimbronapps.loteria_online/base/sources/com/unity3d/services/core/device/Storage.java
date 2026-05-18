package com.unity3d.services.core.device;

import Da.D;
import Da.v;
import Qa.l;
import Za.c;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import fb.P;
import fb.z;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class Storage extends JsonStorage {
    public static final Companion Companion = new Companion(null);
    private static final z onStorageEventCallbacks = P.a(v.n());
    private final String _targetFileName;
    private final StorageManager.StorageType type;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final void addStorageEventCallback(l callback) {
            Object value;
            t.g(callback, "callback");
            z access$getOnStorageEventCallbacks$cp = Storage.access$getOnStorageEventCallbacks$cp();
            do {
                value = access$getOnStorageEventCallbacks$cp.getValue();
            } while (!access$getOnStorageEventCallbacks$cp.e(value, D.w0((List) value, callback)));
        }

        public final void removeStorageEventCallback(l callback) {
            Object value;
            t.g(callback, "callback");
            z access$getOnStorageEventCallbacks$cp = Storage.access$getOnStorageEventCallbacks$cp();
            do {
                value = access$getOnStorageEventCallbacks$cp.getValue();
            } while (!access$getOnStorageEventCallbacks$cp.e(value, D.u0((List) value, callback)));
        }

        private Companion() {
        }
    }

    public Storage(String _targetFileName, StorageManager.StorageType type) {
        t.g(_targetFileName, "_targetFileName");
        t.g(type, "type");
        this._targetFileName = _targetFileName;
        this.type = type;
    }

    public static final /* synthetic */ z access$getOnStorageEventCallbacks$cp() {
        return onStorageEventCallbacks;
    }

    public synchronized boolean clearStorage() {
        clearData();
        return new File(this._targetFileName).delete();
    }

    public final StorageManager.StorageType getType() {
        return this.type;
    }

    public final synchronized boolean initStorage() {
        readStorage();
        super.initData();
        return true;
    }

    public synchronized boolean readStorage() {
        byte[] readFileBytes;
        boolean z = false;
        try {
            try {
                readFileBytes = Utilities.readFileBytes(new File(this._targetFileName));
            } catch (FileNotFoundException e) {
                DeviceLog.debug("Storage JSON file not found in local cache:", e);
            }
        } catch (Exception e2) {
            DeviceLog.debug("Failed to read storage JSON file:", e2);
        }
        if (readFileBytes == null) {
            return false;
        }
        setData(new JSONObject(new String(readFileBytes, c.b)));
        z = true;
        return z;
    }

    public final synchronized void sendEvent(StorageEvent storageEvent, Object obj) {
        List list = (List) onStorageEventCallbacks.getValue();
        if (list.isEmpty()) {
            if (!(WebViewApp.getCurrentApp() != null ? WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.STORAGE, storageEvent, this.type.name(), obj) : false)) {
                DeviceLog.debug("Couldn't send storage event to WebApp");
            }
            return;
        }
        t.d(storageEvent);
        StorageEventInfo storageEventInfo = new StorageEventInfo(storageEvent, this.type, obj);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((l) it.next()).invoke(storageEventInfo);
        }
    }

    public final synchronized boolean storageFileExists() {
        return new File(this._targetFileName).exists();
    }

    public synchronized boolean writeStorage() {
        File file = new File(this._targetFileName);
        if (getData() == null) {
            return false;
        }
        return Utilities.writeFile(file, getData().toString());
    }
}
