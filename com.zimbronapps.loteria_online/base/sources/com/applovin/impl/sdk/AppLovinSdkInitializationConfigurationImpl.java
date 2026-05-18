package com.applovin.impl.sdk;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxSegmentCollection;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class AppLovinSdkInitializationConfigurationImpl extends AppLovinSdkInitializationConfiguration {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final MaxSegmentCollection e;
    private final List f;
    private final List g;
    private final boolean h;

    public static class BuilderImpl implements AppLovinSdkInitializationConfiguration.Builder {
        private String a;
        private final String b;
        private String c;
        private String d;
        private MaxSegmentCollection e;
        private List f = Collections.emptyList();
        private List g = Collections.emptyList();
        private boolean h = true;

        public BuilderImpl(String str, String str2) {
            this.a = str;
            this.b = str2;
            o.e("AppLovinSdkInitializationConfiguration", "Initializing with key: " + str);
        }

        public static /* synthetic */ String a(BuilderImpl builderImpl) {
            return builderImpl.a;
        }

        public static /* synthetic */ String b(BuilderImpl builderImpl) {
            return builderImpl.b;
        }

        public static /* synthetic */ String c(BuilderImpl builderImpl) {
            return builderImpl.c;
        }

        public static /* synthetic */ String d(BuilderImpl builderImpl) {
            return builderImpl.d;
        }

        public static /* synthetic */ MaxSegmentCollection e(BuilderImpl builderImpl) {
            return builderImpl.e;
        }

        public static /* synthetic */ List f(BuilderImpl builderImpl) {
            return builderImpl.f;
        }

        public static /* synthetic */ List g(BuilderImpl builderImpl) {
            return builderImpl.g;
        }

        public static /* synthetic */ boolean h(BuilderImpl builderImpl) {
            return builderImpl.h;
        }

        public AppLovinSdkInitializationConfiguration build() {
            return new AppLovinSdkInitializationConfigurationImpl(this, null);
        }

        public List getAdUnitIds() {
            return this.g;
        }

        public String getAxonEventKey() {
            return this.b;
        }

        public String getMediationProvider() {
            return this.c;
        }

        public String getPluginVersion() {
            return this.d;
        }

        public String getSdkKey() {
            return this.a;
        }

        public MaxSegmentCollection getSegmentCollection() {
            return this.e;
        }

        public List getTestDeviceAdvertisingIds() {
            return this.f;
        }

        public boolean isExceptionHandlerEnabled() {
            return this.h;
        }

        public AppLovinSdkInitializationConfiguration.Builder setAdUnitIds(List list) {
            o.e("AppLovinSdkInitializationConfiguration", "setAdUnitIds(adUnitIds=" + list + ")");
            if (list == null) {
                return this;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (StringUtils.isValidString(str) && str.length() > 0) {
                    if (str.length() == 16) {
                        arrayList.add(str);
                    } else {
                        o.h("AppLovinSdkInitializationConfiguration", "Unable to set initialization ad unit id (" + str + ") - please make sure it is in the format of XXXXXXXXXXXXXXXX");
                    }
                }
            }
            this.g = arrayList;
            return this;
        }

        public AppLovinSdkInitializationConfiguration.Builder setExceptionHandlerEnabled(boolean z) {
            o.e("AppLovinSdkInitializationConfiguration", "setExceptionHandlerEnabled(exceptionHandlerEnabled=" + z + ")");
            this.h = z;
            return this;
        }

        public AppLovinSdkInitializationConfiguration.Builder setMediationProvider(String str) {
            o.e("AppLovinSdkInitializationConfiguration", "setMediationProvider(mediationProvider=" + str + ")");
            if (str == null || (!str.isEmpty() && str.length() <= 64 && StringUtils.isAlphaNumeric(str))) {
                this.c = str;
                return this;
            }
            o.h("AppLovinSdkInitializationConfiguration", "Mediation provider set to invalid value: " + str + ". Please use a valid mediation provider (e.g., AppLovinMediationProvider.MAX)");
            return this;
        }

        public AppLovinSdkInitializationConfiguration.Builder setPluginVersion(String str) {
            o.e("AppLovinSdkInitializationConfiguration", "setPluginVersion(pluginVersion=" + str + ")");
            this.d = str;
            return this;
        }

        public AppLovinSdkInitializationConfiguration.Builder setSdkKey(String str) {
            this.a = str;
            return this;
        }

        public AppLovinSdkInitializationConfiguration.Builder setSegmentCollection(MaxSegmentCollection maxSegmentCollection) {
            o.e("AppLovinSdkInitializationConfiguration", "setSegmentCollection(segmentCollection=" + maxSegmentCollection + ")");
            this.e = maxSegmentCollection;
            return this;
        }

        public AppLovinSdkInitializationConfiguration.Builder setTestDeviceAdvertisingIds(List list) {
            o.e("AppLovinSdkInitializationConfiguration", "setTestDeviceAdvertisingIds(testDeviceAdvertisingIds=" + list + ")");
            if (list == null) {
                return this;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str == null || str.length() != 36) {
                    o.h("AppLovinSdkInitializationConfiguration", "Unable to set test device advertising id (" + str + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
                } else {
                    arrayList.add(str);
                }
            }
            this.f = arrayList;
            return this;
        }

        public String toString() {
            return "AppLovinSdkInitializationConfiguration.Builder{ sdkKey=" + this.a + ", axonEventKey=" + this.b + ", mediationProvider=" + this.c + ", pluginVersion=" + this.d + ", testDeviceAdvertisingIdentifiers=" + this.f + ", adUnitIdentifiers=" + this.g + ", isExceptionHandlerEnabled=" + this.h + ", segmentCollection=" + this.e + "}";
        }
    }

    public /* synthetic */ AppLovinSdkInitializationConfigurationImpl(BuilderImpl builderImpl, a aVar) {
        this(builderImpl);
    }

    public List getAdUnitIds() {
        return this.g;
    }

    public String getAxonEventKey() {
        return this.b;
    }

    public String getMediationProvider() {
        return this.c;
    }

    public String getPluginVersion() {
        return this.d;
    }

    public String getSdkKey() {
        return this.a;
    }

    public MaxSegmentCollection getSegmentCollection() {
        return this.e;
    }

    public List getTestDeviceAdvertisingIds() {
        return this.f;
    }

    public boolean isExceptionHandlerEnabled() {
        return this.h;
    }

    public String toString() {
        return "AppLovinSdkInitializationConfiguration{ sdkKey=" + this.a + ", axonEventKey=" + this.b + ", mediationProvider=" + this.c + ", pluginVersion=" + this.d + ", testDeviceAdvertisingIds=" + this.f + ", adUnitIdentifiers=" + this.g + ", isExceptionHandlerEnabled=" + this.h + ", segmentCollection=" + this.e + "}";
    }

    private AppLovinSdkInitializationConfigurationImpl(BuilderImpl builderImpl) {
        this.a = BuilderImpl.a(builderImpl);
        this.b = BuilderImpl.b(builderImpl);
        this.c = BuilderImpl.c(builderImpl);
        this.d = BuilderImpl.d(builderImpl);
        this.e = BuilderImpl.e(builderImpl);
        this.f = BuilderImpl.f(builderImpl);
        this.g = BuilderImpl.g(builderImpl);
        this.h = BuilderImpl.h(builderImpl);
    }
}
