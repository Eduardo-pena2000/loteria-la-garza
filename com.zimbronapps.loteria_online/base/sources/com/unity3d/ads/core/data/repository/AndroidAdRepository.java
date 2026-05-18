package com.unity3d.ads.core.data.repository;

import Da.A;
import Da.S;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidAdRepository implements AdRepository {
    private final ConcurrentHashMap loadedAds = new ConcurrentHashMap();
    private final ConcurrentHashMap placementsLoadedAds = new ConcurrentHashMap();

    public void addAd(ByteString opportunityId, AdObject adObject) {
        t.g(opportunityId, "opportunityId");
        t.g(adObject, "adObject");
        this.loadedAds.put(opportunityId, adObject);
    }

    public void enqueueOpportunityForPlacement(String placementId, ByteString opportunityId) {
        Object putIfAbsent;
        t.g(placementId, "placementId");
        t.g(opportunityId, "opportunityId");
        ConcurrentHashMap concurrentHashMap = this.placementsLoadedAds;
        Object obj = concurrentHashMap.get(placementId);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(placementId, (obj = new ArrayList()))) != null) {
            obj = putIfAbsent;
        }
        ((List) obj).add(opportunityId);
    }

    public AdObject getAd(ByteString opportunityId) {
        t.g(opportunityId, "opportunityId");
        return (AdObject) this.loadedAds.get(opportunityId);
    }

    public Map getAllAds() {
        return S.z(this.loadedAds);
    }

    public boolean hasOpportunityId(ByteString opportunityId) {
        t.g(opportunityId, "opportunityId");
        return this.loadedAds.containsKey(opportunityId);
    }

    public ByteString pollOpportunityIdForPlacement(String placementId) {
        t.g(placementId, "placementId");
        List list = (List) this.placementsLoadedAds.get(placementId);
        if (list != null) {
            return (ByteString) A.K(list);
        }
        return null;
    }

    public void removeAd(ByteString opportunityId) {
        t.g(opportunityId, "opportunityId");
        this.loadedAds.remove(opportunityId);
    }
}
