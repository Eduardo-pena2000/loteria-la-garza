package Da;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class a0 {

    public static final class a extends Ia.k implements Qa.p {
        public Object a;
        public Object b;
        public int c;
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ int f;
        public final /* synthetic */ int g;
        public final /* synthetic */ Iterator h;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ boolean j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, Iterator it, boolean z, boolean z2, Ga.e eVar) {
            super(2, eVar);
            this.f = i;
            this.g = i2;
            this.h = it;
            this.i = z;
            this.j = z2;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            a aVar = new a(this.f, this.g, this.h, this.i, this.j, eVar);
            aVar.e = obj;
            return aVar;
        }

        public final Object invoke(Ya.j jVar, Ga.e eVar) {
            return ((a) create(jVar, eVar)).invokeSuspend(Ca.I.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00d7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00ad  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0145 -> B:12:0x0148). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0117 -> B:30:0x011a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x00a2 -> B:50:0x0055). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 358
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Da.a0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(int i, int i2) {
        String str;
        if (i <= 0 || i2 <= 0) {
            if (i != i2) {
                str = "Both size " + i + " and step " + i2 + " must be greater than zero.";
            } else {
                str = "size " + i + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public static final Iterator b(Iterator iterator, int i, int i2, boolean z, boolean z2) {
        kotlin.jvm.internal.t.g(iterator, "iterator");
        return !iterator.hasNext() ? E.a : Ya.k.a(new a(i, i2, iterator, z2, z, null));
    }
}
