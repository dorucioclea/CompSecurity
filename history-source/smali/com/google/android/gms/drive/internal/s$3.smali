.class Lcom/google/android/gms/drive/internal/s$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/ResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/s;->discard(Lcom/google/android/gms/common/api/GoogleApiClient;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/common/api/ResultCallback",
        "<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic PZ:Lcom/google/android/gms/drive/internal/s;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/s;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/s$3;->PZ:Lcom/google/android/gms/drive/internal/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public j(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->isSuccess()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "DriveContentsImpl"

    const-string v1, "Error discarding contents"

    invoke-static {v0, v1}, Lcom/google/android/gms/drive/internal/w;->p(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    const-string v0, "DriveContentsImpl"

    const-string v1, "Contents discarded"

    invoke-static {v0, v1}, Lcom/google/android/gms/drive/internal/w;->m(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public synthetic onResult(Lcom/google/android/gms/common/api/Result;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/android/gms/common/api/Result;

    .prologue
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .end local p1    # "x0":Lcom/google/android/gms/common/api/Result;
    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/s$3;->j(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method
