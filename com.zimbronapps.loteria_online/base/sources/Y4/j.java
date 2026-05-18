package Y4;

import Na.n;
import V4.q;
import Y4.i;
import android.webkit.MimeTypeMap;
import java.io.File;
import xb.C;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j implements i {
    public final File a;

    public static final class a implements i.a {
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(File file, e5.m mVar, T4.d dVar) {
            return new j(file);
        }
    }

    public j(File file) {
        this.a = file;
    }

    public Object a(Ga.e eVar) {
        return new m(q.d(C.a.d(C.b, this.a, false, 1, (Object) null), null, null, null, 14, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(n.u(this.a)), V4.f.c);
    }
}
