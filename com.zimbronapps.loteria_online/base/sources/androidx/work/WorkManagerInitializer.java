package androidx.work;

import G4.m;
import G4.w;
import android.content.Context;
import androidx.work.a;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class WorkManagerInitializer implements o4.b {
    public static final String a = m.f("WrkMgrInitializer");

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public w create(Context context) {
        m.c().a(a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        w.e(context, new a.b().a());
        return w.d(context);
    }

    public List dependencies() {
        return Collections.emptyList();
    }
}
