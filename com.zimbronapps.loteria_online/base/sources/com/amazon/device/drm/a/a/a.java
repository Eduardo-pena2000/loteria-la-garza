package com.amazon.device.drm.a.a;

import android.app.Application;
import android.os.RemoteException;
import com.amazon.a.a.h.c;
import com.amazon.a.a.n.a.a.i;
import com.amazon.a.a.n.a.g;
import com.amazon.a.a.n.a.h;
import com.amazon.d.a.j;
import com.amazon.device.drm.model.LicenseResponse;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class a extends h {
    private static final String c = "a";
    private static final String d = "get_license";
    private static final String e = "1.0";

    @com.amazon.a.a.k.a
    c b;

    @com.amazon.a.a.k.a
    private Application f;

    @com.amazon.a.a.k.a
    private com.amazon.a.a.o.b.b g;

    public static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g.values().length];
            a = iArr;
            try {
                iArr[g.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[g.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[g.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[g.j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[g.a.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[g.f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[g.i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[g.p.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[g.q.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[g.h.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[g.b.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[g.g.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[g.n.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[g.m.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[g.o.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[g.l.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[g.k.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public a(com.amazon.device.drm.a.b.b bVar) {
        super(bVar, "get_license", "1.0", bVar.d().toString(), "2.9.0.0");
        b(false);
    }

    private void a(LicenseResponse.RequestStatus requestStatus) {
        com.amazon.device.drm.a.b.b bVar = (com.amazon.device.drm.a.b.b) j();
        bVar.a().a(new com.amazon.device.drm.a.c.a().a(bVar.d()).a(requestStatus).a());
    }

    public boolean b(j jVar) throws RemoteException, com.amazon.a.a.d.b {
        String str = c;
        com.amazon.device.drm.a.e.b.a(str, "onResult: result = " + jVar);
        try {
            com.amazon.a.b.g gVar = new com.amazon.a.b.g(jVar.b());
            if (!a(gVar, a(gVar))) {
                return false;
            }
            com.amazon.device.drm.a.e.b.a(str, "License Verification was successful");
            this.b.a(new com.amazon.a.b.b.a());
            a(LicenseResponse.RequestStatus.LICENSED);
            return true;
        } catch (Exception unused) {
            com.amazon.device.drm.a.e.b.a(c, "License not returned by Appstore");
            a(LicenseResponse.RequestStatus.NOT_LICENSED);
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void c(com.amazon.a.a.d.b bVar) {
        String str;
        String a = bVar.a();
        if (!"EXCEPTION_RESULT_FAILURE".equals(a)) {
            if ("AUTH_TOKEN_VERIFICATION_FAILURE".equals(a)) {
                com.amazon.device.drm.a.e.b.a(c, "AuthToken verification failed");
                a(LicenseResponse.RequestStatus.ERROR_VERIFICATION);
                return;
            } else {
                if ("DATA_AUTH_KEY_LOAD_FAILURE".equals(a)) {
                    com.amazon.device.drm.a.e.b.a(c, "Unable to load the public key from the apk");
                    a(LicenseResponse.RequestStatus.ERROR_INVALID_LICENSING_KEYS);
                    return;
                }
                return;
            }
        }
        String b = bVar.b();
        switch (b.hashCode()) {
            case -1023164887:
                if (b.equals("INVALID_CONTENT_ID")) {
                    com.amazon.device.drm.a.e.b.a(c, "Unable to verify Application metadata");
                    a(LicenseResponse.RequestStatus.ERROR_VERIFICATION);
                    break;
                }
                com.amazon.device.drm.a.e.b.a(c, "No valid failure reason found. Defaulting to UNKNOWN_ERROR");
                a(LicenseResponse.RequestStatus.UNKNOWN_ERROR);
                break;
            case 375605247:
                str = "NO_INTERNET";
                b.equals(str);
                com.amazon.device.drm.a.e.b.a(c, "No valid failure reason found. Defaulting to UNKNOWN_ERROR");
                a(LicenseResponse.RequestStatus.UNKNOWN_ERROR);
                break;
            case 433141802:
                str = "UNKNOWN";
                b.equals(str);
                com.amazon.device.drm.a.e.b.a(c, "No valid failure reason found. Defaulting to UNKNOWN_ERROR");
                a(LicenseResponse.RequestStatus.UNKNOWN_ERROR);
                break;
            case 2056521148:
                str = "INTERNAL_SERVICE_ERROR";
                b.equals(str);
                com.amazon.device.drm.a.e.b.a(c, "No valid failure reason found. Defaulting to UNKNOWN_ERROR");
                a(LicenseResponse.RequestStatus.UNKNOWN_ERROR);
                break;
            default:
                com.amazon.device.drm.a.e.b.a(c, "No valid failure reason found. Defaulting to UNKNOWN_ERROR");
                a(LicenseResponse.RequestStatus.UNKNOWN_ERROR);
                break;
        }
    }

    public boolean f() {
        return false;
    }

    private boolean a(com.amazon.a.b.g gVar, com.amazon.a.b.b bVar) {
        if (bVar == null) {
            return false;
        }
        try {
            com.amazon.device.drm.a.e.a.a(gVar, bVar, this.f);
            return true;
        } catch (com.amazon.a.b.a.a e2) {
            if (e2.d().a(com.amazon.a.b.h.EXPIRATION)) {
                com.amazon.device.drm.a.e.b.a(c, "License has expired");
                this.b.a(a(e2));
                a(LicenseResponse.RequestStatus.EXPIRED);
            } else {
                com.amazon.device.drm.a.e.b.a(c, "License Verification failed" + e2.d());
                this.b.a(a(e2));
                a(LicenseResponse.RequestStatus.ERROR_VERIFICATION);
            }
            return false;
        }
    }

    public void b(com.amazon.d.a.h hVar) {
        String str;
        try {
            str = hVar.g();
            try {
                g valueOf = g.valueOf(str);
                switch (1.a[valueOf.ordinal()]) {
                    case 1:
                        com.amazon.device.drm.a.e.b.a(c, String.format("License has expired: %s", new Object[]{valueOf.name()}));
                        a(LicenseResponse.RequestStatus.EXPIRED);
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        com.amazon.device.drm.a.e.b.a(c, String.format("Customer is not licensed to use the Application: %s", new Object[]{valueOf.name()}));
                        a(LicenseResponse.RequestStatus.NOT_LICENSED);
                        break;
                    case 10:
                    case 11:
                        com.amazon.device.drm.a.e.b.a(c, String.format("Unable to verify Device info: %s", new Object[]{valueOf.name()}));
                        a(LicenseResponse.RequestStatus.ERROR_VERIFICATION);
                        break;
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                        com.amazon.device.drm.a.e.b.a(c, String.format("Unable to verify Application metadata: %s", new Object[]{valueOf.name()}));
                        a(LicenseResponse.RequestStatus.ERROR_VERIFICATION);
                        break;
                    default:
                        com.amazon.device.drm.a.e.b.a(c, "No valid failure reason found. Defaulting to UNKNOWN_ERROR");
                        a(LicenseResponse.RequestStatus.UNKNOWN_ERROR);
                        break;
                }
            } catch (Exception unused) {
                com.amazon.device.drm.a.e.b.a(c, "Unknown Reason of failure" + str);
                this.b.a(a(new i("get_license")));
            }
        } catch (Exception unused2) {
            str = "Unknown";
        }
    }

    private com.amazon.a.b.b a(com.amazon.a.b.g gVar) {
        try {
            return com.amazon.device.drm.a.e.a.a(gVar, this.g.a());
        } catch (com.amazon.a.a.o.b.a.a e2) {
            com.amazon.device.drm.a.e.b.a(c, "Unable to load the public key from the apk");
            a(LicenseResponse.RequestStatus.ERROR_INVALID_LICENSING_KEYS);
            this.b.a(a(e2));
            return null;
        } catch (com.amazon.a.a.o.b.a.b e3) {
            com.amazon.device.drm.a.e.b.a(c, "Unable to parse the license returned by Appstore Client");
            a(LicenseResponse.RequestStatus.ERROR_VERIFICATION);
            this.b.a(a(e3));
            return null;
        } catch (com.amazon.a.a.o.b.a.c e4) {
            com.amazon.device.drm.a.e.b.a(c, "Unable to decode the license with the public key provided by the developer");
            a(LicenseResponse.RequestStatus.ERROR_INVALID_LICENSING_KEYS);
            this.b.a(a(e4));
            return null;
        } catch (Exception unused) {
            com.amazon.device.drm.a.e.b.a(c, "Content License returned from Appstore is not in proper format");
            a(LicenseResponse.RequestStatus.ERROR_VERIFICATION);
            return null;
        }
    }
}
