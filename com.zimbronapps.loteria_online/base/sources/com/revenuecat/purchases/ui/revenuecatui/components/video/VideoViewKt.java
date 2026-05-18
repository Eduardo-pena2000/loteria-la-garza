package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Ca.I;
import M0.f;
import Qa.l;
import Qa.p;
import androidx.compose.ui.e;
import b0.g1;
import b0.m;
import com.revenuecat.purchases.ui.revenuecatui.components.video.TextureVideoView;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoViewKt {

    public static final class 4 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ boolean $autoPlay;
        final /* synthetic */ boolean $loop;
        final /* synthetic */ e $modifier;
        final /* synthetic */ boolean $muteAudio;
        final /* synthetic */ Qa.a $onReady;
        final /* synthetic */ TextureVideoView.ScaleType $scaleType;
        final /* synthetic */ boolean $showControls;
        final /* synthetic */ String $videoUri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(TextureVideoView.ScaleType scaleType, String str, boolean z, boolean z2, boolean z3, boolean z4, e eVar, Qa.a aVar, int i, int i2) {
            super(2);
            this.$scaleType = scaleType;
            this.$videoUri = str;
            this.$showControls = z;
            this.$autoPlay = z2;
            this.$loop = z3;
            this.$muteAudio = z4;
            this.$modifier = eVar;
            this.$onReady = aVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            VideoViewKt.access$Video(this.$scaleType, this.$videoUri, this.$showControls, this.$autoPlay, this.$loop, this.$muteAudio, this.$modifier, this.$onReady, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ boolean $autoPlay;
        final /* synthetic */ f $contentScale;
        final /* synthetic */ boolean $loop;
        final /* synthetic */ e $modifier;
        final /* synthetic */ boolean $muteAudio;
        final /* synthetic */ Qa.a $onReady;
        final /* synthetic */ boolean $showControls;
        final /* synthetic */ String $videoUri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(String str, e eVar, boolean z, boolean z2, boolean z3, boolean z4, f fVar, Qa.a aVar, int i, int i2) {
            super(2);
            this.$videoUri = str;
            this.$modifier = eVar;
            this.$showControls = z;
            this.$autoPlay = z2;
            this.$loop = z3;
            this.$muteAudio = z4;
            this.$contentScale = fVar;
            this.$onReady = aVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            VideoViewKt.VideoView(this.$videoUri, this.$modifier, this.$showControls, this.$autoPlay, this.$loop, this.$muteAudio, this.$contentScale, this.$onReady, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(1);
        }

        public final Void invoke(Exception it) {
            t.g(it, "it");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void Video(com.revenuecat.purchases.ui.revenuecatui.components.video.TextureVideoView.ScaleType r28, java.lang.String r29, boolean r30, boolean r31, boolean r32, boolean r33, androidx.compose.ui.e r34, Qa.a r35, b0.m r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 925
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.video.VideoViewKt.Video(com.revenuecat.purchases.ui.revenuecatui.components.video.TextureVideoView$ScaleType, java.lang.String, boolean, boolean, boolean, boolean, androidx.compose.ui.e, Qa.a, b0.m, int, int):void");
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
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void VideoView(java.lang.String r23, androidx.compose.ui.e r24, boolean r25, boolean r26, boolean r27, boolean r28, M0.f r29, Qa.a r30, b0.m r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.video.VideoViewKt.VideoView(java.lang.String, androidx.compose.ui.e, boolean, boolean, boolean, boolean, M0.f, Qa.a, b0.m, int, int):void");
    }

    public static final /* synthetic */ void access$Video(TextureVideoView.ScaleType scaleType, String str, boolean z, boolean z2, boolean z3, boolean z4, e eVar, Qa.a aVar, m mVar, int i, int i2) {
        Video(scaleType, str, z, z2, z3, z4, eVar, aVar, mVar, i, i2);
    }

    public static final /* synthetic */ void access$safely(Qa.a aVar, l lVar) {
        safely(aVar, lVar);
    }

    private static final void safely(Qa.a aVar, l lVar) {
        try {
            aVar.invoke();
        } catch (Exception e) {
            String str = (String) lVar.invoke(e);
            if (str != null) {
                Logger.INSTANCE.e("TextureVideoView: " + str, e);
            }
        }
    }

    public static /* synthetic */ void safely$default(Qa.a aVar, l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = 1.INSTANCE;
        }
        safely(aVar, lVar);
    }
}
