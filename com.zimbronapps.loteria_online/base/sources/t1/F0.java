package T1;

import android.view.View;
import android.view.ViewParent;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class f0 {

    public /* synthetic */ class a extends kotlin.jvm.internal.q implements Qa.l {
        public static final a a = new a();

        public a() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewParent invoke(ViewParent viewParent) {
            return viewParent.getParent();
        }
    }

    public static final Ya.h a(View view) {
        return Ya.o.j(view.getParent(), a.a);
    }
}
