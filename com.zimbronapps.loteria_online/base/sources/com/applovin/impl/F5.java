package com.applovin.impl;

import android.content.IntentFilter;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class f5 {
    private final Set a = new HashSet(32);
    private final Object b = new Object();

    public boolean a(String str) {
        synchronized (this.b) {
            try {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    if (str.equals(((g5) it.next()).b())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        g5 a;
        if (StringUtils.isValidString(str)) {
            synchronized (this.b) {
                a = a(str, appLovinCommunicatorSubscriber);
            }
            if (a != null) {
                a.a(false);
                AppLovinBroadcastManager.unregisterReceiver(a);
            }
        }
    }

    public boolean a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        if (appLovinCommunicatorSubscriber != null && StringUtils.isValidString(str)) {
            synchronized (this.b) {
                try {
                    g5 a = a(str, appLovinCommunicatorSubscriber);
                    if (a != null) {
                        com.applovin.impl.sdk.o.h("AppLovinCommunicator", "Attempting to re-subscribe subscriber (" + appLovinCommunicatorSubscriber + ") to topic (" + str + ")");
                        if (!a.c()) {
                            a.a(true);
                            AppLovinBroadcastManager.registerReceiver(a, new IntentFilter(str));
                        }
                        return true;
                    }
                    g5 g5Var = new g5(str, appLovinCommunicatorSubscriber);
                    this.a.add(g5Var);
                    AppLovinBroadcastManager.registerReceiver(g5Var, new IntentFilter(str));
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        com.applovin.impl.sdk.o.h("AppLovinCommunicator", "Unable to subscribe - invalid subscriber (" + appLovinCommunicatorSubscriber + ") or topic (" + str + ")");
        return false;
    }

    private g5 a(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        for (g5 g5Var : this.a) {
            if (str.equals(g5Var.b()) && appLovinCommunicatorSubscriber.equals(g5Var.a())) {
                return g5Var;
            }
        }
        return null;
    }
}
