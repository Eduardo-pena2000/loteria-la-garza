package W6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.games_v2.zzb;
import com.google.android.gms.internal.games_v2.zzc;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class l extends zzb implements m {
    public l() {
        super("com.google.android.gms.games.internal.IGamesCallbacks");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 6001) {
            parcel.readString();
            zzc.zzb(parcel);
        } else if (i == 6002) {
            parcel.readString();
            zzc.zzb(parcel);
        } else if (i == 12011) {
            DataHolder dataHolder = (DataHolder) zzc.zza(parcel, DataHolder.CREATOR);
            zzc.zzb(parcel);
            J(dataHolder);
        } else if (i == 12012) {
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            zzc.zzb(parcel);
            o0(readInt, readString);
        } else if (i == 13001) {
            zzc.zzb(parcel);
        } else if (i == 13002) {
            parcel.readInt();
            zzc.zzb(parcel);
        } else if (i == 19001) {
            parcel.readInt();
            zzc.zzb(parcel);
        } else if (i != 19002) {
            switch (i) {
                case 5001:
                    parcel.readInt();
                    parcel.readString();
                    zzc.zzb(parcel);
                    break;
                case 5002:
                    DataHolder dataHolder2 = (DataHolder) zzc.zza(parcel, DataHolder.CREATOR);
                    zzc.zzb(parcel);
                    f0(dataHolder2);
                    break;
                case 5003:
                    int readInt2 = parcel.readInt();
                    String readString2 = parcel.readString();
                    zzc.zzb(parcel);
                    K0(readInt2, readString2);
                    break;
                case 5004:
                    DataHolder dataHolder3 = (DataHolder) zzc.zza(parcel, DataHolder.CREATOR);
                    zzc.zzb(parcel);
                    I0(dataHolder3);
                    break;
                case 5005:
                    Parcelable.Creator creator = DataHolder.CREATOR;
                    DataHolder dataHolder4 = (DataHolder) zzc.zza(parcel, creator);
                    DataHolder dataHolder5 = (DataHolder) zzc.zza(parcel, creator);
                    zzc.zzb(parcel);
                    A(dataHolder4, dataHolder5);
                    break;
                case 5006:
                    DataHolder dataHolder6 = (DataHolder) zzc.zza(parcel, DataHolder.CREATOR);
                    zzc.zzb(parcel);
                    g1(dataHolder6);
                    break;
                case 5007:
                    DataHolder dataHolder7 = (DataHolder) zzc.zza(parcel, DataHolder.CREATOR);
                    zzc.zzb(parcel);
                    m0(dataHolder7);
                    break;
                case 5008:
                    DataHolder dataHolder8 = (DataHolder) zzc.zza(parcel, DataHolder.CREATOR);
                    zzc.zzb(parcel);
                    S(dataHolder8);
                    break;
                case 5009:
                    zzc.zzb(parcel);
                    break;
                case 5010:
                    zzc.zzb(parcel);
                    break;
                case 5011:
                    zzc.zzb(parcel);
                    break;
                default:
                    switch (i) {
                        case 5016:
                            zzm();
                            break;
                        case 5017:
                            zzc.zzb(parcel);
                            break;
                        case 5018:
                            zzc.zzb(parcel);
                            break;
                        case 5019:
                            zzc.zzb(parcel);
                            break;
                        case 5020:
                            parcel.readInt();
                            parcel.readString();
                            zzc.zzb(parcel);
                            break;
                        case 5021:
                            zzc.zzb(parcel);
                            break;
                        case 5022:
                            zzc.zzb(parcel);
                            break;
                        case 5023:
                            zzc.zzb(parcel);
                            break;
                        case 5024:
                            zzc.zzb(parcel);
                            break;
                        case 5025:
                            zzc.zzb(parcel);
                            break;
                        case 5026:
                            parcel.createStringArray();
                            zzc.zzb(parcel);
                            break;
                        case 5027:
                            parcel.createStringArray();
                            zzc.zzb(parcel);
                            break;
                        case 5028:
                            parcel.createStringArray();
                            zzc.zzb(parcel);
                            break;
                        case 5029:
                            parcel.createStringArray();
                            zzc.zzb(parcel);
                            break;
                        case 5030:
                            parcel.createStringArray();
                            zzc.zzb(parcel);
                            break;
                        case 5031:
                            parcel.createStringArray();
                            zzc.zzb(parcel);
                            break;
                        case 5032:
                            zzc.zzb(parcel);
                            break;
                        case 5033:
                            parcel.readInt();
                            parcel.readInt();
                            parcel.readString();
                            zzc.zzb(parcel);
                            break;
                        case 5034:
                            parcel.readInt();
                            parcel.readString();
                            zzc.zze(parcel);
                            zzc.zzb(parcel);
                            break;
                        case 5035:
                            zzc.zzb(parcel);
                            break;
                        case 5036:
                            parcel.readInt();
                            zzc.zzb(parcel);
                            break;
                        case 5037:
                            zzc.zzb(parcel);
                            break;
                        case 5038:
                            zzc.zzb(parcel);
                            break;
                        case 5039:
                            zzc.zzb(parcel);
                            break;
                        case 5040:
                            parcel.readInt();
                            zzc.zzb(parcel);
                            break;
                        case 9001:
                            zzc.zzb(parcel);
                            break;
                        case 11001:
                            parcel.readInt();
                            zzc.zza(parcel, Bundle.CREATOR);
                            zzc.zzb(parcel);
                            break;
                        case 12001:
                            DataHolder dataHolder9 = (DataHolder) zzc.zza(parcel, DataHolder.CREATOR);
                            zzc.zzb(parcel);
                            u(dataHolder9);
                            break;
                        case 14001:
                            zzc.zzb(parcel);
                            break;
                        case 15001:
                            DataHolder dataHolder10 = (DataHolder) zzc.zza(parcel, DataHolder.CREATOR);
                            zzc.zzb(parcel);
                            s0(dataHolder10);
                            break;
                        case 17002:
                            parcel.readInt();
                            zzc.zzb(parcel);
                            break;
                        case 19008:
                            parcel.readInt();
                            zzc.zzb(parcel);
                            break;
                        case 19009:
                            parcel.readInt();
                            zzc.zzb(parcel);
                            break;
                        case 19010:
                            parcel.readInt();
                            zzc.zzb(parcel);
                            break;
                        case 20001:
                            zzc.zzb(parcel);
                            break;
                        case 20002:
                            zzc.zzb(parcel);
                            break;
                        case 20003:
                            zzc.zzb(parcel);
                            break;
                        case 20004:
                            zzc.zzb(parcel);
                            break;
                        case 20005:
                            zzc.zzb(parcel);
                            break;
                        case 20006:
                            zzc.zzb(parcel);
                            break;
                        case 20007:
                            zzc.zzb(parcel);
                            break;
                        case 20008:
                            zzc.zzb(parcel);
                            break;
                        case 20009:
                            zzc.zzb(parcel);
                            break;
                        case 20012:
                            zzc.zzb(parcel);
                            break;
                        case 20019:
                            parcel.readInt();
                            zzc.zzb(parcel);
                            break;
                        case 20020:
                            parcel.readInt();
                            zzc.zza(parcel, Bundle.CREATOR);
                            zzc.zzb(parcel);
                            break;
                        case 23001:
                            parcel.readInt();
                            zzc.zzb(parcel);
                            break;
                        case 23002:
                            parcel.readInt();
                            zzc.zzb(parcel);
                            break;
                        case 23003:
                            parcel.readInt();
                            zzc.zzb(parcel);
                            break;
                        case 23004:
                            parcel.readInt();
                            zzc.zzb(parcel);
                            break;
                        case 23005:
                            parcel.readInt();
                            zzc.zzb(parcel);
                            break;
                        case 24002:
                            zzc.zze(parcel);
                            zzc.zzb(parcel);
                            break;
                        case 25002:
                            parcel.readString();
                            zzc.zzb(parcel);
                            break;
                        case 25003:
                            Status status = (Status) zzc.zza(parcel, Status.CREATOR);
                            String readString3 = parcel.readString();
                            zzc.zzb(parcel);
                            D(status, readString3);
                            break;
                        case 25004:
                            zzc.zzb(parcel);
                            break;
                        case 25005:
                            parcel.readInt();
                            zzc.zzb(parcel);
                            break;
                        case 25006:
                            parcel.readInt();
                            zzc.zzb(parcel);
                            break;
                        default:
                            switch (i) {
                                case 8001:
                                    DataHolder dataHolder11 = (DataHolder) zzc.zza(parcel, DataHolder.CREATOR);
                                    zzc.zzb(parcel);
                                    j0(dataHolder11);
                                    break;
                                case 8002:
                                    parcel.readInt();
                                    zzc.zza(parcel, Bundle.CREATOR);
                                    zzc.zzb(parcel);
                                    break;
                                case 8003:
                                    zzc.zzb(parcel);
                                    break;
                                case 8004:
                                    zzc.zzb(parcel);
                                    break;
                                case 8005:
                                    zzc.zzb(parcel);
                                    break;
                                case 8006:
                                    zzc.zzb(parcel);
                                    break;
                                case 8007:
                                    parcel.readInt();
                                    parcel.readString();
                                    zzc.zzb(parcel);
                                    break;
                                case 8008:
                                    zzc.zzb(parcel);
                                    break;
                                case 8009:
                                    parcel.readString();
                                    zzc.zzb(parcel);
                                    break;
                                case 8010:
                                    parcel.readString();
                                    zzc.zzb(parcel);
                                    break;
                                default:
                                    switch (i) {
                                        case 10001:
                                            zzc.zzb(parcel);
                                            break;
                                        case 10002:
                                            parcel.readString();
                                            zzc.zzb(parcel);
                                            break;
                                        case 10003:
                                            zzc.zzb(parcel);
                                            break;
                                        case 10004:
                                            zzc.zzb(parcel);
                                            break;
                                        case 10005:
                                            parcel.readInt();
                                            zzc.zza(parcel, Bundle.CREATOR);
                                            zzc.zzb(parcel);
                                            break;
                                        case 10006:
                                            zzc.zzb(parcel);
                                            break;
                                        default:
                                            switch (i) {
                                                case 12004:
                                                    DataHolder dataHolder12 = (DataHolder) zzc.zza(parcel, DataHolder.CREATOR);
                                                    H6.a aVar = (H6.a) zzc.zza(parcel, H6.a.CREATOR);
                                                    zzc.zzb(parcel);
                                                    d(dataHolder12, aVar);
                                                    break;
                                                case 12005:
                                                    DataHolder dataHolder13 = (DataHolder) zzc.zza(parcel, DataHolder.CREATOR);
                                                    zzc.zzb(parcel);
                                                    Y0(dataHolder13);
                                                    break;
                                                case 12006:
                                                    zzc.zzb(parcel);
                                                    break;
                                                case 12007:
                                                    zzc.zzb(parcel);
                                                    break;
                                                case 12008:
                                                    zzc.zzb(parcel);
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 12014:
                                                            zzc.zzb(parcel);
                                                            break;
                                                        case 12015:
                                                            parcel.readInt();
                                                            zzc.zza(parcel, Bundle.CREATOR);
                                                            zzc.zzb(parcel);
                                                            break;
                                                        case 12016:
                                                            zzc.zzb(parcel);
                                                            break;
                                                        case 12017:
                                                            DataHolder dataHolder14 = (DataHolder) zzc.zza(parcel, DataHolder.CREATOR);
                                                            String readString4 = parcel.readString();
                                                            Parcelable.Creator creator2 = H6.a.CREATOR;
                                                            H6.a aVar2 = (H6.a) zzc.zza(parcel, creator2);
                                                            H6.a aVar3 = (H6.a) zzc.zza(parcel, creator2);
                                                            H6.a aVar4 = (H6.a) zzc.zza(parcel, creator2);
                                                            zzc.zzb(parcel);
                                                            B0(dataHolder14, readString4, aVar2, aVar3, aVar4);
                                                            break;
                                                        default:
                                                            return false;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            parcel.readInt();
            zzc.zze(parcel);
            zzc.zzb(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
