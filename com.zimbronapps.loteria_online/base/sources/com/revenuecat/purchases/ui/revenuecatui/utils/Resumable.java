package com.revenuecat.purchases.ui.revenuecatui.utils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface Resumable {

    public static final class DefaultImpls {
        public static void invoke(Resumable resumable, boolean z) {
            resumable.resume(z);
        }

        public static /* synthetic */ void invoke$default(Resumable resumable, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            resumable.invoke(z);
        }
    }

    void invoke(boolean z);

    void resume(boolean z);
}
