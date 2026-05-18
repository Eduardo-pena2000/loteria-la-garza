package com.revenuecat.purchases.ui.revenuecatui.helpers;

import A0.c;
import Ca.I;
import Qa.p;
import T4.d;
import b0.B1;
import b0.H;
import b0.b1;
import b0.c1;
import b0.g1;
import b0.m;
import b0.w;
import e5.h;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ImagePreviewsKt {
    private static final /* synthetic */ b1 LocalPreviewImageLoader = H.j(ImagePreviewsKt$LocalPreviewImageLoader$1.INSTANCE);

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ p $content;
        final /* synthetic */ d $imageLoader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(d dVar, p pVar, int i) {
            super(2);
            this.$imageLoader = dVar;
            this.$content = pVar;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            ImagePreviewsKt.ProvidePreviewImageLoader(this.$imageLoader, this.$content, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final /* synthetic */ void ProvidePreviewImageLoader(d imageLoader, p content, m mVar, int i) {
        int i2;
        t.g(imageLoader, "imageLoader");
        t.g(content, "content");
        m i3 = mVar.i(-887489443);
        if ((i & 48) == 0) {
            i2 = (i3.E(content) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 17) == 16 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(-887489443, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.helpers.ProvidePreviewImageLoader (ImagePreviews.kt:21)");
            }
            H.c(LocalPreviewImageLoader.d((Object) null), content, i3, (i2 & 112) | c1.i);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 1(imageLoader, content, i));
        }
    }

    public static final b1 getLocalPreviewImageLoader() {
        return LocalPreviewImageLoader;
    }

    public static final /* synthetic */ c getPreviewPlaceholderBlocking(d dVar, h imageRequest) {
        t.g(dVar, "<this>");
        t.g(imageRequest, "imageRequest");
        return null;
    }
}
