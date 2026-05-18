package com.applovin.mediation.adapter.parameters;

import android.os.Bundle;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface MaxAdapterParameters {
    String getAdUnitId();

    String getConsentString();

    Bundle getCustomParameters();

    Map getLocalExtraParameters();

    Bundle getServerParameters();

    Boolean hasUserConsent();

    @Deprecated
    Boolean isAgeRestrictedUser();

    Boolean isDoNotSell();

    boolean isTesting();
}
