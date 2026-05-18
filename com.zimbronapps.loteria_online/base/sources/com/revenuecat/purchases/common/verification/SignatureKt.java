package com.revenuecat.purchases.common.verification;

import Da.p;
import com.revenuecat.purchases.common.verification.Signature;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SignatureKt {
    public static final /* synthetic */ byte[] access$copyOf(byte[] bArr, Signature.Component component) {
        return copyOf(bArr, component);
    }

    private static final byte[] copyOf(byte[] bArr, Signature.Component component) {
        return p.q(bArr, component.getStartByte(), component.getEndByte());
    }
}
