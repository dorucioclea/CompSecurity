.class final Lcom/facebook/orca/server/as;
.super Ljava/lang/Object;
.source "ReceiptResult.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/orca/server/ReceiptResult;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/orca/server/ReceiptResult;
    .locals 1

    .prologue
    .line 35
    new-instance v0, Lcom/facebook/orca/server/ReceiptResult;

    invoke-direct {v0, p1}, Lcom/facebook/orca/server/ReceiptResult;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/orca/server/ReceiptResult;
    .locals 1

    .prologue
    .line 39
    new-array v0, p1, [Lcom/facebook/orca/server/ReceiptResult;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 33
    invoke-virtual {p0, p1}, Lcom/facebook/orca/server/as;->a(Landroid/os/Parcel;)Lcom/facebook/orca/server/ReceiptResult;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 33
    invoke-virtual {p0, p1}, Lcom/facebook/orca/server/as;->a(I)[Lcom/facebook/orca/server/ReceiptResult;

    move-result-object v0

    return-object v0
.end method
