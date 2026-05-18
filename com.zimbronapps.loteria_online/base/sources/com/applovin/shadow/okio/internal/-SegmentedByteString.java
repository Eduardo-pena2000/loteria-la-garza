package com.applovin.shadow.okio.internal;

import Da.p;
import Qa.q;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.SegmentedByteString;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class -SegmentedByteString {
    public static final int binarySearch(int[] iArr, int i, int i2, int i3) {
        t.g(iArr, "<this>");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else {
                if (i6 <= i) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    public static final void commonCopyInto(SegmentedByteString segmentedByteString, int i, byte[] bArr, int i2, int i3) {
        t.g(segmentedByteString, "<this>");
        t.g(bArr, "target");
        long j = i3;
        com.applovin.shadow.okio.-SegmentedByteString.checkOffsetAndCount(segmentedByteString.size(), i, j);
        com.applovin.shadow.okio.-SegmentedByteString.checkOffsetAndCount(bArr.length, i2, j);
        int i4 = i3 + i;
        int segment = segment(segmentedByteString, i);
        while (i < i4) {
            int i5 = segment == 0 ? 0 : segmentedByteString.getDirectory$okio()[segment - 1];
            int i6 = segmentedByteString.getDirectory$okio()[segment] - i5;
            int i7 = segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length + segment];
            int min = Math.min(i4, i6 + i5) - i;
            int i8 = i7 + (i - i5);
            p.f(segmentedByteString.getSegments$okio()[segment], bArr, i2, i8, i8 + min);
            i2 += min;
            i += min;
            segment++;
        }
    }

    public static final boolean commonEquals(SegmentedByteString segmentedByteString, Object obj) {
        t.g(segmentedByteString, "<this>");
        if (obj == segmentedByteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == segmentedByteString.size() && segmentedByteString.rangeEquals(0, byteString, 0, segmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonGetSize(SegmentedByteString segmentedByteString) {
        t.g(segmentedByteString, "<this>");
        return segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length - 1];
    }

    public static final int commonHashCode(SegmentedByteString segmentedByteString) {
        t.g(segmentedByteString, "<this>");
        int hashCode$okio = segmentedByteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = segmentedByteString.getSegments$okio().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = segmentedByteString.getDirectory$okio()[length + i];
            int i5 = segmentedByteString.getDirectory$okio()[i];
            byte[] bArr = segmentedByteString.getSegments$okio()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        segmentedByteString.setHashCode$okio(i2);
        return i2;
    }

    public static final byte commonInternalGet(SegmentedByteString segmentedByteString, int i) {
        t.g(segmentedByteString, "<this>");
        com.applovin.shadow.okio.-SegmentedByteString.checkOffsetAndCount(segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length - 1], i, 1L);
        int segment = segment(segmentedByteString, i);
        return segmentedByteString.getSegments$okio()[segment][(i - (segment == 0 ? 0 : segmentedByteString.getDirectory$okio()[segment - 1])) + segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length + segment]];
    }

    public static final boolean commonRangeEquals(SegmentedByteString segmentedByteString, int i, ByteString byteString, int i2, int i3) {
        t.g(segmentedByteString, "<this>");
        t.g(byteString, "other");
        if (i < 0 || i > segmentedByteString.size() - i3) {
            return false;
        }
        int i4 = i3 + i;
        int segment = segment(segmentedByteString, i);
        while (i < i4) {
            int i5 = segment == 0 ? 0 : segmentedByteString.getDirectory$okio()[segment - 1];
            int i6 = segmentedByteString.getDirectory$okio()[segment] - i5;
            int i7 = segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length + segment];
            int min = Math.min(i4, i6 + i5) - i;
            if (!byteString.rangeEquals(i2, segmentedByteString.getSegments$okio()[segment], i7 + (i - i5), min)) {
                return false;
            }
            i2 += min;
            i += min;
            segment++;
        }
        return true;
    }

    public static final ByteString commonSubstring(SegmentedByteString segmentedByteString, int i, int i2) {
        t.g(segmentedByteString, "<this>");
        int resolveDefaultParameter = com.applovin.shadow.okio.-SegmentedByteString.resolveDefaultParameter(segmentedByteString, i2);
        if (i < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i + " < 0").toString());
        }
        if (resolveDefaultParameter > segmentedByteString.size()) {
            throw new IllegalArgumentException(("endIndex=" + resolveDefaultParameter + " > length(" + segmentedByteString.size() + ')').toString());
        }
        int i3 = resolveDefaultParameter - i;
        if (i3 < 0) {
            throw new IllegalArgumentException(("endIndex=" + resolveDefaultParameter + " < beginIndex=" + i).toString());
        }
        if (i == 0 && resolveDefaultParameter == segmentedByteString.size()) {
            return segmentedByteString;
        }
        if (i == resolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int segment = segment(segmentedByteString, i);
        int segment2 = segment(segmentedByteString, resolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) p.r(segmentedByteString.getSegments$okio(), segment, segment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (segment <= segment2) {
            int i4 = segment;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(segmentedByteString.getDirectory$okio()[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr.length] = segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length + i4];
                if (i4 == segment2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = segment != 0 ? segmentedByteString.getDirectory$okio()[segment - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i - i7);
        return new SegmentedByteString(bArr, iArr);
    }

    public static final byte[] commonToByteArray(SegmentedByteString segmentedByteString) {
        t.g(segmentedByteString, "<this>");
        byte[] bArr = new byte[segmentedByteString.size()];
        int length = segmentedByteString.getSegments$okio().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = segmentedByteString.getDirectory$okio()[length + i];
            int i5 = segmentedByteString.getDirectory$okio()[i];
            int i6 = i5 - i2;
            p.f(segmentedByteString.getSegments$okio()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public static final void commonWrite(SegmentedByteString segmentedByteString, Buffer buffer, int i, int i2) {
        t.g(segmentedByteString, "<this>");
        t.g(buffer, "buffer");
        int i3 = i + i2;
        int segment = segment(segmentedByteString, i);
        while (i < i3) {
            int i4 = segment == 0 ? 0 : segmentedByteString.getDirectory$okio()[segment - 1];
            int i5 = segmentedByteString.getDirectory$okio()[segment] - i4;
            int i6 = segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length + segment];
            int min = Math.min(i3, i5 + i4) - i;
            int i7 = i6 + (i - i4);
            Segment segment2 = new Segment(segmentedByteString.getSegments$okio()[segment], i7, i7 + min, true, false);
            Segment segment3 = buffer.head;
            if (segment3 == null) {
                segment2.prev = segment2;
                segment2.next = segment2;
                buffer.head = segment2;
            } else {
                t.d(segment3);
                Segment segment4 = segment3.prev;
                t.d(segment4);
                segment4.push(segment2);
            }
            i += min;
            segment++;
        }
        buffer.setSize$okio(buffer.size() + i2);
    }

    public static final void forEachSegment(SegmentedByteString segmentedByteString, q qVar) {
        t.g(segmentedByteString, "<this>");
        t.g(qVar, "action");
        int length = segmentedByteString.getSegments$okio().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = segmentedByteString.getDirectory$okio()[length + i];
            int i4 = segmentedByteString.getDirectory$okio()[i];
            qVar.invoke(segmentedByteString.getSegments$okio()[i], Integer.valueOf(i3), Integer.valueOf(i4 - i2));
            i++;
            i2 = i4;
        }
    }

    public static final int segment(SegmentedByteString segmentedByteString, int i) {
        t.g(segmentedByteString, "<this>");
        int binarySearch = binarySearch(segmentedByteString.getDirectory$okio(), i + 1, 0, segmentedByteString.getSegments$okio().length);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    private static final void forEachSegment(SegmentedByteString segmentedByteString, int i, int i2, q qVar) {
        int segment = segment(segmentedByteString, i);
        while (i < i2) {
            int i3 = segment == 0 ? 0 : segmentedByteString.getDirectory$okio()[segment - 1];
            int i4 = segmentedByteString.getDirectory$okio()[segment] - i3;
            int i5 = segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length + segment];
            int min = Math.min(i2, i4 + i3) - i;
            qVar.invoke(segmentedByteString.getSegments$okio()[segment], Integer.valueOf(i5 + (i - i3)), Integer.valueOf(min));
            i += min;
            segment++;
        }
    }

    public static final boolean commonRangeEquals(SegmentedByteString segmentedByteString, int i, byte[] bArr, int i2, int i3) {
        t.g(segmentedByteString, "<this>");
        t.g(bArr, "other");
        if (i < 0 || i > segmentedByteString.size() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int segment = segment(segmentedByteString, i);
        while (i < i4) {
            int i5 = segment == 0 ? 0 : segmentedByteString.getDirectory$okio()[segment - 1];
            int i6 = segmentedByteString.getDirectory$okio()[segment] - i5;
            int i7 = segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length + segment];
            int min = Math.min(i4, i6 + i5) - i;
            if (!com.applovin.shadow.okio.-SegmentedByteString.arrayRangeEquals(segmentedByteString.getSegments$okio()[segment], i7 + (i - i5), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            segment++;
        }
        return true;
    }
}
