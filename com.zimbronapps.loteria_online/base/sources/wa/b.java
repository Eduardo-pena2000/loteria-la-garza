package Wa;

import Da.t;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class b extends t {
    public final int a;
    public final int b;
    public boolean c;
    public int d;

    public b(char c, char c2, int i) {
        this.a = i;
        this.b = c2;
        boolean z = false;
        if (i <= 0 ? kotlin.jvm.internal.t.h(c, c2) >= 0 : kotlin.jvm.internal.t.h(c, c2) <= 0) {
            z = true;
        }
        this.c = z;
        this.d = z ? c : c2;
    }

    public char a() {
        int i = this.d;
        if (i != this.b) {
            this.d = this.a + i;
        } else {
            if (!this.c) {
                throw new NoSuchElementException();
            }
            this.c = false;
        }
        return (char) i;
    }

    public boolean hasNext() {
        return this.c;
    }
}
