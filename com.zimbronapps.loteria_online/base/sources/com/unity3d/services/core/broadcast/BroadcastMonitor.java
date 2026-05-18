package com.unity3d.services.core.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class BroadcastMonitor {
    private static BroadcastMonitor _instance;
    private final Context _context;
    private Map _eventReceivers;

    private BroadcastMonitor(Context context) {
        this._context = context;
    }

    public static synchronized BroadcastMonitor getInstance() {
        BroadcastMonitor broadcastMonitor;
        synchronized (BroadcastMonitor.class) {
            try {
                if (_instance == null) {
                    _instance = new BroadcastMonitor(ClientProperties.getApplicationContext());
                }
                broadcastMonitor = _instance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return broadcastMonitor;
    }

    public void addBroadcastListener(String str, String str2, String[] strArr) {
        removeBroadcastListener(str);
        IntentFilter intentFilter = new IntentFilter();
        for (String str3 : strArr) {
            intentFilter.addAction(str3);
        }
        if (str2 != null) {
            intentFilter.addDataScheme(str2);
        }
        if (this._eventReceivers == null) {
            this._eventReceivers = new HashMap();
        }
        BroadcastEventReceiver broadcastEventReceiver = new BroadcastEventReceiver(str);
        this._eventReceivers.put(str, broadcastEventReceiver);
        this._context.registerReceiver(broadcastEventReceiver, intentFilter);
    }

    public void removeAllBroadcastListeners() {
        Map map = this._eventReceivers;
        if (map != null) {
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                this._context.unregisterReceiver((BroadcastReceiver) this._eventReceivers.get((String) it.next()));
            }
            this._eventReceivers = null;
        }
    }

    public void removeBroadcastListener(String str) {
        Map map = this._eventReceivers;
        if (map == null || !map.containsKey(str)) {
            return;
        }
        this._context.unregisterReceiver((BroadcastReceiver) this._eventReceivers.get(str));
        this._eventReceivers.remove(str);
    }
}
