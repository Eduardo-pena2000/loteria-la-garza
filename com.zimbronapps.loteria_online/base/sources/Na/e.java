package na;

import T9.a;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import da.j;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import io.flutter.view.FlutterCallbackInformation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class e implements j.c {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public da.j b;
    public io.flutter.embedding.engine.a c;

    public class a implements j.d {
        public final /* synthetic */ CountDownLatch a;

        public a(CountDownLatch countDownLatch) {
            this.a = countDownLatch;
        }

        public void a(Object obj) {
            this.a.countDown();
        }

        public void b(String str, String str2, Object obj) {
            this.a.countDown();
        }

        public void c() {
            this.a.countDown();
        }
    }

    public class b extends HashMap {
        public final /* synthetic */ Map a;

        public b(Map map) {
            this.a = map;
            put("userCallbackHandle", Long.valueOf(e.c(e.this)));
            put("message", map);
        }
    }

    public static /* synthetic */ void a(e eVar, W9.f fVar, Handler handler, S9.f fVar2, long j) {
        eVar.k(fVar, handler, fVar2, j);
    }

    public static /* synthetic */ void b(e eVar, W9.f fVar, S9.f fVar2, long j) {
        eVar.j(fVar, fVar2, j);
    }

    public static /* bridge */ /* synthetic */ long c(e eVar) {
        return eVar.f();
    }

    public static void m(long j) {
        Context a2 = na.a.a();
        if (a2 == null) {
            Log.e("FLTFireBGExecutor", "Context is null, cannot continue.");
        } else {
            a2.getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong("callback_handle", j).apply();
        }
    }

    public static void n(long j) {
        na.a.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong("user_callback_handle", j).apply();
    }

    public void d(Intent intent, CountDownLatch countDownLatch) {
        if (this.c == null) {
            Log.i("FLTFireBGExecutor", "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        a aVar = countDownLatch != null ? new a(countDownLatch) : null;
        byte[] byteArrayExtra = intent.getByteArrayExtra("notification");
        if (byteArrayExtra == null) {
            Log.e("FLTFireBGExecutor", "RemoteMessage byte array not found in Intent.");
            return;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            obtain.setDataPosition(0);
            this.b.d("MessagingBackground#onMessage", new b(z.f((com.google.firebase.messaging.d) com.google.firebase.messaging.d.CREATOR.createFromParcel(obtain))), aVar);
        } finally {
            obtain.recycle();
        }
    }

    public final long e() {
        return na.a.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("callback_handle", 0L);
    }

    public final long f() {
        return na.a.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("user_callback_handle", 0L);
    }

    public final void g(da.b bVar) {
        da.j jVar = new da.j(bVar, "plugins.flutter.io/firebase_messaging_background");
        this.b = jVar;
        jVar.e(this);
    }

    public boolean h() {
        return e() != 0;
    }

    public boolean i() {
        return !this.a.get();
    }

    public final /* synthetic */ void j(W9.f fVar, S9.f fVar2, long j) {
        String j2 = fVar.j();
        AssetManager assets = na.a.a().getAssets();
        if (i()) {
            if (fVar2 != null) {
                Log.i("FLTFireBGExecutor", "Creating background FlutterEngine instance, with args: " + Arrays.toString(fVar2.b()));
                this.c = new io.flutter.embedding.engine.a(na.a.a(), fVar2.b());
            } else {
                Log.i("FLTFireBGExecutor", "Creating background FlutterEngine instance.");
                this.c = new io.flutter.embedding.engine.a(na.a.a());
            }
            FlutterCallbackInformation lookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(j);
            if (lookupCallbackInformation == null) {
                Log.e("FLTFireBGExecutor", "Failed to find registered callback");
                return;
            }
            T9.a k = this.c.k();
            g(k);
            k.i(new a.b(assets, j2, lookupCallbackInformation));
        }
    }

    public final /* synthetic */ void k(W9.f fVar, Handler handler, S9.f fVar2, long j) {
        fVar.t(na.a.a());
        fVar.i(na.a.a(), null, handler, new d(this, fVar, fVar2, j));
    }

    public final void l() {
        this.a.set(true);
        FlutterFirebaseMessagingBackgroundService.m();
    }

    public void o() {
        if (i()) {
            long e = e();
            if (e != 0) {
                p(e, null);
            }
        }
    }

    public void onMethodCall(da.i iVar, j.d dVar) {
        if (!iVar.a.equals("MessagingBackground#initialized")) {
            dVar.c();
        } else {
            l();
            dVar.a(Boolean.TRUE);
        }
    }

    public void p(long j, S9.f fVar) {
        if (this.c != null) {
            Log.e("FLTFireBGExecutor", "Background isolate already started.");
            return;
        }
        W9.f c = Q9.a.e().c();
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new c(this, c, handler, fVar, j));
    }
}
