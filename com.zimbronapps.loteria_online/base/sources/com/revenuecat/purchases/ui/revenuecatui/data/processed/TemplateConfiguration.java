package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import A.q;
import Da.u;
import Da.w;
import android.net.Uri;
import b0.m;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TemplateConfiguration {
    public static final int $stable = 0;
    private final PaywallData.Configuration.ColorInformation colors;
    private final PaywallData.Configuration configuration;
    private final Colors darkModeColors;
    private final Images images;
    private final Map imagesByTier;
    private final Colors lightModeColors;
    private final Locale locale;
    private final PaywallMode mode;
    private final PackageConfiguration packages;
    private final PaywallTemplate template;

    public static final class Colors {
        public static final int $stable = 0;
        private final long accent1;
        private final long accent2;
        private final long accent3;
        private final long background;
        private final long callToActionBackground;
        private final long callToActionForeground;
        private final r0 callToActionSecondaryBackground;
        private final r0 closeButton;
        private final long text1;
        private final long text2;
        private final long text3;
        private final r0 tierControlBackground;
        private final r0 tierControlForeground;
        private final r0 tierControlSelectedBackground;
        private final r0 tierControlSelectedForeground;

        public /* synthetic */ Colors(long j, long j2, long j3, long j4, long j5, long j6, r0 r0Var, long j7, long j8, long j9, r0 r0Var2, r0 r0Var3, r0 r0Var4, r0 r0Var5, r0 r0Var6, k kVar) {
            this(j, j2, j3, j4, j5, j6, r0Var, j7, j8, j9, r0Var2, r0Var3, r0Var4, r0Var5, r0Var6);
        }

        public static /* synthetic */ Colors copy-VbAgQ-U$default(Colors colors, long j, long j2, long j3, long j4, long j5, long j6, r0 r0Var, long j7, long j8, long j9, r0 r0Var2, r0 r0Var3, r0 r0Var4, r0 r0Var5, r0 r0Var6, int i, Object obj) {
            return colors.copy-VbAgQ-U((i & 1) != 0 ? colors.background : j, (i & 2) != 0 ? colors.text1 : j2, (i & 4) != 0 ? colors.text2 : j3, (i & 8) != 0 ? colors.text3 : j4, (i & 16) != 0 ? colors.callToActionBackground : j5, (i & 32) != 0 ? colors.callToActionForeground : j6, (i & 64) != 0 ? colors.callToActionSecondaryBackground : r0Var, (i & 128) != 0 ? colors.accent1 : j7, (i & 256) != 0 ? colors.accent2 : j8, (i & 512) != 0 ? colors.accent3 : j9, (i & 1024) != 0 ? colors.closeButton : r0Var2, (i & 2048) != 0 ? colors.tierControlBackground : r0Var3, (i & 4096) != 0 ? colors.tierControlForeground : r0Var4, (i & 8192) != 0 ? colors.tierControlSelectedBackground : r0Var5, (i & 16384) != 0 ? colors.tierControlSelectedForeground : r0Var6);
        }

        public final long component1-0d7_KjU() {
            return this.background;
        }

        public final long component10-0d7_KjU() {
            return this.accent3;
        }

        public final r0 component11-QN2ZGVo() {
            return this.closeButton;
        }

        public final r0 component12-QN2ZGVo() {
            return this.tierControlBackground;
        }

        public final r0 component13-QN2ZGVo() {
            return this.tierControlForeground;
        }

        public final r0 component14-QN2ZGVo() {
            return this.tierControlSelectedBackground;
        }

        public final r0 component15-QN2ZGVo() {
            return this.tierControlSelectedForeground;
        }

        public final long component2-0d7_KjU() {
            return this.text1;
        }

        public final long component3-0d7_KjU() {
            return this.text2;
        }

        public final long component4-0d7_KjU() {
            return this.text3;
        }

        public final long component5-0d7_KjU() {
            return this.callToActionBackground;
        }

        public final long component6-0d7_KjU() {
            return this.callToActionForeground;
        }

        public final r0 component7-QN2ZGVo() {
            return this.callToActionSecondaryBackground;
        }

        public final long component8-0d7_KjU() {
            return this.accent1;
        }

        public final long component9-0d7_KjU() {
            return this.accent2;
        }

        public final Colors copy-VbAgQ-U(long j, long j2, long j3, long j4, long j5, long j6, r0 r0Var, long j7, long j8, long j9, r0 r0Var2, r0 r0Var3, r0 r0Var4, r0 r0Var5, r0 r0Var6) {
            return new Colors(j, j2, j3, j4, j5, j6, r0Var, j7, j8, j9, r0Var2, r0Var3, r0Var4, r0Var5, r0Var6, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Colors)) {
                return false;
            }
            Colors colors = (Colors) obj;
            return r0.s(this.background, colors.background) && r0.s(this.text1, colors.text1) && r0.s(this.text2, colors.text2) && r0.s(this.text3, colors.text3) && r0.s(this.callToActionBackground, colors.callToActionBackground) && r0.s(this.callToActionForeground, colors.callToActionForeground) && t.c(this.callToActionSecondaryBackground, colors.callToActionSecondaryBackground) && r0.s(this.accent1, colors.accent1) && r0.s(this.accent2, colors.accent2) && r0.s(this.accent3, colors.accent3) && t.c(this.closeButton, colors.closeButton) && t.c(this.tierControlBackground, colors.tierControlBackground) && t.c(this.tierControlForeground, colors.tierControlForeground) && t.c(this.tierControlSelectedBackground, colors.tierControlSelectedBackground) && t.c(this.tierControlSelectedForeground, colors.tierControlSelectedForeground);
        }

        public final long getAccent1-0d7_KjU() {
            return this.accent1;
        }

        public final long getAccent2-0d7_KjU() {
            return this.accent2;
        }

        public final long getAccent3-0d7_KjU() {
            return this.accent3;
        }

        public final long getBackground-0d7_KjU() {
            return this.background;
        }

        public final long getCallToActionBackground-0d7_KjU() {
            return this.callToActionBackground;
        }

        public final long getCallToActionForeground-0d7_KjU() {
            return this.callToActionForeground;
        }

        public final r0 getCallToActionSecondaryBackground-QN2ZGVo() {
            return this.callToActionSecondaryBackground;
        }

        public final r0 getCloseButton-QN2ZGVo() {
            return this.closeButton;
        }

        public final long getText1-0d7_KjU() {
            return this.text1;
        }

        public final long getText2-0d7_KjU() {
            return this.text2;
        }

        public final long getText3-0d7_KjU() {
            return this.text3;
        }

        public final r0 getTierControlBackground-QN2ZGVo() {
            return this.tierControlBackground;
        }

        public final r0 getTierControlForeground-QN2ZGVo() {
            return this.tierControlForeground;
        }

        public final r0 getTierControlSelectedBackground-QN2ZGVo() {
            return this.tierControlSelectedBackground;
        }

        public final r0 getTierControlSelectedForeground-QN2ZGVo() {
            return this.tierControlSelectedForeground;
        }

        public int hashCode() {
            int y = ((((((((((r0.y(this.background) * 31) + r0.y(this.text1)) * 31) + r0.y(this.text2)) * 31) + r0.y(this.text3)) * 31) + r0.y(this.callToActionBackground)) * 31) + r0.y(this.callToActionForeground)) * 31;
            r0 r0Var = this.callToActionSecondaryBackground;
            int y2 = (((((((y + (r0Var == null ? 0 : r0.y(r0Var.A()))) * 31) + r0.y(this.accent1)) * 31) + r0.y(this.accent2)) * 31) + r0.y(this.accent3)) * 31;
            r0 r0Var2 = this.closeButton;
            int y3 = (y2 + (r0Var2 == null ? 0 : r0.y(r0Var2.A()))) * 31;
            r0 r0Var3 = this.tierControlBackground;
            int y4 = (y3 + (r0Var3 == null ? 0 : r0.y(r0Var3.A()))) * 31;
            r0 r0Var4 = this.tierControlForeground;
            int y5 = (y4 + (r0Var4 == null ? 0 : r0.y(r0Var4.A()))) * 31;
            r0 r0Var5 = this.tierControlSelectedBackground;
            int y6 = (y5 + (r0Var5 == null ? 0 : r0.y(r0Var5.A()))) * 31;
            r0 r0Var6 = this.tierControlSelectedForeground;
            return y6 + (r0Var6 != null ? r0.y(r0Var6.A()) : 0);
        }

        public String toString() {
            return "Colors(background=" + r0.z(this.background) + ", text1=" + r0.z(this.text1) + ", text2=" + r0.z(this.text2) + ", text3=" + r0.z(this.text3) + ", callToActionBackground=" + r0.z(this.callToActionBackground) + ", callToActionForeground=" + r0.z(this.callToActionForeground) + ", callToActionSecondaryBackground=" + this.callToActionSecondaryBackground + ", accent1=" + r0.z(this.accent1) + ", accent2=" + r0.z(this.accent2) + ", accent3=" + r0.z(this.accent3) + ", closeButton=" + this.closeButton + ", tierControlBackground=" + this.tierControlBackground + ", tierControlForeground=" + this.tierControlForeground + ", tierControlSelectedBackground=" + this.tierControlSelectedBackground + ", tierControlSelectedForeground=" + this.tierControlSelectedForeground + ')';
        }

        private Colors(long j, long j2, long j3, long j4, long j5, long j6, r0 r0Var, long j7, long j8, long j9, r0 r0Var2, r0 r0Var3, r0 r0Var4, r0 r0Var5, r0 r0Var6) {
            this.background = j;
            this.text1 = j2;
            this.text2 = j3;
            this.text3 = j4;
            this.callToActionBackground = j5;
            this.callToActionForeground = j6;
            this.callToActionSecondaryBackground = r0Var;
            this.accent1 = j7;
            this.accent2 = j8;
            this.accent3 = j9;
            this.closeButton = r0Var2;
            this.tierControlBackground = r0Var3;
            this.tierControlForeground = r0Var4;
            this.tierControlSelectedBackground = r0Var5;
            this.tierControlSelectedForeground = r0Var6;
        }
    }

    public static final class Images {
        public static final int $stable = 0;
        private final Uri backgroundUri;
        private final Uri headerUri;
        private final Uri iconUri;

        public Images(Uri uri, Uri uri2, Uri uri3) {
            this.iconUri = uri;
            this.backgroundUri = uri2;
            this.headerUri = uri3;
        }

        public static /* synthetic */ Images copy$default(Images images, Uri uri, Uri uri2, Uri uri3, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = images.iconUri;
            }
            if ((i & 2) != 0) {
                uri2 = images.backgroundUri;
            }
            if ((i & 4) != 0) {
                uri3 = images.headerUri;
            }
            return images.copy(uri, uri2, uri3);
        }

        public final Uri component1() {
            return this.iconUri;
        }

        public final Uri component2() {
            return this.backgroundUri;
        }

        public final Uri component3() {
            return this.headerUri;
        }

        public final Images copy(Uri uri, Uri uri2, Uri uri3) {
            return new Images(uri, uri2, uri3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Images)) {
                return false;
            }
            Images images = (Images) obj;
            return t.c(this.iconUri, images.iconUri) && t.c(this.backgroundUri, images.backgroundUri) && t.c(this.headerUri, images.headerUri);
        }

        public final Uri getBackgroundUri() {
            return this.backgroundUri;
        }

        public final Uri getHeaderUri() {
            return this.headerUri;
        }

        public final Uri getIconUri() {
            return this.iconUri;
        }

        public int hashCode() {
            Uri uri = this.iconUri;
            int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            Uri uri2 = this.backgroundUri;
            int hashCode2 = (hashCode + (uri2 == null ? 0 : uri2.hashCode())) * 31;
            Uri uri3 = this.headerUri;
            return hashCode2 + (uri3 != null ? uri3.hashCode() : 0);
        }

        public String toString() {
            return "Images(iconUri=" + this.iconUri + ", backgroundUri=" + this.backgroundUri + ", headerUri=" + this.headerUri + ')';
        }
    }

    public static abstract class PackageConfiguration {
        public static final int $stable = 0;

        public static final class MultiPackage {
            public static final int $stable = 0;
            private final List all;
            private final PackageInfo default;
            private final PackageInfo first;

            public MultiPackage(PackageInfo first, PackageInfo packageInfo, List all) {
                t.g(first, "first");
                t.g(packageInfo, "default");
                t.g(all, "all");
                this.first = first;
                this.default = packageInfo;
                this.all = all;
            }

            public static /* synthetic */ MultiPackage copy$default(MultiPackage multiPackage, PackageInfo packageInfo, PackageInfo packageInfo2, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    packageInfo = multiPackage.first;
                }
                if ((i & 2) != 0) {
                    packageInfo2 = multiPackage.default;
                }
                if ((i & 4) != 0) {
                    list = multiPackage.all;
                }
                return multiPackage.copy(packageInfo, packageInfo2, list);
            }

            public final PackageInfo component1() {
                return this.first;
            }

            public final PackageInfo component2() {
                return this.default;
            }

            public final List component3() {
                return this.all;
            }

            public final MultiPackage copy(PackageInfo first, PackageInfo packageInfo, List all) {
                t.g(first, "first");
                t.g(packageInfo, "default");
                t.g(all, "all");
                return new MultiPackage(first, packageInfo, all);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MultiPackage)) {
                    return false;
                }
                MultiPackage multiPackage = (MultiPackage) obj;
                return t.c(this.first, multiPackage.first) && t.c(this.default, multiPackage.default) && t.c(this.all, multiPackage.all);
            }

            public final List getAll() {
                return this.all;
            }

            public final PackageInfo getDefault() {
                return this.default;
            }

            public final PackageInfo getFirst() {
                return this.first;
            }

            public int hashCode() {
                return (((this.first.hashCode() * 31) + this.default.hashCode()) * 31) + this.all.hashCode();
            }

            public String toString() {
                return "MultiPackage(first=" + this.first + ", default=" + this.default + ", all=" + this.all + ')';
            }
        }

        public static final class MultiTier extends PackageConfiguration {
            public static final int $stable = 0;
            private final List allTiers;
            private final TierInfo defaultTier;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MultiTier(TierInfo defaultTier, List allTiers) {
                super(null);
                t.g(defaultTier, "defaultTier");
                t.g(allTiers, "allTiers");
                this.defaultTier = defaultTier;
                this.allTiers = allTiers;
            }

            public static /* synthetic */ MultiTier copy$default(MultiTier multiTier, TierInfo tierInfo, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    tierInfo = multiTier.defaultTier;
                }
                if ((i & 2) != 0) {
                    list = multiTier.allTiers;
                }
                return multiTier.copy(tierInfo, list);
            }

            public final TierInfo component1() {
                return this.defaultTier;
            }

            public final List component2() {
                return this.allTiers;
            }

            public final MultiTier copy(TierInfo defaultTier, List allTiers) {
                t.g(defaultTier, "defaultTier");
                t.g(allTiers, "allTiers");
                return new MultiTier(defaultTier, allTiers);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MultiTier)) {
                    return false;
                }
                MultiTier multiTier = (MultiTier) obj;
                return t.c(this.defaultTier, multiTier.defaultTier) && t.c(this.allTiers, multiTier.allTiers);
            }

            public List getAll() {
                List list = this.allTiers;
                ArrayList arrayList = new ArrayList(w.y(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((TierInfo) it.next()).getPackages());
                }
                return w.A(arrayList);
            }

            public final List getAllTiers() {
                return this.allTiers;
            }

            public PackageInfo getDefault() {
                return this.defaultTier.getDefaultPackage();
            }

            public final TierInfo getDefaultTier() {
                return this.defaultTier;
            }

            public int hashCode() {
                return (this.defaultTier.hashCode() * 31) + this.allTiers.hashCode();
            }

            public String toString() {
                return "MultiTier(defaultTier=" + this.defaultTier + ", allTiers=" + this.allTiers + ')';
            }
        }

        public static final class Multiple extends PackageConfiguration {
            public static final int $stable = 0;
            private final MultiPackage multiPackage;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Multiple(MultiPackage multiPackage) {
                super(null);
                t.g(multiPackage, "multiPackage");
                this.multiPackage = multiPackage;
            }

            public static /* synthetic */ Multiple copy$default(Multiple multiple, MultiPackage multiPackage, int i, Object obj) {
                if ((i & 1) != 0) {
                    multiPackage = multiple.multiPackage;
                }
                return multiple.copy(multiPackage);
            }

            public final MultiPackage component1() {
                return this.multiPackage;
            }

            public final Multiple copy(MultiPackage multiPackage) {
                t.g(multiPackage, "multiPackage");
                return new Multiple(multiPackage);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Multiple) && t.c(this.multiPackage, ((Multiple) obj).multiPackage);
            }

            public List getAll() {
                return this.multiPackage.getAll();
            }

            public PackageInfo getDefault() {
                return this.multiPackage.getDefault();
            }

            public final MultiPackage getMultiPackage() {
                return this.multiPackage;
            }

            public int hashCode() {
                return this.multiPackage.hashCode();
            }

            public String toString() {
                return "Multiple(multiPackage=" + this.multiPackage + ')';
            }
        }

        public static final class Single extends PackageConfiguration {
            public static final int $stable = 0;
            private final PackageInfo singlePackage;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Single(PackageInfo singlePackage) {
                super(null);
                t.g(singlePackage, "singlePackage");
                this.singlePackage = singlePackage;
            }

            public static /* synthetic */ Single copy$default(Single single, PackageInfo packageInfo, int i, Object obj) {
                if ((i & 1) != 0) {
                    packageInfo = single.singlePackage;
                }
                return single.copy(packageInfo);
            }

            public final PackageInfo component1() {
                return this.singlePackage;
            }

            public final Single copy(PackageInfo singlePackage) {
                t.g(singlePackage, "singlePackage");
                return new Single(singlePackage);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Single) && t.c(this.singlePackage, ((Single) obj).singlePackage);
            }

            public List getAll() {
                return u.e(this.singlePackage);
            }

            public PackageInfo getDefault() {
                return this.singlePackage;
            }

            public final PackageInfo getSinglePackage() {
                return this.singlePackage;
            }

            public int hashCode() {
                return this.singlePackage.hashCode();
            }

            public String toString() {
                return "Single(singlePackage=" + this.singlePackage + ')';
            }
        }

        public /* synthetic */ PackageConfiguration(k kVar) {
            this();
        }

        public abstract List getAll();

        public abstract PackageInfo getDefault();

        private PackageConfiguration() {
        }
    }

    public static final class PackageInfo {
        public static final int $stable = 0;
        private final Double discountRelativeToMostExpensivePerMonth;
        private final ProcessedLocalizedConfiguration localization;
        private final Package rcPackage;

        public PackageInfo(Package rcPackage, ProcessedLocalizedConfiguration localization, Double d) {
            t.g(rcPackage, "rcPackage");
            t.g(localization, "localization");
            this.rcPackage = rcPackage;
            this.localization = localization;
            this.discountRelativeToMostExpensivePerMonth = d;
        }

        public static /* synthetic */ PackageInfo copy$default(PackageInfo packageInfo, Package r1, ProcessedLocalizedConfiguration processedLocalizedConfiguration, Double d, int i, Object obj) {
            if ((i & 1) != 0) {
                r1 = packageInfo.rcPackage;
            }
            if ((i & 2) != 0) {
                processedLocalizedConfiguration = packageInfo.localization;
            }
            if ((i & 4) != 0) {
                d = packageInfo.discountRelativeToMostExpensivePerMonth;
            }
            return packageInfo.copy(r1, processedLocalizedConfiguration, d);
        }

        public final Package component1() {
            return this.rcPackage;
        }

        public final ProcessedLocalizedConfiguration component2() {
            return this.localization;
        }

        public final Double component3() {
            return this.discountRelativeToMostExpensivePerMonth;
        }

        public final PackageInfo copy(Package rcPackage, ProcessedLocalizedConfiguration localization, Double d) {
            t.g(rcPackage, "rcPackage");
            t.g(localization, "localization");
            return new PackageInfo(rcPackage, localization, d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PackageInfo)) {
                return false;
            }
            PackageInfo packageInfo = (PackageInfo) obj;
            return t.c(this.rcPackage, packageInfo.rcPackage) && t.c(this.localization, packageInfo.localization) && t.c(this.discountRelativeToMostExpensivePerMonth, packageInfo.discountRelativeToMostExpensivePerMonth);
        }

        public final Double getDiscountRelativeToMostExpensivePerMonth() {
            return this.discountRelativeToMostExpensivePerMonth;
        }

        public final ProcessedLocalizedConfiguration getLocalization() {
            return this.localization;
        }

        public final Package getRcPackage() {
            return this.rcPackage;
        }

        public int hashCode() {
            int hashCode = ((this.rcPackage.hashCode() * 31) + this.localization.hashCode()) * 31;
            Double d = this.discountRelativeToMostExpensivePerMonth;
            return hashCode + (d == null ? 0 : d.hashCode());
        }

        public String toString() {
            return "PackageInfo(rcPackage=" + this.rcPackage + ", localization=" + this.localization + ", discountRelativeToMostExpensivePerMonth=" + this.discountRelativeToMostExpensivePerMonth + ')';
        }
    }

    public static final class TierInfo {
        public static final int $stable = 0;
        private final PackageInfo defaultPackage;
        private final String id;
        private final String name;
        private final List packages;

        public TierInfo(String name, String id, PackageInfo defaultPackage, List packages) {
            t.g(name, "name");
            t.g(id, "id");
            t.g(defaultPackage, "defaultPackage");
            t.g(packages, "packages");
            this.name = name;
            this.id = id;
            this.defaultPackage = defaultPackage;
            this.packages = packages;
        }

        public static /* synthetic */ TierInfo copy$default(TierInfo tierInfo, String str, String str2, PackageInfo packageInfo, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tierInfo.name;
            }
            if ((i & 2) != 0) {
                str2 = tierInfo.id;
            }
            if ((i & 4) != 0) {
                packageInfo = tierInfo.defaultPackage;
            }
            if ((i & 8) != 0) {
                list = tierInfo.packages;
            }
            return tierInfo.copy(str, str2, packageInfo, list);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.id;
        }

        public final PackageInfo component3() {
            return this.defaultPackage;
        }

        public final List component4() {
            return this.packages;
        }

        public final TierInfo copy(String name, String id, PackageInfo defaultPackage, List packages) {
            t.g(name, "name");
            t.g(id, "id");
            t.g(defaultPackage, "defaultPackage");
            t.g(packages, "packages");
            return new TierInfo(name, id, defaultPackage, packages);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TierInfo)) {
                return false;
            }
            TierInfo tierInfo = (TierInfo) obj;
            return t.c(this.name, tierInfo.name) && t.c(this.id, tierInfo.id) && t.c(this.defaultPackage, tierInfo.defaultPackage) && t.c(this.packages, tierInfo.packages);
        }

        public final PackageInfo getDefaultPackage() {
            return this.defaultPackage;
        }

        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public final List getPackages() {
            return this.packages;
        }

        public int hashCode() {
            return (((((this.name.hashCode() * 31) + this.id.hashCode()) * 31) + this.defaultPackage.hashCode()) * 31) + this.packages.hashCode();
        }

        public String toString() {
            return "TierInfo(name=" + this.name + ", id=" + this.id + ", defaultPackage=" + this.defaultPackage + ", packages=" + this.packages + ')';
        }
    }

    public TemplateConfiguration(PaywallTemplate template, PaywallMode mode, PackageConfiguration packages, PaywallData.Configuration configuration, Images images, Map imagesByTier, PaywallData.Configuration.ColorInformation colors, Locale locale) {
        t.g(template, "template");
        t.g(mode, "mode");
        t.g(packages, "packages");
        t.g(configuration, "configuration");
        t.g(images, "images");
        t.g(imagesByTier, "imagesByTier");
        t.g(colors, "colors");
        t.g(locale, "locale");
        this.template = template;
        this.mode = mode;
        this.packages = packages;
        this.configuration = configuration;
        this.images = images;
        this.imagesByTier = imagesByTier;
        this.colors = colors;
        this.locale = locale;
        ColorsFactory colorsFactory = ColorsFactory.INSTANCE;
        PaywallData.Configuration.Colors dark = colors.getDark();
        this.darkModeColors = colorsFactory.create(dark == null ? colors.getLight() : dark);
        this.lightModeColors = colorsFactory.create(colors.getLight());
    }

    public static /* synthetic */ TemplateConfiguration copy$default(TemplateConfiguration templateConfiguration, PaywallTemplate paywallTemplate, PaywallMode paywallMode, PackageConfiguration packageConfiguration, PaywallData.Configuration configuration, Images images, Map map, PaywallData.Configuration.ColorInformation colorInformation, Locale locale, int i, Object obj) {
        return templateConfiguration.copy((i & 1) != 0 ? templateConfiguration.template : paywallTemplate, (i & 2) != 0 ? templateConfiguration.mode : paywallMode, (i & 4) != 0 ? templateConfiguration.packages : packageConfiguration, (i & 8) != 0 ? templateConfiguration.configuration : configuration, (i & 16) != 0 ? templateConfiguration.images : images, (i & 32) != 0 ? templateConfiguration.imagesByTier : map, (i & 64) != 0 ? templateConfiguration.colors : colorInformation, (i & 128) != 0 ? templateConfiguration.locale : locale);
    }

    public final PaywallTemplate component1() {
        return this.template;
    }

    public final PaywallMode component2() {
        return this.mode;
    }

    public final PackageConfiguration component3() {
        return this.packages;
    }

    public final PaywallData.Configuration component4() {
        return this.configuration;
    }

    public final Images component5() {
        return this.images;
    }

    public final Map component6() {
        return this.imagesByTier;
    }

    public final PaywallData.Configuration.ColorInformation component7() {
        return this.colors;
    }

    public final Locale component8() {
        return this.locale;
    }

    public final TemplateConfiguration copy(PaywallTemplate template, PaywallMode mode, PackageConfiguration packages, PaywallData.Configuration configuration, Images images, Map imagesByTier, PaywallData.Configuration.ColorInformation colors, Locale locale) {
        t.g(template, "template");
        t.g(mode, "mode");
        t.g(packages, "packages");
        t.g(configuration, "configuration");
        t.g(images, "images");
        t.g(imagesByTier, "imagesByTier");
        t.g(colors, "colors");
        t.g(locale, "locale");
        return new TemplateConfiguration(template, mode, packages, configuration, images, imagesByTier, colors, locale);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateConfiguration)) {
            return false;
        }
        TemplateConfiguration templateConfiguration = (TemplateConfiguration) obj;
        return this.template == templateConfiguration.template && this.mode == templateConfiguration.mode && t.c(this.packages, templateConfiguration.packages) && t.c(this.configuration, templateConfiguration.configuration) && t.c(this.images, templateConfiguration.images) && t.c(this.imagesByTier, templateConfiguration.imagesByTier) && t.c(this.colors, templateConfiguration.colors) && t.c(this.locale, templateConfiguration.locale);
    }

    public final PaywallData.Configuration.ColorInformation getColors() {
        return this.colors;
    }

    public final PaywallData.Configuration getConfiguration() {
        return this.configuration;
    }

    public final Colors getCurrentColors(m mVar, int i) {
        if (b0.w.L()) {
            b0.w.U(-1598555926, i, -1, "com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.getCurrentColors (TemplateConfiguration.kt:30)");
        }
        Colors colors = q.a(mVar, 0) ? this.darkModeColors : this.lightModeColors;
        if (b0.w.L()) {
            b0.w.T();
        }
        return colors;
    }

    public final Colors getCurrentColorsForTier(TierInfo tier, m mVar, int i) {
        Colors create;
        t.g(tier, "tier");
        if (b0.w.L()) {
            b0.w.U(844077603, i, -1, "com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.getCurrentColorsForTier (TemplateConfiguration.kt:36)");
        }
        Map colorsByTier = this.configuration.getColorsByTier();
        Colors colors = null;
        PaywallData.Configuration.ColorInformation colorInformation = colorsByTier != null ? (PaywallData.Configuration.ColorInformation) colorsByTier.get(tier.getId()) : null;
        if (colorInformation != null) {
            if (q.a(mVar, 0)) {
                ColorsFactory colorsFactory = ColorsFactory.INSTANCE;
                PaywallData.Configuration.Colors dark = colorInformation.getDark();
                if (dark == null) {
                    dark = colorInformation.getLight();
                }
                create = colorsFactory.create(dark);
            } else {
                create = ColorsFactory.INSTANCE.create(colorInformation.getLight());
            }
            colors = create;
        }
        if (colors == null) {
            colors = getCurrentColors(mVar, (i >> 3) & 14);
        }
        if (b0.w.L()) {
            b0.w.T();
        }
        return colors;
    }

    public final Images getImages() {
        return this.images;
    }

    public final Map getImagesByTier() {
        return this.imagesByTier;
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public final PaywallMode getMode() {
        return this.mode;
    }

    public final PackageConfiguration getPackages() {
        return this.packages;
    }

    public final PaywallTemplate getTemplate() {
        return this.template;
    }

    public int hashCode() {
        return (((((((((((((this.template.hashCode() * 31) + this.mode.hashCode()) * 31) + this.packages.hashCode()) * 31) + this.configuration.hashCode()) * 31) + this.images.hashCode()) * 31) + this.imagesByTier.hashCode()) * 31) + this.colors.hashCode()) * 31) + this.locale.hashCode();
    }

    public String toString() {
        return "TemplateConfiguration(template=" + this.template + ", mode=" + this.mode + ", packages=" + this.packages + ", configuration=" + this.configuration + ", images=" + this.images + ", imagesByTier=" + this.imagesByTier + ", colors=" + this.colors + ", locale=" + this.locale + ')';
    }
}
