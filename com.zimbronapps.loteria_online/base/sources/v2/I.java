package V2;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i {
    public final Context a;
    public final f b;
    public final Handler c;
    public final c d;
    public final BroadcastReceiver e;
    public final d f;
    public V2.e g;
    public j h;
    public M2.b i;
    public boolean j;

    public static final class b {
        public static void a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            ((AudioManager) P2.a.e((AudioManager) context.getSystemService("audio"))).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        public static void b(Context context, AudioDeviceCallback audioDeviceCallback) {
            ((AudioManager) P2.a.e((AudioManager) context.getSystemService("audio"))).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    public final class c extends AudioDeviceCallback {
        public c() {
        }

        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            i iVar = i.this;
            i.d(iVar, V2.e.f(i.e(iVar), i.a(i.this), i.b(i.this)));
        }

        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (P2.K.s(audioDeviceInfoArr, i.b(i.this))) {
                i.c(i.this, null);
            }
            i iVar = i.this;
            i.d(iVar, V2.e.f(i.e(iVar), i.a(i.this), i.b(i.this)));
        }

        public /* synthetic */ c(i iVar, a aVar) {
            this();
        }
    }

    public final class d extends ContentObserver {
        public final ContentResolver a;
        public final Uri b;

        public d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.a = contentResolver;
            this.b = uri;
        }

        public void a() {
            this.a.registerContentObserver(this.b, false, this);
        }

        public void b() {
            this.a.unregisterContentObserver(this);
        }

        public void onChange(boolean z) {
            i iVar = i.this;
            i.d(iVar, V2.e.f(i.e(iVar), i.a(i.this), i.b(i.this)));
        }
    }

    public final class e extends BroadcastReceiver {
        public e() {
        }

        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            i iVar = i.this;
            i.d(iVar, V2.e.g(context, intent, i.a(iVar), i.b(i.this)));
        }

        public /* synthetic */ e(i iVar, a aVar) {
            this();
        }
    }

    public interface f {
        void a(V2.e eVar);
    }

    public i(Context context, f fVar, M2.b bVar, j jVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = (f) P2.a.e(fVar);
        this.i = bVar;
        this.h = jVar;
        Handler C = P2.K.C();
        this.c = C;
        int i = P2.K.a;
        this.d = i >= 23 ? new c(this, null) : null;
        this.e = i >= 21 ? new e(this, null) : null;
        Uri j = V2.e.j();
        this.f = j != null ? new d(C, applicationContext.getContentResolver(), j) : null;
    }

    public static /* synthetic */ M2.b a(i iVar) {
        return iVar.i;
    }

    public static /* synthetic */ j b(i iVar) {
        return iVar.h;
    }

    public static /* synthetic */ j c(i iVar, j jVar) {
        iVar.h = jVar;
        return jVar;
    }

    public static /* synthetic */ void d(i iVar, V2.e eVar) {
        iVar.f(eVar);
    }

    public static /* synthetic */ Context e(i iVar) {
        return iVar.a;
    }

    public final void f(V2.e eVar) {
        if (!this.j || eVar.equals(this.g)) {
            return;
        }
        this.g = eVar;
        this.b.a(eVar);
    }

    public V2.e g() {
        c cVar;
        if (this.j) {
            return (V2.e) P2.a.e(this.g);
        }
        this.j = true;
        d dVar = this.f;
        if (dVar != null) {
            dVar.a();
        }
        if (P2.K.a >= 23 && (cVar = this.d) != null) {
            b.a(this.a, cVar, this.c);
        }
        V2.e g = V2.e.g(this.a, this.e != null ? this.a.registerReceiver(this.e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), (String) null, this.c) : null, this.i, this.h);
        this.g = g;
        return g;
    }

    public void h(M2.b bVar) {
        this.i = bVar;
        f(V2.e.f(this.a, bVar, this.h));
    }

    public void i(AudioDeviceInfo audioDeviceInfo) {
        j jVar = this.h;
        if (P2.K.c(audioDeviceInfo, jVar == null ? null : jVar.a)) {
            return;
        }
        j jVar2 = audioDeviceInfo != null ? new j(audioDeviceInfo) : null;
        this.h = jVar2;
        f(V2.e.f(this.a, this.i, jVar2));
    }

    public void j() {
        c cVar;
        if (this.j) {
            this.g = null;
            if (P2.K.a >= 23 && (cVar = this.d) != null) {
                b.b(this.a, cVar);
            }
            BroadcastReceiver broadcastReceiver = this.e;
            if (broadcastReceiver != null) {
                this.a.unregisterReceiver(broadcastReceiver);
            }
            d dVar = this.f;
            if (dVar != null) {
                dVar.b();
            }
            this.j = false;
        }
    }
}
