package T2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d1 {
    public final Context a;
    public final Handler b;
    public final b c;
    public final AudioManager d;
    public c e;
    public int f;
    public int g;
    public boolean h;

    public interface b {
        void C(int i, boolean z);

        void m(int i);
    }

    public final class c extends BroadcastReceiver {
        public c() {
        }

        public static /* synthetic */ void a(d1 d1Var) {
            b(d1Var);
        }

        public static /* synthetic */ void b(d1 d1Var) {
            d1.b(d1Var);
        }

        public void onReceive(Context context, Intent intent) {
            d1.a(d1.this).post(new e1(d1.this));
        }

        public /* synthetic */ c(d1 d1Var, a aVar) {
            this();
        }
    }

    public d1(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = handler;
        this.c = bVar;
        AudioManager audioManager = (AudioManager) P2.a.h((AudioManager) applicationContext.getSystemService("audio"));
        this.d = audioManager;
        this.f = 3;
        this.g = f(audioManager, 3);
        this.h = e(audioManager, this.f);
        c cVar = new c(this, null);
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.e = cVar;
        } catch (RuntimeException e) {
            P2.o.i("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    public static /* synthetic */ Handler a(d1 d1Var) {
        return d1Var.b;
    }

    public static /* synthetic */ void b(d1 d1Var) {
        d1Var.i();
    }

    public static boolean e(AudioManager audioManager, int i) {
        return P2.K.a >= 23 ? audioManager.isStreamMute(i) : f(audioManager, i) == 0;
    }

    public static int f(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            P2.o.i("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    public int c() {
        return this.d.getStreamMaxVolume(this.f);
    }

    public int d() {
        if (P2.K.a >= 28) {
            return c1.a(this.d, this.f);
        }
        return 0;
    }

    public void g() {
        c cVar = this.e;
        if (cVar != null) {
            try {
                this.a.unregisterReceiver(cVar);
            } catch (RuntimeException e) {
                P2.o.i("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.e = null;
        }
    }

    public void h(int i) {
        if (this.f == i) {
            return;
        }
        this.f = i;
        i();
        this.c.m(i);
    }

    public final void i() {
        int f = f(this.d, this.f);
        boolean e = e(this.d, this.f);
        if (this.g == f && this.h == e) {
            return;
        }
        this.g = f;
        this.h = e;
        this.c.C(f, e);
    }
}
