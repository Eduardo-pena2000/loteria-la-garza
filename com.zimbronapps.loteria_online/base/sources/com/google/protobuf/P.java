package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class p extends InputStream {
    public Iterator a;
    public ByteBuffer b;
    public int c = 0;
    public int d;
    public int e;
    public boolean f;
    public byte[] g;
    public int h;
    public long i;

    public p(Iterable iterable) {
        this.a = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.c++;
        }
        this.d = -1;
        if (a()) {
            return;
        }
        this.b = Internal.EMPTY_BYTE_BUFFER;
        this.d = 0;
        this.e = 0;
        this.i = 0L;
    }

    public final boolean a() {
        this.d++;
        if (!this.a.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.a.next();
        this.b = byteBuffer;
        this.e = byteBuffer.position();
        if (this.b.hasArray()) {
            this.f = true;
            this.g = this.b.array();
            this.h = this.b.arrayOffset();
        } else {
            this.f = false;
            this.i = V.k(this.b);
            this.g = null;
        }
        return true;
    }

    public final void b(int i) {
        int i2 = this.e + i;
        this.e = i2;
        if (i2 == this.b.limit()) {
            a();
        }
    }

    public int read() {
        if (this.d == this.c) {
            return -1;
        }
        if (this.f) {
            int i = this.g[this.e + this.h] & 255;
            b(1);
            return i;
        }
        int x = V.x(this.e + this.i) & 255;
        b(1);
        return x;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (this.d == this.c) {
            return -1;
        }
        int limit = this.b.limit();
        int i3 = this.e;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f) {
            System.arraycopy(this.g, i3 + this.h, bArr, i, i2);
            b(i2);
        } else {
            int position = this.b.position();
            q.d(this.b, this.e);
            this.b.get(bArr, i, i2);
            q.d(this.b, position);
            b(i2);
        }
        return i2;
    }
}
