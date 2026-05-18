package V5;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.zzfyn;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class p0 extends zzfyn {
    public p0(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            R5.t.l().zzg(e, "AdMobHandler.handleMessage");
        }
    }

    public final void zza(Message message) {
        try {
            super.zza(message);
        } catch (Throwable th) {
            R5.t.g();
            F0.r(R5.t.l().zzp(), th);
            throw th;
        }
    }
}
