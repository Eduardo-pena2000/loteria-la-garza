package io.flutter.plugins.firebase.messaging;

import S9.f;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import na.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class FlutterFirebaseMessagingBackgroundService extends a {
    public static final List i = Collections.synchronizedList(new LinkedList());
    public static e j;

    public static /* synthetic */ void j(Intent intent, CountDownLatch countDownLatch) {
        l(intent, countDownLatch);
    }

    public static void k(Context context, Intent intent, boolean z) {
        a.d(context, FlutterFirebaseMessagingBackgroundService.class, 2020, intent, z);
    }

    public static /* synthetic */ void l(Intent intent, CountDownLatch countDownLatch) {
        j.d(intent, countDownLatch);
    }

    public static void m() {
        Log.i("FLTFireMsgService", "FlutterFirebaseMessagingBackgroundService started!");
        List list = i;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    j.d((Intent) it.next(), null);
                }
                i.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void n(long j2) {
        e.m(j2);
    }

    public static void o(long j2) {
        e.n(j2);
    }

    public static void p(long j2, f fVar) {
        if (j != null) {
            Log.w("FLTFireMsgService", "Attempted to start a duplicate background isolate. Returning...");
            return;
        }
        e eVar = new e();
        j = eVar;
        eVar.p(j2, fVar);
    }

    public void g(Intent intent) {
        if (!j.h()) {
            Log.w("FLTFireMsgService", "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        List list = i;
        synchronized (list) {
            try {
                if (j.i()) {
                    Log.i("FLTFireMsgService", "Service has not yet started, messages will be queued.");
                    list.add(intent);
                    return;
                }
                CountDownLatch countDownLatch = new CountDownLatch(1);
                new Handler(getMainLooper()).post(new na.f(intent, countDownLatch));
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    Log.i("FLTFireMsgService", "Exception waiting to execute Dart callback", e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* bridge */ /* synthetic */ boolean h() {
        return super.h();
    }

    public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    public void onCreate() {
        super.onCreate();
        if (j == null) {
            j = new e();
        }
        j.o();
    }

    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    public /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i2, int i3) {
        return super.onStartCommand(intent, i2, i3);
    }
}
