package R8;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class d extends ContentObserver {
    public final Context a;
    public final AudioManager b;
    public final a c;
    public final c d;
    public float e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.a = context;
        this.b = (AudioManager) context.getSystemService("audio");
        this.c = aVar;
        this.d = cVar;
    }

    public final float a() {
        return this.c.a(this.b.getStreamVolume(3), this.b.getStreamMaxVolume(3));
    }

    public final boolean b(float f) {
        return f != this.e;
    }

    public final void c() {
        this.d.a(this.e);
    }

    public void d() {
        this.e = a();
        c();
        this.a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void e() {
        this.a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float a = a();
        if (b(a)) {
            this.e = a;
            c();
        }
    }
}
