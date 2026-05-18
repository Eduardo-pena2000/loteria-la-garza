package com.applovin.communicator;

import android.content.Context;
import com.applovin.impl.communicator.MessagingServiceImpl;
import com.applovin.impl.f5;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class AppLovinCommunicator {
    private static AppLovinCommunicator e;
    private static final Object f = new Object();
    private k a;
    private o b;
    private final f5 c = new f5();
    private final MessagingServiceImpl d = new MessagingServiceImpl();

    public static AppLovinCommunicator getInstance() {
        return getInstance(k.o());
    }

    public void a(k kVar) {
        this.a = kVar;
        this.b = kVar.O();
        a("Attached SDK instance: " + kVar + "...");
    }

    public AppLovinCommunicatorMessagingService getMessagingService() {
        return this.d;
    }

    public boolean hasSubscriber(String str) {
        return this.c.a(str);
    }

    public boolean respondsToTopic(String str) {
        return this.a.t().a(str);
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        subscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public String toString() {
        return "AppLovinCommunicator{sdk=" + this.a + '}';
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        unsubscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    @Deprecated
    public static AppLovinCommunicator getInstance(Context context) {
        synchronized (f) {
            try {
                if (e == null) {
                    e = new AppLovinCommunicator();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return e;
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (this.c.a(appLovinCommunicatorSubscriber, str)) {
                this.d.maybeSendStickyMessages(str);
            } else {
                a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + str);
            }
        }
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + str);
            this.c.b(appLovinCommunicatorSubscriber, str);
        }
    }

    private void a(String str) {
        if (this.b == null || !o.a()) {
            return;
        }
        this.b.a("AppLovinCommunicator", str);
    }
}
