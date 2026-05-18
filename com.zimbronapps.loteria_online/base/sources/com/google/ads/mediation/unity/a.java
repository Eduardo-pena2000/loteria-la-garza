package com.google.ads.mediation.unity;

import L5.p;
import L5.y;
import Y5.o;
import android.content.Context;
import android.text.TextUtils;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.metadata.MetaData;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.UnityBannerSize;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class a {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[UnityAds.UnityAdsShowError.values().length];
            d = iArr;
            try {
                iArr[UnityAds.UnityAdsShowError.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[UnityAds.UnityAdsShowError.NOT_READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[UnityAds.UnityAdsShowError.VIDEO_PLAYER_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[UnityAds.UnityAdsShowError.INVALID_ARGUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[UnityAds.UnityAdsShowError.NO_CONNECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[UnityAds.UnityAdsShowError.ALREADY_SHOWING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                d[UnityAds.UnityAdsShowError.INTERNAL_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                d[UnityAds.UnityAdsShowError.TIMEOUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[UnityAds.UnityAdsLoadError.values().length];
            c = iArr2;
            try {
                iArr2[UnityAds.UnityAdsLoadError.INITIALIZE_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                c[UnityAds.UnityAdsLoadError.INTERNAL_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                c[UnityAds.UnityAdsLoadError.INVALID_ARGUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                c[UnityAds.UnityAdsLoadError.NO_FILL.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                c[UnityAds.UnityAdsLoadError.TIMEOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr3 = new int[UnityAds.UnityAdsInitializationError.values().length];
            b = iArr3;
            try {
                iArr3[UnityAds.UnityAdsInitializationError.INTERNAL_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[UnityAds.UnityAdsInitializationError.AD_BLOCKER_DETECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr4 = new int[BannerErrorCode.values().length];
            a = iArr4;
            try {
                iArr4[BannerErrorCode.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[BannerErrorCode.NATIVE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[BannerErrorCode.WEBVIEW_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[BannerErrorCode.NO_FILL.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    public enum b {
        LOADED,
        OPENED,
        CLICKED,
        CLOSED,
        LEFT_APPLICATION,
        IMPRESSION,
        VIDEO_START,
        REWARD,
        VIDEO_COMPLETE
    }

    public static boolean a(String str, String str2) {
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? false : true;
    }

    public static L5.b b(int i, String str) {
        return new L5.b(i, str, "com.unity3d.ads");
    }

    public static L5.b c(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        return b(g(unityAdsInitializationError), str);
    }

    public static L5.b d(UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        return b(h(unityAdsLoadError), str);
    }

    public static L5.b e(UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        return b(i(unityAdsShowError), str);
    }

    public static L5.c f(a6.a aVar) {
        Iterator it = aVar.a().iterator();
        if (it.hasNext()) {
            return ((o) it.next()).a();
        }
        return null;
    }

    public static int g(UnityAds.UnityAdsInitializationError unityAdsInitializationError) {
        int i = a.b[unityAdsInitializationError.ordinal()];
        if (i == 1) {
            return 301;
        }
        if (i != 2) {
            return i != 3 ? 300 : 303;
        }
        return 302;
    }

    public static int h(UnityAds.UnityAdsLoadError unityAdsLoadError) {
        int i = a.c[unityAdsLoadError.ordinal()];
        if (i == 1) {
            return 401;
        }
        if (i == 2) {
            return 402;
        }
        if (i == 3) {
            return 403;
        }
        if (i != 4) {
            return i != 5 ? 400 : 405;
        }
        return 404;
    }

    public static int i(UnityAds.UnityAdsShowError unityAdsShowError) {
        switch (a.d[unityAdsShowError.ordinal()]) {
            case 1:
                return 501;
            case 2:
                return 502;
            case 3:
                return 503;
            case 4:
                return 504;
            case 5:
                return 505;
            case 6:
                return 506;
            case 7:
                return 507;
            case 8:
                return 508;
            default:
                return 500;
        }
    }

    public static int j(BannerErrorInfo bannerErrorInfo) {
        int i = a.a[bannerErrorInfo.errorCode.ordinal()];
        if (i == 1) {
            return 201;
        }
        if (i == 2) {
            return 202;
        }
        if (i != 3) {
            return i != 4 ? 200 : 204;
        }
        return 203;
    }

    public static UnityBannerSize k(Context context, L5.h hVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(L5.h.i);
        arrayList.add(L5.h.l);
        L5.h a2 = p.a(context, hVar, arrayList);
        if (a2 != null) {
            return new UnityBannerSize(a2.j(), a2.c());
        }
        if (z) {
            return new UnityBannerSize(hVar.j(), hVar.c());
        }
        return null;
    }

    public static void l(y yVar, MetaData metaData) {
        if (m(yVar)) {
            metaData.set("user.nonbehavioral", Boolean.FALSE);
        } else {
            metaData.set("user.nonbehavioral", Boolean.TRUE);
        }
        metaData.commit();
    }

    public static boolean m(y yVar) {
        int c = yVar.c();
        int d = yVar.d();
        return (c == 1 || d == 1 || (c != 0 && d != 0)) ? false : true;
    }
}
