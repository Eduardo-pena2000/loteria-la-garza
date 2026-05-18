package com.google.android.ump;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.consent_sdk.zzct;
import com.google.android.gms.internal.consent_sdk.zzdb;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class ConsentDebugSettings {
    public final boolean a;
    public final int b;

    public static class Builder {
        public final Context b;
        public boolean d;
        public final List a = new ArrayList();
        public int c = 0;

        public Builder(@RecentlyNonNull Context context) {
            this.b = context.getApplicationContext();
        }

        public static /* bridge */ /* synthetic */ int a(Builder builder) {
            return builder.c;
        }

        @RecentlyNonNull
        public Builder addTestDeviceHashedId(@RecentlyNonNull String str) {
            this.a.add(str);
            return this;
        }

        @RecentlyNonNull
        public ConsentDebugSettings build() {
            boolean z = true;
            if (!zzdb.zza(true) && !this.a.contains(zzct.zza(this.b)) && !this.d) {
                z = false;
            }
            return new ConsentDebugSettings(z, this, null);
        }

        @RecentlyNonNull
        public Builder setDebugGeography(int i) {
            this.c = i;
            return this;
        }

        @RecentlyNonNull
        public Builder setForceTesting(boolean z) {
            this.d = z;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface DebugGeography {
        public static final int DEBUG_GEOGRAPHY_DISABLED = 0;
        public static final int DEBUG_GEOGRAPHY_EEA = 1;

        @Deprecated
        public static final int DEBUG_GEOGRAPHY_NOT_EEA = 2;
        public static final int DEBUG_GEOGRAPHY_OTHER = 4;
        public static final int DEBUG_GEOGRAPHY_REGULATED_US_STATE = 3;
    }

    public /* synthetic */ ConsentDebugSettings(boolean z, Builder builder, zza zzaVar) {
        this.a = z;
        this.b = Builder.a(builder);
    }

    public int getDebugGeography() {
        return this.b;
    }

    public boolean isTestDevice() {
        return this.a;
    }
}
