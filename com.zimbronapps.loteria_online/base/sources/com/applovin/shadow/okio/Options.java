package com.applovin.shadow.okio;

import java.util.List;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Options extends Da.d implements RandomAccess {
    public static final Companion Companion = new Companion(null);
    private final ByteString[] byteStrings;
    private final int[] trie;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        private final void buildTrieRecursive(long j, Buffer buffer, int i, List list, int i2, int i3, List list2) {
            int i4;
            int i5;
            int i6;
            int i7;
            Buffer buffer2;
            int i8 = i;
            if (i2 >= i3) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i9 = i2; i9 < i3; i9++) {
                if (((ByteString) list.get(i9)).size() < i8) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            ByteString byteString = (ByteString) list.get(i2);
            ByteString byteString2 = (ByteString) list.get(i3 - 1);
            int i10 = -1;
            if (i8 == byteString.size()) {
                int intValue = ((Number) list2.get(i2)).intValue();
                int i11 = i2 + 1;
                ByteString byteString3 = (ByteString) list.get(i11);
                i4 = i11;
                i5 = intValue;
                byteString = byteString3;
            } else {
                i4 = i2;
                i5 = -1;
            }
            if (byteString.getByte(i8) == byteString2.getByte(i8)) {
                int min = Math.min(byteString.size(), byteString2.size());
                int i12 = 0;
                for (int i13 = i8; i13 < min && byteString.getByte(i13) == byteString2.getByte(i13); i13++) {
                    i12++;
                }
                long intCount = j + getIntCount(buffer) + 2 + i12 + 1;
                buffer.writeInt(-i12);
                buffer.writeInt(i5);
                int i14 = i12 + i8;
                while (i8 < i14) {
                    buffer.writeInt(byteString.getByte(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i3) {
                    if (i14 != ((ByteString) list.get(i4)).size()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    buffer.writeInt(((Number) list2.get(i4)).intValue());
                    return;
                } else {
                    Buffer buffer3 = new Buffer();
                    buffer.writeInt(((int) (getIntCount(buffer3) + intCount)) * (-1));
                    buildTrieRecursive(intCount, buffer3, i14, list, i4, i3, list2);
                    buffer.writeAll(buffer3);
                    return;
                }
            }
            int i15 = 1;
            for (int i16 = i4 + 1; i16 < i3; i16++) {
                if (((ByteString) list.get(i16 - 1)).getByte(i8) != ((ByteString) list.get(i16)).getByte(i8)) {
                    i15++;
                }
            }
            long intCount2 = j + getIntCount(buffer) + 2 + (i15 * 2);
            buffer.writeInt(i15);
            buffer.writeInt(i5);
            for (int i17 = i4; i17 < i3; i17++) {
                byte b = ((ByteString) list.get(i17)).getByte(i8);
                if (i17 == i4 || b != ((ByteString) list.get(i17 - 1)).getByte(i8)) {
                    buffer.writeInt(b & 255);
                }
            }
            Buffer buffer4 = new Buffer();
            while (i4 < i3) {
                byte b2 = ((ByteString) list.get(i4)).getByte(i8);
                int i18 = i4 + 1;
                int i19 = i18;
                while (true) {
                    if (i19 >= i3) {
                        i6 = i3;
                        break;
                    } else {
                        if (b2 != ((ByteString) list.get(i19)).getByte(i8)) {
                            i6 = i19;
                            break;
                        }
                        i19++;
                    }
                }
                if (i18 == i6 && i8 + 1 == ((ByteString) list.get(i4)).size()) {
                    buffer.writeInt(((Number) list2.get(i4)).intValue());
                    i7 = i6;
                    buffer2 = buffer4;
                } else {
                    buffer.writeInt(((int) (intCount2 + getIntCount(buffer4))) * i10);
                    i7 = i6;
                    buffer2 = buffer4;
                    buildTrieRecursive(intCount2, buffer4, i8 + 1, list, i4, i6, list2);
                }
                buffer4 = buffer2;
                i4 = i7;
                i10 = -1;
            }
            buffer.writeAll(buffer4);
        }

        public static /* synthetic */ void buildTrieRecursive$default(Companion companion, long j, Buffer buffer, int i, List list, int i2, int i3, List list2, int i4, Object obj) {
            companion.buildTrieRecursive((i4 & 1) != 0 ? 0L : j, buffer, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        private final long getIntCount(Buffer buffer) {
            return buffer.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00d7, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.applovin.shadow.okio.Options of(com.applovin.shadow.okio.ByteString... r17) {
            /*
                Method dump skipped, instructions count: 290
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.Options.Companion.of(com.applovin.shadow.okio.ByteString[]):com.applovin.shadow.okio.Options");
        }

        private Companion() {
        }
    }

    public /* synthetic */ Options(ByteString[] byteStringArr, int[] iArr, kotlin.jvm.internal.k kVar) {
        this(byteStringArr, iArr);
    }

    public static final Options of(ByteString... byteStringArr) {
        return Companion.of(byteStringArr);
    }

    public /* bridge */ boolean contains(ByteString byteString) {
        return super/*Da.b*/.contains(byteString);
    }

    public final ByteString[] getByteStrings$okio() {
        return this.byteStrings;
    }

    public int getSize() {
        return this.byteStrings.length;
    }

    public final int[] getTrie$okio() {
        return this.trie;
    }

    public /* bridge */ int indexOf(ByteString byteString) {
        return super.indexOf(byteString);
    }

    public /* bridge */ int lastIndexOf(ByteString byteString) {
        return super.lastIndexOf(byteString);
    }

    private Options(ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return contains((ByteString) obj);
        }
        return false;
    }

    public ByteString get(int i) {
        return this.byteStrings[i];
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return indexOf((ByteString) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return lastIndexOf((ByteString) obj);
        }
        return -1;
    }
}
