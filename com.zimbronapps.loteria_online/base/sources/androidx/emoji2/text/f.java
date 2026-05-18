package androidx.emoji2.text;

import P1.o;
import android.graphics.Typeface;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import t2.g;
import t2.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f {
    public final u2.b a;
    public final char[] b;
    public final a c = new a(1024);
    public final Typeface d;

    public static class a {
        public final SparseArray a;
        public i b;

        public a() {
            this(1);
        }

        public a a(int i) {
            SparseArray sparseArray = this.a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i);
        }

        public final i b() {
            return this.b;
        }

        public void c(i iVar, int i, int i2) {
            a a = a(iVar.b(i));
            if (a == null) {
                a = new a();
                this.a.put(iVar.b(i), a);
            }
            if (i2 > i) {
                a.c(iVar, i + 1, i2);
            } else {
                a.b = iVar;
            }
        }

        public a(int i) {
            this.a = new SparseArray(i);
        }
    }

    public f(Typeface typeface, u2.b bVar) {
        this.d = typeface;
        this.a = bVar;
        this.b = new char[bVar.k() * 2];
        a(bVar);
    }

    public static f b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            o.a("EmojiCompat.MetadataRepo.create");
            return new f(typeface, g.b(byteBuffer));
        } finally {
            o.b();
        }
    }

    public final void a(u2.b bVar) {
        int k = bVar.k();
        for (int i = 0; i < k; i++) {
            i iVar = new i(this, i);
            Character.toChars(iVar.f(), this.b, i * 2);
            h(iVar);
        }
    }

    public char[] c() {
        return this.b;
    }

    public u2.b d() {
        return this.a;
    }

    public int e() {
        return this.a.l();
    }

    public a f() {
        return this.c;
    }

    public Typeface g() {
        return this.d;
    }

    public void h(i iVar) {
        S1.g.i(iVar, "emoji metadata cannot be null");
        S1.g.b(iVar.c() > 0, "invalid metadata codepoint length");
        this.c.c(iVar, 0, iVar.c() - 1);
    }
}
