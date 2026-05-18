package com.revenuecat.purchases.ui.revenuecatui.components.ktx;

import Ca.o;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment;
import kotlin.jvm.internal.t;
import l1.j;
import o0.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class AlignmentKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[HorizontalAlignment.values().length];
            try {
                iArr[HorizontalAlignment.LEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HorizontalAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HorizontalAlignment.TRAILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VerticalAlignment.values().length];
            try {
                iArr2[VerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VerticalAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VerticalAlignment.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[TwoDimensionalAlignment.values().length];
            try {
                iArr3[TwoDimensionalAlignment.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[TwoDimensionalAlignment.LEADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[TwoDimensionalAlignment.TRAILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[TwoDimensionalAlignment.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[TwoDimensionalAlignment.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[TwoDimensionalAlignment.TOP_LEADING.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[TwoDimensionalAlignment.TOP_TRAILING.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[TwoDimensionalAlignment.BOTTOM_LEADING.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[TwoDimensionalAlignment.BOTTOM_TRAILING.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final /* synthetic */ e.b toAlignment(HorizontalAlignment horizontalAlignment) {
        t.g(horizontalAlignment, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[horizontalAlignment.ordinal()];
        if (i == 1) {
            return e.a.k();
        }
        if (i == 2) {
            return e.a.g();
        }
        if (i == 3) {
            return e.a.j();
        }
        throw new o();
    }

    public static final /* synthetic */ e.b toHorizontalAlignmentOrNull(TwoDimensionalAlignment twoDimensionalAlignment) {
        t.g(twoDimensionalAlignment, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$2[twoDimensionalAlignment.ordinal()]) {
            case 1:
                return e.a.g();
            case 2:
                return e.a.k();
            case 3:
                return e.a.j();
            case 4:
            case 5:
                return null;
            case 6:
                return e.a.k();
            case 7:
                return e.a.j();
            case 8:
                return e.a.k();
            case 9:
                return e.a.j();
            default:
                throw new o();
        }
    }

    public static final /* synthetic */ int toTextAlign(HorizontalAlignment horizontalAlignment) {
        t.g(horizontalAlignment, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[horizontalAlignment.ordinal()];
        if (i == 1) {
            return j.b.f();
        }
        if (i == 2) {
            return j.b.a();
        }
        if (i == 3) {
            return j.b.b();
        }
        throw new o();
    }

    public static final /* synthetic */ e.c toVerticalAlignmentOrNull(TwoDimensionalAlignment twoDimensionalAlignment) {
        t.g(twoDimensionalAlignment, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$2[twoDimensionalAlignment.ordinal()]) {
            case 1:
                return e.a.i();
            case 2:
            case 3:
                return null;
            case 4:
                return e.a.l();
            case 5:
                return e.a.a();
            case 6:
                return e.a.l();
            case 7:
                return e.a.l();
            case 8:
                return e.a.a();
            case 9:
                return e.a.a();
            default:
                throw new o();
        }
    }

    public static final /* synthetic */ e.c toAlignment(VerticalAlignment verticalAlignment) {
        t.g(verticalAlignment, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[verticalAlignment.ordinal()];
        if (i == 1) {
            return e.a.l();
        }
        if (i == 2) {
            return e.a.i();
        }
        if (i == 3) {
            return e.a.a();
        }
        throw new o();
    }

    public static final /* synthetic */ e toAlignment(TwoDimensionalAlignment twoDimensionalAlignment) {
        t.g(twoDimensionalAlignment, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$2[twoDimensionalAlignment.ordinal()]) {
            case 1:
                return e.a.e();
            case 2:
                return e.a.h();
            case 3:
                return e.a.f();
            case 4:
                return e.a.m();
            case 5:
                return e.a.b();
            case 6:
                return e.a.o();
            case 7:
                return e.a.n();
            case 8:
                return e.a.d();
            case 9:
                return e.a.c();
            default:
                throw new o();
        }
    }
}
