package q5;

import Y9.a;
import android.content.Context;
import android.os.Build;
import android.os.Vibrator;
import da.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class i implements Y9.a {
    public j a;

    public final Vibrator a(a.b bVar) {
        Context a = bVar.a();
        Vibrator vibrator = (Vibrator) H1.a.getSystemService(a, Vibrator.class);
        return vibrator != null ? vibrator : (Vibrator) a.getSystemService("vibrator");
    }

    public Vibrator b(a.b bVar) {
        if (Build.VERSION.SDK_INT < 31) {
            return a(bVar);
        }
        try {
            return h.a(g.a(bVar.a().getSystemService("vibrator_manager")));
        } catch (NoSuchMethodError | NoClassDefFoundError unused) {
            return a(bVar);
        }
    }

    public void onAttachedToEngine(a.b bVar) {
        f fVar = new f(new e(b(bVar)));
        j jVar = new j(bVar.b(), "vibration");
        this.a = jVar;
        jVar.e(fVar);
    }

    public void onDetachedFromEngine(a.b bVar) {
        this.a.e((j.c) null);
        this.a = null;
    }
}
