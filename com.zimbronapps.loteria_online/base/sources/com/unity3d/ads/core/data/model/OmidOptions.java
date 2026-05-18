package com.unity3d.ads.core.data.model;

import Q8.f;
import Q8.h;
import Q8.j;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OmidOptions {
    private final f creativeType;
    private final String customReferenceData;
    private final j impressionOwner;
    private final h impressionType;
    private final boolean isolateVerificationScripts;
    private final j mediaEventsOwner;
    private final j videoEventsOwner;

    public OmidOptions() {
        this(false, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OmidOptions copy$default(OmidOptions omidOptions, boolean z, j jVar, j jVar2, String str, h hVar, f fVar, j jVar3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = omidOptions.isolateVerificationScripts;
        }
        if ((i & 2) != 0) {
            jVar = omidOptions.impressionOwner;
        }
        j jVar4 = jVar;
        if ((i & 4) != 0) {
            jVar2 = omidOptions.videoEventsOwner;
        }
        j jVar5 = jVar2;
        if ((i & 8) != 0) {
            str = omidOptions.customReferenceData;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            hVar = omidOptions.impressionType;
        }
        h hVar2 = hVar;
        if ((i & 32) != 0) {
            fVar = omidOptions.creativeType;
        }
        f fVar2 = fVar;
        if ((i & 64) != 0) {
            jVar3 = omidOptions.mediaEventsOwner;
        }
        return omidOptions.copy(z, jVar4, jVar5, str2, hVar2, fVar2, jVar3);
    }

    public final boolean component1() {
        return this.isolateVerificationScripts;
    }

    public final j component2() {
        return this.impressionOwner;
    }

    public final j component3() {
        return this.videoEventsOwner;
    }

    public final String component4() {
        return this.customReferenceData;
    }

    public final h component5() {
        return this.impressionType;
    }

    public final f component6() {
        return this.creativeType;
    }

    public final j component7() {
        return this.mediaEventsOwner;
    }

    public final OmidOptions copy(boolean z, j jVar, j jVar2, String str, h hVar, f fVar, j jVar3) {
        return new OmidOptions(z, jVar, jVar2, str, hVar, fVar, jVar3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OmidOptions)) {
            return false;
        }
        OmidOptions omidOptions = (OmidOptions) obj;
        return this.isolateVerificationScripts == omidOptions.isolateVerificationScripts && this.impressionOwner == omidOptions.impressionOwner && this.videoEventsOwner == omidOptions.videoEventsOwner && t.c(this.customReferenceData, omidOptions.customReferenceData) && this.impressionType == omidOptions.impressionType && this.creativeType == omidOptions.creativeType && this.mediaEventsOwner == omidOptions.mediaEventsOwner;
    }

    public final f getCreativeType() {
        return this.creativeType;
    }

    public final String getCustomReferenceData() {
        return this.customReferenceData;
    }

    public final j getImpressionOwner() {
        return this.impressionOwner;
    }

    public final h getImpressionType() {
        return this.impressionType;
    }

    public final boolean getIsolateVerificationScripts() {
        return this.isolateVerificationScripts;
    }

    public final j getMediaEventsOwner() {
        return this.mediaEventsOwner;
    }

    public final j getVideoEventsOwner() {
        return this.videoEventsOwner;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    public int hashCode() {
        boolean z = this.isolateVerificationScripts;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        j jVar = this.impressionOwner;
        int hashCode = (i + (jVar == null ? 0 : jVar.hashCode())) * 31;
        j jVar2 = this.videoEventsOwner;
        int hashCode2 = (hashCode + (jVar2 == null ? 0 : jVar2.hashCode())) * 31;
        String str = this.customReferenceData;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        h hVar = this.impressionType;
        int hashCode4 = (hashCode3 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        f fVar = this.creativeType;
        int hashCode5 = (hashCode4 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        j jVar3 = this.mediaEventsOwner;
        return hashCode5 + (jVar3 != null ? jVar3.hashCode() : 0);
    }

    public String toString() {
        return "OmidOptions(isolateVerificationScripts=" + this.isolateVerificationScripts + ", impressionOwner=" + this.impressionOwner + ", videoEventsOwner=" + this.videoEventsOwner + ", customReferenceData=" + this.customReferenceData + ", impressionType=" + this.impressionType + ", creativeType=" + this.creativeType + ", mediaEventsOwner=" + this.mediaEventsOwner + ')';
    }

    public OmidOptions(boolean z, j jVar, j jVar2, String str, h hVar, f fVar, j jVar3) {
        this.isolateVerificationScripts = z;
        this.impressionOwner = jVar;
        this.videoEventsOwner = jVar2;
        this.customReferenceData = str;
        this.impressionType = hVar;
        this.creativeType = fVar;
        this.mediaEventsOwner = jVar3;
    }

    public /* synthetic */ OmidOptions(boolean z, j jVar, j jVar2, String str, h hVar, f fVar, j jVar3, int i, k kVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : jVar, (i & 4) != 0 ? null : jVar2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : hVar, (i & 32) != 0 ? null : fVar, (i & 64) == 0 ? jVar3 : null);
    }
}
