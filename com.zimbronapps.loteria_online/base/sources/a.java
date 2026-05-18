// default package

import Ga.e;
import android.content.Context;
import android.graphics.Bitmap;
import f5.h;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a implements h5.a {
    public final Context a;
    public final float b;
    public final String c;

    public a(Context context, float f) {
        t.g(context, "context");
        this.a = context;
        this.b = f;
        this.c = a.class.getName() + '-' + f;
    }

    public String a() {
        return this.c;
    }

    public Object b(Bitmap bitmap, h hVar, e eVar) {
        return b.b(bitmap, this.a, this.b, false, 4, null);
    }
}
