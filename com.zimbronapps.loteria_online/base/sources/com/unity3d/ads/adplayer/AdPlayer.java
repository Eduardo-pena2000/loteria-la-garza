package com.unity3d.ads.adplayer;

import Ca.I;
import Ca.p;
import Ga.e;
import cb.O;
import cb.P;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import fb.F;
import fb.y;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface AdPlayer {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int OFFERWALL_EVENT_QUEUE_SIZE = 5;
    public static final int SCAR_EVENT_QUEUE_SIZE = 10;

    public static final class Companion {
        public static final int OFFERWALL_EVENT_QUEUE_SIZE = 5;
        public static final int SCAR_EVENT_QUEUE_SIZE = 10;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final y broadcastEventChannel = F.b(0, 0, null, 7, null);

        private Companion() {
        }

        public final y getBroadcastEventChannel() {
            return broadcastEventChannel;
        }
    }

    public static final class DefaultImpls {
        public static Object destroy(AdPlayer adPlayer, e eVar) {
            P.d(adPlayer.getScope(), null, 1, null);
            return I.a;
        }

        public static void show(AdPlayer adPlayer, ShowOptions showOptions) {
            t.g(showOptions, "showOptions");
            throw new p(null, 1, null);
        }
    }

    Object destroy(e eVar);

    void dispatchShowCompleted();

    fb.e getOnLoadEvent();

    fb.e getOnOfferwallEvent();

    fb.e getOnScarEvent();

    fb.e getOnShowEvent();

    O getScope();

    WebViewContainer getWebViewContainer();

    Object onAllowedPiiChange(byte[] bArr, e eVar);

    Object onBroadcastEvent(String str, e eVar);

    Object requestShow(Map map, e eVar);

    Object sendActivityDestroyed(e eVar);

    Object sendFocusChange(boolean z, e eVar);

    Object sendGmaEvent(c cVar, e eVar);

    Object sendMuteChange(boolean z, e eVar);

    Object sendOfferwallEvent(OfferwallEvent offerwallEvent, e eVar);

    Object sendPrivacyFsmChange(byte[] bArr, e eVar);

    Object sendScarBannerEvent(BannerBridge.BannerEvent bannerEvent, e eVar);

    Object sendUserConsentChange(byte[] bArr, e eVar);

    Object sendVisibilityChange(boolean z, e eVar);

    Object sendVolumeChange(double d, e eVar);

    void show(ShowOptions showOptions);
}
