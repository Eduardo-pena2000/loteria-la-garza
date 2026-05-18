package V5;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.internal.ads.zzbhe;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class b {
    public static volatile float c = -1.0f;
    public static volatile long d;
    public static final Object e = new Object();
    public boolean a = false;
    public float b = 1.0f;

    public static float e(Context context) {
        float f = 0.0f;
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzpD)).booleanValue()) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return 0.0f;
            }
            return g(audioManager);
        }
        long a = R5.t.o().a();
        long intValue = ((Integer) S5.D.c().zzd(zzbhe.zzpE)).intValue();
        if (c != -1.0f && a - d < intValue) {
            return c;
        }
        synchronized (e) {
            try {
                long a2 = R5.t.o().a();
                if (c == -1.0f || a2 - d >= intValue) {
                    AudioManager audioManager2 = (AudioManager) context.getSystemService("audio");
                    if (audioManager2 == null) {
                        c = 0.0f;
                        d = a2;
                    } else {
                        c = g(audioManager2);
                        d = a2;
                        f = c;
                    }
                } else {
                    f = c;
                }
            } finally {
            }
        }
        return f;
    }

    public static float g(AudioManager audioManager) {
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return streamVolume / streamMaxVolume;
    }

    public final synchronized void a(float f) {
        this.b = f;
    }

    public final synchronized float b() {
        if (!f()) {
            return 1.0f;
        }
        return this.b;
    }

    public final synchronized void c(boolean z) {
        this.a = z;
    }

    public final synchronized boolean d() {
        return this.a;
    }

    public final synchronized boolean f() {
        return this.b >= 0.0f;
    }
}
