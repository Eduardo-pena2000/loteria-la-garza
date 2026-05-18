package com.revenuecat.purchases.ui.revenuecatui.composables;

import A0.c;
import Ca.I;
import M0.f;
import Qa.l;
import Qa.p;
import X.E;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.d;
import b0.B1;
import b0.C0;
import b0.g1;
import b0.m;
import b0.w;
import e5.b;
import e5.h;
import h5.a;
import kotlin.jvm.internal.u;
import v0.E1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RemoteImageKt {

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ float $alpha;
        final /* synthetic */ d $colorFilter;
        final /* synthetic */ String $contentDescription;
        final /* synthetic */ f $contentScale;
        final /* synthetic */ T4.d $imageLoader;
        final /* synthetic */ h $imageRequest;
        final /* synthetic */ e $modifier;
        final /* synthetic */ l $onError;
        final /* synthetic */ c $placeholder;
        final /* synthetic */ ImageSource $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(ImageSource imageSource, h hVar, T4.d dVar, e eVar, c cVar, f fVar, String str, float f, d dVar2, l lVar, int i, int i2) {
            super(2);
            this.$source = imageSource;
            this.$imageRequest = hVar;
            this.$imageLoader = dVar;
            this.$modifier = eVar;
            this.$placeholder = cVar;
            this.$contentScale = fVar;
            this.$contentDescription = str;
            this.$alpha = f;
            this.$colorFilter = dVar2;
            this.$onError = lVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            RemoteImageKt.access$AsyncImage(this.$source, this.$imageRequest, this.$imageLoader, this.$modifier, this.$placeholder, this.$contentScale, this.$contentDescription, this.$alpha, this.$colorFilter, this.$onError, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ float $alpha;
        final /* synthetic */ d $colorFilter;
        final /* synthetic */ String $contentDescription;
        final /* synthetic */ f $contentScale;
        final /* synthetic */ e $modifier;
        final /* synthetic */ ImageSource $placeholderSource;
        final /* synthetic */ ImageSource $source;
        final /* synthetic */ a $transformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(ImageSource imageSource, ImageSource imageSource2, e eVar, f fVar, String str, a aVar, float f, d dVar, int i, int i2) {
            super(2);
            this.$source = imageSource;
            this.$placeholderSource = imageSource2;
            this.$modifier = eVar;
            this.$contentScale = fVar;
            this.$contentDescription = str;
            this.$transformation = aVar;
            this.$alpha = f;
            this.$colorFilter = dVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            RemoteImageKt.access$Image(this.$source, this.$placeholderSource, this.$modifier, this.$contentScale, this.$contentDescription, this.$transformation, this.$alpha, this.$colorFilter, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ float $alpha;
        final /* synthetic */ d $colorFilter;
        final /* synthetic */ String $contentDescription;
        final /* synthetic */ f $contentScale;
        final /* synthetic */ e $modifier;
        final /* synthetic */ ImageSource $placeholderSource;
        final /* synthetic */ ImageSource $source;
        final /* synthetic */ a $transformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(ImageSource imageSource, ImageSource imageSource2, e eVar, f fVar, String str, a aVar, float f, d dVar, int i, int i2) {
            super(2);
            this.$source = imageSource;
            this.$placeholderSource = imageSource2;
            this.$modifier = eVar;
            this.$contentScale = fVar;
            this.$contentDescription = str;
            this.$transformation = aVar;
            this.$alpha = f;
            this.$colorFilter = dVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            RemoteImageKt.access$Image(this.$source, this.$placeholderSource, this.$modifier, this.$contentScale, this.$contentDescription, this.$transformation, this.$alpha, this.$colorFilter, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ e $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(e eVar, int i) {
            super(2);
            this.$modifier = eVar;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            RemoteImageKt.access$ImageForPreviews(this.$modifier, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ float $alpha;
        final /* synthetic */ d $colorFilter;
        final /* synthetic */ String $contentDescription;
        final /* synthetic */ f $contentScale;
        final /* synthetic */ e $modifier;
        final /* synthetic */ int $resource;
        final /* synthetic */ a $transformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(int i, e eVar, f fVar, String str, a aVar, float f, d dVar, int i2, int i3) {
            super(2);
            this.$resource = i;
            this.$modifier = eVar;
            this.$contentScale = fVar;
            this.$contentDescription = str;
            this.$transformation = aVar;
            this.$alpha = f;
            this.$colorFilter = dVar;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            RemoteImageKt.LocalImage(this.$resource, this.$modifier, this.$contentScale, this.$contentDescription, this.$transformation, this.$alpha, this.$colorFilter, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ float $alpha;
        final /* synthetic */ d $colorFilter;
        final /* synthetic */ String $contentDescription;
        final /* synthetic */ f $contentScale;
        final /* synthetic */ e $modifier;
        final /* synthetic */ String $placeholderUrlString;
        final /* synthetic */ a $transformation;
        final /* synthetic */ String $urlString;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(String str, e eVar, String str2, f fVar, String str3, a aVar, float f, d dVar, int i, int i2) {
            super(2);
            this.$urlString = str;
            this.$modifier = eVar;
            this.$placeholderUrlString = str2;
            this.$contentScale = fVar;
            this.$contentDescription = str3;
            this.$transformation = aVar;
            this.$alpha = f;
            this.$colorFilter = dVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            RemoteImageKt.RemoteImage(this.$urlString, this.$modifier, this.$placeholderUrlString, this.$contentScale, this.$contentDescription, this.$transformation, this.$alpha, this.$colorFilter, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void AsyncImage(com.revenuecat.purchases.ui.revenuecatui.composables.ImageSource r32, e5.h r33, T4.d r34, androidx.compose.ui.e r35, A0.c r36, M0.f r37, java.lang.String r38, float r39, androidx.compose.ui.graphics.d r40, Qa.l r41, b0.m r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.RemoteImageKt.AsyncImage(com.revenuecat.purchases.ui.revenuecatui.composables.ImageSource, e5.h, T4.d, androidx.compose.ui.e, A0.c, M0.f, java.lang.String, float, androidx.compose.ui.graphics.d, Qa.l, b0.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void Image(com.revenuecat.purchases.ui.revenuecatui.composables.ImageSource r27, com.revenuecat.purchases.ui.revenuecatui.composables.ImageSource r28, androidx.compose.ui.e r29, M0.f r30, java.lang.String r31, h5.a r32, float r33, androidx.compose.ui.graphics.d r34, b0.m r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.RemoteImageKt.Image(com.revenuecat.purchases.ui.revenuecatui.composables.ImageSource, com.revenuecat.purchases.ui.revenuecatui.composables.ImageSource, androidx.compose.ui.e, M0.f, java.lang.String, h5.a, float, androidx.compose.ui.graphics.d, b0.m, int, int):void");
    }

    private static final b Image$lambda$2(C0 c0) {
        return (b) c0.getValue();
    }

    private static final void Image$lambda$3(C0 c0, b bVar) {
        c0.setValue(bVar);
    }

    private static final void ImageForPreviews(e eVar, m mVar, int i) {
        int i2;
        m i3 = mVar.i(-523416196);
        if ((i & 6) == 0) {
            i2 = (i3.U(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(-523416196, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.ImageForPreviews (RemoteImage.kt:211)");
            }
            F.f.a(androidx.compose.foundation.a.d(eVar, E.a.a(i3, E.b).C(), (E1) null, 2, (Object) null), i3, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 1(eVar, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LocalImage(int r21, androidx.compose.ui.e r22, M0.f r23, java.lang.String r24, h5.a r25, float r26, androidx.compose.ui.graphics.d r27, b0.m r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.RemoteImageKt.LocalImage(int, androidx.compose.ui.e, M0.f, java.lang.String, h5.a, float, androidx.compose.ui.graphics.d, b0.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void RemoteImage(java.lang.String r24, androidx.compose.ui.e r25, java.lang.String r26, M0.f r27, java.lang.String r28, h5.a r29, float r30, androidx.compose.ui.graphics.d r31, b0.m r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.RemoteImageKt.RemoteImage(java.lang.String, androidx.compose.ui.e, java.lang.String, M0.f, java.lang.String, h5.a, float, androidx.compose.ui.graphics.d, b0.m, int, int):void");
    }

    public static final /* synthetic */ void access$AsyncImage(ImageSource imageSource, h hVar, T4.d dVar, e eVar, c cVar, f fVar, String str, float f, d dVar2, l lVar, m mVar, int i, int i2) {
        AsyncImage(imageSource, hVar, dVar, eVar, cVar, fVar, str, f, dVar2, lVar, mVar, i, i2);
    }

    public static final /* synthetic */ void access$Image(ImageSource imageSource, ImageSource imageSource2, e eVar, f fVar, String str, a aVar, float f, d dVar, m mVar, int i, int i2) {
        Image(imageSource, imageSource2, eVar, fVar, str, aVar, f, dVar, mVar, i, i2);
    }

    public static final /* synthetic */ void access$Image$lambda$3(C0 c0, b bVar) {
        Image$lambda$3(c0, bVar);
    }

    public static final /* synthetic */ void access$ImageForPreviews(e eVar, m mVar, int i) {
        ImageForPreviews(eVar, mVar, i);
    }
}
