package ta;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import da.i;
import da.j;
import da.p;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class f implements j.c {
    public final ta.c a;
    public final j b;
    public final Context c;
    public ConsentInformation d;
    public Activity e;

    public class a implements ConsentInformation.OnConsentInfoUpdateSuccessListener {
        public final /* synthetic */ j.d a;

        public a(j.d dVar) {
            this.a = dVar;
        }

        public void onConsentInfoUpdateSuccess() {
            this.a.a(null);
        }
    }

    public class b implements ConsentInformation.OnConsentInfoUpdateFailureListener {
        public final /* synthetic */ j.d a;

        public b(j.d dVar) {
            this.a = dVar;
        }

        public void onConsentInfoUpdateFailure(FormError formError) {
            this.a.b(Integer.toString(formError.getErrorCode()), formError.getMessage(), null);
        }
    }

    public class c implements UserMessagingPlatform.OnConsentFormLoadSuccessListener {
        public final /* synthetic */ j.d a;

        public c(j.d dVar) {
            this.a = dVar;
        }

        public void onConsentFormLoadSuccess(ConsentForm consentForm) {
            f.c(f.this).s(consentForm);
            this.a.a(consentForm);
        }
    }

    public class d implements UserMessagingPlatform.OnConsentFormLoadFailureListener {
        public final /* synthetic */ j.d a;

        public d(j.d dVar) {
            this.a = dVar;
        }

        public void onConsentFormLoadFailure(FormError formError) {
            this.a.b(Integer.toString(formError.getErrorCode()), formError.getMessage(), null);
        }
    }

    public class e implements ConsentForm.OnConsentFormDismissedListener {
        public final /* synthetic */ j.d a;

        public e(j.d dVar) {
            this.a = dVar;
        }

        public void onConsentFormDismissed(FormError formError) {
            if (formError != null) {
                this.a.b(Integer.toString(formError.getErrorCode()), formError.getMessage(), null);
            } else {
                this.a.a(null);
            }
        }
    }

    public static /* synthetic */ class f {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ConsentInformation.PrivacyOptionsRequirementStatus.values().length];
            a = iArr;
            try {
                iArr[ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public f(da.b bVar, Context context) {
        ta.c cVar = new ta.c();
        this.a = cVar;
        j jVar = new j(bVar, "plugins.flutter.io/google_mobile_ads/ump", new p(cVar));
        this.b = jVar;
        jVar.e(this);
        this.c = context;
    }

    public static /* synthetic */ void a(j.d dVar, FormError formError) {
        e(dVar, formError);
    }

    public static /* synthetic */ void b(j.d dVar, FormError formError) {
        f(dVar, formError);
    }

    public static /* synthetic */ ta.c c(f fVar) {
        return fVar.a;
    }

    public static /* synthetic */ void e(j.d dVar, FormError formError) {
        dVar.a(formError);
    }

    public static /* synthetic */ void f(j.d dVar, FormError formError) {
        dVar.a(formError);
    }

    public final ConsentInformation d() {
        ConsentInformation consentInformation = this.d;
        if (consentInformation != null) {
            return consentInformation;
        }
        ConsentInformation consentInformation2 = UserMessagingPlatform.getConsentInformation(this.c);
        this.d = consentInformation2;
        return consentInformation2;
    }

    public void g(Activity activity) {
        this.e = activity;
    }

    public void onMethodCall(i iVar, j.d dVar) {
        String str = iVar.a;
        str.hashCode();
        switch (str) {
            case "ConsentInformation#reset":
                d().reset();
                dVar.a(null);
                break;
            case "UserMessagingPlatform#loadAndShowConsentFormIfRequired":
                Activity activity = this.e;
                if (activity != null) {
                    UserMessagingPlatform.loadAndShowConsentFormIfRequired(activity, new ta.d(dVar));
                    break;
                } else {
                    dVar.b("0", "UserMessagingPlatform#loadAndShowConsentFormIfRequired called before plugin has been registered to an activity.", null);
                    break;
                }
            case "ConsentInformation#requestConsentInfoUpdate":
                if (this.e != null) {
                    ta.b bVar = (ta.b) iVar.a("params");
                    d().requestConsentInfoUpdate(this.e, bVar == null ? new ConsentRequestParameters.Builder().build() : bVar.a(this.e), new a(dVar), new b(dVar));
                    break;
                } else {
                    dVar.b("0", "ConsentInformation#requestConsentInfoUpdate called before plugin has been registered to an activity.", null);
                    break;
                }
            case "ConsentForm#show":
                ConsentForm consentForm = (ConsentForm) iVar.a("consentForm");
                if (consentForm != null) {
                    consentForm.show(this.e, new e(dVar));
                    break;
                } else {
                    dVar.b("0", "ConsentForm#show", null);
                    break;
                }
            case "ConsentForm#dispose":
                ConsentForm consentForm2 = (ConsentForm) iVar.a("consentForm");
                if (consentForm2 == null) {
                    Log.w("0", "Called dispose on ad that has been freed");
                } else {
                    this.a.r(consentForm2);
                }
                dVar.a(null);
                break;
            case "UserMessagingPlatform#showPrivacyOptionsForm":
                Activity activity2 = this.e;
                if (activity2 != null) {
                    UserMessagingPlatform.showPrivacyOptionsForm(activity2, new ta.e(dVar));
                    break;
                } else {
                    dVar.b("0", "UserMessagingPlatform#showPrivacyOptionsForm called before plugin has been registered to an activity.", null);
                    break;
                }
            case "ConsentInformation#isConsentFormAvailable":
                dVar.a(Boolean.valueOf(d().isConsentFormAvailable()));
                break;
            case "UserMessagingPlatform#loadConsentForm":
                UserMessagingPlatform.loadConsentForm(this.c, new c(dVar), new d(dVar));
                break;
            case "ConsentInformation#getPrivacyOptionsRequirementStatus":
                int i = f.a[d().getPrivacyOptionsRequirementStatus().ordinal()];
                if (i == 1) {
                    dVar.a(0);
                    break;
                } else if (i == 2) {
                    dVar.a(1);
                    break;
                } else {
                    dVar.a(2);
                    break;
                }
            case "ConsentInformation#canRequestAds":
                dVar.a(Boolean.valueOf(d().canRequestAds()));
                break;
            case "ConsentInformation#getConsentStatus":
                dVar.a(Integer.valueOf(d().getConsentStatus()));
                break;
            default:
                dVar.c();
                break;
        }
    }
}
