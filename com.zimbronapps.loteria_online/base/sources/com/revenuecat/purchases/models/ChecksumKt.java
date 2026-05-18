package com.revenuecat.purchases.models;

import Da.r;
import Qa.l;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ChecksumKt {

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(1);
        }

        public final CharSequence invoke(byte b) {
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            t.f(format, "format(...)");
            return format;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).byteValue());
        }
    }

    public static final String toHexString(byte[] bArr) {
        t.g(bArr, "<this>");
        return r.w0(bArr, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, 1.INSTANCE, 30, (Object) null);
    }
}
