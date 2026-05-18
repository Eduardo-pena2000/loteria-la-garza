package com.applovin.shadow.okio;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Segment {
    public static final Companion Companion = new Companion(null);
    public static final int SHARE_MINIMUM = 1024;
    public static final int SIZE = 8192;
    public final byte[] data;
    public int limit;
    public Segment next;
    public boolean owner;
    public int pos;
    public Segment prev;
    public boolean shared;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public Segment() {
        this.data = new byte[8192];
        this.owner = true;
        this.shared = false;
    }

    public final void compact() {
        int i;
        Segment segment = this.prev;
        if (segment == this) {
            throw new IllegalStateException("cannot compact");
        }
        kotlin.jvm.internal.t.d(segment);
        if (segment.owner) {
            int i2 = this.limit - this.pos;
            Segment segment2 = this.prev;
            kotlin.jvm.internal.t.d(segment2);
            int i3 = 8192 - segment2.limit;
            Segment segment3 = this.prev;
            kotlin.jvm.internal.t.d(segment3);
            if (segment3.shared) {
                i = 0;
            } else {
                Segment segment4 = this.prev;
                kotlin.jvm.internal.t.d(segment4);
                i = segment4.pos;
            }
            if (i2 > i3 + i) {
                return;
            }
            Segment segment5 = this.prev;
            kotlin.jvm.internal.t.d(segment5);
            writeTo(segment5, i2);
            pop();
            SegmentPool.recycle(this);
        }
    }

    public final Segment pop() {
        Segment segment = this.next;
        if (segment == this) {
            segment = null;
        }
        Segment segment2 = this.prev;
        kotlin.jvm.internal.t.d(segment2);
        segment2.next = this.next;
        Segment segment3 = this.next;
        kotlin.jvm.internal.t.d(segment3);
        segment3.prev = this.prev;
        this.next = null;
        this.prev = null;
        return segment;
    }

    public final Segment push(Segment segment) {
        kotlin.jvm.internal.t.g(segment, "segment");
        segment.prev = this;
        segment.next = this.next;
        Segment segment2 = this.next;
        kotlin.jvm.internal.t.d(segment2);
        segment2.prev = segment;
        this.next = segment;
        return segment;
    }

    public final Segment sharedCopy() {
        this.shared = true;
        return new Segment(this.data, this.pos, this.limit, true, false);
    }

    public final Segment split(int i) {
        Segment take;
        if (i <= 0 || i > this.limit - this.pos) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i >= 1024) {
            take = sharedCopy();
        } else {
            take = SegmentPool.take();
            byte[] bArr = this.data;
            byte[] bArr2 = take.data;
            int i2 = this.pos;
            Da.p.l(bArr, bArr2, 0, i2, i2 + i, 2, (Object) null);
        }
        take.limit = take.pos + i;
        this.pos += i;
        Segment segment = this.prev;
        kotlin.jvm.internal.t.d(segment);
        segment.push(take);
        return take;
    }

    public final Segment unsharedCopy() {
        byte[] bArr = this.data;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.t.f(copyOf, "copyOf(this, size)");
        return new Segment(copyOf, this.pos, this.limit, false, true);
    }

    public final void writeTo(Segment segment, int i) {
        kotlin.jvm.internal.t.g(segment, "sink");
        if (!segment.owner) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = segment.limit;
        if (i2 + i > 8192) {
            if (segment.shared) {
                throw new IllegalArgumentException();
            }
            int i3 = segment.pos;
            if ((i2 + i) - i3 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = segment.data;
            Da.p.l(bArr, bArr, 0, i3, i2, 2, (Object) null);
            segment.limit -= segment.pos;
            segment.pos = 0;
        }
        byte[] bArr2 = this.data;
        byte[] bArr3 = segment.data;
        int i4 = segment.limit;
        int i5 = this.pos;
        Da.p.f(bArr2, bArr3, i4, i5, i5 + i);
        segment.limit += i;
        this.pos += i;
    }

    public Segment(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        kotlin.jvm.internal.t.g(bArr, "data");
        this.data = bArr;
        this.pos = i;
        this.limit = i2;
        this.shared = z;
        this.owner = z2;
    }
}
