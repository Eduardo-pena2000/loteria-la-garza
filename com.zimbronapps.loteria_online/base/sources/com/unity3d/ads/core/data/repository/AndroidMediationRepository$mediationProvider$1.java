package com.unity3d.ads.core.data.repository;

import Qa.a;
import Za.B;
import gatewayprotocol.v1.ClientInfoOuterClass;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidMediationRepository$mediationProvider$1 extends u implements a {
    final /* synthetic */ AndroidMediationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidMediationRepository$mediationProvider$1(AndroidMediationRepository androidMediationRepository) {
        super(0);
        this.this$0 = androidMediationRepository;
    }

    public final ClientInfoOuterClass.MediationProvider invoke() {
        String name = this.this$0.getName();
        if (name != null) {
            ClientInfoOuterClass.MediationProvider mediationProvider = B.N(name, "AppLovinSdk_", false, 2, null) ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX : B.z(name, "AdMob", true) ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_ADMOB : B.z(name, "MAX", true) ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX : B.z(name, "ironSource", true) ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_LEVELPLAY : ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM;
            if (mediationProvider != null) {
                return mediationProvider;
            }
        }
        return ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_UNSPECIFIED;
    }
}
