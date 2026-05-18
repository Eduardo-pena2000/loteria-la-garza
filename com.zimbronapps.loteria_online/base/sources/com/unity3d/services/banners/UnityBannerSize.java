package com.unity3d.services.banners;

import Sa.c;
import android.content.Context;
import com.unity3d.services.core.misc.ViewUtilities;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class UnityBannerSize {
    private final int height;
    private final int width;
    public static final Companion Companion = new Companion(null);
    private static final UnityBannerSize leaderboard = new UnityBannerSize(728, 90);
    private static final UnityBannerSize iabStandard = new UnityBannerSize(468, 60);
    private static final UnityBannerSize standard = new UnityBannerSize(320, 50);

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final UnityBannerSize getDynamicSize(Context context) {
            t.g(context, "context");
            int d = c.d(ViewUtilities.dpFromPx(context, context.getResources().getDisplayMetrics().widthPixels));
            return d >= getLeaderboard().getWidth() ? getLeaderboard() : d >= getIabStandard().getWidth() ? getIabStandard() : getStandard();
        }

        public final UnityBannerSize getIabStandard() {
            return UnityBannerSize.access$getIabStandard$cp();
        }

        public final UnityBannerSize getLeaderboard() {
            return UnityBannerSize.access$getLeaderboard$cp();
        }

        public final UnityBannerSize getStandard() {
            return UnityBannerSize.access$getStandard$cp();
        }

        private Companion() {
        }
    }

    public UnityBannerSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public static final /* synthetic */ UnityBannerSize access$getIabStandard$cp() {
        return iabStandard;
    }

    public static final /* synthetic */ UnityBannerSize access$getLeaderboard$cp() {
        return leaderboard;
    }

    public static final /* synthetic */ UnityBannerSize access$getStandard$cp() {
        return standard;
    }

    public static final UnityBannerSize getDynamicSize(Context context) {
        return Companion.getDynamicSize(context);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }
}
