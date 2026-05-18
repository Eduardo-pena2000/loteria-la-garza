package com.applovin.impl.communicator;

import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorMessagingService;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class MessagingServiceImpl implements AppLovinCommunicatorMessagingService {
    private ScheduledThreadPoolExecutor a;
    private final Object b = new Object();
    private final Map c = new HashMap();
    private final Object d = new Object();

    private Queue a(String str) {
        LinkedList linkedList;
        synchronized (this.d) {
            try {
                Queue queue = (Queue) this.c.get(str);
                linkedList = queue != null ? new LinkedList(queue) : new LinkedList();
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedList;
    }

    private void b(CommunicatorMessageImpl communicatorMessageImpl) {
        if (communicatorMessageImpl.sticky) {
            synchronized (this.d) {
                try {
                    Queue queue = (Queue) this.c.get(communicatorMessageImpl.getTopic());
                    if (queue != null) {
                        queue.add(communicatorMessageImpl);
                        if (queue.size() > 10) {
                            queue.remove();
                        }
                    } else {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(communicatorMessageImpl);
                        this.c.put(communicatorMessageImpl.getTopic(), linkedList);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void c(CommunicatorMessageImpl communicatorMessageImpl) {
        ScheduledThreadPoolExecutor a = a();
        this.a = a;
        a.execute(new b(communicatorMessageImpl));
    }

    public static /* synthetic */ void d(CommunicatorMessageImpl communicatorMessageImpl) {
        a(communicatorMessageImpl);
    }

    public static /* synthetic */ Thread e(Runnable runnable) {
        return a(runnable);
    }

    public void maybeSendStickyMessages(String str) {
        Iterator it = a(str).iterator();
        while (it.hasNext()) {
            c((CommunicatorMessageImpl) it.next());
        }
    }

    public void publish(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        c(appLovinCommunicatorMessage);
        b(appLovinCommunicatorMessage);
    }

    public String toString() {
        return "MessagingServiceImpl{}";
    }

    private static /* synthetic */ void a(CommunicatorMessageImpl communicatorMessageImpl) {
        AppLovinBroadcastManager.sendBroadcastSync(communicatorMessageImpl, null);
    }

    private ScheduledThreadPoolExecutor a() {
        synchronized (this.b) {
            try {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.a;
                if (scheduledThreadPoolExecutor != null) {
                    return scheduledThreadPoolExecutor;
                }
                return new ScheduledThreadPoolExecutor(1, new a());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static /* synthetic */ Thread a(Runnable runnable) {
        Thread thread = new Thread(runnable, "AppLovinSdk:communicator");
        thread.setPriority(1);
        thread.setDaemon(true);
        return thread;
    }
}
