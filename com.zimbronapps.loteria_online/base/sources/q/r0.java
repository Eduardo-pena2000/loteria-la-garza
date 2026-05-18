package Q;

import android.view.View;
import android.view.inputmethod.EditorInfo;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class r0 {
    public static Qa.l a = a.a;

    public /* synthetic */ class a extends kotlin.jvm.internal.q implements Qa.l {
        public static final a a = new a();

        public a() {
            super(1, m0.class, "<init>", "<init>(Landroid/view/View;)V", 0);
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m0 invoke(View view) {
            return new m0(view);
        }
    }

    public static final /* synthetic */ void a(EditorInfo editorInfo) {
        d(editorInfo);
    }

    public static final q0 b() {
        return new Q.a();
    }

    public static final Qa.l c() {
        return a;
    }

    public static final void d(EditorInfo editorInfo) {
        if (androidx.emoji2.text.c.k()) {
            androidx.emoji2.text.c.c().x(editorInfo);
        }
    }
}
