package p9;

import android.content.Context;
import android.os.Build;
import da.j;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class a implements j.c {
    public static final a c = new a(null);
    public static F d;
    public da.b a;
    public da.j b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public a(Context applicationContext, da.b messenger) {
        kotlin.jvm.internal.t.g(applicationContext, "applicationContext");
        kotlin.jvm.internal.t.g(messenger, "messenger");
        if (d == null) {
            d = new F(applicationContext);
        }
        this.a = messenger;
        this.b = new da.j(messenger, "com.ryanheise.android_audio_manager");
        F f = d;
        kotlin.jvm.internal.t.d(f);
        f.c(this);
        da.j jVar = this.b;
        kotlin.jvm.internal.t.d(jVar);
        jVar.e(this);
    }

    public final void a() {
        da.j jVar = this.b;
        kotlin.jvm.internal.t.d(jVar);
        jVar.e(null);
        F f = d;
        kotlin.jvm.internal.t.d(f);
        f.O(this);
        F f2 = d;
        kotlin.jvm.internal.t.d(f2);
        if (f2.D()) {
            F f3 = d;
            kotlin.jvm.internal.t.d(f3);
            f3.j();
            d = null;
        }
        this.b = null;
        this.a = null;
    }

    public final da.j b() {
        return this.b;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void onMethodCall(da.i call, j.d result) {
        kotlin.jvm.internal.t.g(call, "call");
        kotlin.jvm.internal.t.g(result, "result");
        try {
            Object obj = call.b;
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj;
            String str = call.a;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1758921066:
                        if (!str.equals("getCommunicationDevice")) {
                            break;
                        } else {
                            if (Build.VERSION.SDK_INT < 31) {
                                throw new b(31);
                            }
                            F f = d;
                            kotlin.jvm.internal.t.d(f);
                            result.a(f.o());
                            return;
                        }
                    case -1698305881:
                        if (!str.equals("getDevices")) {
                            break;
                        } else {
                            F f2 = d;
                            kotlin.jvm.internal.t.d(f2);
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type kotlin.Int");
                            result.a(f2.p(((Integer) obj2).intValue()));
                            return;
                        }
                    case -1679670739:
                        if (!str.equals("isMicrophoneMute")) {
                            break;
                        } else {
                            F f3 = d;
                            kotlin.jvm.internal.t.d(f3);
                            result.a(f3.F());
                            return;
                        }
                    case -1582239800:
                        if (!str.equals("getStreamMaxVolume")) {
                            break;
                        } else {
                            F f4 = d;
                            kotlin.jvm.internal.t.d(f4);
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.t.e(obj3, "null cannot be cast to non-null type kotlin.Int");
                            result.a(f4.v(((Integer) obj3).intValue()));
                            return;
                        }
                    case -1562927400:
                        if (!str.equals("isSpeakerphoneOn")) {
                            break;
                        } else {
                            F f5 = d;
                            kotlin.jvm.internal.t.d(f5);
                            result.a(f5.H());
                            return;
                        }
                    case -1524320654:
                        if (!str.equals("isHapticPlaybackSupported")) {
                            break;
                        } else {
                            if (Build.VERSION.SDK_INT < 29) {
                                throw new b(29);
                            }
                            F f6 = d;
                            kotlin.jvm.internal.t.d(f6);
                            result.a(f6.E());
                            return;
                        }
                    case -1504647535:
                        if (!str.equals("requestAudioFocus")) {
                            break;
                        } else {
                            F f7 = d;
                            kotlin.jvm.internal.t.d(f7);
                            result.a(Boolean.valueOf(f7.P(list)));
                            return;
                        }
                    case -1413157019:
                        if (!str.equals("setMicrophoneMute")) {
                            break;
                        } else {
                            F f8 = d;
                            kotlin.jvm.internal.t.d(f8);
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.t.e(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            result.a(f8.U(((Boolean) obj4).booleanValue()));
                            return;
                        }
                    case -1296413680:
                        if (!str.equals("setSpeakerphoneOn")) {
                            break;
                        } else {
                            F f9 = d;
                            kotlin.jvm.internal.t.d(f9);
                            Object obj5 = list.get(0);
                            kotlin.jvm.internal.t.e(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            result.a(f9.Y(((Boolean) obj5).booleanValue()));
                            return;
                        }
                    case -1285190630:
                        if (!str.equals("isBluetoothScoOn")) {
                            break;
                        } else {
                            F f10 = d;
                            kotlin.jvm.internal.t.d(f10);
                            result.a(f10.C());
                            return;
                        }
                    case -1197068311:
                        if (!str.equals("adjustStreamVolume")) {
                            break;
                        } else {
                            F f11 = d;
                            kotlin.jvm.internal.t.d(f11);
                            Object obj6 = list.get(0);
                            kotlin.jvm.internal.t.e(obj6, "null cannot be cast to non-null type kotlin.Int");
                            int intValue = ((Integer) obj6).intValue();
                            Object obj7 = list.get(1);
                            kotlin.jvm.internal.t.e(obj7, "null cannot be cast to non-null type kotlin.Int");
                            int intValue2 = ((Integer) obj7).intValue();
                            Object obj8 = list.get(2);
                            kotlin.jvm.internal.t.e(obj8, "null cannot be cast to non-null type kotlin.Int");
                            result.a(f11.d(intValue, intValue2, ((Integer) obj8).intValue()));
                            return;
                        }
                    case -1091382445:
                        if (!str.equals("getMicrophones")) {
                            break;
                        } else {
                            if (Build.VERSION.SDK_INT < 28) {
                                throw new b(28);
                            }
                            F f12 = d;
                            kotlin.jvm.internal.t.d(f12);
                            result.a(f12.q());
                            return;
                        }
                    case -1079290158:
                        if (!str.equals("setAllowedCapturePolicy")) {
                            break;
                        } else {
                            if (Build.VERSION.SDK_INT < 29) {
                                throw new b(29);
                            }
                            F f13 = d;
                            kotlin.jvm.internal.t.d(f13);
                            Object obj9 = list.get(0);
                            kotlin.jvm.internal.t.e(obj9, "null cannot be cast to non-null type kotlin.Int");
                            result.a(f13.R(((Integer) obj9).intValue()));
                            return;
                        }
                    case -1018676910:
                        if (!str.equals("setBluetoothScoOn")) {
                            break;
                        } else {
                            F f14 = d;
                            kotlin.jvm.internal.t.d(f14);
                            Object obj10 = list.get(0);
                            kotlin.jvm.internal.t.e(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            result.a(f14.S(((Boolean) obj10).booleanValue()));
                            return;
                        }
                    case -809761226:
                        if (!str.equals("getStreamMinVolume")) {
                            break;
                        } else {
                            if (Build.VERSION.SDK_INT < 28) {
                                throw new b(28);
                            }
                            F f15 = d;
                            kotlin.jvm.internal.t.d(f15);
                            Object obj11 = list.get(0);
                            kotlin.jvm.internal.t.e(obj11, "null cannot be cast to non-null type kotlin.Int");
                            result.a(f15.w(((Integer) obj11).intValue()));
                            return;
                        }
                    case -763512583:
                        if (!str.equals("loadSoundEffects")) {
                            break;
                        } else {
                            F f16 = d;
                            kotlin.jvm.internal.t.d(f16);
                            result.a(f16.K());
                            return;
                        }
                    case -694417919:
                        if (!str.equals("isMusicActive")) {
                            break;
                        } else {
                            F f17 = d;
                            kotlin.jvm.internal.t.d(f17);
                            result.a(f17.G());
                            return;
                        }
                    case -580980717:
                        if (!str.equals("startBluetoothSco")) {
                            break;
                        } else {
                            F f18 = d;
                            kotlin.jvm.internal.t.d(f18);
                            result.a(f18.a0());
                            return;
                        }
                    case -445792758:
                        if (!str.equals("setCommunicationDevice")) {
                            break;
                        } else {
                            if (Build.VERSION.SDK_INT < 31) {
                                throw new b(31);
                            }
                            F f19 = d;
                            kotlin.jvm.internal.t.d(f19);
                            Object obj12 = list.get(0);
                            kotlin.jvm.internal.t.e(obj12, "null cannot be cast to non-null type kotlin.Int");
                            result.a(Boolean.valueOf(f19.T(((Integer) obj12).intValue())));
                            return;
                        }
                    case -380792370:
                        if (!str.equals("getStreamVolumeDb")) {
                            break;
                        } else {
                            if (Build.VERSION.SDK_INT < 28) {
                                throw new b(28);
                            }
                            F f20 = d;
                            kotlin.jvm.internal.t.d(f20);
                            Object obj13 = list.get(0);
                            kotlin.jvm.internal.t.e(obj13, "null cannot be cast to non-null type kotlin.Int");
                            int intValue3 = ((Integer) obj13).intValue();
                            Object obj14 = list.get(1);
                            kotlin.jvm.internal.t.e(obj14, "null cannot be cast to non-null type kotlin.Int");
                            int intValue4 = ((Integer) obj14).intValue();
                            Object obj15 = list.get(2);
                            kotlin.jvm.internal.t.e(obj15, "null cannot be cast to non-null type kotlin.Int");
                            result.a(f20.y(intValue3, intValue4, ((Integer) obj15).intValue()));
                            return;
                        }
                    case -75324903:
                        if (!str.equals("getMode")) {
                            break;
                        } else {
                            F f21 = d;
                            kotlin.jvm.internal.t.d(f21);
                            result.a(f21.r());
                            return;
                        }
                    case 152385829:
                        if (!str.equals("dispatchMediaKeyEvent")) {
                            break;
                        } else {
                            F f22 = d;
                            kotlin.jvm.internal.t.d(f22);
                            Object obj16 = list.get(0);
                            kotlin.jvm.internal.t.e(obj16, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                            result.a(f22.i((Map) obj16));
                            return;
                        }
                    case 160987616:
                        if (!str.equals("getParameters")) {
                            break;
                        } else {
                            F f23 = d;
                            kotlin.jvm.internal.t.d(f23);
                            result.a(f23.s((String) list.get(0)));
                            return;
                        }
                    case 186762163:
                        if (!str.equals("stopBluetoothSco")) {
                            break;
                        } else {
                            F f24 = d;
                            kotlin.jvm.internal.t.d(f24);
                            result.a(f24.b0());
                            return;
                        }
                    case 276698416:
                        if (!str.equals("getStreamVolume")) {
                            break;
                        } else {
                            F f25 = d;
                            kotlin.jvm.internal.t.d(f25);
                            Object obj17 = list.get(0);
                            kotlin.jvm.internal.t.e(obj17, "null cannot be cast to non-null type kotlin.Int");
                            result.a(f25.x(((Integer) obj17).intValue()));
                            return;
                        }
                    case 469094495:
                        if (!str.equals("isBluetoothScoAvailableOffCall")) {
                            break;
                        } else {
                            F f26 = d;
                            kotlin.jvm.internal.t.d(f26);
                            result.a(f26.B());
                            return;
                        }
                    case 623794710:
                        if (!str.equals("getRingerMode")) {
                            break;
                        } else {
                            F f27 = d;
                            kotlin.jvm.internal.t.d(f27);
                            result.a(f27.u());
                            return;
                        }
                    case 935118828:
                        if (!str.equals("setParameters")) {
                            break;
                        } else {
                            F f28 = d;
                            kotlin.jvm.internal.t.d(f28);
                            result.a(f28.W((String) list.get(0)));
                            return;
                        }
                    case 954131337:
                        if (!str.equals("adjustVolume")) {
                            break;
                        } else {
                            F f29 = d;
                            kotlin.jvm.internal.t.d(f29);
                            Object obj18 = list.get(0);
                            kotlin.jvm.internal.t.e(obj18, "null cannot be cast to non-null type kotlin.Int");
                            int intValue5 = ((Integer) obj18).intValue();
                            Object obj19 = list.get(1);
                            kotlin.jvm.internal.t.e(obj19, "null cannot be cast to non-null type kotlin.Int");
                            result.a(f29.f(intValue5, ((Integer) obj19).intValue()));
                            return;
                        }
                    case 976310915:
                        if (!str.equals("isStreamMute")) {
                            break;
                        } else {
                            F f30 = d;
                            kotlin.jvm.internal.t.d(f30);
                            Object obj20 = list.get(0);
                            kotlin.jvm.internal.t.e(obj20, "null cannot be cast to non-null type kotlin.Int");
                            result.a(f30.I(((Integer) obj20).intValue()));
                            return;
                        }
                    case 1084758859:
                        if (!str.equals("getProperty")) {
                            break;
                        } else {
                            F f31 = d;
                            kotlin.jvm.internal.t.d(f31);
                            result.a(f31.t((String) list.get(0)));
                            return;
                        }
                    case 1163405254:
                        if (!str.equals("getAllowedCapturePolicy")) {
                            break;
                        } else {
                            if (Build.VERSION.SDK_INT < 29) {
                                throw new b(29);
                            }
                            F f32 = d;
                            kotlin.jvm.internal.t.d(f32);
                            result.a(f32.m());
                            return;
                        }
                    case 1187450940:
                        if (!str.equals("setStreamVolume")) {
                            break;
                        } else {
                            F f33 = d;
                            kotlin.jvm.internal.t.d(f33);
                            Object obj21 = list.get(0);
                            kotlin.jvm.internal.t.e(obj21, "null cannot be cast to non-null type kotlin.Int");
                            int intValue6 = ((Integer) obj21).intValue();
                            Object obj22 = list.get(1);
                            kotlin.jvm.internal.t.e(obj22, "null cannot be cast to non-null type kotlin.Int");
                            int intValue7 = ((Integer) obj22).intValue();
                            Object obj23 = list.get(2);
                            kotlin.jvm.internal.t.e(obj23, "null cannot be cast to non-null type kotlin.Int");
                            result.a(f33.Z(intValue6, intValue7, ((Integer) obj23).intValue()));
                            return;
                        }
                    case 1241312831:
                        if (!str.equals("clearCommunicationDevice")) {
                            break;
                        } else {
                            if (Build.VERSION.SDK_INT < 31) {
                                throw new b(31);
                            }
                            F f34 = d;
                            kotlin.jvm.internal.t.d(f34);
                            result.a(f34.g());
                            return;
                        }
                    case 1258134830:
                        if (!str.equals("adjustSuggestedStreamVolume")) {
                            break;
                        } else {
                            F f35 = d;
                            kotlin.jvm.internal.t.d(f35);
                            Object obj24 = list.get(0);
                            kotlin.jvm.internal.t.e(obj24, "null cannot be cast to non-null type kotlin.Int");
                            int intValue8 = ((Integer) obj24).intValue();
                            Object obj25 = list.get(1);
                            kotlin.jvm.internal.t.e(obj25, "null cannot be cast to non-null type kotlin.Int");
                            int intValue9 = ((Integer) obj25).intValue();
                            Object obj26 = list.get(2);
                            kotlin.jvm.internal.t.e(obj26, "null cannot be cast to non-null type kotlin.Int");
                            result.a(f35.e(intValue8, intValue9, ((Integer) obj26).intValue()));
                            return;
                        }
                    case 1357290231:
                        if (!str.equals("abandonAudioFocus")) {
                            break;
                        } else {
                            F f36 = d;
                            kotlin.jvm.internal.t.d(f36);
                            result.a(Boolean.valueOf(f36.b()));
                            return;
                        }
                    case 1378317714:
                        if (!str.equals("unloadSoundEffects")) {
                            break;
                        } else {
                            F f37 = d;
                            kotlin.jvm.internal.t.d(f37);
                            result.a(f37.c0());
                            return;
                        }
                    case 1397925922:
                        if (!str.equals("setRingerMode")) {
                            break;
                        } else {
                            F f38 = d;
                            kotlin.jvm.internal.t.d(f38);
                            Object obj27 = list.get(0);
                            kotlin.jvm.internal.t.e(obj27, "null cannot be cast to non-null type kotlin.Int");
                            result.a(f38.X(((Integer) obj27).intValue()));
                            return;
                        }
                    case 1504508844:
                        if (!str.equals("playSoundEffect")) {
                            break;
                        } else {
                            F f39 = d;
                            kotlin.jvm.internal.t.d(f39);
                            Object obj28 = list.get(0);
                            kotlin.jvm.internal.t.e(obj28, "null cannot be cast to non-null type kotlin.Int");
                            result.a(f39.L(((Integer) obj28).intValue(), (Double) list.get(1)));
                            return;
                        }
                    case 1570996442:
                        if (!str.equals("getAvailableCommunicationDevices")) {
                            break;
                        } else {
                            if (Build.VERSION.SDK_INT < 31) {
                                throw new b(31);
                            }
                            F f40 = d;
                            kotlin.jvm.internal.t.d(f40);
                            result.a(f40.n());
                            return;
                        }
                    case 1984784677:
                        if (!str.equals("setMode")) {
                            break;
                        } else {
                            F f41 = d;
                            kotlin.jvm.internal.t.d(f41);
                            Object obj29 = list.get(0);
                            kotlin.jvm.internal.t.e(obj29, "null cannot be cast to non-null type kotlin.Int");
                            result.a(f41.V(((Integer) obj29).intValue()));
                            return;
                        }
                    case 1986792688:
                        if (!str.equals("isVolumeFixed")) {
                            break;
                        } else {
                            F f42 = d;
                            kotlin.jvm.internal.t.d(f42);
                            result.a(f42.J());
                            return;
                        }
                    case 2093966320:
                        if (!str.equals("generateAudioSessionId")) {
                            break;
                        } else {
                            F f43 = d;
                            kotlin.jvm.internal.t.d(f43);
                            result.a(f43.l());
                            return;
                        }
                }
            }
            result.c();
        } catch (Exception e) {
            e.printStackTrace();
            result.b("Error: " + e, null, null);
        }
    }
}
