package M2;

import android.media.AudioAttributes;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b {
    public static final b g = new e().a();
    public static final String h = P2.K.w0(0);
    public static final String i = P2.K.w0(1);
    public static final String j = P2.K.w0(2);
    public static final String k = P2.K.w0(3);
    public static final String l = P2.K.w0(4);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public d f;

    public static final class b {
        public static void a(AudioAttributes.Builder builder, int i) {
            M2.c.a(builder, i);
        }
    }

    public static final class c {
        public static void a(AudioAttributes.Builder builder, int i) {
            M2.d.a(builder, i);
        }
    }

    public static final class d {
        public final AudioAttributes a;

        public /* synthetic */ d(b bVar, a aVar) {
            this(bVar);
        }

        public d(b bVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(bVar.a).setFlags(bVar.b).setUsage(bVar.c);
            int i = P2.K.a;
            if (i >= 29) {
                b.a(usage, bVar.d);
            }
            if (i >= 32) {
                c.a(usage, bVar.e);
            }
            this.a = usage.build();
        }
    }

    public static final class e {
        public int a = 0;
        public int b = 0;
        public int c = 1;
        public int d = 1;
        public int e = 0;

        public b a() {
            return new b(this.a, this.b, this.c, this.d, this.e, null);
        }

        public e b(int i) {
            this.a = i;
            return this;
        }

        public e c(int i) {
            this.b = i;
            return this;
        }

        public e d(int i) {
            this.c = i;
            return this;
        }
    }

    public /* synthetic */ b(int i2, int i3, int i4, int i5, int i6, a aVar) {
        this(i2, i3, i4, i5, i6);
    }

    public d a() {
        if (this.f == null) {
            this.f = new d(this, null);
        }
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e;
    }

    public int hashCode() {
        return ((((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public b(int i2, int i3, int i4, int i5, int i6) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
    }
}
