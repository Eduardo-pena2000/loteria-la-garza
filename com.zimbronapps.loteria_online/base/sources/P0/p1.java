package P0;

import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface p1 {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();

        public final p1 a() {
            return b.b;
        }
    }

    Qa.a a(P0.a aVar);

    public static final class b implements p1 {
        public static final b b = new b();

        public static final class a extends kotlin.jvm.internal.u implements Qa.a {
            public final /* synthetic */ P0.a a;
            public final /* synthetic */ b b;
            public final /* synthetic */ l2.b c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(P0.a aVar, b bVar, l2.b bVar2) {
                super(0);
                this.a = aVar;
                this.b = bVar;
                this.c = bVar2;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return Ca.I.a;
            }

            public final void invoke() {
                this.a.removeOnAttachStateChangeListener(this.b);
                l2.a.e(this.a, this.c);
            }
        }

        public Qa.a a(P0.a aVar) {
            b bVar = new b(aVar);
            aVar.addOnAttachStateChangeListener(bVar);
            q1 q1Var = new q1(aVar);
            l2.a.a(aVar, q1Var);
            return new a(aVar, bVar, q1Var);
        }

        public static final class b implements View.OnAttachStateChangeListener {
            public final /* synthetic */ P0.a a;

            public b(P0.a aVar) {
                this.a = aVar;
            }

            public void onViewDetachedFromWindow(View view) {
                if (l2.a.d(this.a)) {
                    return;
                }
                this.a.disposeComposition();
            }

            public void onViewAttachedToWindow(View view) {
            }
        }
    }
}
