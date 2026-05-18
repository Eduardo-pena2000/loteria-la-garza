package b5;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import e5.m;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e implements d {
    public /* bridge */ /* synthetic */ Object a(Object obj, m mVar) {
        return c(((Number) obj).intValue(), mVar);
    }

    public final boolean b(int i, Context context) {
        try {
            return context.getResources().getResourceEntryName(i) != null;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    public Uri c(int i, m mVar) {
        if (!b(i, mVar.g())) {
            return null;
        }
        Uri parse = Uri.parse("android.resource://" + mVar.g().getPackageName() + '/' + i);
        t.f(parse, "parse(this)");
        return parse;
    }
}
