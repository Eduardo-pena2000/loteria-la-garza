package com.google.android.ump;

import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class ConsentRequestParameters {
    public final boolean a;
    public final String b;
    public final ConsentDebugSettings c;
    public final String d;

    public static final class Builder {
        public boolean a;
        public String b;
        public ConsentDebugSettings c;
        public String d;

        public static /* bridge */ /* synthetic */ ConsentDebugSettings a(Builder builder) {
            return builder.c;
        }

        public static /* bridge */ /* synthetic */ String b(Builder builder) {
            return builder.b;
        }

        public static /* bridge */ /* synthetic */ String c(Builder builder) {
            return builder.d;
        }

        public static /* bridge */ /* synthetic */ boolean d(Builder builder) {
            return builder.a;
        }

        @RecentlyNonNull
        public ConsentRequestParameters build() {
            return new ConsentRequestParameters(this, null);
        }

        @RecentlyNonNull
        public Builder setAdMobAppId(String str) {
            this.b = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setConsentDebugSettings(ConsentDebugSettings consentDebugSettings) {
            this.c = consentDebugSettings;
            return this;
        }

        @RecentlyNonNull
        public Builder setConsentSyncId(@RecentlyNonNull String str) {
            if (str == null) {
                str = null;
            } else if (!str.matches("^[0-9a-zA-Z+.=\\/_,$\\-{}]{22,150}$")) {
                Log.e("UserMessagingPlatform", "The UMP SDK requires a valid consent sync ID matching the following regex: ^[0-9a-zA-Z+.=\\/_,$\\-{}]{22,150}$. See the setConsentSyncId() API documentation for more details.");
                return this;
            }
            this.d = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setTagForUnderAgeOfConsent(boolean z) {
            this.a = z;
            return this;
        }
    }

    public /* synthetic */ ConsentRequestParameters(Builder builder, zzb zzbVar) {
        this.a = Builder.d(builder);
        this.b = Builder.b(builder);
        this.c = Builder.a(builder);
        this.d = Builder.c(builder);
    }

    @RecentlyNullable
    public ConsentDebugSettings getConsentDebugSettings() {
        return this.c;
    }

    @RecentlyNullable
    public String getConsentSyncId() {
        return this.d;
    }

    public boolean isTagForUnderAgeOfConsent() {
        return this.a;
    }

    @RecentlyNullable
    public final String zza() {
        return this.b;
    }
}
