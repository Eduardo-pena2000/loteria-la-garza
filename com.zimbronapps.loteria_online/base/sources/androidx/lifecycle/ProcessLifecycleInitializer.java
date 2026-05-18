package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.E;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class ProcessLifecycleInitializer implements o4.b {
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public r create(Context context) {
        kotlin.jvm.internal.t.g(context, "context");
        o4.a e = o4.a.e(context);
        kotlin.jvm.internal.t.f(e, "getInstance(...)");
        if (!e.g(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        n.a(context);
        E.b bVar = E.i;
        bVar.b(context);
        return bVar.a();
    }

    public List dependencies() {
        return Da.v.n();
    }
}
