package H6;

import com.google.android.gms.common.data.DataHolder;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class p extends w6.a {
    public a b;

    public static class a extends o {
        public final DataHolder a;
        public final int b;
        public final int c;

        public a(DataHolder dataHolder, int i) {
            this.a = dataHolder;
            this.b = i;
            this.c = dataHolder.S1(i);
        }

        public static /* synthetic */ int b(a aVar) {
            return aVar.b;
        }

        public final Object zza(J6.b bVar) {
            return bVar.zza(this.a, this.b, this.c);
        }
    }

    public p(DataHolder dataHolder) {
        super(dataHolder);
        dataHolder.P1().setClassLoader(p.class.getClassLoader());
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final o get(int i) {
        a aVar = this.b;
        if (aVar != null && a.b(aVar) == i) {
            return aVar;
        }
        a aVar2 = new a(this.a, i);
        this.b = aVar2;
        return aVar2;
    }

    public final void release() {
        DataHolder dataHolder = this.a;
        if (dataHolder != null) {
            K6.f.b(dataHolder);
        }
        super.release();
    }
}
