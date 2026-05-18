package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class MaxNetworkResponseInfoImpl implements MaxNetworkResponseInfo {
    private final MaxNetworkResponseInfo.AdLoadState a;
    private final MaxMediatedNetworkInfo b;
    private final Bundle c;
    private final boolean d;
    private final long e;
    private final String f;
    private final MaxError g;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MaxNetworkResponseInfo.AdLoadState.values().length];
            a = iArr;
            try {
                iArr[MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[MaxNetworkResponseInfo.AdLoadState.AD_LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MaxNetworkResponseInfoImpl(MaxNetworkResponseInfo.AdLoadState adLoadState, MaxMediatedNetworkInfo maxMediatedNetworkInfo, Bundle bundle, boolean z, long j, String str, MaxError maxError) {
        this.a = adLoadState;
        this.b = maxMediatedNetworkInfo;
        this.c = bundle;
        this.d = z;
        this.e = j;
        this.f = str;
        this.g = maxError;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof MaxNetworkResponseInfoImpl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MaxNetworkResponseInfoImpl)) {
            return false;
        }
        MaxNetworkResponseInfoImpl maxNetworkResponseInfoImpl = (MaxNetworkResponseInfoImpl) obj;
        if (!maxNetworkResponseInfoImpl.canEqual(this) || isBidding() != maxNetworkResponseInfoImpl.isBidding() || getLatencyMillis() != maxNetworkResponseInfoImpl.getLatencyMillis()) {
            return false;
        }
        MaxNetworkResponseInfo.AdLoadState adLoadState = getAdLoadState();
        MaxNetworkResponseInfo.AdLoadState adLoadState2 = maxNetworkResponseInfoImpl.getAdLoadState();
        if (adLoadState != null ? !adLoadState.equals(adLoadState2) : adLoadState2 != null) {
            return false;
        }
        MaxMediatedNetworkInfo mediatedNetwork = getMediatedNetwork();
        MaxMediatedNetworkInfo mediatedNetwork2 = maxNetworkResponseInfoImpl.getMediatedNetwork();
        if (mediatedNetwork != null ? !mediatedNetwork.equals(mediatedNetwork2) : mediatedNetwork2 != null) {
            return false;
        }
        Bundle credentials = getCredentials();
        Bundle credentials2 = maxNetworkResponseInfoImpl.getCredentials();
        if (credentials != null ? !credentials.equals(credentials2) : credentials2 != null) {
            return false;
        }
        String bCode = getBCode();
        String bCode2 = maxNetworkResponseInfoImpl.getBCode();
        if (bCode != null ? !bCode.equals(bCode2) : bCode2 != null) {
            return false;
        }
        MaxError error = getError();
        MaxError error2 = maxNetworkResponseInfoImpl.getError();
        return error != null ? error.equals(error2) : error2 == null;
    }

    public MaxNetworkResponseInfo.AdLoadState getAdLoadState() {
        return this.a;
    }

    public String getBCode() {
        return this.f;
    }

    public Bundle getCredentials() {
        return this.c;
    }

    public MaxError getError() {
        return this.g;
    }

    public long getLatencyMillis() {
        return this.e;
    }

    public MaxMediatedNetworkInfo getMediatedNetwork() {
        return this.b;
    }

    public int hashCode() {
        int i = isBidding() ? 79 : 97;
        long latencyMillis = getLatencyMillis();
        int i2 = ((i + 59) * 59) + ((int) (latencyMillis ^ (latencyMillis >>> 32)));
        MaxNetworkResponseInfo.AdLoadState adLoadState = getAdLoadState();
        int hashCode = (i2 * 59) + (adLoadState == null ? 43 : adLoadState.hashCode());
        MaxMediatedNetworkInfo mediatedNetwork = getMediatedNetwork();
        int hashCode2 = (hashCode * 59) + (mediatedNetwork == null ? 43 : mediatedNetwork.hashCode());
        Bundle credentials = getCredentials();
        int hashCode3 = (hashCode2 * 59) + (credentials == null ? 43 : credentials.hashCode());
        String bCode = getBCode();
        int hashCode4 = (hashCode3 * 59) + (bCode == null ? 43 : bCode.hashCode());
        MaxError error = getError();
        return (hashCode4 * 59) + (error != null ? error.hashCode() : 43);
    }

    public boolean isBidding() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MaxResponseInfo{adLoadState=" + this.a + ", mediatedNetwork=" + this.b + ", credentials=" + this.c + ", isBidding=" + this.d);
        int i = a.a[this.a.ordinal()];
        if (i != 1) {
            if (i == 2) {
            }
            sb.append("}");
            return sb.toString();
        }
        sb.append(", error=");
        sb.append(this.g);
        sb.append(", latencyMillis=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
